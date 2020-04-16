package com.codingforfun.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

/**
 * Producer without callback function
 */
public class CustomProducer {
    public static void main(String[] args) {
        Properties properties = new Properties();
        //Kafka cluster, need to set host in your local computer to access Node VM001
        //just used one for testing
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "VM001:9092");

        //ack level
        properties.put(ProducerConfig.ACKS_CONFIG, "all");

        //repeat send time
        properties.put(ProducerConfig.RETRIES_CONFIG, 1);

        //batch size
        properties.put(ProducerConfig.BATCH_SIZE_CONFIG, 16*1024);

        //wait time to send to kafka
        properties.put(ProducerConfig.LINGER_MS_CONFIG, 1);

        //buffer size
        properties.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 32*1024*1024);

        //serializer
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,"org.apache.kafka.common.serialization.StringSerializer");

        //producer instance
        Producer<String, String> producer = new KafkaProducer<String ,String>(properties);

        for(int i=0; i<10; i++) {
            producer.send(new ProducerRecord<String,String>("testTopic001", "messageKey" + i, "messageValue" + i));
        }

        producer.close();


    }

}
