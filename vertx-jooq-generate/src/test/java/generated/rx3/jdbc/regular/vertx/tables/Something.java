/*
 * This file is generated by jOOQ.
 */
package generated.rx3.jdbc.regular.vertx.tables;


import generated.rx3.jdbc.regular.vertx.Keys;
import generated.rx3.jdbc.regular.vertx.Vertx;
import generated.rx3.jdbc.regular.vertx.tables.records.SomethingRecord;

import io.github.jklingsporn.vertx.jooq.shared.JsonArrayConverter;
import io.github.jklingsporn.vertx.jooq.shared.JsonObjectConverter;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function11;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.SelectField;
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
     * The reference instance of <code>VERTX.SOMETHING</code>
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
     * The column <code>VERTX.SOMETHING.SOMEID</code>.
     */
    public final TableField<SomethingRecord, Integer> SOMEID = createField(DSL.name("SOMEID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>VERTX.SOMETHING.SOMESTRING</code>.
     */
    public final TableField<SomethingRecord, String> SOMESTRING = createField(DSL.name("SOMESTRING"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>VERTX.SOMETHING.SOMEHUGENUMBER</code>.
     */
    public final TableField<SomethingRecord, Long> SOMEHUGENUMBER = createField(DSL.name("SOMEHUGENUMBER"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>VERTX.SOMETHING.SOMESMALLNUMBER</code>.
     */
    public final TableField<SomethingRecord, Short> SOMESMALLNUMBER = createField(DSL.name("SOMESMALLNUMBER"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>VERTX.SOMETHING.SOMEREGULARNUMBER</code>.
     */
    public final TableField<SomethingRecord, Integer> SOMEREGULARNUMBER = createField(DSL.name("SOMEREGULARNUMBER"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>VERTX.SOMETHING.SOMEDECIMAL</code>.
     */
    public final TableField<SomethingRecord, BigDecimal> SOMEDECIMAL = createField(DSL.name("SOMEDECIMAL"), SQLDataType.DECIMAL(10, 2), this, "");

    /**
     * The column <code>VERTX.SOMETHING.SOMEBOOLEAN</code>.
     */
    public final TableField<SomethingRecord, Boolean> SOMEBOOLEAN = createField(DSL.name("SOMEBOOLEAN"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.field("FALSE", SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>VERTX.SOMETHING.SOMEDOUBLE</code>.
     */
    public final TableField<SomethingRecord, Double> SOMEDOUBLE = createField(DSL.name("SOMEDOUBLE"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>VERTX.SOMETHING.SOMEJSONOBJECT</code>.
     */
    public final TableField<SomethingRecord, JsonObject> SOMEJSONOBJECT = createField(DSL.name("SOMEJSONOBJECT"), SQLDataType.VARCHAR(512), this, "", new JsonObjectConverter());

    /**
     * The column <code>VERTX.SOMETHING.SOMEJSONARRAY</code>.
     */
    public final TableField<SomethingRecord, JsonArray> SOMEJSONARRAY = createField(DSL.name("SOMEJSONARRAY"), SQLDataType.VARCHAR(512), this, "", new JsonArrayConverter());

    /**
     * The column <code>VERTX.SOMETHING.SOMETIMESTAMP</code>.
     */
    public final TableField<SomethingRecord, LocalDateTime> SOMETIMESTAMP = createField(DSL.name("SOMETIMESTAMP"), SQLDataType.LOCALDATETIME(2), this, "");

    private Something(Name alias, Table<SomethingRecord> aliased) {
        this(alias, aliased, null);
    }

    private Something(Name alias, Table<SomethingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>VERTX.SOMETHING</code> table reference
     */
    public Something(String alias) {
        this(DSL.name(alias), SOMETHING);
    }

    /**
     * Create an aliased <code>VERTX.SOMETHING</code> table reference
     */
    public Something(Name alias) {
        this(alias, SOMETHING);
    }

    /**
     * Create a <code>VERTX.SOMETHING</code> table reference
     */
    public Something() {
        this(DSL.name("SOMETHING"), null);
    }

    public <O extends Record> Something(Table<O> child, ForeignKey<O, SomethingRecord> key) {
        super(child, key, SOMETHING);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Vertx.VERTX;
    }

    @Override
    public Identity<SomethingRecord, Integer> getIdentity() {
        return (Identity<SomethingRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<SomethingRecord> getPrimaryKey() {
        return Keys.SYS_PK_10778;
    }

    @Override
    public Something as(String alias) {
        return new Something(DSL.name(alias), this);
    }

    @Override
    public Something as(Name alias) {
        return new Something(alias, this);
    }

    @Override
    public Something as(Table<?> alias) {
        return new Something(alias.getQualifiedName(), this);
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

    /**
     * Rename this table
     */
    @Override
    public Something rename(Table<?> name) {
        return new Something(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, Long, Short, Integer, BigDecimal, Boolean, Double, JsonObject, JsonArray, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function11<? super Integer, ? super String, ? super Long, ? super Short, ? super Integer, ? super BigDecimal, ? super Boolean, ? super Double, ? super JsonObject, ? super JsonArray, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function11<? super Integer, ? super String, ? super Long, ? super Short, ? super Integer, ? super BigDecimal, ? super Boolean, ? super Double, ? super JsonObject, ? super JsonArray, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
