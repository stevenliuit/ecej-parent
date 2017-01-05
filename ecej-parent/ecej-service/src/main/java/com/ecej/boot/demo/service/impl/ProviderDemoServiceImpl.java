package com.ecej.boot.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ecej.boot.demo.po.Demo;
import com.ecej.boot.demo.service.DemoService;
import com.ecej.boot.demo.service.ProviderDemoService;

@Service("providerDemoService")
public class ProviderDemoServiceImpl implements ProviderDemoService {

	@Resource
	private DemoService demoService;

	public void insertDemo(Demo demo) {
		demoService.insertDemo(demo);
		System.out.println("我调用了远程demo");
	}
}
