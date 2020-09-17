package com.hello.expensetrackerapi.services;

import com.hello.expensetrackerapi.domain.Transaction;
import com.hello.expensetrackerapi.exception.EtBadRequestException;
import com.hello.expensetrackerapi.exception.EtResourceNotFoundException;

import java.util.List;

public interface TransactionService {

    List<Transaction> fetchAllTransactions(Integer userId, Integer categoryId);

    Transaction fetchTransactionById(Integer userId, Integer categoryId, Double amount, String note,
                                     Long transactionDate) throws EtBadRequestException;

    Transaction addTransaction(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws EtBadRequestException;

    void updateTransaction(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction)
        throws EtBadRequestException;

    void removeTransaction(Integer userId, Integer categoryId, Integer tranactionId) throws EtResourceNotFoundException;
}
