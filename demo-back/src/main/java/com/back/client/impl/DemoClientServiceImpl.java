package com.back.client.impl;

import com.back.service.DemoService;
import com.comm.service.DemoClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by lijuntao on 2016/4/27.
 */
@Component("demoClientService")
public class DemoClientServiceImpl implements DemoClientService {

    @Autowired
    private DemoService demoService;

    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}
