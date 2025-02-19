/*
 * This file is generated by jOOQ.
 */
package generated.rx.jdbc.guice.vertx.tables.daos;


import generated.rx.jdbc.guice.vertx.tables.Somethingcomposite;
import generated.rx.jdbc.guice.vertx.tables.records.SomethingcompositeRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.json.JsonObject;

import java.util.Collection;

import org.jooq.Configuration;
import org.jooq.Record2;


import java.util.List;
import io.reactivex.Single;
import java.util.Optional;
import io.github.jklingsporn.vertx.jooq.rx.jdbc.JDBCRXQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@jakarta.inject.Singleton
public class SomethingcompositeDao extends AbstractVertxDAO<SomethingcompositeRecord, generated.rx.jdbc.guice.vertx.tables.pojos.Somethingcomposite, Record2<Integer, Integer>, Single<List<generated.rx.jdbc.guice.vertx.tables.pojos.Somethingcomposite>>, Single<Optional<generated.rx.jdbc.guice.vertx.tables.pojos.Somethingcomposite>>, Single<Integer>, Single<Record2<Integer, Integer>>> implements io.github.jklingsporn.vertx.jooq.rx.VertxDAO<SomethingcompositeRecord,generated.rx.jdbc.guice.vertx.tables.pojos.Somethingcomposite,Record2<Integer, Integer>> {
        @jakarta.inject.Inject

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public SomethingcompositeDao(Configuration configuration, io.vertx.reactivex.core.Vertx vertx) {
                super(Somethingcomposite.SOMETHINGCOMPOSITE, generated.rx.jdbc.guice.vertx.tables.pojos.Somethingcomposite.class, new JDBCRXQueryExecutor<SomethingcompositeRecord,generated.rx.jdbc.guice.vertx.tables.pojos.Somethingcomposite,Record2<Integer, Integer>>(configuration,generated.rx.jdbc.guice.vertx.tables.pojos.Somethingcomposite.class,vertx));
        }

        @Override
        protected Record2<Integer, Integer> getId(generated.rx.jdbc.guice.vertx.tables.pojos.Somethingcomposite object) {
                return compositeKeyRecord(object.getSomeid(), object.getSomesecondid());
        }

        /**
     * Find records that have <code>SOMESECONDID IN (values)</code>
     * asynchronously
     */
        public Single<List<generated.rx.jdbc.guice.vertx.tables.pojos.Somethingcomposite>> findManyBySomesecondid(Collection<Integer> values) {
                return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID.in(values));
        }

        /**
     * Find records that have <code>SOMESECONDID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Single<List<generated.rx.jdbc.guice.vertx.tables.pojos.Somethingcomposite>> findManyBySomesecondid(Collection<Integer> values, int limit) {
                return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMESECONDID.in(values),limit);
        }

        /**
     * Find records that have <code>SOMEJSONOBJECT IN (values)</code>
     * asynchronously
     */
        public Single<List<generated.rx.jdbc.guice.vertx.tables.pojos.Somethingcomposite>> findManyBySomejsonobject(Collection<JsonObject> values) {
                return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMEJSONOBJECT.in(values));
        }

        /**
     * Find records that have <code>SOMEJSONOBJECT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Single<List<generated.rx.jdbc.guice.vertx.tables.pojos.Somethingcomposite>> findManyBySomejsonobject(Collection<JsonObject> values, int limit) {
                return findManyByCondition(Somethingcomposite.SOMETHINGCOMPOSITE.SOMEJSONOBJECT.in(values),limit);
        }

        @Override
        public JDBCRXQueryExecutor<SomethingcompositeRecord,generated.rx.jdbc.guice.vertx.tables.pojos.Somethingcomposite,Record2<Integer, Integer>> queryExecutor(){
                return (JDBCRXQueryExecutor<SomethingcompositeRecord,generated.rx.jdbc.guice.vertx.tables.pojos.Somethingcomposite,Record2<Integer, Integer>>) super.queryExecutor();
        }
}
