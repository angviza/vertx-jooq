package io.github.jklingsporn.vertx.jooq.shared.internal;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author jensklingsporn
 */
public abstract class AbstractQueryResult implements QueryResult{

    /**
     *
     * @param supplier
     * @param <T>
     * @return the value supplied by supplier or throw a NoSuchElementException if the
     * underlying result has no results.
     */
    protected <T> T supplyOrThrow(Supplier<T> supplier){
        if(hasResults()){
            return supplier.get();
        }
        throw new NoSuchElementException("QueryResult is empty");
    }

    @Override
    public List<QueryResult> asList() {
        return stream()
                .collect(Collectors.toList());
    }

}
