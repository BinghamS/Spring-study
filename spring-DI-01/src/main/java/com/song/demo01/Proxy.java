package com.song.demo01;

import com.sun.java.accessibility.util.EventID;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/10 12:41
 */
public class Proxy implements Rent{
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        sign();
        fare();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    //收中介费
    public void fare(){
        System.out.println("中介收中介费");
    }

    //签合同
    public void sign(){
        System.out.println("中介签订合同");
    }
}
