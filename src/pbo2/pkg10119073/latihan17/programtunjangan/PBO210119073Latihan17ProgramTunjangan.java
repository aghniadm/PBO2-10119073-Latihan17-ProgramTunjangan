package pbo2.pkg10119073.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menghitung tunjangan
 *
 */
public class PBO210119073Latihan17ProgramTunjangan {

    public static void main(String[] args) {
        double tunjangan,total;
    
        System.out.println("==============Program Tunjangan==============");
        System.out.print("Berapa gaji pokok Anda perbulan?: Rp. ");
       
        Scanner scan = new Scanner(System.in);
        double gaji = scan.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum): ");
        String status = scan.next();
        
        if("Menikah".equals(status)||("menikah".equals(status))){
            tunjangan = 0.35 * gaji;
        }    
        else{ 
            tunjangan = 0 * gaji;
        }
        total = gaji + tunjangan;
        
        System.out.println("=========Hasil Perhitungan Gaji Anda==========");
        System.out.println("Gaji Pokok\t\t: Rp. " + gaji);
        System.out.println("Tunjangan\t\t: Rp. " + tunjangan);
        System.out.println("Total Gaji\t\t: Rp. " + total);
        System.out.println("(Developed by : Aghnia Dewi Mahiranie)");
    }
    
}
