package xyz.ivyxjc.springbootdemo.model;

/**
 * @api {POST} /register 注册用户
 * @apiGroup Users
 * @apiVersion 0.0.1
 * @apiDescription 用于注册用户
 * @apiParam {String} account 用户账户名
 * @apiParam {String} password 密码
 * @apiParam {String} mobile 手机号
 * @apiParam {int} vip = 0  是否注册Vip身份 0 普通用户 1 Vip用户
 * @apiParam {String} [recommend] 邀请码
 * @apiParamExample {json} 请求样例：
 * ?account=sodlinken&password=11223344&mobile=13739554137&vip=0&recommend=
 * @apiSuccess (200) {String} msg 信息
 * @apiSuccess (200) {int} code 0 代表无错误 1代表有错误
 * @apiSuccessExample {json} 返回样例:
 * {"code":"0","msg":"注册成功"}
 */
public class User {
    private int userId;
    private String username;
    private String password;
    private String description;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
