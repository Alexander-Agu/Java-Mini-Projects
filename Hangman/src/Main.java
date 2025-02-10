import wordz.WordSeperator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // A strict Hangman game where a single bad guess might mean failure
        /*
        * TODO:
        *   PLayer will get a number of tries to guess the letter -> tries will vary depending on the word
        *   If player guess all the letters before their tries are 0 -> they win the round
        *   Else player will loose the round
        *
        * TODO: -> Algorythm
        *   1. Store words in an ARRAY
        *   2. Each word will be separated into Random Missing Letters and Random Available Letters
        *   3. If the number 0f missing letters is 3 that means player has 3 tries
        *   4. If player guess all correct letters corrects he wins the round
        *   5. Else the player loses
        *   6. When the rounds ends and player has the winning points they win the game
        *   7. Else the player loses the game
        * */

        ArrayList<String> words = new ArrayList<String>();
        words.add("happiness");
        words.add("dancing");
        words.add("thinking");
        words.add("distant");
        words.add("weekend");

        WordSeperator test = new WordSeperator();

        ArrayList<ArrayList<String>> please = test.separateWordR("Alexander");
        System.out.println(please.toString());

    }
}