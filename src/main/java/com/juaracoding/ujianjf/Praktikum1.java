package com.juaracoding.ujianjf;

import java.util.Scanner;

// Ouput dari input Tid4k $@ma adalah 268

public class Praktikum1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan kata :");
        String inputString = sc.nextLine();
        int hasil = 0;

        for (int i = 0; i < inputString.length(); i ++) {
            char charStr = inputString.charAt(i);

            if (charStr >= ' ' && charStr <= '@') {
                hasil += (int) charStr;

            } else if (charStr >= '0' && charStr <= '9') {
                hasil += (int) charStr;

            } else if (charStr >= 'A' && charStr <= 'Z') {
                hasil += (int) charStr;

//            } else if (charStr >= 'a' && charStr <= 'z') {    //huruf kecil exclude
//                hasil += (int) charStr;

            }
        }
        System.out.println("Hasil : "+ hasil);
    }
}
