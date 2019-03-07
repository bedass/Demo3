package com.aaa.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

/**
 * fileName:JedisUtilImpl
 * description:
 * author:zz
 * createTime:2019-03-02 19:05
 */
@Component
public class JedisUtilImpl implements  JedisUtil {
    /*@Autowired
    private JedisPool jedisPool;*/
    @Autowired
    private JedisCluster jedisCluster;
    @Override
    public void putObject(Object key, Object value) {
        // TODO Auto-generated method stub
        jedisCluster.set(SerializeUtil.serialize(key.toString()),
                SerializeUtil.serialize(value));
        //resource.close();
    }
    @Override
    public Object removeObject(Object arg0) {
        // TODO Auto-generated method stub
        Object expire = jedisCluster.expire(
                SerializeUtil.serialize(arg0.toString()), 0);
       // resource.close();
        return expire;
    }
    @Override
    public Object getObject(Object arg0) {
        // TODO Auto-generated method stub
        Object value = SerializeUtil.unserialize(jedisCluster.get(
                SerializeUtil.serialize(arg0.toString())));
      //  resource.close();
        return value;
    }
}
