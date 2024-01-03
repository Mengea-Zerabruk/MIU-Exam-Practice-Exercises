/*
Write a method that raises a number to a power without using Math.pow() method
 */
public class XPowerOfN {
    public static void main(String[] args) {
        int x=2;
        int n=-3;
        System.out.println(xPowerOfN(x,n));
    }
    static double xPowerOfN(int x, int n){
        double result=1;
        if (n>0){
            for (int powerOf = 1; powerOf <=n ; powerOf++)
                result*=x;

        } else if (n<0) {
            for (int powerOf = -1; powerOf >=n ; powerOf--)
                result*=(1/x);

        }
        return result;
    }
}
