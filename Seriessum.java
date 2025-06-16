package day1;

import java.util.Scanner;

public class Seriessum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value:");
        int n=sc.nextInt();
        System.out.print("Enter m value:");
        int m=sc.nextInt();
        
        //sum
        int sum = 1;
        int sign = -1;
        int factor = n;
        for(int i=1;i<m;i++)
        {
        	//n=n*n;
        	sum=sum+(sign*n);
        	n=n*factor;
        	sign = sign*(-1);
        }
        System.out.print("sum of the series is:"+sum);

        
    }
}
