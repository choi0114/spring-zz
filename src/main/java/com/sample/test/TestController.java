package com.sample.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test.do")
	public String test() {
		System.out.println("깃-소스트리 연동 테스트입니다.");
		return "test";
	}
	
	@RequestMapping("/merge.do")
	public String merge() {
		System.out.println("마스터-버그픽스 병합 테스트입니다.");
		return "merge";
	}
	
	@RequestMapping("/bugfix.do")
	public String bugfix() {
		System.out.println("브랜치 테스트입니다.");
		return "bugfix";
	}
}
