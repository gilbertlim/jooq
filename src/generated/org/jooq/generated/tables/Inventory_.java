/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.generated.Indexes;
import org.jooq.generated.Keys;
import org.jooq.generated.Sakila_;
import org.jooq.generated.tables.Film_.FilmPath;
import org.jooq.generated.tables.Rental_.RentalPath;
import org.jooq.generated.tables.Store_.StorePath;
import org.jooq.generated.tables.records.InventoryRecord;
import org.jooq.impl.AutoConverter;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.19.10",
        "schema version:1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Inventory_ extends TableImpl<InventoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila.inventory</code>
     */
    public static final Inventory_ INVENTORY = new Inventory_();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InventoryRecord> getRecordType() {
        return InventoryRecord.class;
    }

    /**
     * The column <code>sakila.inventory.inventory_id</code>.
     */
    public final TableField<InventoryRecord, Long> INVENTORY_ID = createField(DSL.name("inventory_id"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "", new AutoConverter<UInteger, Long>(UInteger.class, Long.class));

    /**
     * The column <code>sakila.inventory.film_id</code>.
     */
    public final TableField<InventoryRecord, Long> FILM_ID = createField(DSL.name("film_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "", new AutoConverter<UInteger, Long>(UInteger.class, Long.class));

    /**
     * The column <code>sakila.inventory.store_id</code>.
     */
    public final TableField<InventoryRecord, Long> STORE_ID = createField(DSL.name("store_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "", new AutoConverter<UInteger, Long>(UInteger.class, Long.class));

    /**
     * The column <code>sakila.inventory.last_update</code>.
     */
    public final TableField<InventoryRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "");

    private Inventory_(Name alias, Table<InventoryRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Inventory_(Name alias, Table<InventoryRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>sakila.inventory</code> table reference
     */
    public Inventory_(String alias) {
        this(DSL.name(alias), INVENTORY);
    }

    /**
     * Create an aliased <code>sakila.inventory</code> table reference
     */
    public Inventory_(Name alias) {
        this(alias, INVENTORY);
    }

    /**
     * Create a <code>sakila.inventory</code> table reference
     */
    public Inventory_() {
        this(DSL.name("inventory"), null);
    }

    public <O extends Record> Inventory_(Table<O> path, ForeignKey<O, InventoryRecord> childPath, InverseForeignKey<O, InventoryRecord> parentPath) {
        super(path, childPath, parentPath, INVENTORY);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class InventoryPath extends Inventory_ implements Path<InventoryRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> InventoryPath(Table<O> path, ForeignKey<O, InventoryRecord> childPath, InverseForeignKey<O, InventoryRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private InventoryPath(Name alias, Table<InventoryRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public InventoryPath as(String alias) {
            return new InventoryPath(DSL.name(alias), this);
        }

        @Override
        public InventoryPath as(Name alias) {
            return new InventoryPath(alias, this);
        }

        @Override
        public InventoryPath as(Table<?> alias) {
            return new InventoryPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sakila_.SAKILA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.INVENTORY_IDX_FK_FILM_ID, Indexes.INVENTORY_IDX_STORE_ID_FILM_ID);
    }

    @Override
    public Identity<InventoryRecord, Long> getIdentity() {
        return (Identity<InventoryRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<InventoryRecord> getPrimaryKey() {
        return Keys.KEY_INVENTORY_PRIMARY;
    }

    @Override
    public List<ForeignKey<InventoryRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_INVENTORY_FILM, Keys.FK_INVENTORY_STORE);
    }

    private transient FilmPath _film;

    /**
     * Get the implicit join path to the <code>sakila.film</code> table.
     */
    public FilmPath film() {
        if (_film == null)
            _film = new FilmPath(this, Keys.FK_INVENTORY_FILM, null);

        return _film;
    }

    private transient StorePath _store;

    /**
     * Get the implicit join path to the <code>sakila.store</code> table.
     */
    public StorePath store() {
        if (_store == null)
            _store = new StorePath(this, Keys.FK_INVENTORY_STORE, null);

        return _store;
    }

    private transient RentalPath _rental;

    /**
     * Get the implicit to-many join path to the <code>sakila.rental</code>
     * table
     */
    public RentalPath rental() {
        if (_rental == null)
            _rental = new RentalPath(this, null, Keys.FK_RENTAL_INVENTORY.getInverseKey());

        return _rental;
    }

    @Override
    public Inventory_ as(String alias) {
        return new Inventory_(DSL.name(alias), this);
    }

    @Override
    public Inventory_ as(Name alias) {
        return new Inventory_(alias, this);
    }

    @Override
    public Inventory_ as(Table<?> alias) {
        return new Inventory_(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Inventory_ rename(String name) {
        return new Inventory_(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Inventory_ rename(Name name) {
        return new Inventory_(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Inventory_ rename(Table<?> name) {
        return new Inventory_(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Inventory_ where(Condition condition) {
        return new Inventory_(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Inventory_ where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Inventory_ where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Inventory_ where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Inventory_ where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Inventory_ where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Inventory_ where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Inventory_ where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Inventory_ whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Inventory_ whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
