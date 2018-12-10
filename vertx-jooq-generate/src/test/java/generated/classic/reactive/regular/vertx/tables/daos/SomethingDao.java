/*
 * This file is generated by jOOQ.
 */
package generated.classic.reactive.regular.vertx.tables.daos;


import generated.classic.reactive.regular.vertx.enums.Someenum;
import generated.classic.reactive.regular.vertx.tables.Something;
import generated.classic.reactive.regular.vertx.tables.records.SomethingRecord;

import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;


import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.reactivepg.ReactiveClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SomethingDao extends AbstractReactiveVertxDAO<SomethingRecord, generated.classic.reactive.regular.vertx.tables.pojos.Something, Integer, Future<List<generated.classic.reactive.regular.vertx.tables.pojos.Something>>, Future<generated.classic.reactive.regular.vertx.tables.pojos.Something>, Future<Integer>, Future<Integer>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<SomethingRecord,generated.classic.reactive.regular.vertx.tables.pojos.Something,Integer> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public SomethingDao(Configuration configuration, io.reactiverse.pgclient.PgClient delegate) {
        super(Something.SOMETHING, generated.classic.reactive.regular.vertx.tables.pojos.Something.class, new ReactiveClassicQueryExecutor<SomethingRecord,generated.classic.reactive.regular.vertx.tables.pojos.Something,Integer>(configuration,delegate,generated.classic.reactive.regular.vertx.tables.mappers.RowMappers.getSomethingMapper()));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(generated.classic.reactive.regular.vertx.tables.pojos.Something object) {
        return object.getSomeid();
    }

    /**
     * Find records that have <code>someString IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.reactive.regular.vertx.tables.pojos.Something>> findManyBySomestring(List<String> values) {
        return findManyByCondition(Something.SOMETHING.SOMESTRING.in(values));
    }

    /**
     * Find records that have <code>someHugeNumber IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.reactive.regular.vertx.tables.pojos.Something>> findManyBySomehugenumber(List<Long> values) {
        return findManyByCondition(Something.SOMETHING.SOMEHUGENUMBER.in(values));
    }

    /**
     * Find records that have <code>someSmallNumber IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.reactive.regular.vertx.tables.pojos.Something>> findManyBySomesmallnumber(List<Short> values) {
        return findManyByCondition(Something.SOMETHING.SOMESMALLNUMBER.in(values));
    }

    /**
     * Find records that have <code>someRegularNumber IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.reactive.regular.vertx.tables.pojos.Something>> findManyBySomeregularnumber(List<Integer> values) {
        return findManyByCondition(Something.SOMETHING.SOMEREGULARNUMBER.in(values));
    }

    /**
     * Find records that have <code>someDouble IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.reactive.regular.vertx.tables.pojos.Something>> findManyBySomedouble(List<Double> values) {
        return findManyByCondition(Something.SOMETHING.SOMEDOUBLE.in(values));
    }

    /**
     * Find records that have <code>someEnum IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.reactive.regular.vertx.tables.pojos.Something>> findManyBySomeenum(List<Someenum> values) {
        return findManyByCondition(Something.SOMETHING.SOMEENUM.in(values));
    }

    /**
     * Find records that have <code>someJsonObject IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.reactive.regular.vertx.tables.pojos.Something>> findManyBySomejsonobject(List<JsonObject> values) {
        return findManyByCondition(Something.SOMETHING.SOMEJSONOBJECT.in(values));
    }

    /**
     * Find records that have <code>someJsonArray IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.reactive.regular.vertx.tables.pojos.Something>> findManyBySomejsonarray(List<JsonArray> values) {
        return findManyByCondition(Something.SOMETHING.SOMEJSONARRAY.in(values));
    }

    /**
     * Find records that have <code>someTimestamp IN (values)</code> asynchronously
     */
    public Future<List<generated.classic.reactive.regular.vertx.tables.pojos.Something>> findManyBySometimestamp(List<LocalDateTime> values) {
        return findManyByCondition(Something.SOMETHING.SOMETIMESTAMP.in(values));
    }

    @Override
    public ReactiveClassicQueryExecutor<SomethingRecord,generated.classic.reactive.regular.vertx.tables.pojos.Something,Integer> queryExecutor(){
        return (ReactiveClassicQueryExecutor<SomethingRecord,generated.classic.reactive.regular.vertx.tables.pojos.Something,Integer>) super.queryExecutor();
    }
}
