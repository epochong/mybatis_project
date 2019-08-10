package com.epochong;

import com.epochong.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author epochong
 * @date 2019/8/9 22:33
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class MybatisTest {
    private SqlSessionFactory sqlSessionFactory = null;

   @Before
   public void testInit() {
       String mybatisConfigFile = "sqlMapConfig.xml";
       InputStream inputStream = null;
       try {
           inputStream = Resources.getResourceAsStream(mybatisConfigFile);
           sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

   @Test
    public void queryUserById() {
       SqlSession sqlSession = sqlSessionFactory.openSession();
       try {
           User user = sqlSession.selectOne("test.queryUserById",1);
           System.out.println(user);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}

