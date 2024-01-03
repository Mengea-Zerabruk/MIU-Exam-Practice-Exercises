public class SecondLargestInteger {
    public static void main(String[] args) {
        int [] a={};
        System.out.println(f(a));
    }
    static int f(int[] a){
        int secondLargestInteger=-1;
        int max=0;
        for (int element:a) {
            if (element>max)
                max=element;
            for (int element2: a) {
                if (element2<max && element2>secondLargestInteger)
                    secondLargestInteger=element2;
            }
        }


        return secondLargestInteger;
    }
}
