package com.hy1089;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

@SpringBootTest
class JedisSpringbootTestApplicationTests {

    @Test
    void contextLoads() {
//        HostAndPort hostAndPort = new HostAndPort("112.124.22.45", 8000);
//        JedisCluster jedisCluster = new JedisCluster(hostAndPort);
//        jedisCluster.set("name","hy1079");
//        System.out.println("=========="+jedisCluster.get("name"));
    }

}
