/*
 * YouTuan Inc.
 * Copyright (c) 2019-2020 All Rights Reserved.
 */

CREATE TABLE QUESTION
(
	id INT AUTO_INCREMENT,
	title VARCHAR(50),
	description TEXT,
	gmt_create BIGINT,
	gmt_modified BIGINT,
	creator INT,
	comment_count INT DEFAULT 0,
	view_count INT DEFAULT 0,
	like_count INT DEFAULT 0,
	tag VARCHAR(255),
	CONSTRAINT QUESTION_PK
		PRIMARY KEY (id)
);

