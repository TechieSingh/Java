// 1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
// 2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
// 3. Take input "num1" and "num2" as the two numbers.
// 4. Print their GCD and LCM.

// ****************************************************************************************************

import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();

        int on1=n1;
        int on2=n2;

        while (n1%n2!=0){
            int res = n1 % n2;
            n1=n2;
            n2=res;
        }

        int gcd=n2;
        int lcm=(on1*on2)/gcd;



    }
}

