select AVG(co.n)
from (select COUNT(id) as n
      from book_order_table
      where CREATED_AT between '2021-01-30' AND '2021-12-29'
      group by user_id) as co;
