package cn.fadedsun.blog.dao;

import cn.fadedsun.blog.data.User;
import cn.fadedsun.blog.mapper.UserMapper;
import cn.hutool.core.util.StrUtil;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;

import javax.annotation.Resource;
import java.util.Optional;

public class UserDao {

    @Resource
    private UserMapper userMapper;

    public void insert(User user) {
        userMapper.insert(user);
    }


    public Optional<User> selectByUsername(String username) {
        // 技术逻辑
        if (StrUtil.isBlank(username)) {
            return Optional.empty();
        }
        return userMapper.selectByUsername(username);
    }
}
