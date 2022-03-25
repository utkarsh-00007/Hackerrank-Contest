/*
Problem

Create the function that accepts an integer array ‘arr’, its length and two integer variables ‘num’ and ‘diff’.
Implement this function to find and return the number of elements of ‘arr’ having an absolute difference of less than or equal to ‘diff’ with ‘num’.
Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than or equal to ‘diff’, return -1.

Input Format

size of array input array two integers num and diff

Constraints

1

Output Format

print count of elements of ‘arr’ having absolute difference of less than or equal to ‘diff’

Sample Input 0

6
12 3 14 56 77 13
13
2
Sample Output 0

3

*/
import java.io.*;
import java.util.*;
public class Solution {
    public static int solve(int n,int arr[],int num,int diff)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            int res=Math.abs(arr[i]-num);
            if(res<=diff)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        } 
        int num=s.nextInt();
        int diff=s.nextInt();
        System.out.println(solve(n,arr,num,diff));
    }
}
