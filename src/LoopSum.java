public class LoopSum {
    public static void main(String[] args) {
        int n=7;
        int[] a={-1,2,-1};
        System.out.println(loopSum(a, n));
    }
    static int loopSum(int[] a, int n){
        int sum=0;
        int index=0;
        for (int elemnet = 0; elemnet <n ; elemnet++) {
            if (index<a.length)
                sum+=a[index++];
            else {
                index=0;
                sum+=a[index++];
            }
        }
        return sum;
    }
}
