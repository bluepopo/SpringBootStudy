package zy.code.configurer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication//只有在web环境下才配置
@EnableConfigurationProperties(HelloProperties.class)//让属性文件生效
public class HelloServiceAutoConfiguration {

    @Autowired
    HelloProperties helloProperties;

    @Bean
    public HelloService helloService(){
        // 将helloService注入到容器中
       HelloService helloService =  new HelloService();
       helloService.setHelloProperties(helloProperties);
        return helloService;
    }


}
