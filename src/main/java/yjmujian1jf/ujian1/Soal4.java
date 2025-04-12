package yjmujian1jf.ujian1;

import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {
        /// Soal 4 perulangan
        String[] namaFilm;

        /// Memasukan banyak film
        Scanner sc = new Scanner(System.in);
        System.out.print("Berapa banyak film yang ingin ditonton: ");
        int banyakfFilm = sc.nextInt();
        namaFilm = new String[banyakfFilm+1];

        /// memasukan nama-nama film yang ingin ditonton
        for (int i = 1; i <= banyakfFilm; ++i){
            namaFilm[i-1] = sc.nextLine();
            System.out.print("Masukan nama film ke "+i+": ");
            if (i == banyakfFilm){
                namaFilm[i] = sc.nextLine(); /* untuk menginput data elemnt terakhir*/
            }
        }
        /// Menampilkan film - film yang ingin ditonton
        if (banyakfFilm > 0)
        System.out.println("Film yang ingin ditonton:");
        else System.out.println("Masukan jumlah film yang benar");
        for (int i = 1; i <= banyakfFilm; ++i){
            System.out.println(i +". "+namaFilm[i]);
        }
    }
}
