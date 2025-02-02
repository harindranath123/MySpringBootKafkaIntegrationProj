package org.hari.sprng.kafka.intg.listener;

import lombok.extern.slf4j.Slf4j;
import org.hari.sprng.kafka.intg.model.MyPrdcCls;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@EnableKafka
@Component
public class MySpringbootKafkaConsumer {

    @KafkaListener(topics = "my_test_tp", groupId = "my-consumer-group1")
    public void consume(String val){
        System.out.println("Entered into consume: "+ val);
    }
}
