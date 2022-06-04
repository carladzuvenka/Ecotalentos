import java.io.*;
import java.util.*;
import java.util.Scanner;

class MyRegex{
 
    String pattern = " ";
    
}


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    Scanner read = new Scanner(System.in); 
    
     while(read.hasNext()){
    
        String ip;
    
        ip=read.next();
    
        System.out.println(ip.matches(new MyRegex().pattern));
     }
    
    }
    
   
}
