package cn.fadedsun.blog.controller;

import cn.fadedsun.blog.data.User;
import cn.fadedsun.blog.service.user.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author fuwj
 * @date 2021/4/2 17:34
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/api/user")
    public void register(@RequestBody User user) throws Exception {
        userService.insert(user);
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
