package com.example.myday1.redisson;

import org.redisson.config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    @Bean
    public Config get(){
        Config config = new Config();
        config.setTransportMode(TransportMode.EPOLL);
        config.useClusterServers()
                //可以用"rediss://"来启用SSL连接
                .addNodeAddress("redis://127.0.0.1:6379");
        return config;
    }
}
