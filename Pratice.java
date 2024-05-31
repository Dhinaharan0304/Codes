package IBM_Test;

import java.util.Arrays;
import java.util.Vector;

public class Pratice {
	 public static void password() {
    	 String pwd="101011";
    	 int count=0;
    	 for(int i=0;i<pwd.length()-1;i+=2) {
    		 if(pwd.charAt(i)!=pwd.charAt(i+1)) {
    			 count++;
    		 }
    	 }
    	 System.out.println("password count: "+count);
     }
     static void sumofarray() {
    	 Vector<Integer> vector=new  Vector();
    	 Vector<Integer> ans=new  Vector();
    	 vector.add(2);
    	 vector.add(4);
    	 vector.add(3);
    	 ans.add(0);
    	 System.out.println("original vector: "+vector);
    	  for(int i=1;i<vector.size();i++) {
    		  int sum=0;
    		  int ele=0;
    		  for(int j=0;j<i;j++) {
    			  sum+=vector.elementAt(i)-vector.elementAt(j);
    		  }
    		  ans.add(sum);
    	  }
    	  System.out.println("original vector: "+ans);
     }
     static void missnum() {
    	 int[] arr= {1,3,5,2,5};
    	 int[] ans=new int[arr.length];
    	 for(int i=0;i<arr.length;i++) {
    		 ans[arr[i]-1]++;
    	 }
    	 System.out.println(Arrays.toString(ans));
    	 for(int i=0;i<ans.length;i++) {
    		 if(ans[i]==0) {
    			 System.out.println(i+1);
    			 break;
    		 }
    	 } 
     }
     static void diagonal() {
    	 int[][] arr= {
    			 {1,2,3},
    			 {4,5,6},
    			 {9,8,9}
    	 };
    	 int ans1=0;
    	 int ans2=0;
    	 int n=arr.length;
    	 int m=arr[0].length;
    	 for(int i=1;i<=n;i++) {
    		 for(int j=1;j<=n;j++) {
    			 
    			 if(i==j && j==n+1-i) {
    				 ans1+=arr[i-1][j-1];
    				 ans2+=arr[i-1][j-1];
    			 }
    			 else if(i==j) {
    				 ans2+=arr[i-1][j-1];
    			 }
    			 else if(j==n+1-i) {
    				 ans1+=arr[i-1][j-1];
    			 }
    		 }
    	 }
    	 System.out.println("ans1:"+ans1+"ans2: "+ans2);
    	 System.out.println(ans1-ans2);
     }
     static void triplets() {
    	 int[] arr= {3,3,4,7,8};
    	 int n=arr.length;
    	 int d=5;
    	 int count=0;
    	 //culuative of sum
    	 int[] prefixsum=new int[n+1];
    	for(int i=1;i<=n;i++) {
    		prefixsum[i]=prefixsum[i-1]+arr[i-1];
    	}
    	 System.out.println(Arrays.toString(prefixsum));
    	 
    	 for(int i=0;i<n-1;i++) {
    		 for(int j=i+1;j<=n;j++) {
    			 int sum=prefixsum[i]-prefixsum[j];
    			 if(sum%d==0) {
    				 count++;
    			 }
    		 }
    	 }
    	 System.out.println(count);
     }
     static void odd_and_even() {
		 int[] arr= {3,4,9};
		 int[] ans=new int[arr.length];
		 int value=3;
		 for(int i=0;i<value;i++) {
			 for(int j=0;j<arr.length;j++) {
				 if(arr[j]%2==0) {
					arr[j]-=value;	
				 }
				 else arr[j]+=value;
		   }
			 System.out.println(i+": "+Arrays.toString(arr));
		 }
	 }
     
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		password();
		sumofarray();
		missnum();
		diagonal();
		triplets();
		odd_and_even();
	}

}
