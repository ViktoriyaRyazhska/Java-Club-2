select u.id, u.firstName, u.lastName, u.email from book_order_table
join user_table u on book_order_table.user_id  = u.id
where book_order_table.RETURN_AT < CURRENT_TIMESTAMP and CREATED_AT is not null and (CLOSED_AT is null or CLOSED_AT > book_order_table.RETURN_AT);