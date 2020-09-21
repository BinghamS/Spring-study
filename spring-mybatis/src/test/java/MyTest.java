import com.song.dao.TestDao;
import com.song.utils.MybatisUtils;
import com.song.dao.ProductDao;
import com.song.pojo.Product;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.PublicKey;
import java.util.List;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/15 17:47
 */
public class MyTest {
    private SqlSession sqlSession;

    @Before//在@Test注解执行之前调用
    public void before() {
        //第一步：获得SqlSession对象
        sqlSession = MybatisUtils.getSqlSession();
    }

    @Test
    public void test() {
        /*ProductDao productDao = sqlSession.getMapper(ProductDao.class);
        List<Product> productList = productDao.getProductList();

        for (Product product : productList) {
            System.out.println(product);
        }*/

        TestDao mapper = sqlSession.getMapper(TestDao.class);
        List<com.song.pojo.Test> productList = mapper.getTestList();

        for (com.song.pojo.Test product : productList) {
            System.out.println(product);
        }
    }

    @Test
    public void getById(){
        int id = 12;
        ProductDao mapper = sqlSession.getMapper(ProductDao.class);
        Product product = mapper.getProductById(id);

        System.out.println(product);
    }

    //增删改需要提交事物
    //添加一个数据
    @Test
    public void addTest(){
        com.song.pojo.Test test = new com.song.pojo.Test(6, "test6");
        TestDao mapper = sqlSession.getMapper(TestDao.class);
        int i = mapper.addTest(test);//大于0插入成功
        System.out.println(i);
        //提交事务
        sqlSession.commit();
    }

    //更新
    @Test
    public void updateTest(){
        TestDao mapper = sqlSession.getMapper(TestDao.class);
        int i = mapper.updateTest(new com.song.pojo.Test(6, "哈哈"));
        if (i>0){
            System.out.println("成功");
        }else System.out.println("失败");
        sqlSession.commit();
    }

    //删除
    @Test
    public void deleteTest(){
        TestDao mapper = sqlSession.getMapper(TestDao.class);
        int i = mapper.deleteTest(6);
        if (i>0){
            System.out.println("成功");
        }else System.out.println("失败");
        sqlSession.commit();
    }

    @After//在@Test执行完之后调用
    public void after() {
        //关闭SqlSession
        sqlSession.close();
    }
}
