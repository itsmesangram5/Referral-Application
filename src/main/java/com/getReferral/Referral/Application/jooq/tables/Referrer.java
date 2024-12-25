/*
 * This file is generated by jOOQ.
 */
package com.getReferral.Referral.Application.jooq.tables;


import com.getReferral.Referral.Application.jooq.Keys;
import com.getReferral.Referral.Application.jooq.ReferralDb;
import com.getReferral.Referral.Application.jooq.tables.ReferralApplications.ReferralApplicationsPath;
import com.getReferral.Referral.Application.jooq.tables.ReferralPosting.ReferralPostingPath;
import com.getReferral.Referral.Application.jooq.tables.Users.UsersPath;
import com.getReferral.Referral.Application.jooq.tables.records.ReferrerRecord;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Referrer extends TableImpl<ReferrerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>referral_db.referrer</code>
     */
    public static final Referrer REFERRER = new Referrer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReferrerRecord> getRecordType() {
        return ReferrerRecord.class;
    }

    /**
     * The column <code>referral_db.referrer.referrer_id</code>.
     */
    public final TableField<ReferrerRecord, Integer> REFERRER_ID = createField(DSL.name("referrer_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>referral_db.referrer.user_id</code>.
     */
    public final TableField<ReferrerRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER, this, "");

    private Referrer(Name alias, Table<ReferrerRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Referrer(Name alias, Table<ReferrerRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>referral_db.referrer</code> table reference
     */
    public Referrer(String alias) {
        this(DSL.name(alias), REFERRER);
    }

    /**
     * Create an aliased <code>referral_db.referrer</code> table reference
     */
    public Referrer(Name alias) {
        this(alias, REFERRER);
    }

    /**
     * Create a <code>referral_db.referrer</code> table reference
     */
    public Referrer() {
        this(DSL.name("referrer"), null);
    }

    public <O extends Record> Referrer(Table<O> path, ForeignKey<O, ReferrerRecord> childPath, InverseForeignKey<O, ReferrerRecord> parentPath) {
        super(path, childPath, parentPath, REFERRER);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class ReferrerPath extends Referrer implements Path<ReferrerRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> ReferrerPath(Table<O> path, ForeignKey<O, ReferrerRecord> childPath, InverseForeignKey<O, ReferrerRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private ReferrerPath(Name alias, Table<ReferrerRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public ReferrerPath as(String alias) {
            return new ReferrerPath(DSL.name(alias), this);
        }

        @Override
        public ReferrerPath as(Name alias) {
            return new ReferrerPath(alias, this);
        }

        @Override
        public ReferrerPath as(Table<?> alias) {
            return new ReferrerPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ReferralDb.REFERRAL_DB;
    }

    @Override
    public Identity<ReferrerRecord, Integer> getIdentity() {
        return (Identity<ReferrerRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ReferrerRecord> getPrimaryKey() {
        return Keys.KEY_REFERRER_PRIMARY;
    }

    @Override
    public List<UniqueKey<ReferrerRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_REFERRER_USER_ID);
    }

    @Override
    public List<ForeignKey<ReferrerRecord, ?>> getReferences() {
        return Arrays.asList(Keys.REFERRER_IBFK_1);
    }

    private transient UsersPath _users;

    /**
     * Get the implicit join path to the <code>referral_db.users</code> table.
     */
    public UsersPath users() {
        if (_users == null)
            _users = new UsersPath(this, Keys.REFERRER_IBFK_1, null);

        return _users;
    }

    private transient ReferralApplicationsPath _referralApplications;

    /**
     * Get the implicit to-many join path to the
     * <code>referral_db.referral_applications</code> table
     */
    public ReferralApplicationsPath referralApplications() {
        if (_referralApplications == null)
            _referralApplications = new ReferralApplicationsPath(this, null, Keys.REFERRAL_APPLICATIONS_IBFK_3.getInverseKey());

        return _referralApplications;
    }

    private transient ReferralPostingPath _referralPosting;

    /**
     * Get the implicit to-many join path to the
     * <code>referral_db.referral_posting</code> table
     */
    public ReferralPostingPath referralPosting() {
        if (_referralPosting == null)
            _referralPosting = new ReferralPostingPath(this, null, Keys.REFERRAL_POSTING_IBFK_1.getInverseKey());

        return _referralPosting;
    }

    @Override
    public Referrer as(String alias) {
        return new Referrer(DSL.name(alias), this);
    }

    @Override
    public Referrer as(Name alias) {
        return new Referrer(alias, this);
    }

    @Override
    public Referrer as(Table<?> alias) {
        return new Referrer(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Referrer rename(String name) {
        return new Referrer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Referrer rename(Name name) {
        return new Referrer(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Referrer rename(Table<?> name) {
        return new Referrer(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Referrer where(Condition condition) {
        return new Referrer(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Referrer where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Referrer where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Referrer where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Referrer where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Referrer where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Referrer where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Referrer where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Referrer whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Referrer whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}