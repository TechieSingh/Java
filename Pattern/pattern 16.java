// 1												1	
// 1	2										2	1	
// 1	2	3								3	2	1	
// 1	2	3	4						4	3	2	1	
// 1	2	3	4	5				5	4	3	2	1	
// 1	2	3	4	5	6		6	5	4	3	2	1	
// 1	2	3	4	5	6	7	6	5	4	3	2	1

// *******************************************************************************************

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int sp=2*n-3;
        int st=1;
        for(int i=1;i<=n;i++){
            int ford=1;
            for(int j=1;j<=st;j++){
                System.out.print(ford+"\t");
                ford++;
            }
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            int back=i;
            for(int j=1;j<=st;j++)
            {
                if(i==n){
                    st=n-1;
                    back--;
                    System.out.print(back+"\t");
                }
                else{
                    System.out.print(back+"\t");
                    back--;
                }
            }
            sp-=2;
            st++;
            System.out.println("");
        }
    }
}
