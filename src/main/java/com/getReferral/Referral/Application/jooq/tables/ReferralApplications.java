/*
 * This file is generated by jOOQ.
 */
package com.getReferral.Referral.Application.jooq.tables;


import com.getReferral.Referral.Application.jooq.Indexes;
import com.getReferral.Referral.Application.jooq.Keys;
import com.getReferral.Referral.Application.jooq.ReferralDb;
import com.getReferral.Referral.Application.jooq.tables.Applicants.ApplicantsPath;
import com.getReferral.Referral.Application.jooq.tables.ReferralPosting.ReferralPostingPath;
import com.getReferral.Referral.Application.jooq.tables.Referrer.ReferrerPath;
import com.getReferral.Referral.Application.jooq.tables.Resumes.ResumesPath;
import com.getReferral.Referral.Application.jooq.tables.records.ReferralApplicationsRecord;

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
public class ReferralApplications extends TableImpl<ReferralApplicationsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>referral_db.referral_applications</code>
     */
    public static final ReferralApplications REFERRAL_APPLICATIONS = new ReferralApplications();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReferralApplicationsRecord> getRecordType() {
        return ReferralApplicationsRecord.class;
    }

    /**
     * The column
     * <code>referral_db.referral_applications.referral_application_id</code>.
     */
    public final TableField<ReferralApplicationsRecord, Integer> REFERRAL_APPLICATION_ID = createField(DSL.name("referral_application_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column
     * <code>referral_db.referral_applications.referral_posting_id</code>.
     */
    public final TableField<ReferralApplicationsRecord, Integer> REFERRAL_POSTING_ID = createField(DSL.name("referral_posting_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>referral_db.referral_applications.referrer_id</code>.
     */
    public final TableField<ReferralApplicationsRecord, Integer> REFERRER_ID = createField(DSL.name("referrer_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>referral_db.referral_applications.applicant_id</code>.
     */
    public final TableField<ReferralApplicationsRecord, Integer> APPLICANT_ID = createField(DSL.name("applicant_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>referral_db.referral_applications.resume_id</code>.
     */
    public final TableField<ReferralApplicationsRecord, Integer> RESUME_ID = createField(DSL.name("resume_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>referral_db.referral_applications.applied_date</code>.
     */
    public final TableField<ReferralApplicationsRecord, LocalDate> APPLIED_DATE = createField(DSL.name("applied_date"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>referral_db.referral_applications.status</code>.
     */
    public final TableField<ReferralApplicationsRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.CLOB, this, "");

    private ReferralApplications(Name alias, Table<ReferralApplicationsRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private ReferralApplications(Name alias, Table<ReferralApplicationsRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>referral_db.referral_applications</code> table
     * reference
     */
    public ReferralApplications(String alias) {
        this(DSL.name(alias), REFERRAL_APPLICATIONS);
    }

    /**
     * Create an aliased <code>referral_db.referral_applications</code> table
     * reference
     */
    public ReferralApplications(Name alias) {
        this(alias, REFERRAL_APPLICATIONS);
    }

    /**
     * Create a <code>referral_db.referral_applications</code> table reference
     */
    public ReferralApplications() {
        this(DSL.name("referral_applications"), null);
    }

    public <O extends Record> ReferralApplications(Table<O> path, ForeignKey<O, ReferralApplicationsRecord> childPath, InverseForeignKey<O, ReferralApplicationsRecord> parentPath) {
        super(path, childPath, parentPath, REFERRAL_APPLICATIONS);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class ReferralApplicationsPath extends ReferralApplications implements Path<ReferralApplicationsRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> ReferralApplicationsPath(Table<O> path, ForeignKey<O, ReferralApplicationsRecord> childPath, InverseForeignKey<O, ReferralApplicationsRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private ReferralApplicationsPath(Name alias, Table<ReferralApplicationsRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public ReferralApplicationsPath as(String alias) {
            return new ReferralApplicationsPath(DSL.name(alias), this);
        }

        @Override
        public ReferralApplicationsPath as(Name alias) {
            return new ReferralApplicationsPath(alias, this);
        }

        @Override
        public ReferralApplicationsPath as(Table<?> alias) {
            return new ReferralApplicationsPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ReferralDb.REFERRAL_DB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.REFERRAL_APPLICATIONS_APPLICANT_ID, Indexes.REFERRAL_APPLICATIONS_REFERRAL_POSTING_ID, Indexes.REFERRAL_APPLICATIONS_REFERRER_ID, Indexes.REFERRAL_APPLICATIONS_RESUME_ID);
    }

    @Override
    public Identity<ReferralApplicationsRecord, Integer> getIdentity() {
        return (Identity<ReferralApplicationsRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ReferralApplicationsRecord> getPrimaryKey() {
        return Keys.KEY_REFERRAL_APPLICATIONS_PRIMARY;
    }

    @Override
    public List<ForeignKey<ReferralApplicationsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.REFERRAL_APPLICATIONS_IBFK_1, Keys.REFERRAL_APPLICATIONS_IBFK_2, Keys.REFERRAL_APPLICATIONS_IBFK_3, Keys.REFERRAL_APPLICATIONS_IBFK_4);
    }

    private transient ApplicantsPath _applicants;

    /**
     * Get the implicit join path to the <code>referral_db.applicants</code>
     * table.
     */
    public ApplicantsPath applicants() {
        if (_applicants == null)
            _applicants = new ApplicantsPath(this, Keys.REFERRAL_APPLICATIONS_IBFK_1, null);

        return _applicants;
    }

    private transient ReferralPostingPath _referralPosting;

    /**
     * Get the implicit join path to the
     * <code>referral_db.referral_posting</code> table.
     */
    public ReferralPostingPath referralPosting() {
        if (_referralPosting == null)
            _referralPosting = new ReferralPostingPath(this, Keys.REFERRAL_APPLICATIONS_IBFK_2, null);

        return _referralPosting;
    }

    private transient ReferrerPath _referrer;

    /**
     * Get the implicit join path to the <code>referral_db.referrer</code>
     * table.
     */
    public ReferrerPath referrer() {
        if (_referrer == null)
            _referrer = new ReferrerPath(this, Keys.REFERRAL_APPLICATIONS_IBFK_3, null);

        return _referrer;
    }

    private transient ResumesPath _resumes;

    /**
     * Get the implicit join path to the <code>referral_db.resumes</code> table.
     */
    public ResumesPath resumes() {
        if (_resumes == null)
            _resumes = new ResumesPath(this, Keys.REFERRAL_APPLICATIONS_IBFK_4, null);

        return _resumes;
    }

    @Override
    public ReferralApplications as(String alias) {
        return new ReferralApplications(DSL.name(alias), this);
    }

    @Override
    public ReferralApplications as(Name alias) {
        return new ReferralApplications(alias, this);
    }

    @Override
    public ReferralApplications as(Table<?> alias) {
        return new ReferralApplications(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReferralApplications rename(String name) {
        return new ReferralApplications(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReferralApplications rename(Name name) {
        return new ReferralApplications(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReferralApplications rename(Table<?> name) {
        return new ReferralApplications(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ReferralApplications where(Condition condition) {
        return new ReferralApplications(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ReferralApplications where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ReferralApplications where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ReferralApplications where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ReferralApplications where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ReferralApplications where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ReferralApplications where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ReferralApplications where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ReferralApplications whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ReferralApplications whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
