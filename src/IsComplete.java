public class IsComplete {
    public static void main(String[] args) {
        int[] a={5, 7, 9, 13};
        System.out.println(isComplete(a));
    }

    static int isComplete(int[] a){
        boolean containsEvenNumber=false;

        boolean numberExists;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int element:a) {
            if (element%2==0){
                containsEvenNumber=true;
                if (element<min){
                    min=element;

                }
                if (element>max){
                    max=element;

                }
            }
        }
        if (min==max || !containsEvenNumber )
            return 0;// condition a-d doesn't satisfied
        for (int numbers = min; numbers <=max ; numbers++) {
            numberExists=false;
            for (int element:a) {// checking min max numbers are with in the array
                if (numbers==element)
                    numberExists=true;
            }
            if (!numberExists)
                return 0;// the number between min and max doesn't exist in the array
        }
        return 1;// satisfies all conditions
    }
}
