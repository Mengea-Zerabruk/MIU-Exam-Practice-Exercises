public class CountChar {
    public static void main(String[] args) {
        /*
        Given a String and a character return how many times the given character is present in that
        string.
         */
        char character='a';
        String string= "Mengea Zerabruk";
        System.out.println(countACharacter(string, character));
    }

    static int countACharacter(String string, char character){
        int countChar=0;
        for (int index = 0; index <string.length() ; index++) {

            if (string.charAt(index)==character)
                countChar++;
        }
        return countChar;
    }
}
