package laskin;

import java.util.*;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public abstract class Komento {
    public TextField tuloskentta; 
    public TextField syotekentta; 
    public Button nollaa;
    public Button undo;
    public Sovelluslogiikka sovellus;

    public Komento(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovellus = sovellus;
    }

    public abstract void suorita();
    public abstract void peru();
}