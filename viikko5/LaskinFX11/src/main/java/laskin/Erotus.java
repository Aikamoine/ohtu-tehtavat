package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Erotus extends Komento {

    public Erotus(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
    }

    @Override
    public void suorita() {
        int syote = Integer.parseInt(syotekentta.getText());
        this.sovellus.miinus(syote);
        edellinenSyote = syote;
        syotekentta.setText("");
        tuloskentta.setText("" + sovellus.tulos());
        nollaa.disableProperty().set(false);
        undo.disableProperty().set(false);
    }
}
