package LATIHAN6;
/**
 *NAMA    : Rangga Meinandi
 *KELAS   : TI-1A
 *NIM     : A21900141
 *
 */
public class KAMBING_STATIC_DAN_KONSTANTA    {
    public static final String NAMA_KAMBING = "MIDUN";

    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
        + Mamalia.jumlahKambing);
    }
}
