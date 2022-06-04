import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        int n;
           
        n = read.nextInt();   
        
         if (n % 2==0){
             if(n >= 2 || n < 5)
        System.out.printf("Not Weird");
        
            else if(n >=6 || n <= 20)
        System.out.printf("Weird");  
           else 
        System.out.printf("Not Weird");   
        } else {
            System.out.printf("Weird"); 
        }
         
    }
}