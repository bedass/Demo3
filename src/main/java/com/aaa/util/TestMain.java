package com.aaa.util;

import redis.clients.jedis.Jedis;

/**
 * fileName:TestMain
 * description:
 * author:zz
 * createTime:2019-03-02 19:11
 */
public class TestMain {
    public static void main(String[] args) {

        Jedis jedis =  new Jedis("192.168.226.20",6379);
        System.out.println(jedis.ping());
    }
}
