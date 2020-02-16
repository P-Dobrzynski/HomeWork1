package com.company;

import java.util.Scanner;

public class Drawing {
    //    Napisz program rysujący kwadrat ze znaków ASCII. Długość boku wprowadza użytkownik.
    private static Scanner scanner=new Scanner(System.in);

    public static void drawSquare() {
        System.out.println("Podaj bok kwadratu: ");
        int squareSide=scanner.nextInt();
        for (int i=0; i < squareSide; i++) {
            for (int j=0; j < squareSide; j++) {
                System.out.print(" $");
            }
            System.out.println();
        }

    }
//    Napisz program rysujący trójkąt ze znaków ASCII. Długość podstawy i wysokość wprowadza użytkownik.

    public static void drawTriangle() {
        System.out.println("Podaj bok trójkąta: ");
        int edge=scanner.nextInt();
        for (int i=0; i < edge; i++) {
            for (int j=edge - i; j < edge; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

// Napisz program rysujący kwadrat ze znaków ASCII. Każdy z jego wewnętrznych trójkątów wyznaczonych
// przez boki i przekątne kwadratu powinien być narysowany przy użyciu innego znaku ASCII.

    public static void drawBiggerSquare() {
        int squareSide = 9;
        for (int i=1; i <=squareSide; i++) {
            for (int j=1; j <= squareSide; j++) {
                if (i == 1 || j == 1 || i == squareSide || j == squareSide ||
                        i == j || j == squareSide - i + 1) {
                    System.out.print(" @");
                }else if ((i == 2 && (j>2 && j<8)) || (i==3 && (j>3 && j<7)) || (i==4 && j==5) ) {
                    System.out.print(" +");
                }else if ((i==6 & j==5) || (i==7 && (j>3 && j<7)) || (i ==8 && (j>2 && j<8))) {
                    System.out.print(" -");
                }else if ((j==6 & i==5) || (j==7 && (i>3 && i<7)) || (j ==8 && (i>2 && i<8))) {
                    System.out.print(" ^");
                }else if ((j == 2 && (i>2 && j<8)) || (j==3 && (i>3 && i<7)) || (j==4 && i==5)) {
                    System.out.print(" =");
                } else{
                } System.out.print("  ");
            }
                System.out.println();


        }

    }
}