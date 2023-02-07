package com.example.demo.controller;
 
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Company;
import com.example.demo.service.CompanyService;


@RestController
@RequestMapping("/api/company/")
public class CompanyController {
    @Autowired
    CompanyService companyService;
    @RequestMapping("/findAll") 
    @CrossOrigin(origins = "*")
    public  List<Company> findAll(){ 
        return companyService.findAll();
    }
 
    @PostMapping("/save") 
    @CrossOrigin(origins = "*")
    public  Company save(@RequestBody Company company){ 
        return companyService.save(company);
    }

    @GetMapping("/delete") 
    @CrossOrigin(origins = "*")
    public  void delete(Integer companyId){ 
        companyService.delete(companyId);
    }

    @RequestMapping("/init") 
    @CrossOrigin(origins = "*")
    public  void initData(){ 
        List<Company> companyList = new ArrayList<Company>();

        Company company  = new Company();
        company.setAvatar("Russia");
        company.setName("Joey");
        company.setCompany("Youtube");
        company.setStatus("Active");
        company.setDueDate("31/12/2023");
        company.setTargetAchievement(50000);

        companyList.add(company);

        Company company2  = new Company();
        company2.setAvatar("KK");
        company2.setName("Max");
        company2.setCompany("Google");
        company2.setStatus("Active");
        company2.setDueDate("15/12/2023");
        company2.setTargetAchievement(20000);

        companyList.add(company2);

        companyService.saveAll(companyList);
    }

}
