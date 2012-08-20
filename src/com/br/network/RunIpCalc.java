package com.br.network;

import java.util.Scanner;

public class RunIpCalc {
	
	public static void main(String []args){
		IPCalc ipCalc = new IPCalc();
		Scanner in = new Scanner(System.in);
		System.out.print("digite o endereço ip: ");
		String ipAddress = in.nextLine();
		in.close();
		String result = ipCalc.calcule(ipAddress);
		System.out.println(result);
	}

}
