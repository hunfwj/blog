package cn.fadedsun.blog.service.user;

import cn.fadedsun.blog.data.User;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;

import java.time.Instant;

public class UserFactory {

    public static User newUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(SecureUtil.sha256(password));
        user.setMotto(StrUtil.EMPTY);
        user.setNickname(StrUtil.EMPTY);
        long now = Instant.now().toEpochMilli();
        user.setCreatedAt(now);
        user.setUpdatedAt(now);
        return user;
    }
}
