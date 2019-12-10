package ohtu.kivipaperisakset;

public abstract class Pelaa {
    
    Tuomari tuomari = new Tuomari();
    String ekanSiirto = "";
    String tokanSiirto = "";

    public void pelaa() {

        init();

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            newRound();
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    protected abstract void init();

    protected abstract void newRound();

}