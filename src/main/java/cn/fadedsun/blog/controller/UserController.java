package cn.fadedsun.blog.controller;

import cn.fadedsun.blog.data.User;
import cn.fadedsun.blog.mapper.UserMapper;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.Instant;
import java.util.Optional;

/**
 * @author fuwj
 * @date 2021/4/2 17:34
 */
@RestController
public class UserController {

    @Resource
    private UserMapper userMapper;

    @PostMapping("/api/user")
    public void register(@RequestBody User user) {
        // todo 验证数据是否合法
        if (StrUtil.isBlank(user.getUsername())) {
            return;
        }
        if (StrUtil.isBlank(user.getPassword())) {
            return;
        }
        // todo 验证账号是否唯一
        Optional<User> existUser = userMapper.selectByUsername(user.getUsername());
        if (existUser.isPresent()) {
            System.out.println("123456");
            return;
        }

        // todo 加密密码, 并设置默认值
        user.setPassword(SecureUtil.sha256(user.getPassword()));
        user.setMotto(StrUtil.EMPTY);
        user.setNickname(StrUtil.EMPTY);
        long now = Instant.now().toEpochMilli();
        user.setCreatedAt(now);
        user.setUpdatedAt(now);
        // todo 存入数据库
        userMapper.insert(user);
    }

    public void login() {
        // todo 验证登录失败次数

        // todo 查询用户是否存在

        // todo 匹配密码, 若失败, 记录失败次数, 成功清零

        // todo 返回凭证
    }

    public void info() {

        // todo 验证凭证, 并识别用户

        // todo 返回个人信息
    }
}
