package com.song.demo02;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/10 13:45
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService =new UserServiceImpl();

        UserSerciveProxy proxy = new UserSerciveProxy();

        proxy.setUserService(userService);

        proxy.query();
    }
}
