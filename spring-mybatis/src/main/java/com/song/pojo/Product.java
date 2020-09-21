package com.song.pojo;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/15 17:15
 */
@Alias("product")
public class Product implements Serializable {
    private int id;
    private int proid;
    private String profilepath;
    private int comp_id;
    private String vernum;
    private String filepath;
    private String created_at;
    private String updated_at;

    public Product() {
    }

    public Product(int id, int proid, String profilepath, int comp_id, String vernum, String filepath, String created_at, String updated_at) {
        this.id = id;
        this.proid = proid;
        this.profilepath = profilepath;
        this.comp_id = comp_id;
        this.vernum = vernum;
        this.filepath = filepath;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public String getProfilepath() {
        return profilepath;
    }

    public void setProfilepath(String profilepath) {
        this.profilepath = profilepath;
    }

    public int getComp_id() {
        return comp_id;
    }

    public void setComp_id(int comp_id) {
        this.comp_id = comp_id;
    }

    public String getVernum() {
        return vernum;
    }

    public void setVernum(String vernum) {
        this.vernum = vernum;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", proid=" + proid +
                ", profilepath='" + profilepath + '\'' +
                ", comp_id=" + comp_id +
                ", vernum='" + vernum + '\'' +
                ", filepath='" + filepath + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                '}';
    }
}
