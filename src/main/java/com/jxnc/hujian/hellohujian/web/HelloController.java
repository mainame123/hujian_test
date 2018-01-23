package com.jxnc.hujian.hellohujian.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Administrator
 *
 *这个访问的包一定要放在 主程序的 子包下面！！！！！！
 *比如 HelloHujianApplication 在com.jxnc.hujian.hellohujian包
 *那么，controller层一定要在  com.jxnc.hujian.hellohujian的子包下面。
 *干
 *
 *
 *
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

	
	
	
	
	 @RequestMapping
	    public String hello() {
	        return "Hello Spring-Boot";
	    }

	    @RequestMapping("/info")
	    public Map<String, String> getInfo(@RequestParam String name) {
	        Map<String, String> map = new HashMap<>();
	        map.put("name", name);
	        return map;
	    }
	
}
