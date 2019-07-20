/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		for(int x=0;x<p;x++){
		    int k=sc.nextInt();
		    int[] a=new int[k+1];
		    a[0]=1;
		    for(int i=3;i<k+1;i++){
		        a[i]+=a[i-3];
		    }
		    for(int i=5;i<k+1;i++){
		        a[i]+=a[i-5];
		    }
		    for(int i=10;i<k+1;i++){
		        a[i]+=a[i-10];
		    }
		    System.out.println(a[k]);
		}
		
	}
}
