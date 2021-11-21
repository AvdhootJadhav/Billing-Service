package com.avdhoot.billingservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BillEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long billNumber;
    private String billedTo;
    private String billDate;
    private Long billPrice;
    private double tax;
    private double total;
}
