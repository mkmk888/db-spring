package com.mkmk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mkmk.dto.UserDTO;
import com.mkmk.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping("/")
	@ResponseBody
	public List<UserDTO> SelectAllFromUser() {
		List<UserDTO> userList = service.userList();
		return userList;
	}
	
	@RequestMapping("/search_by_id")
	@ResponseBody
	public String searchById(@RequestParam String id) {
		List<UserDTO> userList = service.userList();
		int intId=Integer.parseInt(id);
		UserDTO obj = userList.get(intId-1);
		String name = obj.getName();
		String prop = obj.getProp();
		
		return name+" / "+prop;
	}
}
