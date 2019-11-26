package laskin;

import java.util.*;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Sovelluslogiikka {
 
    private int tulos;
 
    public void plus(int luku) {
        tulos += luku;
    }
     
    public void miinus(int luku) {
        tulos -= luku;
    }
 
    public void nollaa() {
        tulos = 0;
    }
 
    public int tulos() {
        return tulos;
    }
}