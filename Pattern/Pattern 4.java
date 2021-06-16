Pattern 4

// **************************************************************

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int str=n;
        int sp=0;
            for(int i=0;i<n;i++){
                for(int j=sp;j>0;j--) {
                    System.out.print("\t");
                }
                for(int j=str;j>0;j--) {
                    System.out.print("*\t");
                }
                sp++;
                str--;
                System.out.println("");
            }


    }
}
