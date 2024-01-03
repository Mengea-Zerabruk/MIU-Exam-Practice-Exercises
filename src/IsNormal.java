public class IsNormal {
    public static void main(String[] args) {
        int n=12;
        System.out.println(isNormal(n));
    }
    static int isNormal(int n){
        if (n==0 || n==1)
            return 1;
        for (int factors = 2; factors <n ; factors++) {
            if(n%factors==0){
                if (factors%2!=0)
                    return 0;// odd factors
            }
        }
        return 1;
    }
}
