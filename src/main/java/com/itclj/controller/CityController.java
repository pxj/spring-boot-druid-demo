package com.itclj.controller;

import com.itclj.domain.model.City;
import com.itclj.service.CityService;
import java.util.List;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lujun.chen on 2017/3/14.
 */
@Controller
@RequestMapping("/city")
public class CityController {

  @Autowired
  private CityService cityService;

  @ResponseBody
  @RequestMapping("/list")
  public List<City> list(City city) {
    return cityService.list(city);
  }

}
