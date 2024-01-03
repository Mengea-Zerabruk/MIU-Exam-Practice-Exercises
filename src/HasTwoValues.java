public class HasTwoValues {
    public static void main(String[] args) {
        int[] a={};
        System.out.println(hasTwoValues(a));
    }
    static int hasTwoValues(int[] a){
        if (a.length<2)
            return 0;// at least two elements required
        int differentValues=1;
        int firstValue=a[0];
        int secondValue;
        for (int element:a) {
            if (element!=firstValue && differentValues==1){
                differentValues++;
                secondValue=element;
            } else if (element!=firstValue && differentValues==2) {
                return 0;// the array contains more than two different values
            }
        }
        if (differentValues<2)
            return 0;//the array contains only one value
        return 1;
    }
}
