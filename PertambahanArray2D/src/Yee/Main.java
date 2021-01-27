package Yee;

public class Main {

    public static void main(String[] args) {

        // Mendeklarasikan variabel untuk parameter

        int a = 5, b = 5;
        int cn = 0, dn = 0;

        // Menbuat variabel lokal pada main agar dapat digunakan untuk
        // menyimpan nilai dari method static sebelumnya dan
        // digunakan untuk parameter method selanjutnya

        int[][] c = Static.a(a,b);

        // Menjalankan method hitung dari Class Static

        Static.hitung(c,cn,dn);
    }
}
