package com.company;

public class CaesarCipher {
// Napisz program, który potrafi zaszyfrować i odszyfrować wiadomość przy użyciu szyfru Cezara.
    public CaesarCipher() {
    }

    static String caesarCipher(String value,int shift) {
        char[] charArray=value.toCharArray();

        for (int i=0; i < charArray.length; i++) {
            if (charArray[i] == ' ') charArray[i] = ' ';
            else if (charArray[i] != ' ') {
                char letter=charArray[i];
                letter=(char) (letter + shift);
                charArray[i]=letter;
            }
        }

        return new String(charArray);
    }
    static String ceaserDecipher(String value, int shift) {
        char[] charArray=value.toCharArray();

        for (int i=0; i < charArray.length; i++) {
            if (charArray[i] == ' ') charArray[i]=' ';
            else if (charArray[i] != ' ') {
                char letter=charArray[i];
                letter=(char) (letter - shift);
                charArray[i]=letter;
            }
        }
        return new String(charArray);
    }
}
