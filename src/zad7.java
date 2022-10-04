public class zad7 {
    public static void main(String[] args) {
        int SprzedazProduktow;
        double Procent;
        double Zarobek;

        SprzedazProduktow = 4600000;
        Procent = 0.62;
        Zarobek = (double)SprzedazProduktow*Procent;

        System.out.println("Wygenerowana sprzedaż w regionie mazowieckim: " + Zarobek + "zł");
    }
}
