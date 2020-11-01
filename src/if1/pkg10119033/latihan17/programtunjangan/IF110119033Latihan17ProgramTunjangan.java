/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119033.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi menghitung tunjangan gaji
 */
public class IF110119033Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    
    public static String status;
    public static double gaji, tunjangan;
    
    public static void inputData() {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        gaji = scanner.nextDouble();
        
        System.out.print("Status Anda?(Menikah/Belum)\t: ");
        status = scanner.next();
        while (!(status.toUpperCase().equals("MENIKAH") || status.toUpperCase().equals("BELUM"))) {
            System.out.print("Status Anda?(Menikah/Belum)\t: ");
                status = scanner.next();
        }
    }
    
    public static double hitungTunjangan() {
        double nominal = 0.35 * gaji;
        return nominal;
    }
    
    public static double cekStatus() {
        if (status.toUpperCase().equals("MENIKAH")) {
            tunjangan = hitungTunjangan();
        } else {
            tunjangan = 0.0;
        }
        return tunjangan;
    }
    
    
    public static void tampilFormat() {
        System.out.println("======Hasil Perhitungan Gaji Anda======");
        System.out.println("Gaji Pokok\t\t\t: Rp. " + gaji);
        System.out.printf("Tunjangan\t\t\t: Rp. %.1f%n", tunjangan);
        double totalGaji = gaji + tunjangan;
        System.out.println("Total Gaji\t\t\t: Rp. " + totalGaji);
        System.out.println("(Developed by : Dandi Ahmadin)");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        inputData();
        cekStatus();
        tampilFormat();
    }   
} 