public class IsCumulative {
    public static void main(String[] args) {
        int[] a = {3};
        System.out.println(isCumulative(a));

    }

    static int isCumulative(int[] a) {
        int sum;
        if (a.length<=1)
            return 0;
        for (int index = 0; index < a.length; index++) {
            if (index > 0) {// not to include the zero index
                sum = 0;
                for (int nThElement = 0; nThElement < index; nThElement++) {
                    sum += a[nThElement];
                }
                if (sum!=a[index])
                    return 0;// the array is not cumulative
            }
        }
        return 1;// the array is cumulative
    }
}
