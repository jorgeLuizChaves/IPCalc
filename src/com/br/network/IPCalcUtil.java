package com.br.network;

public class IPCalcUtil {

	private static final int NUMBER_OF_BINARY_INTERVALS = 3;
	private static final String REGEX = "\\.";
	private static final Integer NUMBER_OF_BINARY_FIELDS = 8;

	public static String convertToBinary(String ipAddress) {
		StringBuilder ipAddressBinaryResult = new StringBuilder("");
		String[] ipAddresssplited = ipAddress.split(REGEX);
		for(int cont = 0; cont < ipAddresssplited.length; cont++){
			StringBuilder ipAddressBinary = new StringBuilder("");
			int ipAddressSlipt = Integer.parseInt(ipAddresssplited[cont]);
			for(int cont2 = 0; cont2 < NUMBER_OF_BINARY_FIELDS; cont2++){
				ipAddressBinary.append(ipAddressSlipt % 2);
				ipAddressSlipt = ipAddressSlipt / 2;
			}
			ipAddressBinary.reverse();
			ipAddressBinaryResult.append(ipAddressBinary);
			if(cont < NUMBER_OF_BINARY_INTERVALS){
				ipAddressBinaryResult.append(".");
			}
		}
		return ipAddressBinaryResult.toString();
	}

	public static IPClass calculateSubMask(String ipAddressBinary) {
		String first3BinaryValues = ipAddressBinary.split(REGEX)[0];
		String maskBinaryKey = first3BinaryValues.substring(0, 3);
		return IPClass.findIPClass(maskBinaryKey);
	}
}