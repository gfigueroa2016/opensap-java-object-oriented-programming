package de.hpi.codeocean.ide.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MorseAlphabet {
	
	// This attribute is still missing a getter. */
	private List<MorseCharacter> morseAlphabet = new ArrayList<MorseCharacter>();
	
	public MorseAlphabet() {
		/* Here we create the MorseAlphabet for our code.
		 * This alphabet still lacks some characters. Please add the missing characters. */
		morseAlphabet.add(new MorseCharacter('A', Arrays.asList(CypherSymbol.SHORT, CypherSymbol.LONG, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('B', Arrays.asList(CypherSymbol.LONG, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('C', Arrays.asList(CypherSymbol.LONG, CypherSymbol.SHORT, CypherSymbol.LONG, CypherSymbol.SHORT, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('D', Arrays.asList(CypherSymbol.LONG, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.BLANK)));
		// here, the E is missing. Please add it.
		morseAlphabet.add(new MorseCharacter('F', Arrays.asList(CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.LONG, CypherSymbol.SHORT, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('G', Arrays.asList(CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.SHORT, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('H', Arrays.asList(CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('I', Arrays.asList(CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('J', Arrays.asList(CypherSymbol.SHORT, CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('K', Arrays.asList(CypherSymbol.LONG, CypherSymbol.SHORT, CypherSymbol.LONG, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('L', Arrays.asList(CypherSymbol.SHORT, CypherSymbol.LONG, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('M', Arrays.asList(CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('N', Arrays.asList(CypherSymbol.LONG, CypherSymbol.SHORT, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('O', Arrays.asList(CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('P', Arrays.asList(CypherSymbol.SHORT, CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.SHORT, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('Q', Arrays.asList(CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.SHORT, CypherSymbol.LONG, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('R', Arrays.asList(CypherSymbol.SHORT, CypherSymbol.LONG, CypherSymbol.SHORT, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('S', Arrays.asList(CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.BLANK)));
		// here is also missing a T
		morseAlphabet.add(new MorseCharacter('U', Arrays.asList(CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.LONG, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('V', Arrays.asList(CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.LONG, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('W', Arrays.asList(CypherSymbol.SHORT, CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('X', Arrays.asList(CypherSymbol.LONG, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.LONG, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('Y', Arrays.asList(CypherSymbol.LONG, CypherSymbol.SHORT, CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('Z', Arrays.asList(CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('0', Arrays.asList(CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('1', Arrays.asList(CypherSymbol.SHORT, CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.BLANK)));
		// and the number 2 is also missing
		morseAlphabet.add(new MorseCharacter('3', Arrays.asList(CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('4', Arrays.asList(CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.LONG, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('5', Arrays.asList(CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('6', Arrays.asList(CypherSymbol.LONG, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('7', Arrays.asList(CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('8', Arrays.asList(CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.SHORT, CypherSymbol.SHORT, CypherSymbol.BLANK)));
		morseAlphabet.add(new MorseCharacter('9', Arrays.asList(CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.LONG, CypherSymbol.SHORT, CypherSymbol.BLANK)));
	}


}