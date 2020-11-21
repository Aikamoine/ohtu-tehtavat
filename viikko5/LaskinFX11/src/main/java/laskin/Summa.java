package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Summa extends Komento{

    public Summa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {  
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
    }

    @Override
    public void suorita() {
        int syote = Integer.parseInt(syotekentta.getText());
        sovellus.plus(syote);
        edellinenSyote = -syote;
        syotekentta.setText("");
        tuloskentta.setText("" + sovellus.tulos());
        nollaa.disableProperty().set(false);
        undo.disableProperty().set(false);
    }
}
