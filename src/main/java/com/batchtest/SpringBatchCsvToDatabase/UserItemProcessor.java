package com.batchtest.SpringBatchCsvToDatabase;

import org.springframework.batch.item.ItemProcessor;

import com.batchtest.SpringBatchCsvToDatabase.model.User;

public class UserItemProcessor implements ItemProcessor<User, User> {

    @Override
    public User process(User user) throws Exception {
        return user;
    }

}
