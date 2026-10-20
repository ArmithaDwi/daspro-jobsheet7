
import java.util.Scanner;

public class TiketBioskop05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket = 0, hargaTiket = 50000, totalHarga;
        int totalPenjualan = 0, totalTiket = 0;
        double diskon;
        String namaPelanggan;

        while (true) {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                break;
            }

            System.out.print("Masukkan jumlah tiket: ");
            jumlahTiket = sc.nextInt();
            sc.nextLine();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Ulangi lagi!");
                continue;
            }

            diskon = 0;
            totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            totalHarga = (int) (totalHarga - (totalHarga * diskon));

            System.out.println("Nama pelanggan: " + namaPelanggan);
            System.out.println("Total harga setelah diskon: Rp " + totalHarga);

            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;
        }

        System.out.println("\nTotal tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);

        sc.close();
    }
}
