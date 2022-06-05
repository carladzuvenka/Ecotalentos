import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        
        int t = read.nextInt();
        
        for(int i=0; i < t; i++){
            
             
            try{
                
                long a = read.nextLong();
                
                System.out.println(a+" can be fitted in:");
                
                if(a >= -128 && a <= 127 )
                System.out.println("* byte");
                if(a >= -32768 && a <= 32767 )
                System.out.println("* short");
                if(a >= -2147483648 && a <= 2147483647 )
                System.out.println("* int");
                if(a >= -922337203685477580l && a <= 922337203685477580l )
                System.out.println("* long");
                
                
                 
            }catch (Exception e){
                System.out.println("cant be fitted anywhere.");
            }
        }
    }
}