package com.bridgelabz.datastructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class HashMapsTest {

	@Test
	public void givenSentence_WhenAdded_ShouldReturnWordFrequency() {
		String sentence= "To be or not to be";
		HashMaps<String, Integer> hashmaps= new HashMaps<>();
		String[] words=sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value=hashmaps.get(word);
			if(value == null)
				value=1;
			else
				value=value+1;
			hashmaps.add(word,value);
		}
		System.out.println(hashmaps);
		int frequency=hashmaps.get("be");
		assertEquals(2,frequency);
	}

}
