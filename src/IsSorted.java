public class IsSorted {
    public static void main(String[] args) {
        int[] a={1,2,5,6,3};
        System.out.println(isSorted(a));
    }
    static int isSorted(int[] a){
        if (a.length==0)
            return 1;
        int previousValue=a[0];
        boolean checkerAscending=false;
        boolean checkerDescending=false;
        for (int element: a) {
            if(element>previousValue) {
                previousValue = element;
                checkerAscending = true;
            } else if (element<previousValue) {
                previousValue=element;
                checkerDescending=true;
            }
            if (checkerAscending && checkerDescending)
                return 0;
        }
        return 1;
    }
}
