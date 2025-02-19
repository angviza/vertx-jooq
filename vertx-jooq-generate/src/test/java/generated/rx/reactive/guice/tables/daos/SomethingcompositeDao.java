/*
 * This file is generated by jOOQ.
 */
package generated.rx.reactive.guice.tables.daos;


import generated.rx.reactive.guice.tables.Somethingcomposite;
import generated.rx.reactive.guice.tables.records.SomethingcompositeRecord;

import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;
import io.vertx.core.json.JsonObject;

import java.util.Collection;

import org.jooq.Configuration;
import org.jooq.Record2;


import java.util.List;
import io.reactivex.Single;
import java.util.Optional;
import io.github.jklingsporn.vertx.jooq.rx.reactivepg.ReactiveRXQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@jakarta.inject.Singleton
public class SomethingcompositeDao extends AbstractReactiveVertxDAO<SomethingcompositeRecord, generated.rx.reactive.guice.tables.pojos.Somethingcomposite, Record2<Integer, Integer>, Single<List<generated.rx.reactive.guice.tables.pojos.Somethingcomposite>>, Single<Optional<generated.rx.reactive.guice.tables.pojos.Somethingcomposite>>, Single<Integer>, Single<Record2<Integer, Integer>>> implements io.github.jklingsporn.vertx.jooq.rx.VertxDAO<SomethingcompositeRecord,generated.rx.reactive.guice.tables.pojos.Somethingcomposite,Record2<Integer, Integer>> {
        @jakarta.inject.Inject

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public SomethingcompositeDao(Configuration configuration, io.vertx.reactivex.sqlclient.SqlClient delegate) {
                super(Somethingcomposite.SOMETHINGCOMPOSITE, generated.rx.reactive.guice.tables.pojos.Somethingcomposite.class, new ReactiveRXQueryExecutor<SomethingcompositeRecord,generated.rx.reactive.guice.tables.pojos.Somethingcomposite,Record2<Integer, Integer>>(configuration,delegate,generated.rx.reactive.guice.tables.mappers.RowMappers.getSomethingcompositeMapper()));
        }

        @Override
        protected Record2<Integer, Integer> getId(generated.rx.reactive.guice.tables.pojos.Somethingcomposite object) {
                return compositeKeyRecord(object.getSomeid(), object.getSomesecondid());
        }

        /**
     * Find records that have <code>someSecondId IN (values)</code>
     * asynchronously
     */
        public Single<List<generated.rx.reactive.guice.tables.pojos.Somethingcomposite>> findManyBySomesecondid(Collection<Integer> values) {
                return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID.in(values));
        }

        /**
     * Find records that have <code>someSecondId IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Single<List<generated.rx.reactive.guice.tables.pojos.Somethingcomposite>> findManyBySomesecondid(Collection<Integer> values, int limit) {
                return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID.in(values),limit);
        }

        /**
     * Find records that have <code>someJsonObject IN (values)</code>
     * asynchronously
     */
        public Single<List<generated.rx.reactive.guice.tables.pojos.Somethingcomposite>> findManyBySomejsonobject(Collection<JsonObject> values) {
                return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMEJSONOBJECT.in(values));
        }

        /**
     * Find records that have <code>someJsonObject IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Single<List<generated.rx.reactive.guice.tables.pojos.Somethingcomposite>> findManyBySomejsonobject(Collection<JsonObject> values, int limit) {
                return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMEJSONOBJECT.in(values),limit);
        }

        @Override
        public ReactiveRXQueryExecutor<SomethingcompositeRecord,generated.rx.reactive.guice.tables.pojos.Somethingcomposite,Record2<Integer, Integer>> queryExecutor(){
                return (ReactiveRXQueryExecutor<SomethingcompositeRecord,generated.rx.reactive.guice.tables.pojos.Somethingcomposite,Record2<Integer, Integer>>) super.queryExecutor();
        }
}