public class IsEvens {
    public static void main(String[] args) {
        int n=8264;
        System.out.println(isEvens(n));
    }

    static int isEvens(int n){
        int digit;
        while(n!=0){
            digit=n%10;
            if (digit%2!=0)
                return 0;// not every digit of the integer are even numbers
            n/=10;
        }
        return 1;// every digit of the integer are even numbers
    }
}
