import java.util.*;
import java.lang.Math;

public class soal1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, rating, tertinggi, terendah, count, n;
        double total, rata;
        String status;
        int[] data = new int[7];

        total = 0;
        count = 0;
        tertinggi = -999;
        terendah = 999;
        for (i = 0; i <= 5; i++) {
            rating = Integer.parseInt(input.nextLine());
            data[i] = rating;
            total = total + rating;
            if (rating > tertinggi) {
                tertinggi = rating;
            }
            if (rating < terendah) {
                terendah = rating;
            }
            if (rating >= 4) {
                count = count + 1;
            }
        }
        rata = total / 6;
        if (rata >= 4) {
            status = "Kondisi sangat baik.";
        } else {
            if (rata >= 3) {
                status = "Kondisi cukup, masih perlu peningkatan.";
            } else {
                status = "Kondisi kurang, perlu banyak peningkatan.";
            }
        }
        System.out.println("Daftar rating: " + data[0] + data[1] + data[2] + data[3] + data[4] + data[5]);
        System.out.println("Rata-rata: " + rata);
        System.out.println("Tertinggi: " + tertinggi);
        System.out.println("Terendah: " + terendah);
        System.out.println("Reviewer rating >4: " + count + " orang");
        System.out.println(status);
    }
}
