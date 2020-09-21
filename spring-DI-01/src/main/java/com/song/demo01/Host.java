package com.song.demo01;

/**
 * 房东
 *
 * @author songb
 * @date 2020/5/10 12:38
 */
public class Host implements Rent{

    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
