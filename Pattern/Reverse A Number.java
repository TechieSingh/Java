// 1. You've to display the digits of a number in reverse.
// 2. Take as input "n", the number for which digits have to be display in reverse.
// 3. Print the digits of the number line-wise, but in reverse order.

// ***********************************************************************************

import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String n = scn.nextLine();
        int l = n.length();
        for(int i=1;i<=l;i++){
            System.out.println(n.charAt(l-i));
        }
    }
}
