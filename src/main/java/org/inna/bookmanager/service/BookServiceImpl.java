package org.inna.bookmanager.service;

import org.inna.bookmanager.dao.BookDao;
import org.inna.bookmanager.model.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    @Transactional
    public void addBook(Book book) {

    }

    @Override
    @Transactional
    public void updateBook(Book book) {

    }

    @Override
    @Transactional
    public void removeBook(int id) {

    }

    @Override
    @Transactional
    public Book getBookById(int id) {
        return null;
    }

    @Override
    @Transactional
    public List<Book> listBooks() {
        return null;
    }
}
