package account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SignUp {
    Scanner input = new Scanner(System.in);
    public HashMap<String, String> createAccount(HashMap<String, String> userData){
        System.out.println("Please input username");
        String userName = input.nextLine();
        System.out.println("Please enter your profession");
        String profession = input.nextLine();
        System.out.println("Please create password");
        String password = input.nextLine();

        userData.put("userName", userName);
        userData.put("profession", profession);
        userData.put("password", password);

        return userData;
    }
}
