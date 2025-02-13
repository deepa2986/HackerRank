public class CaesarCipher {

    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        // String s = "I enjoy learning from scalar topics";
        int k = 3;
        String s1 = caesarCipher(s, k);
        System.out.println(s1);
    }



//    public static String caesarCipher(String s,int k){
//
//                // To hold the cipher text
//                StringBuilder result = new StringBuilder();
//
//                // Character by character encryption
//                for (char character : s.toCharArray()) {
//                    if (character != ' ') {
//                        int originalAlphabetPosition = character - 'a';
//
//                        // Applying Caesar Cipher Technique
//                        int newAlphabetPosition = (originalAlphabetPosition + k) % 26;
//                        char newCharacter = (char) ('a' + newAlphabetPosition);
//
//                        // Adding the new character to the result
//                        result.append(newCharacter);
//                    } else {
//                        result.append(character);
//                    }
//                }
//                return result.toString();
//            }


    public static String caesarCipher(String s,int k){
        k = k % 26;
        String cipherText = "";
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                if(Character.isLowerCase(c)){
                    char ch = (char)(c + k);
                    if(ch > 'z'){
                        cipherText += (char)(c - (26 - k));
                    }else cipherText += ch;

                }else if(Character.isUpperCase(c)){
                    char ch = (char)(c + k);
                    if(ch > 'Z'){
                        cipherText += (char)(c - (26 - k));
                    }else cipherText += ch;
                }
            }else cipherText += c;
        }
        return cipherText;
    }
}


