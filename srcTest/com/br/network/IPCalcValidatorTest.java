package com.br.network;

import org.junit.Assert;
import org.junit.Test;

public class IPCalcValidatorTest {
	
	@Test
	public void testIsValidIPAddressWhenItIsTrue(){
		String ipAddress = "192.168.0.1";
		Assert.assertTrue(IPCalcValidator.isValidIPAddress(ipAddress));
	}
	
	@Test
	public void testIsValidIPAddressWhenItIsFalse(){
		String ipAddress = "192.168.2.280";
		Assert.assertFalse(IPCalcValidator.isValidIPAddress(ipAddress));
	}
}