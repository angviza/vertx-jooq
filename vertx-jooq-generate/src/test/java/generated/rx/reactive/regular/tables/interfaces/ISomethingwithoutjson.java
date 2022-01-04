/*
 * This file is generated by jOOQ.
 */
package generated.rx.reactive.regular.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ISomethingwithoutjson extends VertxPojo, Serializable {

    /**
     * Setter for <code>vertx.somethingWithoutJson.someId</code>.
     */
    public ISomethingwithoutjson setSomeid(Integer value);

    /**
     * Getter for <code>vertx.somethingWithoutJson.someId</code>.
     */
    public Integer getSomeid();

    /**
     * Setter for <code>vertx.somethingWithoutJson.someString</code>.
     */
    public ISomethingwithoutjson setSomestring(String value);

    /**
     * Getter for <code>vertx.somethingWithoutJson.someString</code>.
     */
    public String getSomestring();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface ISomethingwithoutjson
     */
    public void from(ISomethingwithoutjson from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface ISomethingwithoutjson
     */
    public <E extends ISomethingwithoutjson> E into(E into);

        @Override
        public default ISomethingwithoutjson fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setSomeid,json::getInteger,"someId","java.lang.Integer");
                setOrThrow(this::setSomestring,json::getString,"someString","java.lang.String");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("someId",getSomeid());
                json.put("someString",getSomestring());
                return json;
        }

}
