/*
 * This file is generated by jOOQ.
 */
package com.getReferral.Referral.Application.jooq.tables.daos;


import com.getReferral.Referral.Application.jooq.tables.ReferralPosting;
import com.getReferral.Referral.Application.jooq.tables.records.ReferralPostingRecord;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
@Repository
public class ReferralPostingDao extends DAOImpl<ReferralPostingRecord, com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting, Integer> {

    /**
     * Create a new ReferralPostingDao without any configuration
     */
    public ReferralPostingDao() {
        super(ReferralPosting.REFERRAL_POSTING, com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting.class);
    }

    /**
     * Create a new ReferralPostingDao with an attached configuration
     */
    @Autowired
    public ReferralPostingDao(Configuration configuration) {
        super(ReferralPosting.REFERRAL_POSTING, com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting.class, configuration);
    }

    @Override
    public Integer getId(com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting object) {
        return object.getReferralPostingId();
    }

    /**
     * Fetch records that have <code>referral_posting_id BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchRangeOfReferralPostingId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(ReferralPosting.REFERRAL_POSTING.REFERRAL_POSTING_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>referral_posting_id IN (values)</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchByReferralPostingId(Integer... values) {
        return fetch(ReferralPosting.REFERRAL_POSTING.REFERRAL_POSTING_ID, values);
    }

    /**
     * Fetch a unique record that has <code>referral_posting_id = value</code>
     */
    public com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting fetchOneByReferralPostingId(Integer value) {
        return fetchOne(ReferralPosting.REFERRAL_POSTING.REFERRAL_POSTING_ID, value);
    }

    /**
     * Fetch a unique record that has <code>referral_posting_id = value</code>
     */
    public Optional<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchOptionalByReferralPostingId(Integer value) {
        return fetchOptional(ReferralPosting.REFERRAL_POSTING.REFERRAL_POSTING_ID, value);
    }

    /**
     * Fetch records that have <code>referrer_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchRangeOfReferrerId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(ReferralPosting.REFERRAL_POSTING.REFERRER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>referrer_id IN (values)</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchByReferrerId(Integer... values) {
        return fetch(ReferralPosting.REFERRAL_POSTING.REFERRER_ID, values);
    }

    /**
     * Fetch records that have <code>referral_posting_title BETWEEN
     * lowerInclusive AND upperInclusive</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchRangeOfReferralPostingTitle(String lowerInclusive, String upperInclusive) {
        return fetchRange(ReferralPosting.REFERRAL_POSTING.REFERRAL_POSTING_TITLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>referral_posting_title IN (values)</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchByReferralPostingTitle(String... values) {
        return fetch(ReferralPosting.REFERRAL_POSTING.REFERRAL_POSTING_TITLE, values);
    }

    /**
     * Fetch records that have <code>branch BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchRangeOfBranch(String lowerInclusive, String upperInclusive) {
        return fetchRange(ReferralPosting.REFERRAL_POSTING.BRANCH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>branch IN (values)</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchByBranch(String... values) {
        return fetch(ReferralPosting.REFERRAL_POSTING.BRANCH, values);
    }

    /**
     * Fetch records that have <code>passout_yr BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchRangeOfPassoutYr(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(ReferralPosting.REFERRAL_POSTING.PASSOUT_YR, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>passout_yr IN (values)</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchByPassoutYr(Integer... values) {
        return fetch(ReferralPosting.REFERRAL_POSTING.PASSOUT_YR, values);
    }

    /**
     * Fetch records that have <code>exp_title BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchRangeOfExpTitle(String lowerInclusive, String upperInclusive) {
        return fetchRange(ReferralPosting.REFERRAL_POSTING.EXP_TITLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>exp_title IN (values)</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchByExpTitle(String... values) {
        return fetch(ReferralPosting.REFERRAL_POSTING.EXP_TITLE, values);
    }

    /**
     * Fetch records that have <code>exp_tech BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchRangeOfExpTech(String lowerInclusive, String upperInclusive) {
        return fetchRange(ReferralPosting.REFERRAL_POSTING.EXP_TECH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>exp_tech IN (values)</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchByExpTech(String... values) {
        return fetch(ReferralPosting.REFERRAL_POSTING.EXP_TECH, values);
    }

    /**
     * Fetch records that have <code>project_tech BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchRangeOfProjectTech(String lowerInclusive, String upperInclusive) {
        return fetchRange(ReferralPosting.REFERRAL_POSTING.PROJECT_TECH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>project_tech IN (values)</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchByProjectTech(String... values) {
        return fetch(ReferralPosting.REFERRAL_POSTING.PROJECT_TECH, values);
    }

    /**
     * Fetch records that have <code>tech_skills BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchRangeOfTechSkills(String lowerInclusive, String upperInclusive) {
        return fetchRange(ReferralPosting.REFERRAL_POSTING.TECH_SKILLS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tech_skills IN (values)</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchByTechSkills(String... values) {
        return fetch(ReferralPosting.REFERRAL_POSTING.TECH_SKILLS, values);
    }

    /**
     * Fetch records that have <code>soft_skills BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchRangeOfSoftSkills(String lowerInclusive, String upperInclusive) {
        return fetchRange(ReferralPosting.REFERRAL_POSTING.SOFT_SKILLS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>soft_skills IN (values)</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchBySoftSkills(String... values) {
        return fetch(ReferralPosting.REFERRAL_POSTING.SOFT_SKILLS, values);
    }

    /**
     * Fetch records that have <code>ctc BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchRangeOfCtc(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(ReferralPosting.REFERRAL_POSTING.CTC, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ctc IN (values)</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchByCtc(BigDecimal... values) {
        return fetch(ReferralPosting.REFERRAL_POSTING.CTC, values);
    }

    /**
     * Fetch records that have <code>positions BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchRangeOfPositions(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(ReferralPosting.REFERRAL_POSTING.POSITIONS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>positions IN (values)</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchByPositions(Integer... values) {
        return fetch(ReferralPosting.REFERRAL_POSTING.POSITIONS, values);
    }

    /**
     * Fetch records that have <code>last_date_to_apply BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchRangeOfLastDateToApply(LocalDate lowerInclusive, LocalDate upperInclusive) {
        return fetchRange(ReferralPosting.REFERRAL_POSTING.LAST_DATE_TO_APPLY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_date_to_apply IN (values)</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchByLastDateToApply(LocalDate... values) {
        return fetch(ReferralPosting.REFERRAL_POSTING.LAST_DATE_TO_APPLY, values);
    }

    /**
     * Fetch records that have <code>company_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchRangeOfCompanyName(String lowerInclusive, String upperInclusive) {
        return fetchRange(ReferralPosting.REFERRAL_POSTING.COMPANY_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>company_name IN (values)</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchByCompanyName(String... values) {
        return fetch(ReferralPosting.REFERRAL_POSTING.COMPANY_NAME, values);
    }

    /**
     * Fetch records that have <code>referral_posting_desripation BETWEEN
     * lowerInclusive AND upperInclusive</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchRangeOfReferralPostingDesripation(String lowerInclusive, String upperInclusive) {
        return fetchRange(ReferralPosting.REFERRAL_POSTING.REFERRAL_POSTING_DESRIPATION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>referral_posting_desripation IN
     * (values)</code>
     */
    public List<com.getReferral.Referral.Application.jooq.tables.pojos.ReferralPosting> fetchByReferralPostingDesripation(String... values) {
        return fetch(ReferralPosting.REFERRAL_POSTING.REFERRAL_POSTING_DESRIPATION, values);
    }
}