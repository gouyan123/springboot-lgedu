package com.gouyan.springbootanalysis.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**被@ComponentScan注解扫描后，实例化bean到spring容器*/
@Component
/**@ConfigurationProperties 将默认配置转换成 Configuration；@PropertySource(classpath:/)可以指定自定义配置文件 路径名称*/
@ConfigurationProperties(prefix = "instance")
public class ServerBean {

    private String ip;

    private Integer port;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "ServerBean{" +
                "ip='" + ip + '\'' +
                ", port=" + port +
                '}';
    }
}