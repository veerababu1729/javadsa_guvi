package day1;

import java.util.Scanner;

public class Secondmaxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value:");
        int n=sc.nextInt();
        int fmax=-1;
        int fmin=10;
        int smax=-1;
        int smin=10;
        while(n>0) {
        	int r = n%10;
        	n = (int)n/10;
        	if(r>fmax) {
        		smax = fmax;
        		fmax = r;
        	}
        	
        	if(r<fmin) {
        		smin = fmin;
        		fmin = r;
        	}
        }
        System.out.print("smax"+smax+" smin"+smin);
        

        
    }
}
