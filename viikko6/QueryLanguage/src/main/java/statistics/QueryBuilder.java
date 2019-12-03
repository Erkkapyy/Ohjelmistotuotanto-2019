package statistics;

import statistics.matcher.*;
import java.util.*;

public class QueryBuilder {
    ArrayList<Matcher> matchers;

    public QueryBuilder() {
        matchers = new ArrayList<Matcher>();
        matchers.add(new All());
    }

    public Matcher build() {
        Matcher[] arrayfiedMatchers = new Matcher[matchers.size()];
        for(int i = 0; i < matchers.size(); i++) {
            arrayfiedMatchers[i] = matchers.get(i);
        }
        matchers.clear();
        return new And(arrayfiedMatchers);
    }

    public QueryBuilder playsIn(String team) {
        matchers.add(new PlaysIn(team));
        return this;
    }

    public QueryBuilder hasAtLeast(int value, String category) {
        matchers.add(new HasAtLeast(value, category));
        return this;
    }

    public QueryBuilder hasFewerThan(int value, String category) {
        matchers.add(new HasFewerThan(value, category));
        return this;
    }

    public QueryBuilder oneOf(Matcher... paramMatchers) {
        matchers.clear();
        matchers.add(new Or(paramMatchers));
        return this;
    }
}