// 		*	
// 	*		*	
// *				*	
// 	*		*	
// 		*	
    
// ***************************************************************************************************************

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        int n=scn.nextInt();
        int isps=-1;
        int osps=n/2;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=osps;j++){
                System.out.print("\t");
            }
            System.out.print("*");
            for(int k=0;k<=isps;k++){
                System.out.print("\t");
            }
            if(isps!=-1){
                System.out.print("*");
            }
            if(i<=n/2){
                osps--;
                isps+=2;
            }
            else if(i>n/2){
                osps++;
                isps-=2;
            }
            System.out.println();
        }

    }
}



