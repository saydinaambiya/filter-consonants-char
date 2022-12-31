package com.enigmacamp.sorting;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inputTerm = new Scanner(System.in);

        System.out.print("Input one line of words (S) : ");
        String words = inputTerm.nextLine();

        String vowelCharacters = CharacterSorting.getVowelCharacter(words);
        String consonantCharacters = CharacterSorting.getConsonantCharacter(words);

        System.out.println("Vowel Characters: \n" + vowelCharacters);
        System.out.println("Consonant Characters: \n"+consonantCharacters);
    }
}
