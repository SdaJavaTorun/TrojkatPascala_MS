package com.java.trojkatpascala;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("- - Trójkąt Pascala - - ");
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wysokość trójkąta: ");
        int n = input.nextInt();
        int b = n-1;
        int a = 2*n-1;
        int [][] tab = new int[n][a];
        tab[0][b] = 1;

        for(int i = 1; i < tab.length; i++){
            for(int j = 1; j < tab[i].length; j++ ){
                tab[i][b-i] = 1;
                tab[i][b+i] = 1;
                if( i > 1 && i < tab.length && j < b+i && j > b-i){
                    tab[i][j] = tab[i-1][j-1]+ tab[i-1][j+1];
                }
            }
        }
        for(int i = 0; i < tab.length; i++ ) {
            for (int j = 0; j < tab[i].length; j++) {
             if (tab[i][j] == 0 ) {
                 System.out.format("%2s"," ");
               } else {
                 System.out.format("%2d",tab[i][j]);
               }
            }
            System.out.println();
        }
    }
}

