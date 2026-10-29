public class ceasar {



    private static int normalizeOffset(int offset){
        return ((offset % 26) + 26) % 26;
    }


    private static String encrypt(String input, int offset){
        offset = normalizeOffset(offset);
        String output = "";
        
        for (char ch : input.toCharArray()){
            if ('A' <= ch && ch <= 'Z'){
                ch = (char) (((ch - 'A') + offset) % 26 + 'A');
            }
            if ('a' <= ch && ch <= 'z'){
                ch = (char) (((ch - 'a') + offset) % 26 + 'a');
            }
            output += ch;
        }
        
        return output;
    }

    private static String decrypt(String input, int offset){
        offset = normalizeOffset(offset);
        return encrypt(input, -offset);
    }

    public static void main(String[] args) {
        int offset = 3;
        String word = "XYZ";

        String encrytpedWord = encrypt(word, offset);
        System.out.println(encrytpedWord);
        String decryptedWord = decrypt(encrytpedWord, offset);
        System.out.println(decryptedWord);



    }
}
