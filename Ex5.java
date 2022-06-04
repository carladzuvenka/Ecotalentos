import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        
        String a,b;
        
        a= read.next();
        b=read.next();
        
        
        System.out.println(a.length()+b.length());
       
       if( b.charAt(0) > a.charAt(0) )
        System.out.println("No");
       else 
        System.out.println("Yes");
        
        a = (a.substring(0,1)).toUpperCase() + a.substring(1);       
        b = (b.substring(0,1)).toUpperCase() + b.substring(1);
        
        
        System.out.println(a+" "+ b);
    }
}