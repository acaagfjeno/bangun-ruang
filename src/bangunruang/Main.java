/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("KALKULATOR BANGUN RUANG");

        // KUBUS
        System.out.println("\n=== KUBUS ===");
        System.out.print("Masukkan sisi: ");
        double sisi = input.nextDouble();

        Kubus kubus = new Kubus(sisi);
        System.out.println("Volume Kubus: " + kubus.volume());

        // BALOK
        System.out.println("\n=== BALOK ===");
        System.out.print("Masukkan panjang: ");
        double p = input.nextDouble();

        System.out.print("Masukkan lebar: ");
        double l = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double t = input.nextDouble();

        Balok balok = new Balok(p, l, t);
        System.out.println("Volume Balok: " + balok.volume());

        // TABUNG
        System.out.println("\n=== TABUNG ===");
        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        Tabung tabung = new Tabung(r, tinggi);
        System.out.printf("Volume Tabung: %.2f%n", tabung.volume());

        input.close();
    }
}