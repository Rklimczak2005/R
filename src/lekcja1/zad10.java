package lekcja1;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj wartość produktu: ");

        double WartoscProduktu;
        double PodatekStanowy;
        double PodatekLokalny;
        double Cena;

        WartoscProduktu = klawiatura.nextDouble();
        PodatekStanowy = 0.04*WartoscProduktu;
        PodatekLokalny = 0.02*WartoscProduktu;
        Cena = WartoscProduktu + PodatekStanowy + PodatekLokalny;

        System.out.println("Podatek Stanowy to: " + PodatekStanowy + "zł");
        System.out.println("Podatek lokalny to: " + PodatekLokalny + "zł");
        System.out.println("Łączna wartość produktu to: " + Cena + "zł");

    }
}
