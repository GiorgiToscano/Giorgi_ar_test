package com.model.serio;

import java.util.Random;

public class DBConnect {

	//Classe decisamente inutile
	
	private static final String alphanumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private static final String alphanumericandsymbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
	final static Random random = new Random();
	
	public DBConnect() {
		
	}

	//TODO: MD5 Hashing
	
	/**
	 * Genera una stringa casuale con caratteri alfanumerici
	 * 
	 * @param length numero di caratteri della stringa da generare
	 * @return
	 */
	public static String getRandomString(int length) {
		return generateRandomStringFromCharset(alphanumeric, length);
	}
	
	/**
	 * Genera una stringa casuale contenente caratteri della stringa chars
	 * 
	 * @param chars set di caratteri
	 * @param length numero di caratteri della stringa da generare
	 * @return
	 */
	private static String generateRandomStringFromCharset(String chars, int length) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < length; i++) {
			builder.append(chars.charAt(random.nextInt(chars.length())));
		}
		return builder.toString();
	}
	
	public static String generaPasswordCasuale() {
		return generateRandomStringFromCharset(alphanumericandsymbols, 8);
	}
}
