/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmed.dal.repository.impl;

import com.ahmed.dal.entity.Branch;
import com.ahmed.dal.repository.AbstractRepo;

/**
 *
 * @author Ahmed Hafez
 */
public class BranchRepo extends AbstractRepo<Branch>{
    public BranchRepo(){
        super(Branch.class);
        this.setDefaultOrder("nameAr");
    }
}
