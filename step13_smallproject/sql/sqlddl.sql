-- 재능 기부자
DROP TABLE furniture cascade constraint;

-- 재능 수혜자
DROP TABLE electronics cascade constraint;

-- 재능기부 정보
DROP TABLE seasonality cascade constraint;

-- 재능기부 프로젝트
DROP TABLE decoration cascade constraint;

DROP TABLE product cascade constraint;

DROP SEQUENCE product_id_seq;


CREATE TABLE furniture(
       pnum				NUMBER(10) PRIMARY KEY,
       pname        	VARCHAR2(20)  NOT NULL,
       price            NUMBER(9) NOT NULL,
       standard         VARCHAR2(20) NOT NULL,
       color            VARCHAR2(20) NOT NULL,
	   priority			NUMBER(5) NOT NULL
);

CREATE TABLE electronics(
	   pnum             NUMBER(10) PRIMARY KEY,
       pname        	VARCHAR2(20)  NOT NULL,
       price            NUMBER(9) NOT NULL,
       standard         VARCHAR2(20) NOT NULL,
       color            VARCHAR2(20) NOT NULL,
	   priority			NUMBER(5) NOT NULL
);

CREATE TABLE seasonality(
       pnum             NUMBER(10) PRIMARY KEY,
       pname        	VARCHAR2(20)  NOT NULL,
       price            NUMBER(9) NOT NULL,
       standard         VARCHAR2(20) NOT NULL,
       color            VARCHAR2(20) NOT NULL,
	   priority			NUMBER(5) NOT NULL
);

CREATE TABLE decoration(
       pnum             NUMBER(10) PRIMARY KEY,
       pname        	VARCHAR2(20)  NOT NULL,
       price            NUMBER(9) NOT NULL,
       standard         VARCHAR2(20) NOT NULL,
       color            VARCHAR2(20) NOT NULL,
	   priority			NUMBER(5) NOT NULL
);

CREATE SEQUENCE product_id_seq;
	
CREATE TABLE product (
	   pnum     		NUMBER(10) PRIMARY KEY,
	   pname 		VARCHAR2(20) NOT NULL,
       price        VARCHAR2(9) NOT NULL      
);

ALTER TABLE product  ADD FOREIGN KEY (pnum) REFERENCES furniture  (pnum);
ALTER TABLE product  ADD FOREIGN KEY (pnum) REFERENCES electronics  (pnum);
ALTER TABLE product  ADD FOREIGN KEY (pnum) REFERENCES seasonality  (pnum);
ALTER TABLE product  ADD FOREIGN KEY (pnum) REFERENCES decoration  (pnum);

--ALTER TABLE product ADD FOREIGN KEY (pname)  REFERENCES furniture  (pname);
--ALTER TABLE product ADD FOREIGN KEY (pname)  REFERENCES electronics  (pname);
--ALTER TABLE product ADD FOREIGN KEY (pname)  REFERENCES seasonality  (pname);
--ALTER TABLE product ADD FOREIGN KEY (pname)  REFERENCES decoration  (pname);
--
--ALTER TABLE product ADD FOREIGN KEY (price)  REFERENCES furniture  (price);
--ALTER TABLE product ADD FOREIGN KEY (price)  REFERENCES electronics  (price);
--ALTER TABLE product ADD FOREIGN KEY (price)  REFERENCES seasonality  (price);
--ALTER TABLE product ADD FOREIGN KEY (price)  REFERENCES decoration  (price);
