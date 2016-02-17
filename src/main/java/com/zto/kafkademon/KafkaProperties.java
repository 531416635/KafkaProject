package com.zto.kafkademon;

public interface KafkaProperties {

	final static String zkConnect = "10.10.19.188:2181";
	final static String groupId = "group1";
	final static String topic = "topic1";
	final static String kafkaServerURL = "10.10.19.188";
	final static int kafkaServerPort = 9092;
	final static int kafkaProducerBufferSize = 64 * 1024;
	final static int connectionTimeOut = 20000;
	final static int reconnectInterval = 10000;
	final static String clientId = "SimpleConsumerDemoClient";
}
