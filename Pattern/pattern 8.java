// 				*	
// 			*		
// 		*			
// 	*				
// *


// ****************************************************************************

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int sps =n-1;
        for(int i=1;i<=n;i++){
            for(int j=sps;j>0;j--) {
                System.out.print("\t");
            }
            System.out.println("*");
            sps--;
        }
    }
}
