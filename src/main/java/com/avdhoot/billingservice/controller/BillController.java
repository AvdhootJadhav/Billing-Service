package com.avdhoot.billingservice.controller;

import java.util.List;

import com.avdhoot.billingservice.entity.BillEntity;
import com.avdhoot.billingservice.service.BillService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BillController {
    
    @Autowired
    private BillService service;

    @PostMapping("/home")
    public String introduction(){
        return "Hey, there!";
    }

    @GetMapping("/bills")
    public List<BillEntity> getAllBills(){
        return service.getAllBills();
    }

    @GetMapping("/bills/{id}")
    public BillEntity findBillById(@PathVariable("id") Long billNumber){
        return service.findBillById(billNumber);
    }

    @GetMapping("/bills/due/date/{date}")
    public List<BillEntity> findBillduedate(@PathVariable("date") String billDate){
        return service.findBillduedate(billDate);
    }

    @PostMapping("/savebill")
    public BillEntity saveBill(@RequestBody BillEntity entity){
        return service.saveBill(entity);
    }
}
