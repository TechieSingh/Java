// 1. You've to print first n fibonacci numbers.
// 2. Take as input "n", the count of fibonacci numbers to print.
// 3. Print first n fibonacci numbers.
// **************************************************************

import java.util.*;

public class Main{

    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();

        int a=0;
        int b=1;
        int c;
        int count=0;

        System.out.println(a);
        System.out.println(b);

        for(int i = 0; i<n; i++){
            c=a+b;
            a=b;
            b=c;
            if(i<n-2){
                System.out.println(c);
                count++;
            }
        }
    }

}
