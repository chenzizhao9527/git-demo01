package com.ahut.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication // Spring Boot��Ŀ�ĺ���ע�⣬��ҪĿ���ǿ����Զ�����
@Controller // ��������һ��SpringMVC��Controller������
public class HelloApplication {
	
	@RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello world";
    }
	
	@RequestMapping(value = "/hello2", method = RequestMethod.POST)
    @ResponseBody
    public String hello2() {
        return "hello world2";
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    @ResponseBody
    public String hello3() {
        return "hello world3";
    }

	// ��main����������һ��Ӧ�ã��������Ӧ�õ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] applications = {HelloApplication.class,helloApplication02.class};
		SpringApplication.run(applications, args);

	}

}
