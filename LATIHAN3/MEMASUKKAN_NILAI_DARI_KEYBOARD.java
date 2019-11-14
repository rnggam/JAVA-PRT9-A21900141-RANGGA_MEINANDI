package LATIHAN3;

    import java.util.Scanner;

/**
 *NAMA    : Rangga Meinandi
 *KELAS   : TI-1A
 *NIM     : A21900141
 *
 */

public class MEMASUKKAN_NILAI_DARI_KEYBOARD {
        public static void main(String[] args) {
            System.out.println("Masukkan nama Anda: ");
            Scanner scanner = new Scanner(System.in);

            String nama = scanner.next();
            System.out.println("Nama Anda adalah: " + nama);
        }
}
