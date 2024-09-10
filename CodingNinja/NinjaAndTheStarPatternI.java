/*
if n = 3
***
* *
***
 */
public class NinjaAndTheStarPatternI {
    public static void getStarPattern(int n) {
        // Write your code here
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                // System.out.print("*");
                if(j>0 && j<n-1 && i>0 && i<n-1)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        int n = 5;
        getStarPattern(n);
    }
}
