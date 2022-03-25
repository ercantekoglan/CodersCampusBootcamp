package com.codercampus.Assignment11.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;

	public List<Transaction> findAll() {
		List<Transaction> sorted = transactionRepository.findAll().stream()
				.sorted((t1, t2) -> t1.getDate().compareTo(t2.getDate())).collect(Collectors.toList());
		return sorted;
	}

	public Transaction findById(Long transactionById) {

		for (Transaction transactionId : transactionRepository.findAll()) {
			if (transactionId.getId().equals(transactionById)) {
				return transactionId;
			}

		}

		return null;

	}

}
