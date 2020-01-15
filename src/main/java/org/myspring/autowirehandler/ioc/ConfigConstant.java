package org.myspring.autowirehandler.ioc;

public interface ConfigConstant {
    //配置文件的名称
    String CONFIG_FILE = "autowirehandler.properties";
    //数据源
    String JDBC_DRIVER = "autowirehandler.framework.jdbc.driver";
    String JDBC_URL = "autowirehandler.framework.jdbc.url";
    String JDBC_USERNAME = "autowirehandler.framework.jdbc.username";
    String JDBC_PASSWORD = "autowirehandler.framework.jdbc.password";

    //java源码地址
    String APP_BASE_PACKAGE = "autowirehandler.framework.app.base_package";
    //jsp页面路径
    String APP_JSP_PATH = "autowirehandler.framework.app.jsp_path";
    //静态资源路径
    String APP_ASSET_PATH = "autowirehandler.framework.app.asset_path";
}
