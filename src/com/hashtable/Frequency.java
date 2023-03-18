package com.hashtable;

import java.util.Hashtable;
import java.util.LinkedList;

public class Frequency {
	public static void main(String[] args) {
		String sentence ="Paranoids are notparanoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable";
		Hashtable<String,Integer> fr = new Hashtable<>();
		Hashtable<String,LinkedList <Integer>> ffr = new Hashtable<>();
		// split sentence to word
		String[] words = sentence.split(" ");
		String []letter=sentence.toLowerCase().split("\\W");
				
		// count frequency of word
		for (String word: words) {
			if (fr.containsKey(word)) {
				fr.put(word, fr.get(word) + 1);
			} else {
				fr.put(word, 1);
			} 
			LinkedList<Integer> frlist=ffr.get(word);
			if(frlist==null) {
				frlist=new LinkedList<>();
				frlist.add(1);
				ffr.put(word, frlist);
			}else {
				frlist.add(frlist.getLast()+1);
			}
			
			// print frequency
			for (String word1 : fr.keySet()) {
				System.out.println(word + ": " + fr.get(word));
			}

		}
	
	       for(String word:ffr.keySet()) {
	    	   LinkedList<Integer>frlist=ffr.get(word);
	    	   int frequency=frlist.getLast();
	    	   System.out.println(word+ " "+frequency);
	    	   

}
}}