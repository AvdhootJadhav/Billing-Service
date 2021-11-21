package com.avdhoot.billingservice.service;

import java.util.List;

import com.avdhoot.billingservice.entity.BillEntity;
import com.avdhoot.billingservice.repository.BillRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService {
    
    @Autowired
    private BillRepository repository;

    public BillEntity saveBill(BillEntity entity) {
        return repository.save(entity);
    }

    public List<BillEntity> getAllBills() {
        return repository.findAll();
    }

    public BillEntity findBillById(Long billNumber) {
        return repository.findBybillNumber(billNumber);
    }

    public List<BillEntity> findBillduedate(String billDate) {
        return repository.findAllBybillDate(billDate);
    }
}
