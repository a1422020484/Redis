package com.test;

import redis.clients.jedis.Jedis;

public class RedisConnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//连接本地的 Redis 服务
	      Jedis jedis = new Jedis("192.168.236.128");
	      System.out.println("Connection to server sucessfully");
	      //查看服务是否运行
	      System.out.println("Server is running: "+jedis.ping());
	}

}
