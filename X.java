// Criar uma classe X em Java.

public class X {
    private String login;
    private String senha;
    private int codigo;
    private char sexo;

    public X( ) {
        this.login = " ";
        this.senha = " ";
        this.codigo = -1;
        this.sexo = '*';
    }
    public X(int codigo, String login, String senha, char sexo) {
        this.login = login;
        this.senha = senha;
        this.codigo = codigo;
        this.sexo = sexo;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String toString() {
        return "Usuário [login=" + login + ", senha=" + senha + ", código=" + codigo + ", sexo=" + sexo + "]";
    }
}
