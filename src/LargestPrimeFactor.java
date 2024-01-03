public class LargestPrimeFactor {
    public static void main(String[] args) {
        int number=6936;
        System.out.println(largestPrimeCount(number));
    }
    static int largestPrimeCount(int number){
        int largestPrimeFactor=0;
        if (number<=1)
            return 0;//prime number is a number greater than or equal to 2
        for (int factor = 1; factor <=number ; factor++) {
            if (number%factor==0){
                if (isPrime(factor))
                    largestPrimeFactor=factor;
            }
        }
        return largestPrimeFactor;
    }
    static boolean isPrime(int primeFactor){
        int count=1;
        if (primeFactor==2)
            return true;
        for (int factors = 2; factors <primeFactor ; factors++) {
            if (primeFactor%factors==0)//how many times does it divided
                count++;
            if (count>1)
                return false;//not prime number i.e, more than one factors
        }
        return true;
    }
}
