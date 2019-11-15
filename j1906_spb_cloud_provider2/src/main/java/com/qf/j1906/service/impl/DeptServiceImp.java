package com.qf.j1906.service.impl;

import com.qf.j1906.mapper.DeptMapper;
import com.qf.j1906.pojo.Dept;
import com.qf.j1906.pojo.DeptExample;
import com.qf.j1906.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImp implements DeptService{

    @Resource
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        DeptExample example = new DeptExample();
        List<Dept> depts = deptMapper.selectByExample(example);
        return depts;
    }
}
