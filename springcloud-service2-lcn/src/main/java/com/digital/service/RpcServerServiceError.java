package com.digital.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.digital.api.RpcServerService;
import com.digital.entity.UserEntity;



@Component
public class RpcServerServiceError implements RpcServerService {

	@Override
	public int insert(String name) {
		// TODO Auto-generated method stub
		System.out.println("进入断路器");
		throw new RuntimeException("save 保存失败.");
	}

}
