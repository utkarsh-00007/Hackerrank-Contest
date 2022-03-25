/*
Password Checker
Problem

You are given a function int CheckPassword(String str, int n);

The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0. str is a valid password if it satisfies the below conditions.

– At least 4 characters

– At least one numeric digit

– At Least one Capital Letter

– Must not have space or slash (/)

– Starting character must not be a number

Example:

Input:

aA1_67

Output:

1

Sample Input:

a987 abC012

Output:

0

Input Format

A string and n for string size.

Constraints

Input string will not be empty.

Output Format

Returns 1 if given string str is valid password else 0.

Sample Input 0

aA1_67
Sample Output 0

1
 */
import java.io.*;
import java.util.*;
public class PasswordChecker {
    public static int checkPassword(String str){
        if (str.length()<4){
            return 0;
        }
        else {
            char c;
            int count1=0;
            int count2=0;
            for (int i = 0; i < str.length(); i++) {
                c=str.charAt(i);
                if (Character.isDigit(c)){
                    count1++;
                    if (count1<1){
                        return 0;
                    }
                }
                if (Character.isUpperCase(c)){
                    count2++;
                    if (count2<1){
                        return 0;
                    }
                }
                if (c==' '||c=='/'){
                    return 0;
                }
            }
            String str1="1234567890";
            for (int i = 0; i < 10; i++) {

                if (str.charAt(0)==str1.charAt(i)){
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(checkPassword(str));

    }
}
