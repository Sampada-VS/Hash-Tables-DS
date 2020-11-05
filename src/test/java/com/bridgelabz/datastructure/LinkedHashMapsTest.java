package com.bridgelabz.datastructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedHashMapsTest {

	@Test
	public void givenSentence_WhenAdded_ShouldReturnWordFrequency() {
		String sentence="Paranoids are not paranoid because they are paranoid but "+ 
				"because they keep putting themselves "+ 
				"deliberately into paranoid avoidable situations";
		LinkedHashMaps<String,Integer> linkedHashMaps=new LinkedHashMaps<>();
		String[] words=sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value=linkedHashMaps.get(word);
			if(value == null)
				value=1;
			else
				value=value+1;
			linkedHashMaps.add(word,value);
		}
		System.out.println(linkedHashMaps);
		int frequency=linkedHashMaps.get("paranoid");
		assertEquals(3,frequency);
	}

}
