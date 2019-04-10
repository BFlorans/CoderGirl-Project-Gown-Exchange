CREATE TABLE gown_styles (id INTEGER, color TEXT, size INTEGER, sleeve_length TEXT, contact_person CONTACT);
CREATE TABLE contact (id INTEGER, contact_person TEXT, phone TEXT, email TEXT, location TEXT);
INSERT INTO gown_styles VALUES (1, "navy", 6, "long");
INSERT INTO contact VALUES (1, "Batsheva Florans", "314-743-7550", "bbflorans@gmail.com", "St. Louis");
INSERT INTO gown_styles VALUES (2, "blush", 10, "sleeveless");
INSERT INTO contact VALUES (2, "Jane Brown", "314-743-7550", "janebrown@com", "New York");
SELECT * from  contact, gown_styles;
