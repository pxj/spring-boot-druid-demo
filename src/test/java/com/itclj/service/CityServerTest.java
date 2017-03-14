package com.itclj.service;

import com.alibaba.fastjson.JSON;
import com.itclj.domain.model.City;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by lujun.chen on 2017/3/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CityServerTest {

  private static Logger logger= LoggerFactory.getLogger(CityServerTest.class);

  @Autowired
  private CityService cityService;

  @Test
  public void list(){
    City city=new City();
    city.setCity("Balaiha");
    List<City> list=cityService.list(city);
    logger.info(JSON.toJSONString(list));
  }
}
