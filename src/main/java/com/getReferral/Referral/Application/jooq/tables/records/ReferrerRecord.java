/*
 * This file is generated by jOOQ.
 */
package com.getReferral.Referral.Application.jooq.tables.records;


import com.getReferral.Referral.Application.jooq.tables.Referrer;
import com.getReferral.Referral.Application.jooq.tables.interfaces.IReferrer;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ReferrerRecord extends UpdatableRecordImpl<ReferrerRecord> implements IReferrer {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>referral_db.referrer.referrer_id</code>.
     */
    @Override
    public void setReferrerId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>referral_db.referrer.referrer_id</code>.
     */
    @Override
    public Integer getReferrerId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>referral_db.referrer.user_id</code>.
     */
    @Override
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>referral_db.referrer.user_id</code>.
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
    public void from(IReferrer from) {
        setReferrerId(from.getReferrerId());
        setUserId(from.getUserId());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IReferrer> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReferrerRecord
     */
    public ReferrerRecord() {
        super(Referrer.REFERRER);
    }

    /**
     * Create a detached, initialised ReferrerRecord
     */
    public ReferrerRecord(Integer referrerId, Integer userId) {
        super(Referrer.REFERRER);

        setReferrerId(referrerId);
        setUserId(userId);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ReferrerRecord
     */
    public ReferrerRecord(com.getReferral.Referral.Application.jooq.tables.pojos.Referrer value) {
        super(Referrer.REFERRER);

        if (value != null) {
            setReferrerId(value.getReferrerId());
            setUserId(value.getUserId());
            resetChangedOnNotNull();
        }
    }
}