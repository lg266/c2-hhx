package com.cyanfox;

import com.cyanfox.entity.User;
import com.cyanfox.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MpdemoApplicationTests {

	@Autowired
	private UserMapper userMapper;



	@Test
	void findAll() {
		List<User> users = userMapper.selectList(null);
		System.out.println(users);
	}

}
