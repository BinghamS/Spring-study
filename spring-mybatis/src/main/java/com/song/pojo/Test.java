package com.song.pojo;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/16 18:08
 */
public class Test {
    private int id;
    private String coll;

    public Test() {
    }

    public Test(int id, String coll) {
        this.id = id;
        this.coll = coll;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColl() {
        return coll;
    }

    public void setColl(String coll) {
        this.coll = coll;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", coll='" + coll + '\'' +
                '}';
    }

}
