// *	*	*		*	*	*	
// *	*				*	*	
// *						*	
// *	*				*	*	
// *	*	*		*	*	*

// ***************************************************************************

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int sps =n/2;
        int str =1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=sps;j++){
                System.out.print("*\t");
            }
            for(int k=1;k<=str;k++){
                System.out.print("\t");
            }
            for(int l=0;l<=sps;l++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                sps--;
                str+=2;
            }
            else{
                sps++;
                str-=2;
            }
            System.out.println("");
        }
    }
}
