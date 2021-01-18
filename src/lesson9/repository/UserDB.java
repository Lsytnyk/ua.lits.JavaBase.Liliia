package lesson9.repository;

import lesson9.models.Role;
import lesson9.models.User;

import java.util.ArrayList;

public class UserDB {

    ArrayList<User> userList;

    public UserDB (){
        userList = new ArrayList<>();
        userList.add(new User("Liliia", "Kiselova", 30, "QA", "+380669718696","machaon00@gmail.com","Lviv", Role.Admin));
        userList.add(new User("Chester", "Sytnyk", 7, "dog", "+380669718695","machaon01@gmail.com","Lviv", Role.User));
        userList.add(new User("Seriy", "Kiselov", 37, "Musician", "+380669718694","machaon02@gmail.com","Lviv", Role.User));
    }

    public void addUser(String name,String surname,int age, String title, String phoneNumber, String email, String address, Role role){
        userList.add(new User(name, surname, age, title, phoneNumber,email,address, role));

    }

    public void removeUser(String email){

        int index = findUser(email);
        if ( index > -1){
            userList.remove(index);
            System.out.println("User " +email+ " has been removed");
        }
        else{
            System.out.println("User was not found");
        }
    }

    public int findUser(String email){
        int index = -1;
        for(int i=0; i<userList.size(); i++){
            if( userList.get(i).getEmail().equals(email)){
              index = i;
            }
        }
     return index;

    }

    public User getUser(int index){
        return userList.get(index);
    }
}


