package com.carlton.cycarltoneureka.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.carlton.cycarltoneureka.hystrix.HelloRemoteHystrix;

@FeignClient(name="cy-carlton-productor",fallback=HelloRemoteHystrix.class)
public interface HelloRemote {

	@RequestMapping(value="/hello/sayHello")
	public String sayHello(@RequestParam(value="name") String name);
}
