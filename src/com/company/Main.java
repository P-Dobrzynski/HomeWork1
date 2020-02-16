package com.company;

import java.util.*;

import static java.lang.Math.*;
import static java.lang.Math.pow;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.print("n pierwszych liczb fibonacciego to: ");
//        fibonacci(12);
//        System.out.print("number to array: ");
//        numbersToArray(1024);
//        System.out.print("odwrócona liczba całkowita: ");
//        System.out.println(reverseNumber(123456) +"\n");
        int[] aOne= {1,0,2,4};
        int[] aTwo= {2,5};
//        System.out.print("dodane dwie liczby w postaci tablicowej: ");
//        System.out.println(addingTwoArrays(aOne, aTwo));
//        addingTwoArrays2(aOne, aTwo);
//        symbolToAscii();
//        asciiToSymbol();
//        System.out.println(CaesarCipher.caesarCipher("Ala ma kota",3));
//        System.out.println(CaesarCipher.ceaserDecipher("Dod pd nrwd",3));
//        Drawing.drawSquare();
//        Drawing.drawTriangle();
//        Drawing.drawBiggerSquare();
//        ifPitragoras(5, 3, 4);
//        ifPalindrome("ada");
//        ifAnagram("listen", "silent");

    }
// Napisz funkcję wypisującą N pierwszych liczb ciągu Fibonacciego.
    public static void fibonacci(int n) {
        ArrayList fibonacciList=new ArrayList<Integer>();

        if (n == 0) fibonacciList.add(n);
        if (n == 1) fibonacciList.add(n);
        int f=0;
        int f1=1;
        fibonacciList.add(0);
        fibonacciList.add(1);
        for (int i=2; i <= n; i++) {
            int m=f + f1;
            f=f1;
            f1=m;
            fibonacciList.add(m);
        }
        System.out.println(fibonacciList.toString());
    }
// Napisz funkcję, która zwraca wszystkie cyfry liczby całkowitej w postaci tablicy. Przykład: 1024: [1,0,2,4].
    public static void numbersToArray(int number) {
        ArrayList numbersToListConverter=new ArrayList<Integer>();

        if (number == 0) numbersToListConverter.add(0);
        if (number < 0) System.out.print("Error, add a positive number ");
        for (; number > 0; number=number / 10) {
                if (number % 10 == 0) numbersToListConverter.add(0, 0);
                else if (number % 10 != 0) numbersToListConverter.add(0, number % 10);
        }

        System.out.println(numbersToListConverter.toString());
    }
// Napisz funkcję, która odwraca liczbę całkowitą, np. 123456 -> 654321.
    public static int reverseNumber ( int number) {
        int reversed=0;

       while (number != 0) {
            int lastDigit = number % 10;
            reversed = (reversed * 10) + lastDigit;
            number /= 10;
        }
        return reversed;
    }
// Napisz funkcję, która dodaje dwie liczby zapisane w postaci tablicowej. Wynik również zapisujemy
// w postaci tablicy. Przykład: [1,0,2,4] i [2,5] -> [1,0,4,9].
    public static ArrayList addingTwoArrays (int[] aOne, int[] aTwo){
        ArrayList addedArray = new ArrayList();
        if ( aOne[0] == 0 && aTwo[0] == 0) addedArray.add(0, 0);
        int result1 = 0;
        int result2 = 0;
        int addedArraysResult;
        int numberCount =0;
        for(int i = 0; i < aOne.length; i++){
            result1 *= 10;
            result1 += aOne[i];
        }
        for(int j = 0; j<aTwo.length; j++) {
            result2 *= 10;
            result2 += aTwo[j];
        }
        addedArraysResult=result1 + result2;
        int couter= addedArraysResult;
       while ( couter != 0) {
           couter /= 10;
           numberCount++;
       }

        for(int k = 0; k <numberCount; k++ ) {
            int temp = addedArraysResult % 10;
            addedArraysResult /= 10;
            addedArray.add(0, temp);
        }
        return addedArray;
    }

    // próba druga - nie działa !!!
    public static void addingTwoArrays2 (int[] aOne, int[] aTwo){
        int[] result = new int[aOne.length];
        int lengthDiff = aOne.length - aTwo.length;
        int temp;
        int addedtemp = 0;
        for(int i = aTwo.length -1; i >= 0 ; i--) {
            result[i+lengthDiff] = aOne[i+lengthDiff] + aTwo[i] + addedtemp;

            if ( result[i+lengthDiff] > 10 ) {
                temp = result[i+lengthDiff] % 10;
                result[i+lengthDiff] = temp;
                addedtemp = 1;
            }else if (result[i+lengthDiff] == 10 ){
                addedtemp = 1;
                result[i+lengthDiff] = 0;
            }
        }
        result[0] = aOne[0];
        result[1] = aOne[1];
        System.out.println(result.toString());
    }


// Napisz program wyświetlający kod ASCII wprowadzonego znaku.
    public static void symbolToAscii () {
        System.out.println("\nwrite one symbol, to convert to ascii code(only first symbol will be converted): ");;
        char ch = scanner.next().charAt(0);
        int ascii = ch;
        System.out.println("ascii of your symbol is: " + ascii);
    }
// Napisz program wyświetlający znak dla podanego kodu ASCII.
    public static void asciiToSymbol () {
            System.out.println("\nwrite ascii code to convert: ");
            while (!scanner.hasNextInt()) {
                System.out.println("error, this is not a number ");
                System.out.println("write ascii code to convert: ");
                scanner.next();
            }
            int ascii=scanner.nextInt();
            char ch = (char) ascii;
        System.out.println("ascii code of your character is: " + ch);

    }

    //Wykorzystując twierdzenie Pitagorasa napisz program, który pobiera 3 liczby i sprawdza
    // czy są one poprawnymi długościami boków trójkąta prostokątnego.

    public static void ifPitragoras (int a, int b, int c) {
        if (pow(a, 2) + pow(b, 2) == pow(c, 2) ||
                pow(a, 2) + pow(c, 2) == pow(b, 2) ||
                pow(b, 2) + pow(c, 2) == pow(a, 2)) {
            System.out.println(" boki: " + a + ", " + b + ", " + c + " są bokami trójkąta prostokątnego. ");
        } else {
            System.out.println(" podane liczby nie są bokami trójkąta prostokątnego");
        }
    }
    //Napisz program sprawdzający czy dany String jest palindromem.

    public static void ifPalindrome ( String word){
       ArrayList original = new ArrayList<String>();
       original.add(word);
       ArrayList ifPalindrome = new ArrayList<String>();
        for(int i = original.size()-1; i>=0; i--){
            ifPalindrome.add(0, original.get(i));
        }
        if (original.equals(ifPalindrome)) {
            System.out.println("Podane słowo jest palindromem");
        }else System.out.println("Podane słowo nie jest palindromem");
    }

//Napisz program sprawdzający czy dany String jest anagramem drugiego stringa.
    public static void ifAnagram ( String word1, String word2) {
        char a1[]=word1.toCharArray();
        char a2[]=word2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(a1);
        System.out.println(a2);
        if (word1.compareTo(word2) == 0) {
//            System.out.println("poodane słowa są anagramem");
//        }else {
//            System.out.println("podane słowa nie są anagramem");
//        }
        }

    }

}
