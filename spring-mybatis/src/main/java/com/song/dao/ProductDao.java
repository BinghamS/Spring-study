package com.song.dao;

import com.song.pojo.Product;

import java.util.List;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/15 17:34
 */
public interface ProductDao {
    List<Product> getProductList();

    //根据id查询
    Product getProductById(int id);
}
