package com.tenco.bankexer.repository.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tenco.bankexer.repository.model.Account;

@Mapper // MyBatis 연결 처리
public interface AccountRepository {

	public int insert(Account account);

	public int updateById(Account account);

	public int delteById(int id);

	public Account findById(); 

	public List<Account> findAll(int id); // 관리자용
	
	}
