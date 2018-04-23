package com.model.validator;

import java.util.regex.Pattern;

public class CommonValiditation {

	static Pattern codfisPattern = Pattern.compile("^[A-Za-z]{6}[0-9]{2}[A-Za-z]{1}[0-9]{2}[A-Za-z]{1}[0-9]{3}[A-Za-z]{1}$");
	static Pattern pwdPattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d_]{8,}$");
	static Pattern giorgiEmailPattern = Pattern.compile("^\\w+([-+.']\\w+)*@iisgiorgimilano.gov.it$");
	
	public static boolean isValidCodiceFiscale(String codfis) {
		return codfisPattern.matcher(codfis).find();
	}
	
	public static boolean isValidPassword(String pwd) {
		return pwdPattern.matcher(pwd).find();
	}
	
	
	public static boolean isValidGiorgiEmail(String email) {
		//return giorgiEmailPattern.matcher(email).find();
		return true;
	}

}
