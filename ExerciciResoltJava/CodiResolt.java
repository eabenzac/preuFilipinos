package junit;

import java.util.Scanner;

public class Codi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		for (int i =0;i<casos;i++) {
			Double num1 = sc.nextDouble();
			Double num2 = sc.nextDouble();
			System.out.println(filipinos(num1,num2));
		}
		

	}
	public static String filipinos(double num1,double num2) {
		if (num1 <0) {
			if (num2 <= (num1*-0.5) || num2 <= num1) {
				return "SI";
			}else {
				return "NO";
			}
		}else {
			if (num2 < (num1*1.5) || num2 <= num1 ) {
				return "SI";
			}else {
				return "NO";
			}
		}
		
	}

}
