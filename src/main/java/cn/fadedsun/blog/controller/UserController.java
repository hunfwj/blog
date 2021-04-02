package cn.fadedsun.blog.controller;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author fuwj
 * @date 2021/4/2 17:34
 */
@RestController
public class UserController {


    public void register() {
        // todo 验证数据是否合法

        // todo 验证账号是否唯一

        // todo 加密密码

        // todo 存入数据库

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
