package com.song.pojo;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/7 23:46
 */
public class User {

    public User() {
    }

    public User(String str) {
        this.str = str;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    private Cat cat;
    private Dog dog;
    private String str;

    @Override
    public String toString() {
        return "User{" +
                "str='" + str + '\'' +
                '}';
    }
}
