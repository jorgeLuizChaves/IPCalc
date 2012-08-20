package com.br.network;

import java.util.LinkedHashMap;
import java.util.Map;

public enum IPClass {

	A("255.0.0.0"),
	B("255.255.0.0"),
	C("255.255.255.0");
	
	private static Map<String, IPClass> ipClassMap = new LinkedHashMap<String, IPClass>();
	private String ipClassDecimal;
	
	static{
		ipClassMap.put("011", A);
		ipClassMap.put("101", B);
		ipClassMap.put("110", C);
	}
	
	IPClass(String ipClass){
		this.ipClassDecimal = ipClass;
	}
	
	public static IPClass findIPClass(String binaryMaskKey){
		return ipClassMap.get(binaryMaskKey);
	}
	
	public String getIpClassBinary(){
		return ipClassDecimal;
	}
}