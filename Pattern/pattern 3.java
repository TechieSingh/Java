
// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.

// **********************************************************************************************

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int sp=n-1;
        int str=1;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=sp;j++){
                System.out.print("	");
            }
            for(int k=1;k<=str;k++){
                System.out.print("*	");
            }
            sp--;
            str++;
            System.out.println("");
        }
    }
}
