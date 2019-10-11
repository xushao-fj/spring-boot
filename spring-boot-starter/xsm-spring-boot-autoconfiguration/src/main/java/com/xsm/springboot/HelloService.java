package com.xsm.springboot;

/**
 * @author xsm
 * @Date 2019/10/11 21:15
 */
public class HelloService {

    private HelloProperties helloProperties;

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHello(String name){
        return helloProperties.getPrefix() + "-" + name + helloProperties.getSuffix();
    }
}
