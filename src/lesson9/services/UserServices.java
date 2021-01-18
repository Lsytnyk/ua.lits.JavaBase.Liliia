package lesson9.services;

import lesson9.models.Role;
import lesson9.models.User;
import lesson9.repository.UserDB;

public class UserServices {
    Boolean logged;
    Role role;
    private UserDB userDB = new UserDB();

    public UserServices(){
        logged = false;
    }

    public void logIn(String email){
        int index = userDB.findUser(email);
        if (index > -1){
            logged = true;
            role = userDB.getUser(index).getRole();
        }
    }

    public void getAllUsers() {
        System.out.println(userDB);
    }

    public void addUser(String name,String surname,int age, String title, String phoneNumber, String email, String address, Role role){
        userDB.addUser(name, surname, age, title, phoneNumber,email,address, role);
    }


}
