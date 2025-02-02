package org.hari.sprng.kafka.intg.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import lombok.extern.slf4j.Slf4j;
import org.hari.sprng.kafka.intg.model.MyPrdcCls;
import org.hari.sprng.kafka.intg.service.MySpringbootKfkSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MySpringbootKfkSrvImpl implements MySpringbootKfkSrv {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public String prdcMsg(MyPrdcCls myPrdcCls)  {
        try {
            ObjectWriter objM = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String val = objM.writeValueAsString(myPrdcCls);
            kafkaTemplate.send("my_test_tp", val);
            return "Sent Successfully..!";
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
