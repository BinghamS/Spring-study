package com.song;

import com.song.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/7 23:54
 */
public class test {

    public void testMethodAutowire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        user.getCat().shout();
        user.getDog().shout();
        System.out.println(user.toString());
        System.out.println("*************************");

        User user1 = context.getBean("user1",User.class);
        System.out.println(user1.toString());
        System.out.println("***********************");

        User user2 = context.getBean("user2", User.class);
        System.out.println(user2.toString());
    }

    public static void main(String[] args) {
        test test = new test();
        test.testMethodAutowire();
    }

}
