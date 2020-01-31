package com.cos.springlegacy;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cos.springlegacy.dto.RequestInfoDto;

//http:localhost:8080/springlegacy/
//Controller 어노테이션은 페이지를 리턴하는 어노테이션이다.
@Controller
public class HomeController {
	
	/*
	 * 1.데이터 전달  - 쿼리스트링, Form데이터, Json
	 * 2.데이터 받기  - 쿼리스트링, Form데이터, Json
	 * 3.Pathvariable 사용해보기
	 */
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		//Comtroller 어노테이션이 있는 클래스에서 함수가 return하는 순간 Wiew Resolver가 관여하여 preffix와 suffix를 만들어서 페이지를 리턴해줌
		
		//일반적으로 데이터 전달할 때 request에 담기 하지만 스프링에서는 model이라는 객체를 만들어놔서 여기다가 담으면된다.
		
		String username="ssar";
		model.addAttribute("username",username);//object타입 이다
		
		return "home";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String hello(Model model, @RequestParam("id") String id, @RequestParam("pw") String pw) {
		
		System.out.println("id : "+id);
		System.out.println("pw : "+pw);
		
		model.addAttribute("id",id);
		model.addAttribute("pw",pw);
		
		return "hello";
	}
	
	@RequestMapping(value = "/goodbye", method = RequestMethod.GET)
	public String goodbye(RequestInfoDto requestIndoDto) {
		
		System.out.println("addr : "+requestIndoDto.getAddr());
		System.out.println("hobby : "+requestIndoDto.getHobby());
		return "goodbye";
	}
	
}
