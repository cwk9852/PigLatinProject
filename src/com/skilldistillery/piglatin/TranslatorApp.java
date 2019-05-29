package com.skilldistillery.piglatin;

import java.util.Scanner;

public class TranslatorApp {

	private Scanner kb = new Scanner(System.in);
	private PigLatinTranslator plt = new PigLatinTranslator();

	public TranslatorApp() {
	}

	public static void main(String[] args) {

		TranslatorApp tA = new TranslatorApp();
		tA.run();

	}

	public void run() {
		System.out.println("Welcome to PigLatin Translator");
		System.out.println("Please enter a word or phrase to translate:");
		String string = kb.nextLine();
		System.out.println("Original:\t" + string);
		System.out.println("Translated:\t" + plt.translateText(string));
	}
}

//does individual words through .translateWord.
//String word = kb.nextLine();
//System.out.println(word);
//String translatedWord = plt.translateWord(word);
//System.out.println("Word: " + word + "\tTranslated:\t" + translatedWord);
//System.out.println("Please enter a phrase to translate:");