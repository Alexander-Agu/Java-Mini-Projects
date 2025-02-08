import GeneratorTypes.GeneratorTypes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GeneratorTypes generatorTypes = new GeneratorTypes();
        ArrayList<String> test = generatorTypes.createGeneratorTypes();


        String password = "";
        for (int i = 0; i <= 15; i++){
            int chooseRandomChar = (int) (Math.random() * test.size() - 1);
            password += test.get(chooseRandomChar);
        }
        System.out.println(password);
    }
}