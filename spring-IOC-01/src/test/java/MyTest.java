import com.song.dao.UserDao;
import com.song.dao.UserDaoImpl;
import com.song.dao.UserMysqlImpl;
import com.song.service.UserService;
import com.song.service.UserServiceImpl;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/7 11:03
 */
public class MyTest {

    public static void main(String[] args) {
        //用户实际调用的事业务层，dao层不需要接触
        UserService userService = new UserServiceImpl();

        //动态调用，使得只需要改一层代码即可
        ((UserServiceImpl) userService).setUserDao(new UserMysqlImpl());


        userService.getUser();
    }



}
