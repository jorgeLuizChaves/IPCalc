package com.br.network;

import junit.framework.Assert;

import org.junit.Test;

public class IPCalcUtilTest {
	
	private static String IPADDRESS_BINARY = "11000000.10101000.00000000.00000001";

	@Test
	public void testConvertToBinary() throws Exception {
		String ipAddress = "192.168.0.1";
		String ipAddressBinary = IPCalcUtil.convertToBinary(ipAddress);
		Assert.assertEquals(IPADDRESS_BINARY, ipAddressBinary);
	}
	
	@Test
	public void testCalculateSubMaskClassC() throws Exception {
		Assert.assertEquals(IPClass.C, IPCalcUtil.calculateSubMask(IPADDRESS_BINARY));
	}
	
	@Test
	public void testCalculateSubMaskClassB() throws Exception {
		String ipBinary = "10100000.10101000.00000000.00000001";
		Assert.assertEquals(IPClass.B, IPCalcUtil.calculateSubMask(ipBinary));
	}
	
	@Test
	public void testCalculateSubMaskClassA() throws Exception {
		String ipBinary = "01100000.10101000.00000000.00000001";
		Assert.assertEquals(IPClass.A, IPCalcUtil.calculateSubMask(ipBinary));
	}
}