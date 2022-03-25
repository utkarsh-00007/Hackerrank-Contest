/*
Problem

The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area,
‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

Input Format

input two positive integer input size of array input array

Constraints

-1

Output Format

Return -1 if the array is null Return 0 if the total amount of food from all houses is not sufficient for all the rats. Computed values lie within the integer range.

Sample Input 0

7 
2
8
2 8 3 5 7 4 1 2
Sample Output 0

4
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static int function(int r,int unit, int[] arr){
        if(arr==null){
            return -1;
        }
        int check=r*unit;
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            count++;
            if(sum>=check){
                break;
            }
        }
        if(sum<check){
            return 0;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int unit=sc.nextInt();
        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(function(r,unit,arr));
    }
}
