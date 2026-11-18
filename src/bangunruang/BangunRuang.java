/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangunruang;

class Kubus {
    double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    double volume() {
        return sisi * sisi * sisi;
    }
}

class Balok {
    double panjang, lebar, tinggi;

    Balok(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    double volume() {
        return panjang * lebar * tinggi;
    }
}

class Tabung {
    double jariJari, tinggi;

    Tabung(double r, double t) {
        jariJari = r;
        tinggi = t;
    }

    double volume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }
}