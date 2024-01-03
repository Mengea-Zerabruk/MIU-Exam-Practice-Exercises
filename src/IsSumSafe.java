public class IsSumSafe {
    public static void main(String[] args) {
        int[] a={5,-5,0};
        System.out.println(isSumSafe(a));
    }
    static int isSumSafe(int[] a){
        int sum=0;
        for (int element:
             a) {
            sum+=element;
        }
        for (int element:a) {
            if (sum==element)
                return 0;//the array is not sum safe

        }
        return 1; //the array is sum safe
    }
}
