package com.xsm.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xsm
 * @Date 2019/10/11 21:16
 */
@ConfigurationProperties(prefix = "xsm.hello")
public class HelloProperties {
    private String prefix;

    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
