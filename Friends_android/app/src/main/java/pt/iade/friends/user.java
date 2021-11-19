package pt.iade.friends;

public class user{

    private String name;
    private String password;
    private char email;
    private char phone_number;

    //constructor
    public user(char email, String name, char phone_number, String password)
    {
        this.email = email;
        this.name = name;
        this.phone_number = phone_number;
        this.password = password;
    }

    //setters&getters
    public void setEmail(char email) {
        this.email = email;
    }
    public char getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPhone_number(char phone_number) {
        this.phone_number = phone_number;
    }
    public char getPhone_number() {
        return phone_number;
    }
    //toString
    @Override
    public String toString() {
        return "user{" +
                "email=" + email +
                ", name='" + name + '\'' +
                ", phone_number=" + phone_number +
                '}';
    }
}
