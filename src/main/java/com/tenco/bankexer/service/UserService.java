package com.tenco.bankexer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;

import com.tenco.bankexer.dto.SignInFormDto;
import com.tenco.bankexer.handler.exception.CustomRestfullException;
import com.tenco.bankexer.repository.interfaces.UserRepository;
import com.tenco.bankexer.repository.model.User;

public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public User signIn(SignInFormDto signInFormDto) {
		User userEntity = userRepository.findByUsernameAndPassword(signInFormDto);
		if (userEntity == null) {
			throw new CustomRestfullException("아이디 혹은 비밀번호가 틀렸습니다.", HttpStatus.BAD_REQUEST);
		}
		return userEntity;
	}
}
