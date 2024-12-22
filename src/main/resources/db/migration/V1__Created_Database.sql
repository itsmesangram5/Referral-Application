CREATE TABLE `users` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `name` text,
  `email_id` text,
  `phone` text,
  `password` text,
  `role` text,
  PRIMARY KEY (`user_id`)
) ;


CREATE TABLE `applicants` (
  `applicant_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`applicant_id`),
  UNIQUE KEY `user_id` (`user_id`),
  CONSTRAINT `applicants_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
);

CREATE TABLE `referrer` (
  `referrer_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`referrer_id`),
  UNIQUE KEY `user_id` (`user_id`),
  CONSTRAINT `referrer_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
) ;


CREATE TABLE `referral_posting` (
  `referral_posting_id` int NOT NULL AUTO_INCREMENT,
  `referrer_id` int DEFAULT NULL,
  `referral_posting_title` text,
  `branch` text,
  `passout_yr` int DEFAULT NULL,
  `exp_title` text,
  `exp_tech` text,
  `project_tech` text,
  `tech_skills` text,
  `soft_skills` text,
  `ctc` decimal(5,2) DEFAULT NULL,
  `positions` int DEFAULT NULL,
  `last_date_to_apply` date DEFAULT NULL,
  `company_name` text,
  `referral_posting_desripation` text,
  PRIMARY KEY (`referral_posting_id`),
  KEY `referrer_id` (`referrer_id`),
  CONSTRAINT `referral_posting_ibfk_1` FOREIGN KEY (`referrer_id`) REFERENCES `referrer` (`referrer_id`)
) ;

CREATE TABLE `resumes` (
  `resume_id` int NOT NULL AUTO_INCREMENT,
  `applicant_id` int DEFAULT NULL,
  `resume_name` text NOT NULL,
  `branch` text,
  `passout_yr` int DEFAULT NULL,
  `exp_duration` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`resume_id`),
  KEY `applicant_id` (`applicant_id`),
  CONSTRAINT `resumes_ibfk_1` FOREIGN KEY (`applicant_id`) REFERENCES `applicants` (`applicant_id`)
) ;

CREATE TABLE `referral_applications` (
  `referral_application_id` int NOT NULL AUTO_INCREMENT,
  `referral_posting_id` int DEFAULT NULL,
  `referrer_id` int DEFAULT NULL,
  `applicant_id` int DEFAULT NULL,
  `resume_id` int DEFAULT NULL,
  `applied_date` date DEFAULT NULL,
  `status` text,
  PRIMARY KEY (`referral_application_id`),
  KEY `applicant_id` (`applicant_id`),
  KEY `referral_posting_id` (`referral_posting_id`),
  KEY `referrer_id` (`referrer_id`),
  KEY `resume_id` (`resume_id`),
  CONSTRAINT `referral_applications_ibfk_1` FOREIGN KEY (`applicant_id`) REFERENCES `applicants` (`applicant_id`),
  CONSTRAINT `referral_applications_ibfk_2` FOREIGN KEY (`referral_posting_id`) REFERENCES `referral_posting` (`referral_posting_id`),
  CONSTRAINT `referral_applications_ibfk_3` FOREIGN KEY (`referrer_id`) REFERENCES `referrer` (`referrer_id`),
  CONSTRAINT `referral_applications_ibfk_4` FOREIGN KEY (`resume_id`) REFERENCES `resumes` (`resume_id`)
) ;







