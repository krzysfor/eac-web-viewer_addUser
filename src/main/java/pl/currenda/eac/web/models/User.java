package pl.currenda.eac.web.models;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private String id = "";
    private String name = "";
    private String surname = "";
    private String email = "";
    private String password = "";

    public User (){
    }

    public User(String id, String name, String surname, String email, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
