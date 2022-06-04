import java.io.*;
import java.util.*;
import java.util.Scanner;

class validUserName{
    
   public static String name=" ";
    
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read= new Scanner(System.in);
        
        while(read.hasNext()){
            
            String user =read.next();
        
            if(user.matches(validUserName.name))
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }
    }
}