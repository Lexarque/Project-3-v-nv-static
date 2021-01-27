package Yee;

import java.util.Arrays;
import java.util.Scanner;

public class Static {

    // Membuat array 2d baru dengan method static dengan parameter a dan b

    static int[][] a(int a, int b){
        return new int[a][b];

    }

    // Membuat method static untuk penambahan array 2d
    // Misalkan saja nilai awal adalah n
    // dan operator penambahan kedua angka adalah n+2
    // jadi misalkan n = 5
    // berarti 5 + 2 = 7, 7 + 2 = 9
    // alan berhenti jika sudah mencapai baris dan kolom terakhir

    static void hitung(int[][] a, int an1, int an2){

        Scanner S = new Scanner(System.in);
        System.out.println("Silahkan masukkan nilai awal = ");
        an1 = S.nextInt();
        S.nextLine();
        System.out.println("Nilai kedua = ");
        an2 = S.nextInt();
        S.nextLine();

        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                a[i][j] = an1;
                an1 += an2;
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
