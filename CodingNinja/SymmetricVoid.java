/*
* * * * * * 
* *     * * 
*         * 
*         * 
* *     * * 
* * * * * * 
 */
public class SymmetricVoid {
    public static void symmetry(int n) {
        // Write your code here
        int space = 0;
        // upper shape 
        for(int i = 0;i<n;i++)
        {
            //stars 
            for(int j = n;j>i;j--)
            {
                System.out.print("* ");
            }

            // spaces 
            for(int j = 1;j<=space;j++)
            {
                System.out.print("  ");
            }
            
            // stars
            for(int j = i;j<n;j++)
            {
                System.out.print("* ");
            }
            space+=2;
            System.out.println();

        }
        space-=2;
        // downside
        for(int i = 0;i<n;i++)
        {
            //stars
            for(int j = 0;j<=i;j++)
            {
                System.out.print("* ");
            } 
            

            // spaces 
            for(int j = 1;j<=space;j++)
            {
                System.out.print("  ");
            }
            
            // stars
            for(int j = 0;j<=i;j++)
            {
                System.out.print("* ");
            }
            space -=2;
            System.out.println();

        }

    }

    public static void main(String[] args) {
        int n = 5;
        symmetry(n);
    }

}
