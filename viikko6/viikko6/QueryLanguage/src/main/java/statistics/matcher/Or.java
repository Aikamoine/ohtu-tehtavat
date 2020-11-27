
package statistics.matcher;

import statistics.Player;

public class Or implements Matcher{
    private Matcher[] matchers;

    public Or(Matcher... matchers) {
        this.matchers = matchers;
    }

    @Override
    public boolean matches(Player p) {
        int tosi = 0;
        for (Matcher matcher : matchers) {
            if (matcher.matches(p)) {
                tosi ++;
            }
        }

        return tosi > 0;
    }
}
