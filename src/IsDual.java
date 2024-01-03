public class IsDual {
    public static void main(String[] args) {
        int[] a={1, 2, 2, 1, 3,0};
        System.out.println(isDual(a));
    }
    static int isDual(int[] a){
        if (a.length%2 !=0)
            return 0;// odd length of array
        if (a.length==0)
            return 1;//always dual array
        int sumOfConsecutiveElements=a[0]+a[1];
        int temp;
        for (int index = 0; index <a.length ; index+=2) {
            if ((a[index]%2==0 && a[index+1]%2!=0) ||
                    (a[index]%2!=0 && a[index+1]%2==0)){
                temp=a[index] +a[index+1];
            }
            else return 0;// Consecutive elements are even and odd or vice versa

            if (sumOfConsecutiveElements!=temp)
                return 0;// sum of consecutive elements is not equal
        }
        return 1;
    }
}
