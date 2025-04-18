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

            if (inputString.charAt(i) >= ' ' && inputString.charAt(i) <= '/') {
                hasil += (int) inputString.charAt(i);

            } else if (inputString.charAt(i) >= '0' && inputString.charAt(i) <= '9') {
                hasil += (int) inputString.charAt(i);

            } else if (inputString.charAt(i) >= ':' && inputString.charAt(i) <= '@') {
                hasil += (int) inputString.charAt(i);

            } else if (inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'Z') {
                hasil += (int) inputString.charAt(i);

//            } else if (inputString.charAt(i) >= 'a' && inputString.charAt(i) <= 'z') {    //huruf kecil exclude
//                hasil += (int) inputString.charAt(i);
            }
        }
        System.out.println("Hasil : "+ hasil);
    }
}
