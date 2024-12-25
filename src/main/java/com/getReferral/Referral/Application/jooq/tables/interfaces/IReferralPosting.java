/*
 * This file is generated by jOOQ.
 */
package com.getReferral.Referral.Application.jooq.tables.interfaces;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public interface IReferralPosting extends Serializable {

    /**
     * Setter for <code>referral_db.referral_posting.referral_posting_id</code>.
     */
    public void setReferralPostingId(Integer value);

    /**
     * Getter for <code>referral_db.referral_posting.referral_posting_id</code>.
     */
    public Integer getReferralPostingId();

    /**
     * Setter for <code>referral_db.referral_posting.referrer_id</code>.
     */
    public void setReferrerId(Integer value);

    /**
     * Getter for <code>referral_db.referral_posting.referrer_id</code>.
     */
    public Integer getReferrerId();

    /**
     * Setter for
     * <code>referral_db.referral_posting.referral_posting_title</code>.
     */
    public void setReferralPostingTitle(String value);

    /**
     * Getter for
     * <code>referral_db.referral_posting.referral_posting_title</code>.
     */
    public String getReferralPostingTitle();

    /**
     * Setter for <code>referral_db.referral_posting.branch</code>.
     */
    public void setBranch(String value);

    /**
     * Getter for <code>referral_db.referral_posting.branch</code>.
     */
    public String getBranch();

    /**
     * Setter for <code>referral_db.referral_posting.passout_yr</code>.
     */
    public void setPassoutYr(Integer value);

    /**
     * Getter for <code>referral_db.referral_posting.passout_yr</code>.
     */
    public Integer getPassoutYr();

    /**
     * Setter for <code>referral_db.referral_posting.exp_title</code>.
     */
    public void setExpTitle(String value);

    /**
     * Getter for <code>referral_db.referral_posting.exp_title</code>.
     */
    public String getExpTitle();

    /**
     * Setter for <code>referral_db.referral_posting.exp_tech</code>.
     */
    public void setExpTech(String value);

    /**
     * Getter for <code>referral_db.referral_posting.exp_tech</code>.
     */
    public String getExpTech();

    /**
     * Setter for <code>referral_db.referral_posting.project_tech</code>.
     */
    public void setProjectTech(String value);

    /**
     * Getter for <code>referral_db.referral_posting.project_tech</code>.
     */
    public String getProjectTech();

    /**
     * Setter for <code>referral_db.referral_posting.tech_skills</code>.
     */
    public void setTechSkills(String value);

    /**
     * Getter for <code>referral_db.referral_posting.tech_skills</code>.
     */
    public String getTechSkills();

    /**
     * Setter for <code>referral_db.referral_posting.soft_skills</code>.
     */
    public void setSoftSkills(String value);

    /**
     * Getter for <code>referral_db.referral_posting.soft_skills</code>.
     */
    public String getSoftSkills();

    /**
     * Setter for <code>referral_db.referral_posting.ctc</code>.
     */
    public void setCtc(BigDecimal value);

    /**
     * Getter for <code>referral_db.referral_posting.ctc</code>.
     */
    public BigDecimal getCtc();

    /**
     * Setter for <code>referral_db.referral_posting.positions</code>.
     */
    public void setPositions(Integer value);

    /**
     * Getter for <code>referral_db.referral_posting.positions</code>.
     */
    public Integer getPositions();

    /**
     * Setter for <code>referral_db.referral_posting.last_date_to_apply</code>.
     */
    public void setLastDateToApply(LocalDate value);

    /**
     * Getter for <code>referral_db.referral_posting.last_date_to_apply</code>.
     */
    public LocalDate getLastDateToApply();

    /**
     * Setter for <code>referral_db.referral_posting.company_name</code>.
     */
    public void setCompanyName(String value);

    /**
     * Getter for <code>referral_db.referral_posting.company_name</code>.
     */
    public String getCompanyName();

    /**
     * Setter for
     * <code>referral_db.referral_posting.referral_posting_desripation</code>.
     */
    public void setReferralPostingDesripation(String value);

    /**
     * Getter for
     * <code>referral_db.referral_posting.referral_posting_desripation</code>.
     */
    public String getReferralPostingDesripation();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IReferralPosting
     */
    public void from(IReferralPosting from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IReferralPosting
     */
    public <E extends IReferralPosting> E into(E into);
}