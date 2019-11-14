package LATIHAN4;

import com.sun.org.apache.xpath.internal.objects.XString;

/**
 *NAMA    : Rangga Meinandi
 *KELAS   : TI-1A
 *NIM     : A21900141
 *
 */

public class KAMBING {

    public void tambahKambing() {
    int jumlahKambing = 0;

    jumlahKambing = jumlahKambing + 5;
    System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }

    public static void main(String[] args) {
        KAMBING KambingJantan = new KAMBING();
        KambingJantan.tambahKambing();
    }

}
