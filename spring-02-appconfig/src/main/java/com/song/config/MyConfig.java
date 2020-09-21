package com.song.config;

import com.song.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/9 2:48
 */

//这个也会被spring托管，注册到容器中，因为本来就是一个@Component ，@Configuration代表这是一个配置类，就和beans.xml一样
@Configuration
@ComponentScan("com.song.pojo")
public class MyConfig {

    //注册一个bean，就相当于我们之前写的bean标签
    //这个方法的名字，就相当于bean的id属性，
    // 返回值就相当于class属性
    @Bean
    public User getUser(){
        return new User();//就是返回要注入到bean的对象
    }
}
