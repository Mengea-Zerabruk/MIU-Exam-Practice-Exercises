public class IsLayered {
    public static void main(String[] args) {
        int[] a={};
        System.out.println(isLayered(a));
    }
    //Option 1:
//    static int isLayered(int[] a){
//        if (a.length<2)
//            return 0;//it requires at least two elements
//        int previousValue=a[0];
//        int countElement;
//        for (int index = 0; index <a.length ; index++) {
//            countElement=0;
//            for (int element:a) {
//                if (element==a[index])
//                    countElement++;
//                if (countElement>1)
//                    break;//at least two elements
//            }
//            if (countElement<2 || previousValue>a[index])
//                return 0;// either the array is not in ascending order or each element is not appeared 2 or more times
//            else previousValue=a[index];
//        }
//        return 1;// the array is layered array
//    }
    //Option 2:
      static int isLayered(int[] a){
        if(a.length<2)
            return 0;// the array requires at least two elements
        int previousValue=a[0];
        for (int element:a) {
            if (countElement(a, element)<2 || previousValue>element)
                return 0;
            else previousValue=element;
        }
        return 1;
    }
    static int countElement(int[] a, int element){
        int countElement=0;
            for (int arrayElement:a) {
                if (arrayElement==element)
                    countElement++;
            }
            return countElement;
    }
}
