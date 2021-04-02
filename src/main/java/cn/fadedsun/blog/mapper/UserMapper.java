package cn.fadedsun.blog.mapper;

import cn.fadedsun.blog.data.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

/**
 * @author fuwj
 * @date 2021/4/2 18:01
 */
@Mapper
public interface UserMapper {
    /**
     * 插入一个账户
     * @param user 用户
     */
    void insert(User user);

    Optional<User> selectByUsername(String username);
}
