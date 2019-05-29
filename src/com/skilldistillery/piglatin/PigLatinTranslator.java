package com.skilldistillery.piglatin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatinTranslator extends AbstractTranslator {

	public PigLatinTranslator() {

	}

	@Override
	public String translateWord(String word) {
		String translatedWord = "";
		if (word == null) {
			return "";
		}
		if (word.matches("\\b[aeiou]\\w+")) {
			translatedWord = word.concat("way");
		} else {
			Pattern y = Pattern.compile("([^aeiou]+)(\\w+)");
			Matcher m = y.matcher("");
			m.reset(word);
			if (m.find()) {
				translatedWord = (m.group(2)).concat(m.group(1)).concat(("ay"));
			}
		}
		return translatedWord;
	}

	@Override
	public String translateText(String string) {
		String[] words = string.split("\\s");
		StringBuilder translatedString = new StringBuilder();
		for (String w : words) {
			translatedString.append(translateWord(w));
			translatedString.append(" ");
		}
		return translatedString.toString();
	}

}
