package cn.fadedsun.blog.service.user;

import cn.fadedsun.blog.dao.UserDao;
import cn.fadedsun.blog.data.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserService {


    @Resource
    private UserDao userDao;

    public void insert(User user) throws Exception {
        UserStrategy.checkUserInfo(user);

        Optional<User> existUser = userDao.selectByUsername(user.getUsername());
        if (existUser.isPresent()) {
            throw new Exception("");
        }

        User newUser = UserFactory.newUser(user.getUsername(), user.getPassword());

        userDao.insert(newUser);
    }

}
