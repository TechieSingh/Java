// 1	
// 1	1	
// 1	2	1	
// 1	3	3	1	
// 1	4	6	4	1	

// ***************************************************************************

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i< n;i++){
            int count = 1;
            for (int j=0;j<=i;j++){
                System.out.print(count+"\t");
                int result= count*(i-j)/(j+1);
                count=result;
            }
            System.out.println();
        }
    }
    
}
