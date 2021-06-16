// 		1	
// 	2	3	2	
// 3	4	5	4	3	
// 	2	3	2	
// 		1	
    
    
//     ********************************************************************************************
    
    
package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n/2;
        int st = 1;
        int no =1;
        for(int i = 1; i<= n;i++)
        {
            for(int j =1;j<=sp;j++)
            {
                System.out.print("\t");
            }
            int val=no;//as the value of no changes val will start with it.
            for(int j = 1; j<= st; j++)
            {
                System.out.print(val+"\t");
                if(j<=st/2){
                    val++;
                }
                else {
                    val--;
                }

            }
            if(i <= n/2)
            {
                sp--;
                st += 2;
                no++;
            }
            else
            {
                sp++;
                st -= 2;
                no--;
            }
            System.out.println();

        }
    }
}
