select count(book_copy.idbook_copy) > 0 as isAvailable, book.title 
from book_copy left join book on book_copy.book_idbook = book.idbook 
where book_copy.book_status_idbook_status = 1
 group by title
