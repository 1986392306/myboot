//自定义配置类
package com.hunau.myboot.properties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component                              //构件
@ConfigurationProperties (prefix="mysql")      //配置属性类prefix="mysql"
public class MysqlProperties {
    private String jdbcName;
    private String dbUrl;
    private String userName;
    private String password;
    public String getJdbcName() {
        return jdbcName;
    }
    public void setJdbcName(String jdbcName) {
        this.jdbcName = jdbcName;
    }
    public String getDbUrl() {
        return dbUrl;
    }
    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
