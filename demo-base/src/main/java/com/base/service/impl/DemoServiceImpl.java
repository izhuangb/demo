package com.base.service.impl;

import com.base.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by lijuntao on 2016/4/20.
 */
@Service
public class DemoServiceImpl implements DemoService {


    public String sayHello(String name){
        return "Hello"+name;
    }
}
