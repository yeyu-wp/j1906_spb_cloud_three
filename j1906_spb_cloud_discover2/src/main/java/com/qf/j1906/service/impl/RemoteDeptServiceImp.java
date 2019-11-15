package com.qf.j1906.service.impl;

import com.qf.j1906.pojo.Dept;
import com.qf.j1906.service.RemoteDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class RemoteDeptServiceImp implements RemoteDeptService {

    @Autowired
    private RestTemplate restTemplate;
    @Override
    public List<Dept> findAll() {
        Dept[] forObject = restTemplate.getForObject("http://SERVICE-PROVIDER2/depts", Dept[].class);
        List<Dept> depts = Arrays.asList(forObject);
        return depts;

    }
}
