package com.example.store.dao;

import com.example.store.model.BookStoreMessage;

public interface BookStoreMessageMapper {
    int deleteByPrimaryKey(Long bookStoreId);

    int insert(BookStoreMessage record);

    int insertSelective(BookStoreMessage record);

    BookStoreMessage selectByPrimaryKey(Long bookStoreId);

    int updateByPrimaryKeySelective(BookStoreMessage record);

    int updateByPrimaryKey(BookStoreMessage record);
}