package com.mkmk.dto;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("user")
@Getter
@Setter
@ToString
public class UserDTO {
	int id;
	String name;
	String prop;
	
	public UserDTO() {}
	
	public UserDTO(int id, String name, String prop) {
		super();
		this.id = id;
		this.name = name;
		this.prop = prop;
	}
	
	public UserDTO(String name) {
		super();
		this.name = name;
	}
}
