package com.hibernate_example.week_18_hibernate_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate_example.week_18_hibernate_example.domain.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
