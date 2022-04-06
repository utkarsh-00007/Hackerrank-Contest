/*
Problem : Matrix Diagonal Sum
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

Input Format

mat = [[1,2,3], [4,5,6], [7,8,9]]

Constraints

n == mat.length == mat[i].length 1 <= n <= 100 1 <= mat[i][j] <= 100

Output Format

25 Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25 Notice that element mat[1][1] = 5 is counted only once.

Sample Input 0

 3 
 1 2 3
 4 5 6 
 7 8 9
Sample Output 0

25
*/



import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // for(int i=0;i<n;i++){ //for displaying array because it looks quite good
        //     for(int j=0;j<n;j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        int sum1=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i==j){
                   sum1 +=arr[i][j];
                }
                if (i!=j &&i+j==n-1){
                    sum1 += arr[i][j];
                }
            }
        }
        System.out.println(sum1);
    }
}
