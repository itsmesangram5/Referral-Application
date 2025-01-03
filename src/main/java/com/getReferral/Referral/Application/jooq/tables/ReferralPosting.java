/*
 * This file is generated by jOOQ.
 */
package com.getReferral.Referral.Application.jooq.tables;


import com.getReferral.Referral.Application.jooq.Indexes;
import com.getReferral.Referral.Application.jooq.Keys;
import com.getReferral.Referral.Application.jooq.ReferralDb;
import com.getReferral.Referral.Application.jooq.tables.ReferralApplications.ReferralApplicationsPath;
import com.getReferral.Referral.Application.jooq.tables.Referrer.ReferrerPath;
import com.getReferral.Referral.Application.jooq.tables.records.ReferralPostingRecord;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ReferralPosting extends TableImpl<ReferralPostingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>referral_db.referral_posting</code>
     */
    public static final ReferralPosting REFERRAL_POSTING = new ReferralPosting();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReferralPostingRecord> getRecordType() {
        return ReferralPostingRecord.class;
    }

    /**
     * The column <code>referral_db.referral_posting.referral_posting_id</code>.
     */
    public final TableField<ReferralPostingRecord, Integer> REFERRAL_POSTING_ID = createField(DSL.name("referral_posting_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>referral_db.referral_posting.referrer_id</code>.
     */
    public final TableField<ReferralPostingRecord, Integer> REFERRER_ID = createField(DSL.name("referrer_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>referral_db.referral_posting.referral_posting_title</code>.
     */
    public final TableField<ReferralPostingRecord, String> REFERRAL_POSTING_TITLE = createField(DSL.name("referral_posting_title"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>referral_db.referral_posting.branch</code>.
     */
    public final TableField<ReferralPostingRecord, String> BRANCH = createField(DSL.name("branch"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>referral_db.referral_posting.passout_yr</code>.
     */
    public final TableField<ReferralPostingRecord, Integer> PASSOUT_YR = createField(DSL.name("passout_yr"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>referral_db.referral_posting.exp_title</code>.
     */
    public final TableField<ReferralPostingRecord, String> EXP_TITLE = createField(DSL.name("exp_title"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>referral_db.referral_posting.exp_tech</code>.
     */
    public final TableField<ReferralPostingRecord, String> EXP_TECH = createField(DSL.name("exp_tech"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>referral_db.referral_posting.project_tech</code>.
     */
    public final TableField<ReferralPostingRecord, String> PROJECT_TECH = createField(DSL.name("project_tech"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>referral_db.referral_posting.tech_skills</code>.
     */
    public final TableField<ReferralPostingRecord, String> TECH_SKILLS = createField(DSL.name("tech_skills"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>referral_db.referral_posting.soft_skills</code>.
     */
    public final TableField<ReferralPostingRecord, String> SOFT_SKILLS = createField(DSL.name("soft_skills"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>referral_db.referral_posting.ctc</code>.
     */
    public final TableField<ReferralPostingRecord, BigDecimal> CTC = createField(DSL.name("ctc"), SQLDataType.DECIMAL(5, 2), this, "");

    /**
     * The column <code>referral_db.referral_posting.positions</code>.
     */
    public final TableField<ReferralPostingRecord, Integer> POSITIONS = createField(DSL.name("positions"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>referral_db.referral_posting.last_date_to_apply</code>.
     */
    public final TableField<ReferralPostingRecord, LocalDate> LAST_DATE_TO_APPLY = createField(DSL.name("last_date_to_apply"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>referral_db.referral_posting.company_name</code>.
     */
    public final TableField<ReferralPostingRecord, String> COMPANY_NAME = createField(DSL.name("company_name"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>referral_db.referral_posting.referral_posting_desripation</code>.
     */
    public final TableField<ReferralPostingRecord, String> REFERRAL_POSTING_DESRIPATION = createField(DSL.name("referral_posting_desripation"), SQLDataType.CLOB, this, "");

    private ReferralPosting(Name alias, Table<ReferralPostingRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private ReferralPosting(Name alias, Table<ReferralPostingRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>referral_db.referral_posting</code> table
     * reference
     */
    public ReferralPosting(String alias) {
        this(DSL.name(alias), REFERRAL_POSTING);
    }

    /**
     * Create an aliased <code>referral_db.referral_posting</code> table
     * reference
     */
    public ReferralPosting(Name alias) {
        this(alias, REFERRAL_POSTING);
    }

    /**
     * Create a <code>referral_db.referral_posting</code> table reference
     */
    public ReferralPosting() {
        this(DSL.name("referral_posting"), null);
    }

    public <O extends Record> ReferralPosting(Table<O> path, ForeignKey<O, ReferralPostingRecord> childPath, InverseForeignKey<O, ReferralPostingRecord> parentPath) {
        super(path, childPath, parentPath, REFERRAL_POSTING);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class ReferralPostingPath extends ReferralPosting implements Path<ReferralPostingRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> ReferralPostingPath(Table<O> path, ForeignKey<O, ReferralPostingRecord> childPath, InverseForeignKey<O, ReferralPostingRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private ReferralPostingPath(Name alias, Table<ReferralPostingRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public ReferralPostingPath as(String alias) {
            return new ReferralPostingPath(DSL.name(alias), this);
        }

        @Override
        public ReferralPostingPath as(Name alias) {
            return new ReferralPostingPath(alias, this);
        }

        @Override
        public ReferralPostingPath as(Table<?> alias) {
            return new ReferralPostingPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ReferralDb.REFERRAL_DB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.REFERRAL_POSTING_REFERRER_ID);
    }

    @Override
    public Identity<ReferralPostingRecord, Integer> getIdentity() {
        return (Identity<ReferralPostingRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ReferralPostingRecord> getPrimaryKey() {
        return Keys.KEY_REFERRAL_POSTING_PRIMARY;
    }

    @Override
    public List<ForeignKey<ReferralPostingRecord, ?>> getReferences() {
        return Arrays.asList(Keys.REFERRAL_POSTING_IBFK_1);
    }

    private transient ReferrerPath _referrer;

    /**
     * Get the implicit join path to the <code>referral_db.referrer</code>
     * table.
     */
    public ReferrerPath referrer() {
        if (_referrer == null)
            _referrer = new ReferrerPath(this, Keys.REFERRAL_POSTING_IBFK_1, null);

        return _referrer;
    }

    private transient ReferralApplicationsPath _referralApplications;

    /**
     * Get the implicit to-many join path to the
     * <code>referral_db.referral_applications</code> table
     */
    public ReferralApplicationsPath referralApplications() {
        if (_referralApplications == null)
            _referralApplications = new ReferralApplicationsPath(this, null, Keys.REFERRAL_APPLICATIONS_IBFK_2.getInverseKey());

        return _referralApplications;
    }

    @Override
    public ReferralPosting as(String alias) {
        return new ReferralPosting(DSL.name(alias), this);
    }

    @Override
    public ReferralPosting as(Name alias) {
        return new ReferralPosting(alias, this);
    }

    @Override
    public ReferralPosting as(Table<?> alias) {
        return new ReferralPosting(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReferralPosting rename(String name) {
        return new ReferralPosting(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReferralPosting rename(Name name) {
        return new ReferralPosting(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReferralPosting rename(Table<?> name) {
        return new ReferralPosting(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ReferralPosting where(Condition condition) {
        return new ReferralPosting(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ReferralPosting where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ReferralPosting where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ReferralPosting where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ReferralPosting where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ReferralPosting where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ReferralPosting where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ReferralPosting where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ReferralPosting whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ReferralPosting whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
