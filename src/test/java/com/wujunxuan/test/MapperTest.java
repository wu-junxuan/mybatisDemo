package com.wujunxuan.test;


import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.wujunxuan.mapper.UserMapper;
import com.wujunxuan.pojo.User;

public class MapperTest {
	
	@Test
	public void test_findUserById() throws Exception {
		System.out.println("================begin test_findUserById test");
		String resourceString="mybatis-config.xml";
		
		InputStream resourceAsStream = Resources.getResourceAsStream(resourceString);
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourceAsStream);
		
		//获取sqlsession最好是使用请求作用域，并且在使用完就将它关闭：使用try-catch-finally方法
		//
		try (SqlSession session = sqlSessionFactory.openSession()) {
			// 你的应用逻辑代码
			UserMapper userMapper = session.getMapper(UserMapper.class);
			User user=userMapper.findUserById(10);
//			User user2=session.selectOne("com.wujunxuan.mapper.UserMapper.findUserById", 10);
			System.out.println(user);
//			System.out.println(user2);
			}

		
		
	}

}
