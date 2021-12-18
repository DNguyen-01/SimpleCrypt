package Crypto.src;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    private Character cs;
    private Character cf;
    private int shift;

    ROT13(Character cs, Character cf) {

        this.shift = cs-cf;
    }

    ROT13() {
        shift = 13;
    }


    public String crypt(String text) throws UnsupportedOperationException {

        StringBuilder cryptedString = new StringBuilder();

        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(c >= 'a' && c <= 'm'){
                c+= 13;
            }
            else if(c >= 'A' && c <= 'M'){
                c+= 13;
            }
            else if(c >= 'n' && c <= 'z'){
                c-= 13;
            }
            else if(c >= 'N' && c <= 'Z'){
                c-= 13;
            }
            cryptedString.append(c);
        }

        return cryptedString.toString();
    }

    public String encrypt(String text) {

        return crypt(text);

    }

    public String decrypt(String text) {

        return crypt(text);
    }

    public static String rotate(String s, Character c) {

        int spot = s.indexOf(c);
        String beginning = s.substring(spot);
        String end = s.substring(0, spot);
        String join = beginning + end;
        return join;
    }

}
