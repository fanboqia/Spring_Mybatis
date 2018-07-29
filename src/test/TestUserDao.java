package test;

import mapper.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

public class TestUserDao {
    private ApplicationContext context;
    @Before
    public void setUp() throws  Exception{
        context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
    }
    @Test
    public void testfindUserById() throws Exception{
        UserDao userDao = (UserDao) context.getBean("UserDao");
        User user = userDao.findUserById(1);
        System.out.println(user);
    }
}
