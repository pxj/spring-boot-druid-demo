package com.itclj.common;

import com.alibaba.druid.support.http.StatViewServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * druid监控配置
 * Created by lujun.chen on 2017/3/14.
 */
@WebServlet(urlPatterns = "/druid/*",initParams= {
    @WebInitParam(name = "allow", value = "10.16.16.99,127.0.0.1"),// IP白名单 (没有配置或者为空，则允许所有访问)
    @WebInitParam(name = "deny", value = "10.16.16.100"),// IP黑名单 (存在共同时，deny优先于allow)
    @WebInitParam(name = "loginUsername", value = "clj"),// 用户名
    @WebInitParam(name = "loginPassword", value = "123456"),// 密码
    @WebInitParam(name = "resetEnable", value = "false")// 禁用HTML页面上的“Reset All”功能)
})
public class DruidStatViewServlet extends StatViewServlet {

}
