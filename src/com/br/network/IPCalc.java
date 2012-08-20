package com.br.network;

public class IPCalc {

	public String calcule(String ipAddress){
		if(isValid(ipAddress)){
			String ipAddressBinary = convertIPAddressToBinay(ipAddress);
			IPClass subMaskWire =getSubMaskWired(ipAddressBinary);
			return generateResultMessage(ipAddress, ipAddressBinary, subMaskWire);
		}else{
			return "Ip inválido";
		}
	}

	private String generateResultMessage(String ipAddress, String ipAddressBinary, IPClass subMaskWire) {
		return new StringBuilder()
		.append("ip decimal value: ")
		.append(ipAddress)
		.append("\n")
		.append("ip binary value: ")
		.append(ipAddressBinary)
		.append("\n")
		.append("subMask decimal value: ")
		.append(subMaskWire.getIpClassBinary())
		.toString();
	}

	private IPClass getSubMaskWired(String maskBinaryKey) {
		return IPCalcUtil.calculateSubMask(maskBinaryKey);
	}

	private String convertIPAddressToBinay(String ipAddress) {
		return IPCalcUtil.convertToBinary(ipAddress);
	}

	private boolean isValid(String ipAddress) {
		return IPCalcValidator.isValidIPAddress(ipAddress);
	}
}