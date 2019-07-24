/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();
		for(int x=0;x<z;x++){
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    System.out.println(path(m,n));
		    
		}
		
	}
	static int path(int m,int n){
		    int[][] a=new int[m][n];
		    for(int i=0;i<m;i++){
		        a[i][0]=1;
		    }
		    for(int j=0;j<n;j++){
		        a[0][j]=1;
		    }
		    if(m>1 && n>1){
		    for(int i=1;i<m;i++){
		        for(int j=1;j<n;j++){
		            a[i][j]=a[i-1][j]+a[i][j-1];
		        }
		    }
		    }
		    return a[m-1][n-1];
		}
}
