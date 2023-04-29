package main;

import java.util.Arrays;
import java.util.List;


/* Esercizi dispensa universitaria
 * link: https://pages.di.unipi.it/milazzo/teaching/AA1415-ProgJava/dispensa-compitino/Dispensa-esercizi-compitino.pdf	
 *
 * Ne svolgo qualcuno per tenermi in allenamento tra un framework e un altro.
 * Le soluzioni della dispensa sono a volte bypassate in favore di un uso di
 * metodi più moderni (es. Arrays.asList())
 * 
 * Mi sono aiutato infine con stackoverflow in alcune occasioni.
 */
public class Algoritmi {
	
	private static String[] words = new String[] {"Albero", "pianta", "Fiore"};
	
	public static void main(String[] args) {
		invertiStringa("Albero");
		soloVocali("Albero");
		sommaLunghezzeSoloMaiuscole(words);
		trovaCaratterePunteggiatura("!Albero.");
		spaziVocali("Frase di prova ora deve risultare uno anzi tre");
	}
	
	//Invertire una Stringa
	public static void invertiStringa(String word) {
		StringBuilder result = new StringBuilder();
		for(int i=word.length()-1; i>=0; i--) {
			result.append(word.charAt(i));
		}
		System.out.println("Input: " + word + "\nOutput: " + result.toString() +"\n");
	}
	
	// Stampare solo le vocali
	public static void soloVocali(String word) {
		List<String> vocali = Arrays.asList("A","a","E","e","I","i","O","o","U","u");
		for(int i=0; i<word.length(); i++) {
			String letter = String.valueOf(word.charAt(i));
			if (vocali.contains(letter)){
				System.out.print(letter + " ");
			}		
		}
	}
	
	/* Sommare le lunghezze di un array di Stringhe
	 * ma solo quelle che iniziano con una maiuscola
	 */
	public static void sommaLunghezzeSoloMaiuscole(String[] words) {
		int count = 0;
		for(int i=0; i<words.length; i++) {
			if(Character.isUpperCase(words[i].charAt(0))) {
				count = count + words[i].length();
			}
		}
		System.out.println("\n\n" + count);
	}
	
	// Stampare i caratteri punteggiatura in una Stringa
	public static void trovaCaratterePunteggiatura(String word) {
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			if(!Character.isLetterOrDigit(c)) {
				System.out.println(c);
			}
			
		}
	}
	
	/*
	 *  Inserire una stringa e stampa il numero complessivo di spazi 
	 *  che sono immediatamente seguiti da una vocale.
	 *  
	 *   es: "Frase di prova ora deve risultare uno anzi tre" stampa 3
	 */
	public static void spaziVocali(String input) {
		List<String> vocali = Arrays.asList("A","a","E","e","I","i","O","o","U","u");
		int count = 0;
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isWhitespace(c)) {
				char d = input.charAt(i+1);
				if (vocali.contains(String.valueOf(d))){
					count++;
				}
			}
		}
		System.out.println("\n" + count);
	}
	
	

}
