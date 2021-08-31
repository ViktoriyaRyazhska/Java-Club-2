CREATE FUNCTION dbo.MostPopularBook (@DateStart date, @DateFin date)
	RETURN varchar(128)
	AS
	BEGIN

	RETURN
		(SELECT TOP (1) topBook
		FROM 
			(SELECT book.title as topBook, COUNT(history.BookID) as NUMB
			FROM history JOIN book ON book.id = history.BookID 
			WHERE @DateStart >= history.dateBorrowed AND
			@DateFin <= history.dateBorrowed 
			GROUP BY book.title
			ORDER BY COUNT(history.BookID) DESC)
	END;

--DROP FUNCTION dbo.MostPopularBook;

CREATE FUNCTION dbo.LeastPopularBook (@DateStart date, @DateFin date)
	RETURN varchar(128)
	AS
	BEGIN

	RETURN
		(SELECT TOP (1) bottomBook
		FROM 
			(SELECT book.title as bottomBook, COUNT(history.BookID) as NUMB
			FROM history JOIN book ON book.id = history.BookID 
			WHERE @DateStart >= history.dateBorrowed AND
			@DateFin <= history.dateBorrowed 
			GROUP BY book.title
			ORDER BY COUNT(history.BookID))
	END;

--DROP FUNCTION dbo.LeastPopularBook;
