package android.vinicius.loginmvc.model;

public class Usuario {
    private int id;

    private String userNome;

    private String userSenha;

    public String userEmail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return userNome;
    }

    public void setNome(String userNome) {
        this.userNome = userNome;
    }

    public String getSenha() {
        return userSenha;
    }

    public void setSenha(String userSenha) {
        this.userSenha = userSenha;
    }

    public String getEmail() {
        return userEmail;
    }

    public void setEmail (String userEmail) {
        this.userEmail = userEmail;
    }
}
