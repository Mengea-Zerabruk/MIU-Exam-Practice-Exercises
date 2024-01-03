public class IsFiniteLoop {
    public static void main(String[] args) {
        int[] a={1, 5, 4, -1};
        System.out.println(isFiniteLoop(a));
    }

    static int isFiniteLoop(int[] a){
        int countRotation=0;
        int index=0;
        while(index<a.length){
            if (a[index]==-1)
                return -1;
            else if (a[index]<-1 || a[index]>=a.length) {
                return 1;
            }
            else {
                index=a[index];
                countRotation++;
                if (countRotation==a.length)
                    break;
            }
        }
        return 0;// Infinite loop

    }
}
