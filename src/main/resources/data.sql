/**insert data for author**/
INSERT INTO authors(id, name, version)
VALUES (1, 'Jackson Pool', 0);
INSERT INTO authors(id, name, version)
VALUES (2, 'Dan Brown', 0);
INSERT INTO authors(id, name, version)
VALUES (3, 'Henry Jack', 0);
INSERT INTO authors(id, name, version)
VALUES (4, 'Tim Can', 0);
INSERT INTO authors(id, name, version)
VALUES (5, 'Will Samson', 0);


/**insert data for book**/
INSERT INTO book(id, name, version)
VALUES (1, 'Dead Notes', 0);
INSERT INTO book(id, name, version)
VALUES (2, 'Amazon King', 0);
INSERT INTO book(id, name, version)
VALUES (3, 'Java Core',0);
INSERT INTO book(id, name,version)
VALUES (4, 'Spring Framework', 0);
INSERT INTO book(id, name,version)
VALUES (5, 'JPA Data', 0);

/**insert data to BookAuthors table**/
insert into book_authors (fk_book, fk_authors) values (1,2);
insert into book_authors (fk_book, fk_authors) values (2,1);
insert into book_authors (fk_book, fk_authors) values (3,3);
insert into book_authors (fk_book, fk_authors) values (4,4);
insert into book_authors (fk_book, fk_authors) values (5,5);

