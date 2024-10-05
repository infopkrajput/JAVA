@SuppressWarnings({ "resource", "unused" })
public class ch7B_a {
    public static void main(String[] args) {
        int i = 3, j = 4, k, l;
        k = addMult(i, j);
        l = addMult(i, j);
        System.out.println(k + " " + l);
    }

    static int addMult(int ii,int jj)
    {
        int kk,ll;
        kk = ii+jj;
        ll = ii*jj;
        // return(kk,ll); // Error because any return statement can not return two values
        return 0;
    }
}
