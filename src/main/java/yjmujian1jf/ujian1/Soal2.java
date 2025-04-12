package yjmujian1jf.ujian1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        /// Soal 2 String Method
        /// Input Nama film
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nama film: ");
        String namaFilm = sc.nextLine();
       /// Mengubah nama film menjadi huruf besar
        System.out.println("Nama film dalam huruf besar: "+ namaFilm.toUpperCase());
    }
}
