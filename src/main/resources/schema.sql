CREATE TABLE product (
    id IDENTITY PRIMARY KEY,
    type VARCHAR(100) NOT NULL,
    name VARCHAR(100) UNIQUE NOT NULL
);

INSERT INTO product (id,type,name) VALUES (1,'laptop','John Doe');
INSERT INTO product (id,type,name) VALUES (2,'key','Alice Smith');
INSERT INTO product (id,type,name) VALUES (3,'phone','Charlie Brown');
