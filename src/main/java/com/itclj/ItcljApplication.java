package com.itclj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by lujun.chen on 2017/3/14.
 */
@ServletComponentScan
@SpringBootApplication
public class ItcljApplication {

  public static void main(String[] args) {
    SpringApplication.run(ItcljApplication.class,args);
  }

}
