package laskin;

import java.util.*;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Nollaa extends Komento {
    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
    }

    private int edellinen = 0;

    @Override
    public void suorita() {

    try {
        edellinen = Integer.parseInt(tuloskentta.getText());
    } catch (Exception e) {
    }

    syotekentta.setText("");
    tuloskentta.setText("" + 0);

    nollaa.disableProperty().set(false);
    }

    @Override
    public void peru() {
        tuloskentta.setText("" + edellinen);
        undo.disableProperty().set(true);
    };
}