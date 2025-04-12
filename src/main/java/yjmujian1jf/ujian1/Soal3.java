package yjmujian1jf.ujian1;

import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        /// Soal 3 Peracabangan
        double hargaTiket;
        double totalHarga;
        Scanner sc = new Scanner(System.in);
        System.out.print("Hari apa ini?: ");
        String hari = sc.nextLine();
        System.out.print("Masukan jumlah tiket yang dibeli: ");
        int jumlahTiket = sc.nextInt();


        /// mengecek hari weekend = sabtu & minggu
        if (hari.equalsIgnoreCase("Senin")||
                hari.equalsIgnoreCase("Selasa")||
                hari.equalsIgnoreCase("Rabu")||
                hari.equalsIgnoreCase("Kamis")||
                hari.equalsIgnoreCase("Jumat")){
                hargaTiket = 35000;

                /*mengecek jumlah tiket untuk diskon */
            if (jumlahTiket>5){
                totalHarga = (hargaTiket * jumlahTiket) - (hargaTiket * jumlahTiket  * 0.1);
                System.out.println("Jumlah tiket: "+jumlahTiket);
                System.out.println("Total harga tiket dengan diskon: "+totalHarga);
            }
            else {
                totalHarga = hargaTiket * jumlahTiket;
                System.out.println("Jumlah tiket: "+jumlahTiket);
                System.out.println("Total harga tiket: "+totalHarga);
            }

        } else if (hari.equalsIgnoreCase("Sabtu") ||
                   hari.equalsIgnoreCase("Minggu")){
                hargaTiket = 45000;

            /*mengecek jumlah tiket untuk diskon */
            if (jumlahTiket>5){
                totalHarga = (hargaTiket * jumlahTiket) - (hargaTiket * jumlahTiket  * 0.1);
                System.out.println("Jumlah tiket: "+jumlahTiket);
                System.out.println("Total harga tiket dengan diskon: "+totalHarga);
            }
            else {
                totalHarga = hargaTiket * jumlahTiket;
                System.out.println("Jumlah tiket: "+jumlahTiket);
                System.out.println("Total harga tiket: "+totalHarga);
            }
            /// Jika hari tidak di input dengan benar
            }else {
            System.out.println("Masukan hari yang benar!");
            System.exit(0);
        }

    }

}
