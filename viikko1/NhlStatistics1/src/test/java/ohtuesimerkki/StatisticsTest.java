

package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class StatisticsTest {
 
    Reader readerStub = new Reader() {
 
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();
 
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
 
            return players;
        }
    };
 
    Statistics stats;

    @Before
    public void setUp(){
        // luodaan Statistics-olio joka käyttää "stubia"
        stats = new Statistics(readerStub);
    }  
    
    @Test
    public void pelaajiaOikeaMaara() {
        assertEquals(5, readerStub.getPlayers().size());
    }
    
    @Test
    public void pelaajaHakuToimii() {
        assertEquals("Semenko              EDM  4 + 12 = 16",stats.search("Semenko").toString());
    }
    
    @Test
    public void huonoHakuPalauttaaNull() {
        assertEquals(null, stats.search("Laakso"));
    }
    
    @Test
    public void joukkueHaku() {
        assertEquals(3, stats.team("EDM").size());
    }
    
    @Test
    public void pisteLista() {
        assertEquals("Gretzky              EDM 35 + 89 = 124", stats.topScorers(1).get(0).toString());
    }
    
    @Test
    public void tokaPisteissa() {
        assertEquals("Lemieux              PIT 45 + 54 = 99", stats.topScorers(4).get(1).toString());
    }
}
