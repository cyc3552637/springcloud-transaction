package com.digital.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.codingapi.tx.annotation.TxTransaction;
import com.digital.api.RpcServerService;
import com.digital.api.UserService2;
import com.digital.dao.UserDao;
import com.digital.entity.UserEntity;

@Service
public class UserServiceImpl implements UserService2 {

	@Autowired
    UserDao userdao;
    @Autowired
    RpcServerService rpcserverservice;
    
    
    @Value("${server.port}")
    String port;
    @TxTransaction(isStart=true)
    @Transactional
    public String insert2(String name) {
		// TODO Auto-generated method stub
    	int num1=rpcserverservice.insert(name);
    	int num2=userdao.register("2",name,"2");

    	
	


	
		return " i am from port:" +port+"   statue1"+num1+"   statue2"+num2;
	}

	
}
