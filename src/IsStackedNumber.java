public class IsStackedNumber {
    public static void main(String[] args) {
        int n=15;
        System.out.println(isStackedNumber(n));
    }

    static int isStackedNumber(int n){
        int sum=0;
        int positiveInteger=1;
        while(n>0){
            sum+=positiveInteger;
            if (sum==n)
                return 1;//the argument is stacked
            else if (sum>n) {
                return 0;//the argument is not stacked
            }
            else positiveInteger++;
        }
        return 0;//the argument is not stacked
    }
}
