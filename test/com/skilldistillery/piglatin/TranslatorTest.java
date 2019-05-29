package com.skilldistillery.piglatin;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TranslatorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void test_translateWord_returns_empty_String_for_null_input() {
		PigLatinTranslator plt = new PigLatinTranslator();
		String input = null;
		String expected = "";
		String output = plt.translateWord(input);
		assertEquals(expected, output);

	}

	@Test
	public void test_translateWord_for_word_starting_with_consonant_and_vowel_moves_consonant_to_end_of_word_and_adds_ay() {
		PigLatinTranslator plt = new PigLatinTranslator();
		String input = "Word";
		String expected = "ordWay";
		String output = plt.translateWord(input);
		assertEquals(expected, output);
	}

}
