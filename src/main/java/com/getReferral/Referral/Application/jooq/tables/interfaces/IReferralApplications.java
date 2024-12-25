/*
 * This file is generated by jOOQ.
 */
package com.getReferral.Referral.Application.jooq.tables.interfaces;


import java.io.Serializable;
import java.time.LocalDate;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public interface IReferralApplications extends Serializable {

    /**
     * Setter for
     * <code>referral_db.referral_applications.referral_application_id</code>.
     */
    public void setReferralApplicationId(Integer value);

    /**
     * Getter for
     * <code>referral_db.referral_applications.referral_application_id</code>.
     */
    public Integer getReferralApplicationId();

    /**
     * Setter for
     * <code>referral_db.referral_applications.referral_posting_id</code>.
     */
    public void setReferralPostingId(Integer value);

    /**
     * Getter for
     * <code>referral_db.referral_applications.referral_posting_id</code>.
     */
    public Integer getReferralPostingId();

    /**
     * Setter for <code>referral_db.referral_applications.referrer_id</code>.
     */
    public void setReferrerId(Integer value);

    /**
     * Getter for <code>referral_db.referral_applications.referrer_id</code>.
     */
    public Integer getReferrerId();

    /**
     * Setter for <code>referral_db.referral_applications.applicant_id</code>.
     */
    public void setApplicantId(Integer value);

    /**
     * Getter for <code>referral_db.referral_applications.applicant_id</code>.
     */
    public Integer getApplicantId();

    /**
     * Setter for <code>referral_db.referral_applications.resume_id</code>.
     */
    public void setResumeId(Integer value);

    /**
     * Getter for <code>referral_db.referral_applications.resume_id</code>.
     */
    public Integer getResumeId();

    /**
     * Setter for <code>referral_db.referral_applications.applied_date</code>.
     */
    public void setAppliedDate(LocalDate value);

    /**
     * Getter for <code>referral_db.referral_applications.applied_date</code>.
     */
    public LocalDate getAppliedDate();

    /**
     * Setter for <code>referral_db.referral_applications.status</code>.
     */
    public void setStatus(String value);

    /**
     * Getter for <code>referral_db.referral_applications.status</code>.
     */
    public String getStatus();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IReferralApplications
     */
    public void from(IReferralApplications from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IReferralApplications
     */
    public <E extends IReferralApplications> E into(E into);
}