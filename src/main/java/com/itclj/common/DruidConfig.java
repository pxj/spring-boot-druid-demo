package com.itclj.common;

import com.alibaba.druid.pool.DruidDataSource;
import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lujun.chen on 2017/3/14.
 */
@Configuration
public class DruidConfig {

  @Bean
  @ConfigurationProperties(prefix="spring.datasource")
  public DataSource druidDataSource(){
    return new DruidDataSource();
  }

}
