// 1. You are required to check if a given set of numbers is a valid pythagorean triplet.
// 2. Take as input three numbers a, b and c.
// 3. Print true if they can form a pythagorean triplet and false otherwise.

// **************************************************************************************************

import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        a=a*a;
        b=b*b;
        c=c*c;
        
        
        if(a + b == c){
            System.out.println("true");
        }
        else if(a + c == b){
            System.out.println("true");
        }
        else if(c + b == a){
            System.out.println("true");             
        }
        else {
            System.out.println("false");
        }

    }
}
