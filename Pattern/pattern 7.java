// *	
// 	*	
// 		*	
// 			*	
// 				*	
        
//  *****************************************************************

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int sps =0;
        int str =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sps;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=str;k++){
                System.out.print("*");
            }
            System.out.println("");
            sps++;
        }
    }
}

