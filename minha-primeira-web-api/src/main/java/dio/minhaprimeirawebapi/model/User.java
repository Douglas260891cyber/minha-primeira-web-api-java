package dio.minhaprimeirawebapi.model;

public class User {
    private Integer id;
    private String login;
    private String passsword;

    public User() {

    }

    public User(String login, String password) {
        this.login = login;
        this.passsword = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    @Override
    public String toString() {
        return "User [login=" + login + 
               ", passsword=" + passsword + "]";
    }
}