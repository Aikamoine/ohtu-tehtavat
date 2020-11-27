
package statistics;

import statistics.matcher.*;


public class QueryBuilder {
    private Matcher matcher;
    
    public QueryBuilder() {
        this.matcher = new All();
    }
    
    public Matcher build() {
        return matcher;
    }
    
    public QueryBuilder playsIn(String team) {
        this.matcher = new PlaysIn(team);
        return this;
    }
    
    public QueryBuilder hasAtLeast(int amount, String category) {
        this.matcher = new And(matcher, new HasAtLeast(amount, category));
        return this;
    }
    
    public QueryBuilder hasFewerThan(int amount, String category) {
        this.matcher = new And(matcher, new HasFewerThan(amount, category));
        return this;
    }
    
    public QueryBuilder oneOf(Matcher... matchers) {
        this.matcher = new Or(matchers);
        return this;
    }
}

