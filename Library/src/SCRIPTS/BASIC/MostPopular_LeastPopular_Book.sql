
		SELECT book.title
		FROM history JOIN book ON book.id = history.BookID
        WHERE history.dateBorrowed <= '30-09-2001'
          AND
                '30-09-2001' <= history.dateBorrowed
		GROUP BY book.title
		ORDER BY COUNT(history.BookID) DESC
        LIMIT 1;


	    SELECT book.title
		FROM history JOIN book ON book.id = history.BookID
		WHERE '30-09-2001' >= history.dateBorrowed AND
                '30-09-2001' <= history.dateBorrowed
		GROUP BY book.title
		ORDER BY COUNT(history.BookID)
        LIMIT 1;
