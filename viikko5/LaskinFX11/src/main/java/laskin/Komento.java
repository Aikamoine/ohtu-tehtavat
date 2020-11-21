package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

class Komento {

    protected TextField tuloskentta;
    protected TextField syotekentta;
    protected Button nollaa;
    protected Button undo;
    protected Sovelluslogiikka sovellus;
    protected int edellinenSyote;

    public Komento(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovellus = sovellus;
    }

    void suorita() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void peru() {
        sovellus.plus(edellinenSyote);
        tuloskentta.setText(""+sovellus.tulos());
        syotekentta.setText("");
        undo.disableProperty().set(true);
    }

}
