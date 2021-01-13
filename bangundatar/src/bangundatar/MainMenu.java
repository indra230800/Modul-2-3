package bangundatar;

import java.util.Scanner;

public class MainMenu {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        /*Kamus*/
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;
 
        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();
    }
 
    private static void mainMenu(){
        //pilihan menu
        System.out.println("====================");
        System.out.println("Hitung Luas dan Keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}

