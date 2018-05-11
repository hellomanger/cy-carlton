package com.carlton.cycarltoneureka.hystrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.carlton.cycarltoneureka.service.HelloRemote;
@Component
public class HelloRemoteHystrix implements HelloRemote{

	@Override
	public String sayHello(@RequestParam(value="name") String name) {
		return "没有服务或者服务挂了的时候，我来顶着 "+name;
	}

}
