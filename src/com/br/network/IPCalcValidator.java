package com.br.network;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPCalcValidator {
	
	private static final String IP_ADDRESS_REGEX = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
												"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
												"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
												"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	
	public static boolean isValidIPAddress(String ipAddress){
		return isValid(ipAddress);
	}

	private static boolean isValid(String ipAddress) {
		Pattern pattern = Pattern.compile(IP_ADDRESS_REGEX);
		Matcher matcher = pattern.matcher(ipAddress);
		return matcher.matches();
	}
}