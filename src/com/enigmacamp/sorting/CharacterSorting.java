package com.enigmacamp.sorting;
import java.util.Arrays;

public class CharacterSorting {
    public static String getVowelCharacter(String words){
        String lowerCaseWords = words.toLowerCase();
        String vowelCharacter = lowerCaseWords.replaceAll("[^aiueo]","");

        char temp[] = vowelCharacter.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
    public static String getConsonantCharacter(String words){
        String lowerCaseWords = words.toLowerCase();
        String consonantCharacter = lowerCaseWords.replaceAll("[aiueo ]","");

        return consonantCharacter;
    }
}
