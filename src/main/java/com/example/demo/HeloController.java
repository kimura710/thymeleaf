package com.example.demo;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeloController {
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("string","Hello");
		model.addAttribute("stringNull",null);
		model.addAttribute("stringArray",new String[] {"Foo","Bar","Baz","Tuk"});
		model.addAttribute("stringList",Arrays.asList("Hoge","Fuga","papa","Beer"));
		model.addAttribute("STRING","HELLO");
		model.addAttribute("number",10001212);
		return "index";
	}

}
