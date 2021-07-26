package com.example.myday1.jedis;
import redis.clients.jedis.Jedis;


public class JedisConfig {
    private Jedis jedis;

    public String addKey(String key, String name){
        jedis = new Jedis("127.0.0.1",6379);
        String count = jedis.set(key, name); //访问Redis服务
        jedis.close(); //使用完关闭连接
        return count;
    }

    public String getValue(String key){
        jedis = new Jedis("127.0.0.1",6379);
        String value = jedis.get(key); //访问Redis服务
        jedis.close(); //使用完关闭连接
        return value;
    }

}
