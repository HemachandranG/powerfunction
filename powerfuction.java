package Powerfunction;

import java.util.Scanner;

public class Powerfunction {

	 static int pow(int a,int b,int c){
		 int power=0;
	        if (b==0){
	            return 1;
	        }
	        if(b==1) {
	        	return a;
	        }
	        	return power(a,b/2,c);
	 }
	        	
	      
	    public static void main(String[] args) {
			
			Scanner H = new Scanner (System.in);
			int a = H.nextInt();
			int b=H.nextInt();
			int c=H.nextInt();
			
			System.out.println(power(a,b,c));
		}
	}
