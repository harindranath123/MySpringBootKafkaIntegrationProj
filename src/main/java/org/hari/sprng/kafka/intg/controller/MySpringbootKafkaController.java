package org.hari.sprng.kafka.intg.controller;

import lombok.extern.slf4j.Slf4j;
import org.hari.sprng.kafka.intg.model.MyPrdcCls;
import org.hari.sprng.kafka.intg.service.MySpringbootKfkSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class MySpringbootKafkaController {

    @Autowired
    private MySpringbootKfkSrv mySpringbootKfkSrv;

    @PostMapping("/produceMsg")
    public String produceMsg(@RequestBody(required = true) MyPrdcCls myPrdcCls){
        return mySpringbootKfkSrv.prdcMsg(myPrdcCls);
    }
}
