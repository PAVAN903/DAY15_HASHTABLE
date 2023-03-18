package com.hashtable;

import java.util.Hashtable;

public class Frequency {
	public static void main(String[] args) {
		String sentence = "To be or not to be";
		Hashtable<String, Integer> fr = new Hashtable<>();
		// split sentence to word
		String[] words = sentence.split(" ");
		// count frequency of word
		for (String word : words) {
			if (fr.containsKey(word)) {
				fr.put(word, fr.get(word) + 1);
			} else {
				fr.put(word, 1);
			}
			// print frequency
			for (String word1 : fr.keySet()) {
				System.out.println(word + ": " + fr.get(word));
			}

		}
	}

}
