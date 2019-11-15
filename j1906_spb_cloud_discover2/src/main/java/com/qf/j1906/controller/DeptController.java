package com.qf.j1906.controller;

import com.qf.j1906.pojo.Dept;
import com.qf.j1906.service.RemoteDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class DeptController {
    @Autowired
    private RemoteDeptService remoteDeptService;

    @RequestMapping(value = "/depts",method = RequestMethod.GET)
    public String findAll(Model model){
        List<Dept> depts = remoteDeptService.findAll();
        model.addAttribute("dept",depts);
        return "list";

    }
}
