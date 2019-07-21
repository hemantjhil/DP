/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		//code
		//Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//int n=sc.nextInt();
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++){
		int t=Integer.parseInt(br.readLine());
		long[] a=new long[t+1];
		a[0]=1;
		a[1]=2;
		for(int x=2;x<=t;x++){
		    a[x]=a[x-1]+a[x-2];
		}
		System.out.println(a[t-1]);
		}
	}
}
