import account.Login;
import account.SignUp;
import task.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
//import account.SignUp.*;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data structure to save information
        ArrayList<HashMap<String, String>> users = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> userAccount = new HashMap<String, String>();

        // Data structure to save task data
        ArrayList<HashMap<String, String>> tasks = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> taskData = new HashMap<String, String>();

        // Creates user account
        SignUp signUp = new SignUp();
        users.add(signUp.createAccount(userAccount));

        System.out.println("Login to acess info");
        System.out.println("Please enter User Name");
        String name = input.nextLine();
        System.out.println("Please Enter password");
        String password = input.nextLine();


        // User Login
        Login login = new Login();
        Boolean loggedIn = login.login(users, name, password);
        if (loggedIn){
            System.out.println("You are logged In!");
            System.out.println("You may start writing your tasks now");
            while (true){

                Task task = new Task();
                HashMap<String, String> newTask = task.createTask(taskData);
                tasks.add(newTask);

                System.out.println("Do you wish to continue? y or n");
                String ask = input.nextLine();
                if (ask.equals("y")){
                }else {break;}

            }

            System.out.println("Here are all your tasks");
            System.out.println(tasks);
        } else {
            System.out.println("Your account does not exist");
        }
    }
}
