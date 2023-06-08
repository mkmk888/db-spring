package com.mkmk.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.mkmk.dto.UserDTO;

public interface UserDAO {
	public abstract List<UserDTO> userList(SqlSessionTemplate session);
}
