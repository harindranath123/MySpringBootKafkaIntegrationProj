package org.hari.sprng.kafka.intg.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.hari.sprng.kafka.intg.model.MyPrdcCls;

public interface MySpringbootKfkSrv {

    String prdcMsg(MyPrdcCls myPrdcCls);
}
