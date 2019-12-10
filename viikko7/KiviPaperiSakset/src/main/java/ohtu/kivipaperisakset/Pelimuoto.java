package ohtu.kivipaperisakset;

public class Pelimuoto extends Pelaa {

    public static Pelimuoto luoKaksinPeli() {
        return new KPSPelaajaVsPelaaja();
    }

    public static Pelimuoto luoHelppoYksinPeli() {
        return new KPSTekoaly();
    }

    public static Pelimuoto luoVaikeaYksinPeli() {
        return new KPSParempiTekoaly();
    }

    public void init() {};

    public void newRound() {};
}
