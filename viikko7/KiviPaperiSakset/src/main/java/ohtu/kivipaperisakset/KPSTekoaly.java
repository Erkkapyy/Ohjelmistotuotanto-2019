package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends Pelimuoto {

    private static final Scanner scanner = new Scanner(System.in);
    Tekoaly tekoaly = new Tekoaly();

    @Override
    public void init() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        ekanSiirto = scanner.nextLine();
        tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);

    }

    @Override
    public void newRound() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        ekanSiirto = scanner.nextLine();
        tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        tekoaly.asetaSiirto(ekanSiirto);
    }
}