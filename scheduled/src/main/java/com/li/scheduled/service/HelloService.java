package com.li.scheduled.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Async //表示这个类里面的方法都是异步方法, 也可以注解到具体方法上
@Service
public class HelloService {
}
