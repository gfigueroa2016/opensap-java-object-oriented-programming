package de.hpi.codeocean.ide.exercise;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Decoder {
	
	private static final char CYPHER_ON = '+';
	private static final char CYPHER_OFF = '-';
	private List<MorseCharacter> morseAlphabet;
	
	public Decoder() {
		morseAlphabet = new MorseAlphabet().getMorseAlphabet();
	}
	
	
	public String decodeFile(File file) {
		
		/* Read the input file  */
		String inputText = getFileContent(file);
		
		/* Create the list of MorseCharacters (morseStream) from the text */
		List<MorseCharacter> morseStream = createCypherStream(inputText.toCharArray());
		
		/* decode the morseStream and return the result */
		return decodeMorseStream(morseStream);
	}
	

	private String getFileContent(File file) {
		/* The file is read character by character.
		 * We use a StringBuilder to create a String out of the single characters.
		 * In the end, the resulting String is returned.
		 */
		
		StringBuilder sb = new StringBuilder();

		/* When dealing with file content, exceptions can occur, 
		 * that might lead to unexpected aborts of the program.
		 * Therefore we have to make sure that the program does not crash 
		 * when reading the file content.
		 * After having read the full file content, the file (meaning: the file reader) 
		 * should be closed again to free up the resources again.
		 * Add the respective missing statements here.
		 */
		Reader reader = new FileReader(file);
		// Here we have to read the file character by character and append each character
		// to the StringBuilder sb. If you don't know yet how to do that, be encouraged to
		// search the internet, how to read a file characterwise and how to append a character to a StringBuilder.
		
		return sb.toString();
	}
	
	private List<MorseCharacter> createCypherStream (char[] inputStream) {
		/* We create the MorseStream from the previously read file 
		 * Eventually, we have to clean the content of the read file as
		 * Eric pressed to extensively on LONG or SHORT.
		 */
		
		/* A MorseCharacter consists of multiple CypherSymbols,
		 * multiple MorseCharacters make up a morseStream (which is implemented as an ArrayList) */
		List<MorseCharacter> morseStream = new ArrayList<>();
		List<CypherSymbol> morseSymbol = new ArrayList<>();
		
		int index = 0;
					
		// If the next character of the inputStream after the start or after a CYPHER_OFF is a CYPHER_ON,
		// we have found the start of a new CypherSymbol.
			
		// If the next character after that is a CYPHER_OFF, 
		// we have found a CypherSymbol SHORT.
		// Otherwise, if the next character is a CYPHER_ON, 
		// we have found a CypherSymbol LONG.
		
		// There might follow an arbitrary number of CYPHER_ONs for a long CypherSymbol 
		// until a CYPHER_OFF finishes the CypherSymbol. 
		// Afterwards, further CypherSymbols might follow until the MorseCharacter is complete.
			
		// If 2 CYPHER_OFF occur after one another, the content of the MorseCharacter is complete.
		// We append a CypherSymbol BLANK, the morseSymbol is then complete and can be
		// appended to the list morseStream. 
		// 
		// Afterwards, the next MorseCharacter can be processed.
		// (Take care: calling clear() on the list of the current morseSymbol possibly deletes values that are still needed in the morseStream,
		//   as morseStream holds references onto the lists used within MorseSymbol.)
		
		return morseStream;
		
	}
	
	private String decodeMorseStream(List<MorseCharacter> morseStream) {
		/*
		 * The morseStream is decoded and returned as a human-readable text. 
		 * Therefore, it has to be checked whether the morse code symbol (MorseCharacter) 
		 * exists in the morseAlphabet. 
		 * In case it does, it is appended to the text, otherwise a question mark is added. 
		 * Each character is followed by a whitespace.
		 */
		
		StringBuilder sb = new StringBuilder();
		/* Please check whether morseCharacter is found in the morseAlphabet here. 
		 * If it has been found, append the (translated) character to the translated text.
		 * Otherwise, a question mark is appended at this position in the text.
		 */
		for (MorseCharacter morseCharacter : morseStream) {
			for (MorseCharacter potentialMatch : morseAlphabet) {
				
				// the check for an actual match is still missing here... 
				// the equals method of MorseCharacter might come in handy here.
				sb.append(potentialMatch.getCharacter() + " ");
			}
		}
		
		return null;
	}
	
}