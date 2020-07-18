package zy.code.springboot06mybatis.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zy.code.springboot06mybatis.dao.BookDao;
import zy.code.springboot06mybatis.domain.Book;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookDao bookDao;

    public List<Book> findAll(){
        return bookDao.findAll();
    }

    public Book findById(int id){
        return bookDao.findById(id);
    }

    public void insert(Book book){
        bookDao.insert(book);
    }

    public void update(Book book){
        bookDao.update(book);
    }

    public void delete(Book book){
        bookDao.delete(book);
    }


}
