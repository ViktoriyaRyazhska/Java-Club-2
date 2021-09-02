SELECT AVG(DATEDIFF( history.dateReturned, history.dateBorrowed)) as Average_Reading_Time FROM history
    WHERE history.dateReturned IS NOT NULL;