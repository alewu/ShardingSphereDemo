package com.ale.datadesensitization;

import com.ale.datadesensitization.entity.MyUser;
import com.ale.datadesensitization.mapper.UserMapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DataDesensitizationApplicationTests {
	@Resource
	private UserMapper userMapper;

	@Test
	 void testAdd(){
		MyUser user = new MyUser();
		user.setName("Tom");
		user.setPwd("123456");
		int insert = userMapper.insert(user);
		Assertions.assertEquals(1, insert);
	}

	@Test
	 void testFind(){
		List<MyUser> list = userMapper.selectList(Wrappers.<MyUser>lambdaQuery().eq(MyUser::getPwd, "123456"));
		list.forEach(myUser-> System.out.println(myUser.getId()+" "+myUser.getName()+" "+myUser.getPwd()));
	}

}
