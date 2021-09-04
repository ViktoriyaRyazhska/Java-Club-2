select count(book_order.idbookBorrow) from book_order where book_order.reader_take_at between @date1 and @date1
