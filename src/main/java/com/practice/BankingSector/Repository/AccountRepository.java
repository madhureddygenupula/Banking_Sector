package com.practice.BankingSector.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.BankingSector.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
