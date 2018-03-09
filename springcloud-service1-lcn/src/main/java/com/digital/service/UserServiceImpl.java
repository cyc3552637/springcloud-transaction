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
import com.digital.api.UserService;
import com.digital.dao.UserDao;
import com.digital.entity.UserEntity;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    UserDao userdao;

    @Value("${server.port}")
    String port;

    @Transactional
    public int insert(String name) {
		// TODO Auto-generated method stub
		int num=userdao.register("1",name,"1");
		return num;
	}

	
}
