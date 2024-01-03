public class IsAllPossibilities {
    public static void main(String[] args) {
        int[] a={0};
        System.out.println(isAllPossibilities(a));
    }
    static int isAllPossibilities(int[] a){
        if (a.length<1)
            return 0;//empty array
        boolean checker;
        for (int possibleNumber = 0; possibleNumber <a.length ; possibleNumber++) {
            checker=false;
            for (int element:a) {
                if (possibleNumber==element){
                    checker=true;
                    break;
                }
            }
            if (!checker)
                return 0;//the possible number is not included in the array
        }
        return 1;// the array contains all the possible numbers
    }
}
