package com.springmvc.service.impl;

import com.springmvc.service.DataService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Author: luohanwen
 * @Date: 2019/9/19 11:05
 */
public class DataServiceImpl implements DataService {
    @Value("${database.url}")
    private String dataBaseUrl;

    @Override
    public String getData() {
        System.out.println("----------------------");
        System.out.println(dataBaseUrl);
        return null;
    }
}
