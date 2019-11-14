package LATIHAN5;

/**
 *NAMA    : Rangga Meinandi
 *KELAS   : TI-1A
 *NIM     : A21900141
 *
 */

public class KAMBING_GLOBAL {
    int jumlahKambing = 88;

    public  void getJumlahKambing() {
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }

    public  void  tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }

    public static void main(String[] args) {
        KAMBING_GLOBAL kambingSusu = new KAMBING_GLOBAL();
        kambingSusu.getJumlahKambing();
        kambingSusu.tambahKambing();
        kambingSusu.getJumlahKambing();
    }
}
