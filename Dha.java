/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dha;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Dha {
    private static int number;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
	int sum=0,flag=1,i;
System.out.println("enter the number");
int n=sc.nextInt();
int[] a=new int[number];
for(i=0;i<number;i++){
a[i]=scr.nextInt();
if(i>0&&a[i]>a[i-1])
         {
	    flag=flag+1;
	     sum+=flag;
	}
else{
      sum+=1;
    flag=1;
   }
}
	System.out.println("Min Chocolates to be required : " +sum);
	
}
}
    
