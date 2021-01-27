package lesson9.models;


public class User {
    private String name;
    private String surname;
    private int age;
    private String title;
    private String phoneNumber;
    private String email;
    private String address;
    private Role role;

    public User (String name,String surname,int age, String title, String phoneNumber, String email, String address, Role role){

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.role = role;
    }

    public void changeRole(Role role){
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public Role getRole() {
        return role;
    }
}
