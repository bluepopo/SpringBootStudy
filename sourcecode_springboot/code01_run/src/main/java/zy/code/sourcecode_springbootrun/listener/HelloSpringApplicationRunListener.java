package zy.code.sourcecode_springbootrun.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class HelloSpringApplicationRunListener implements SpringApplicationRunListener {

    public HelloSpringApplicationRunListener(SpringApplication application,String[] args) {
    }

    @Override
    public void starting() {
        System.out.println("HelloSpringApplicationRunListener...starting..开始启动中");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        System.out.println("HelloSpringApplicationRunListener...environmentPrepared..准备环境");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("HelloSpringApplicationRunListener...contextPrepared..准备上下文ioc容器环境");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("HelloSpringApplicationRunListener...contextLoaded..上下文ios容器环境准备完成了");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        System.out.println("HelloSpringApplicationRunListener...started..SpringApplication开启阶段完成");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        System.out.println("HelloSpringApplicationRunListener...running..springBoot应用已经开始运行啦");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        //在实验时加入了mysql、mybatis依赖，但是没有配置，会抛出没有数据源的异常导致
        System.out.println("HelloSpringApplicationRunListener...failed..启动阶段抛出异常了");
    }
}
