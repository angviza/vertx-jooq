/*
 * This file is generated by jOOQ.
 */
package generated.classic.reactive.dataobject.tables;


import generated.classic.reactive.dataobject.Keys;
import generated.classic.reactive.dataobject.Vertx;
import generated.classic.reactive.dataobject.enums.Someenum;
import generated.classic.reactive.dataobject.tables.records.SomethingRecord;

import io.github.jklingsporn.vertx.jooq.generate.converter.CommaSeparatedStringIntoListConverter;
import io.github.jklingsporn.vertx.jooq.generate.converter.SomeJsonPojo;
import io.github.jklingsporn.vertx.jooq.generate.converter.SomeJsonPojoConverter;
import io.github.jklingsporn.vertx.jooq.shared.JsonArrayConverter;
import io.github.jklingsporn.vertx.jooq.shared.JsonObjectConverter;
import io.github.jklingsporn.vertx.jooq.shared.postgres.JSONBToJsonObjectConverter;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row17;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Something extends TableImpl<SomethingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vertx.something</code>
     */
    public static final Something SOMETHING = new Something();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SomethingRecord> getRecordType() {
        return SomethingRecord.class;
    }

    /**
     * The column <code>vertx.something.someId</code>.
     */
    public final TableField<SomethingRecord, Integer> SOMEID = createField(DSL.name("someId"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("nextval('\"something_someId_seq\"'::regclass)", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>vertx.something.someString</code>.
     */
    public final TableField<SomethingRecord, String> SOMESTRING = createField(DSL.name("someString"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vertx.something.someHugeNumber</code>.
     */
    public final TableField<SomethingRecord, Long> SOMEHUGENUMBER = createField(DSL.name("someHugeNumber"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>vertx.something.someSmallNumber</code>.
     */
    public final TableField<SomethingRecord, Short> SOMESMALLNUMBER = createField(DSL.name("someSmallNumber"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>vertx.something.someRegularNumber</code>.
     */
    public final TableField<SomethingRecord, Integer> SOMEREGULARNUMBER = createField(DSL.name("someRegularNumber"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vertx.something.someDouble</code>.
     */
    public final TableField<SomethingRecord, Double> SOMEDOUBLE = createField(DSL.name("someDouble"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>vertx.something.someEnum</code>.
     */
    public final TableField<SomethingRecord, Someenum> SOMEENUM = createField(DSL.name("someEnum"), SQLDataType.VARCHAR.defaultValue(DSL.field("'FOO'::\"someEnum\"", SQLDataType.VARCHAR)).asEnumDataType(generated.classic.reactive.dataobject.enums.Someenum.class), this, "");

    /**
     * The column <code>vertx.something.someJsonObject</code>.
     */
    public final TableField<SomethingRecord, JsonObject> SOMEJSONOBJECT = createField(DSL.name("someJsonObject"), SQLDataType.VARCHAR(45), this, "", new JsonObjectConverter());

    /**
     * The column <code>vertx.something.someCustomJsonObject</code>.
     */
    public final TableField<SomethingRecord, SomeJsonPojo> SOMECUSTOMJSONOBJECT = createField(DSL.name("someCustomJsonObject"), SQLDataType.JSONB, this, "", new SomeJsonPojoConverter());

    /**
     * The column <code>vertx.something.someJsonArray</code>.
     */
    public final TableField<SomethingRecord, JsonArray> SOMEJSONARRAY = createField(DSL.name("someJsonArray"), SQLDataType.VARCHAR(45), this, "", new JsonArrayConverter());

    /**
     * The column <code>vertx.something.someVertxJsonObject</code>.
     */
    public final TableField<SomethingRecord, JsonObject> SOMEVERTXJSONOBJECT = createField(DSL.name("someVertxJsonObject"), SQLDataType.JSONB, this, "", new JSONBToJsonObjectConverter());

    /**
     * The column <code>vertx.something.someTime</code>.
     */
    public final TableField<SomethingRecord, LocalTime> SOMETIME = createField(DSL.name("someTime"), SQLDataType.LOCALTIME(6), this, "");

    /**
     * The column <code>vertx.something.someDate</code>.
     */
    public final TableField<SomethingRecord, LocalDate> SOMEDATE = createField(DSL.name("someDate"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vertx.something.someTimestamp</code>.
     */
    public final TableField<SomethingRecord, LocalDateTime> SOMETIMESTAMP = createField(DSL.name("someTimestamp"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>vertx.something.someTimestampWithTZ</code>.
     */
    public final TableField<SomethingRecord, OffsetDateTime> SOMETIMESTAMPWITHTZ = createField(DSL.name("someTimestampWithTZ"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>vertx.something.someByteA</code>.
     */
    public final TableField<SomethingRecord, byte[]> SOMEBYTEA = createField(DSL.name("someByteA"), SQLDataType.BLOB, this, "");

    /**
     * The column <code>vertx.something.someStringAsList</code>.
     */
    public final TableField<SomethingRecord, List<String>> SOMESTRINGASLIST = createField(DSL.name("someStringAsList"), SQLDataType.VARCHAR(45), this, "", new CommaSeparatedStringIntoListConverter());

    private Something(Name alias, Table<SomethingRecord> aliased) {
        this(alias, aliased, null);
    }

    private Something(Name alias, Table<SomethingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vertx.something</code> table reference
     */
    public Something(String alias) {
        this(DSL.name(alias), SOMETHING);
    }

    /**
     * Create an aliased <code>vertx.something</code> table reference
     */
    public Something(Name alias) {
        this(alias, SOMETHING);
    }

    /**
     * Create a <code>vertx.something</code> table reference
     */
    public Something() {
        this(DSL.name("something"), null);
    }

    public <O extends Record> Something(Table<O> child, ForeignKey<O, SomethingRecord> key) {
        super(child, key, SOMETHING);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Vertx.VERTX;
    }

    @Override
    public UniqueKey<SomethingRecord> getPrimaryKey() {
        return Keys.SOMETHING_PKEY;
    }

    @Override
    public Something as(String alias) {
        return new Something(DSL.name(alias), this);
    }

    @Override
    public Something as(Name alias) {
        return new Something(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Something rename(String name) {
        return new Something(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Something rename(Name name) {
        return new Something(name, null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<Integer, String, Long, Short, Integer, Double, Someenum, JsonObject, SomeJsonPojo, JsonArray, JsonObject, LocalTime, LocalDate, LocalDateTime, OffsetDateTime, byte[], List<String>> fieldsRow() {
        return (Row17) super.fieldsRow();
    }
}
