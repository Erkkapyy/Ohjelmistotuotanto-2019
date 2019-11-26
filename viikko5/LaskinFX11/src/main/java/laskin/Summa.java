package laskin;

import java.util.*;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Summa extends Komento {
    public Summa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
    }

    private int edellinen = 0;

    @Override
    public void suorita() {
    int tulos = 0;
    int arvo = 0;

    try {
        arvo = Integer.parseInt(syotekentta.getText());
        tulos = Integer.parseInt(tuloskentta.getText());
    } catch (Exception e) {
    }

    edellinen = tulos;
    tulos += arvo;

    syotekentta.setText("");
    tuloskentta.setText("" + tulos);

    if ( tulos==0) {
        nollaa.disableProperty().set(true);
    } else {
        nollaa.disableProperty().set(false);
    }
    undo.disableProperty().set(false);
    }

    @Override
    public void peru() {
        tuloskentta.setText("" + edellinen);
        undo.disableProperty().set(true);
    };
}