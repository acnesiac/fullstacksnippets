package com.cognizant.devtest.moviesmanager.domain.repository;

import com.cognizant.devtest.moviesmanager.domain.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepository extends JpaRepository<Account, Long> {
	//@Query("SELECT t FROM Account a WHERE a.id = ? ")
	//Account findAccountById(Long id);
}
