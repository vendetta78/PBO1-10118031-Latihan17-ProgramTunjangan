package programtunjangan;

import java.util.Scanner;

/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk tunjangan
 */
public class ProgramTunjangan {

    public static void main(String[] args) {
        System.out.println("===========PROGRAM TUNJANGAN===========");
        System.out.print("Berapa gaji pokok anda perbulan ?\t: Rp. ");
        Scanner scanner = new Scanner(System.in);
        double gajipokok = scanner.nextInt();
        double tunjangan = 0;
        System.out.print("Status anda ? (Menikah/Belum)\t\t: ");
        String status = scanner.next();
        if (status.equals("Menikah")) {
            tunjangan = 0.35 * gajipokok;
            System.out.println(status);
        }

        double totalgaji = gajipokok + tunjangan;
        System.out.println("===========HASIL PERHITUNGAN GAJI ANDA===========");
        System.out.println("Gaji Pokok \t\t: Rp. " + gajipokok);
        System.out.println("Tunjangan \t\t: Rp. " + tunjangan);
        System.out.println("Total Gaji \t\t: Rp. " + totalgaji);
        System.out.println("(Developed by : Rizki Aria Putra)");

    }

}
