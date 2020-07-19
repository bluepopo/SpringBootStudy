package zy.code.configurer;

public class HelloService {

    private  HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHello(){
        return helloProperties.getPrefix() + "hello" + helloProperties.getSuffix();
    }
}
