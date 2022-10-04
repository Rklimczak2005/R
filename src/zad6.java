public class zad6 {
    public static void main(String[] args) {
        int pomieszczenie1;
        int pomieszczenie2;
        int pomieszczenie3;
        int pomieszczenie4;
        int PowierzchniaMieszkania;
        int Osoba;
        double PowierzchniaNaOsobe;

        pomieszczenie1 = 3*4;
        pomieszczenie2 = 3*4;
        pomieszczenie3 = 2*3;
        pomieszczenie4 = 2*2;
        PowierzchniaMieszkania = pomieszczenie1 + pomieszczenie2 +
                pomieszczenie3 + pomieszczenie4;
        Osoba = 4;
        PowierzchniaNaOsobe = (double)PowierzchniaMieszkania/Osoba;


        System.out.println("Pomieszczenie 1 ma: " + pomieszczenie1 + "m");
        System.out.println("Pomieszczenie 2 ma: " + pomieszczenie2 + "m");
        System.out.println("Pomieszczenie 3 ma: " + pomieszczenie3 + "m");
        System.out.println("Pomieszczenie 4 ma: " + pomieszczenie4 + "m");
        System.out.println("Całkowita powierzchnia mieszkania ma: " + PowierzchniaMieszkania + "m");
        System.out.println("Powierzchnia przypadająca na 1 osobe to: " + PowierzchniaNaOsobe + "m");
    }
}
