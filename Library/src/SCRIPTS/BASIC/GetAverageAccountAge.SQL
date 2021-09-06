select AVG((DATEDIFF(CURRENT_DATE, user_table.CREATED_AT) / 365)) as avg_using
from user_table;