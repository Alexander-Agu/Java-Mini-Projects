package account;

import java.util.ArrayList;
import java.util.HashMap;

public class Login {
    public Boolean login(ArrayList<HashMap<String, String>> data, String userName, String password){
        int points = 0;
        for (int i = 0; i <= data.size() - 1; i++){
            HashMap<String, String> user =  data.get(i);

            if (user.containsValue(userName)){
                points++;
            }
            if (user.containsValue(password)) {
                points++;
            }
        }
        System.out.println(points);
        if (points == 2){
            return true;
        } else {
            return false;
        }
    }
}
