package cn.fadedsun.blog.service.user;

import cn.fadedsun.blog.data.User;
import cn.hutool.core.util.StrUtil;

public class UserStrategy {

    /**
     * 检查参数是否合法
     * @param user 用户信息
     * @throws Exception 参数异常
     */
    public static void checkUserInfo(User user) throws Exception {
        // todo 验证数据是否合法
        if (StrUtil.isBlank(user.getUsername())) {
            throw new Exception("username not be empty");
        }
        if (StrUtil.isBlank(user.getPassword())) {
            throw new Exception("password not be empty");
        }
    }
}
