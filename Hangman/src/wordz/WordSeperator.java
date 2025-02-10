package wordz;

import java.util.ArrayList;

public class WordSeperator {
    ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();


    // Separates words into missing words and available words
    public ArrayList<ArrayList<String>> separateWordR(String word){
        // Split the word and store it into an Array list
        String separateWord[] = word.split("");
        ArrayList<String> separatedWord = new ArrayList<String>();
        for (String i : separateWord){
            separatedWord.add(i);
        }
        ArrayList<String> copyArray = new ArrayList<String>();
        copyArray.addAll(separatedWord);


        // Getting random amount of missing and available letters
        int missingLettersLenth = 0;
        while (true) {
            int randomMissingLetterLenth = (int) (Math.random() * separatedWord.size());

            if (randomMissingLetterLenth >= 3 && randomMissingLetterLenth < separatedWord.size() - 1){
                missingLettersLenth = randomMissingLetterLenth;
                break;
            }
        }
        int availableLettersLenth = (separatedWord.size()) - missingLettersLenth;


        ArrayList<String> missingChars = new ArrayList<String>();
        ArrayList<String> availableChars = new ArrayList<String>();
        ArrayList<Integer> selectedLetters = new ArrayList<Integer>();
        int count = availableLettersLenth;
        while (count > 0){

            int selectRandom = (int) (Math.random() * separatedWord.size());

            if (selectedLetters.contains(selectRandom)) {
            } else {
                missingChars.add(separatedWord.get(selectRandom));
                separatedWord.set(selectRandom, "_");
                selectedLetters.add(selectRandom);

                count--;
            }
        }

        results.add(missingChars);
        results.add(separatedWord);
        results.add(copyArray);
        return results;
    }
}
