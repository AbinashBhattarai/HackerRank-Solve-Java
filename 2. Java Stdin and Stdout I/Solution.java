import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int[] inputs = new int[3];
        
        int i = 0;
        while (i < 3) {
            inputs[i] = Integer.valueOf(scan.nextLine());
            i++;
        }
        scan.close();
        
        for (int num : inputs) {
            System.out.println(num);
        }  
    }
}