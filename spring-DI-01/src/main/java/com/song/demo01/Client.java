package com.song.demo01;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/10 12:39
 */
public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //代理,中介帮房东租房子，但是一般中介会有一定的附属操作
        Proxy proxy = new Proxy();

        //你不用面对房东，直接找中介租房即可
        proxy.rent();
    }
}
