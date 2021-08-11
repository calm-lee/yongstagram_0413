package com.yostagram;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {

	@RequestMapping("/test1")
	@ResponseBody
	public String ex01() {
		return "TEST!";
	}
}