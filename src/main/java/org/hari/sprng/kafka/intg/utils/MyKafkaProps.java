package org.hari.sprng.kafka.intg.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ConfigurationProperties("my.springboot.kafka")
@Component
public class MyKafkaProps {

    private Map<String, String> producer = new HashMap<>();

    private Map<String, String> consumer = new HashMap<>();

    public List<String> getProducer(){
        return producer.values().stream().toList();
    }

    public void setProducer(Map<String, String> producer) {
        this.producer = producer;
    }

    public Map<String, String> getConsumer() {
        return consumer;
    }

    public void setConsumer(Map<String, String> consumer) {
        this.consumer = consumer;
    }
}
