/*
 * This file is generated by jOOQ.
 */
package com.getReferral.Referral.Application.jooq.tables.records;


import com.getReferral.Referral.Application.jooq.tables.Applicants;
import com.getReferral.Referral.Application.jooq.tables.interfaces.IApplicants;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ApplicantsRecord extends UpdatableRecordImpl<ApplicantsRecord> implements IApplicants {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>referral_db.applicants.applicant_id</code>.
     */
    @Override
    public void setApplicantId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>referral_db.applicants.applicant_id</code>.
     */
    @Override
    public Integer getApplicantId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>referral_db.applicants.user_id</code>.
     */
    @Override
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>referral_db.applicants.user_id</code>.
     */
    @Override
    public Integer getUserId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IApplicants from) {
        setApplicantId(from.getApplicantId());
        setUserId(from.getUserId());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IApplicants> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ApplicantsRecord
     */
    public ApplicantsRecord() {
        super(Applicants.APPLICANTS);
    }

    /**
     * Create a detached, initialised ApplicantsRecord
     */
    public ApplicantsRecord(Integer applicantId, Integer userId) {
        super(Applicants.APPLICANTS);

        setApplicantId(applicantId);
        setUserId(userId);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ApplicantsRecord
     */
    public ApplicantsRecord(com.getReferral.Referral.Application.jooq.tables.pojos.Applicants value) {
        super(Applicants.APPLICANTS);

        if (value != null) {
            setApplicantId(value.getApplicantId());
            setUserId(value.getUserId());
            resetChangedOnNotNull();
        }
    }
}
