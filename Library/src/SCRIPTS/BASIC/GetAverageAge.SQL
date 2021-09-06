select AVG(FLOOR(DATEDIFF(CURRENT_DATE, user_table.birthdate) / 365)) as avg_age
from user_table;