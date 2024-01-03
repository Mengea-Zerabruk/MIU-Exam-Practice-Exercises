public class IsBalanced {
    public static void main(String [] args){
        int[] a={-2, 3, 2,3};
        System.out.println(isBalanced(a));
    }

    static int isBalanced(int[] a){
        boolean elementHasMirror;
        for (int outer: a) {
            elementHasMirror=false;
            for (int element:a) {
                if (element==(-1*outer)) {
                    elementHasMirror = true;
                    break;
                }
            }
            if (!elementHasMirror)
                return 0;// the array element doesn't have mirror value
        }
        return 1;// the array elements have mirror value
    }
}
