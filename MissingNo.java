/*
Problem : Missing Number in an Array
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Input Format

N = 5 A[] = {1,2,3,5}

Constraints

1<=N<=10^6 1<=A[i]<=10^6

Output Format

4

Sample Input 0

5
1 2 3 5
Sample Output 0

4
*/



import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum1=0;
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
            sum1 += arr[i];
        }
        int sum2=0;
        for(int i=0;i<n+1;i++){
            sum2+=i;
        }
        System.out.println((sum2-sum1));
    }
}
/*
If input array is sorted then this code will also work
public class Solution {

   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       for(int i=0;i<arr.length-1;i++){
           if(arr[i+1]-arr[i]>1){
               System.out.println((arr[i]+arr[i+1])/2);
               break;
           }
       }
   }
}
*/
