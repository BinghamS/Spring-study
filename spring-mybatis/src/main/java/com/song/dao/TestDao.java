package com.song.dao;

import com.song.pojo.Test;

import java.util.List;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/16 18:07
 */
public interface TestDao {
    //查询全部
    List<Test> getTestList();

    //添加一个数据
    int addTest(Test test);

    //修改一个数据
    int updateTest(Test test);

    //删除一个数据
    int deleteTest(int id);

}
