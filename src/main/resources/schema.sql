CREATE TABLE subject
(
    id int PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE category
(
    id int PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    subject_id int,
    FOREIGN KEY (subject_id) REFERENCES subject (id)
);

CREATE TABLE sub_category
(
    id int PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    category_id       int,
    FOREIGN KEY (category_id) REFERENCES category (id)
);

#
#
# CREATE TABLE user
# (
#     user_id   int PRIMARY KEY AUTO_INCREMENT,
#     user_name VARCHAR(255) NOT NULL,
#     password  VARCHAR(255) NOT NULL
# );
#
# CREATE TABLE source
# (
#     source_id     int PRIMARY KEY AUTO_INCREMENT,
#     source_type   VARCHAR(255) NOT NULL,
#     title         VARCHAR(255) NOT NULL,
#     author        VARCHAR(255),
#     category_id   int,
#     path          VARCHAR(255),
#     page_number   INT,
#     publish_date  DATE,
#     description   VARCHAR(255),
#     accessibility VARCHAR(255),
#     FOREIGN KEY (category_id) REFERENCES category (category_id)
# );
#
# CREATE TABLE note
# (
#     note_id   int PRIMARY KEY AUTO_INCREMENT,
#     topic     VARCHAR(255) NOT NULL,
#     content   VARCHAR(255) NOT NULL,
#     source_id int,
#     user_id   int,
#     FOREIGN KEY (source_id) REFERENCES source (source_id),
#     FOREIGN KEY (user_id) REFERENCES user (user_id)
# );
#
# CREATE TABLE note_category
# (
#     note_id     int,
#     category_id int,
#     PRIMARY KEY (note_id, category_id),
#     FOREIGN KEY (note_id) REFERENCES note (note_id),
#     FOREIGN KEY (category_id) REFERENCES category (category_id)
# );
#
# CREATE TABLE note_subcategory
# (
#     note_id         int,
#     sub_category_id int,
#     PRIMARY KEY (note_id, sub_category_id),
#     FOREIGN KEY (note_id) REFERENCES note (note_id),
#     FOREIGN KEY (sub_category_id) REFERENCES sub_category (sub_category_id)
# );
#
#
#
