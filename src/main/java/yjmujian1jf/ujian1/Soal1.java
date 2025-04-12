package yjmujian1jf.ujian1;

public class Soal1 {
    public static void main(String[] args) {
        /// Soal 1 Variable
        String namaFilm;
        /// varibel hargaTiket menggunakan int seperti contoh soal
        int hargaTiket;
        int jumlahTiket;

        /// Memasukan data pada variabel
        namaFilm = "Thor Ragnarok";
        hargaTiket = 30000;
        jumlahTiket = 2;

        /// dalam println menggunakan karakter escape (\n) untuk menambahkan baris baru agar di print sekalian
        System.out.println("Nama Film: "+namaFilm
                +"\nHarga Tiket: "+ hargaTiket
                +"\nJumlah Tiket: "+jumlahTiket);
    }
}
