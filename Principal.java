/*Cria uma classe Principal contendo um menu com as opções Listar, Inserir, Excluir, Atualizar e Sair para acessar as funções CRUD da DAO. */

public class Principal {
    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();
        dao.conectar();

        // Inserir
        X usuario = new X(234, "Caio", "Taylor145", 'M');

        if (dao.inserirUsuario(usuario) == true) {
            System.out.println("Inserção com sucesso ->" + usuario.toString());
        }

        // Listar
        System.out.println("==== Mostrar usuários do sexo masculino === ");
        X[] usuarios = dao.getUsuariosMasculinos();

        for (int i = 0; i < usuarios.length; i++) {
            System.out.println(usuarios[i].toString());
        }

        // Atualizar
        usuario.setSenha("nova senha");
        dao.atualizarUsuario(usuario);

        System.out.println(" Mostrar usuarios ");
        usuarios = dao.getUsuarios();

        for (int i = 0; i < usuarios.length; i++) {
            System.out.println(usuarios[i].toString());
        }

        dao.excluirUsuario(usuario.getCodigo());

        usuarios = dao.getUsuarios();

        System.out.println("mostrar usuarios");

        for (int i = 0; i < usuarios.length; i++) {
            System.out.println(usuarios[i].toString());
        }

        dao.close();
    }
}
