public class IsMagicArray {
    public static void main(String[] args) {
        int [] a={8, 5,-5, 5, 3};
        System.out.println(isMagicArray(a));
    }

    static int isMagicArray(int [] a){
        int sumOfPrimes=0;
        for (int element:a) {
            if (isPrime(element))
                sumOfPrimes+=element;
        }
        if (sumOfPrimes!=a[0])
            return 0;
        return 1;
    }
    static boolean isPrime(int element){
        int countFactors=0;
        if (element<2)
           return false;
        for (int factor = 1; factor <=element ; factor++) {
            if (element%factor==0)
                countFactors++;
        }
        if (countFactors>2)
            return false;// more than two factors i.e. not prime number
        return true;
        }

    }

