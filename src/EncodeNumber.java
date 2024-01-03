
import java.util.ArrayList;
import java.util.List;

public class EncodeNumber {
    public static void main(String[] args) {
        int number=10;
        System.out.println(encodeNumber(number));
    }
    static List<Integer> encodeNumber(int number){
        int temp=1;
        if (number<=1)
            return null;//the number should greater than or equal to 2
        List<Integer> result= new ArrayList<>();//creating ArrayList that holds unknown number of prime factors
        while(number>1){
            for (int factor = 2; factor <=number ; factor++) {
                if (number%factor==0){
                    if (isPrime(factor)){
                        result.add(factor);//adding prime factors to the ArrayList
                        temp=factor;//I use this to upgrade number after i get a prime number
                        break;//exit from inner for loop to upgrade number
                    }
                }
            }
            //numb
            number/=temp;
        }
        return result;
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

