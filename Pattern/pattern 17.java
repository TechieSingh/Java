// 		*	
// 		*	*	
// *	*	*	*	*	
// 		*	*	
// 		*	
    
    
// *********************************************************************

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int str=1;
        int sp=n/2;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=sp;j++)
            {
                if(i==sp+1){
                    System.out.print("*\t");
                }
                else
                    System.out.print("\t");

            }
            for (int j=1;j<=str;j++)
            {
                System.out.print("*\t");
            }
            if(i<=sp){
                str++;
            }
            else {
                str--;
            }
            System.out.println(" ");
        }
    }
}
