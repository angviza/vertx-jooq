/*
 * This file is generated by jOOQ.
 */
package generated.cf.async.guice;


import generated.cf.async.guice.tables.Something;
import generated.cf.async.guice.tables.Somethingcomposite;
import generated.cf.async.guice.tables.Somethingwithoutjson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Vertx extends SchemaImpl {

    private static final long serialVersionUID = -568782917;

    /**
     * The reference instance of <code>vertx</code>
     */
    public static final Vertx VERTX = new Vertx();

    /**
     * The table <code>vertx.something</code>.
     */
    public final Something SOMETHING = generated.cf.async.guice.tables.Something.SOMETHING;

    /**
     * The table <code>vertx.somethingComposite</code>.
     */
    public final Somethingcomposite SOMETHINGCOMPOSITE = generated.cf.async.guice.tables.Somethingcomposite.SOMETHINGCOMPOSITE;

    /**
     * The table <code>vertx.somethingWithoutJson</code>.
     */
    public final Somethingwithoutjson SOMETHINGWITHOUTJSON = generated.cf.async.guice.tables.Somethingwithoutjson.SOMETHINGWITHOUTJSON;

    /**
     * No further instances allowed
     */
    private Vertx() {
        super("vertx", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Something.SOMETHING,
            Somethingcomposite.SOMETHINGCOMPOSITE,
            Somethingwithoutjson.SOMETHINGWITHOUTJSON);
    }
}
