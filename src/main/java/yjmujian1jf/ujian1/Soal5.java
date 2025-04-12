package yjmujian1jf.ujian1;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        /// Soal 5 Array
        int [] hargaTiket = new int[5]; /* saya pake integer di harga kali ini karena */
        int[] totalHarga;               /* tidak ada proses aritmatika dengan koma seperti pada Soal 3 */
        Scanner sc = new Scanner(System.in);
        /// Memasukan harga tiket untuk 5 film
        for (int i = 1; i <= hargaTiket.length; i++){
            System.out.print("Masukan harga tiket film ke "+i+(" : "));
            hargaTiket[i-1] = sc.nextInt();
        }
        System.out.println("============");
        /// Menampilkan harga tiket 5 film
        for (int i = 1; i <= hargaTiket.length; i++){
            System.out.println("harga tiket film ke "+i+(": "+hargaTiket[i-1]));
        }
        /// Menghitung total harga dari 5 film
        totalHarga = new int[]{hargaTiket[0] + hargaTiket[1] + hargaTiket[2] + hargaTiket[3] + hargaTiket[4]};
        System.out.println("Total Harga: "+totalHarga[0]);
    }
}
/* Maaf pak untuk ujian ini saya belum pake getter dan setter seperti
 * yang pak paul ajarkan kemarin karena saya belum terlalu paham dengan konsepnya
 */