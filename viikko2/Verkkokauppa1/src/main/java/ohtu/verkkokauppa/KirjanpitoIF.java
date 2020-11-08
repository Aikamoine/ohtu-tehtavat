
package ohtu.verkkokauppa;

import java.util.ArrayList;

public interface KirjanpitoIF {

    ArrayList<String> getTapahtumat();

    void lisaaTapahtuma(String tapahtuma);
    
}
