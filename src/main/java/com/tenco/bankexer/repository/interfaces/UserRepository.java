package com.tenco.bankexer.repository.interfaces;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tenco.bankexer.dto.SignInFormDto;
import com.tenco.bankexer.repository.model.User;

@Mapper // MyBatis 의존 설정함(build.gradle 파일)
public interface UserRepository {

	public int insert(User user);
	public int updateById(User user);
	public int deleteById(Integer id);
	public User findById(Integer id);
	public List<User> findAll();
	
	
	public User findByUsernameAndPassword(SignInFormDto signInFormDto);
}// end of class
