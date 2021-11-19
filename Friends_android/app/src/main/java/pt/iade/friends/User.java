package pt.iade.friends;

public class User {

    private String name;
    private String password;
    private char email;
    private char phone_number;

    //constructor
    public User(char email, String name, char phone_number, String password)
    {
        this.email = email;
        this.name = name;
        this.phone_number = phone_number;
        this.password = password;
    }

    //setters&getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public char getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(char phone_number) {
        this.phone_number = phone_number;
    }
    //toString
    @Override
    public String toString() {
        return " User { " +
                " Name = " + name +
                " Password = " + password +
                ", Email = " + email + '\'' +
                ", Phone_Number= " + phone_number +
                '}';
    }
}
