package com.song.demo02;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/10 13:45
 */
public class UserSerciveProxy implements UserService{

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("del");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    //增加日志方法
    public void log(String msg){
        System.out.println("使用了"+msg+"方法");
    }
}
