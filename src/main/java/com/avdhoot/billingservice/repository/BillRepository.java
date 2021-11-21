package com.avdhoot.billingservice.repository;

import java.util.List;

import com.avdhoot.billingservice.entity.BillEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<BillEntity,Long> {

    BillEntity findBybillNumber(Long billNumber);

    List<BillEntity> findAllBybillDate(String billDate);
    
}
