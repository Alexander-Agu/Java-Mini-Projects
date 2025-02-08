package GeneratorTypes;

import java.util.ArrayList;

public class GeneratorTypes {
    String specialChars = "!@#$%^&*()_+:<>?/|";
    String numberChars = "1234567890";
    String lowerChars = "qwertyuiopasdfghjklzxcvbnm";
    String upperChars = "QWERTYUIOPASDFGHJKLZXCVBNM";

    public ArrayList<String> createGeneratorTypes (){
        ArrayList<String> generatorTypes = new ArrayList<String>();


        ArrayList<String[]> typeCollection = new ArrayList<String[]>();
        String[] splitSpecial = specialChars.split("");
        String[] splitnumbers = numberChars.split("");
        String[] splitLower = lowerChars.split("");
        String[] splitUpper = upperChars.split("");
        typeCollection.add(splitSpecial);
        typeCollection.add(splitnumbers);
        typeCollection.add(splitLower);
        typeCollection.add(splitUpper);



        for (int i = 0; i <= typeCollection.size() - 1; i++){
            ArrayList<String> addToMain = new ArrayList<String>();
            for (String x: typeCollection.get(i)){
                addToMain.add(x);
            }
            generatorTypes.addAll(addToMain);
        }

        return generatorTypes;
    }
}
