// 0	
// 1	1	
// 2	3	5	
// 8	13	21	34	
// 55	89	144	233	377

// ************************************************************************


import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int k=0;
        int l=1;
        int m=1;
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++) {
                System.out.print(k+"\t");
                k=l;
                l=m;
                m=k+l;
            }
            System.out.println();
        }

    }
}
