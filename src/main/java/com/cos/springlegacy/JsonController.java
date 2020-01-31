package com.cos.springlegacy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.springlegacy.dto.RequestJsonDto;

@Controller
public class JsonController {
	
	//스프링은 form의 name값 혹은 쿼리스트링만 오브젝트로 자동 변환해준다.
	@RequestMapping(value = "/jsonTest",method = RequestMethod.POST)
	public @ResponseBody RequestJsonDto jsonTest(@RequestBody RequestJsonDto requestJsonDto) {
		System.out.println("id : "+requestJsonDto.getId());
		return requestJsonDto;
	}
	
	@RequestMapping(value = "/jsonHome/{num}",method = RequestMethod.GET)
	public String jsonHome(@PathVariable int num) {
		System.out.println(num);
		return "jsonHome";
	}
}
