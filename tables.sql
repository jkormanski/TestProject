CREATE TABLE person
(
  id serial NOT NULL,
  first_name character varying(50),
  last_name character varying(50),
  CONSTRAINT person_pk PRIMARY KEY (id)
)

CREATE TABLE book
(
  id serial NOT NULL,
  name character varying(50),
  book_category_id integer,
  CONSTRAINT book_pk PRIMARY KEY (id),
  CONSTRAINT book_book_category_id_fkey FOREIGN KEY (book_category_id)
      REFERENCES book_category (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)

CREATE TABLE book_category
(
  id serial NOT NULL,
  name character varying(50) NOT NULL,
  CONSTRAINT book_category_pk PRIMARY KEY (id)
)

