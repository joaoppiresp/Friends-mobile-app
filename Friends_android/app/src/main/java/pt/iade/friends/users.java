package pt.iade.friends;

public class users {

    public char email;
    public String name;
    public char phone_number;
    //constructor
    public users(char email, String name, char phone_number){
        this.email = email;
        this.name = name;
        this.phone_number = phone_number;
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
        return "users{" +
                "email=" + email +
                ", name='" + name + '\'' +
                ", phone_number=" + phone_number +
                '}';
    }
}
