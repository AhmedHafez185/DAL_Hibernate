/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmed.dal.repository.impl;

import com.ahmed.dal.entity.AdminUser;
import com.ahmed.dal.repository.AbstractRepo;

/**
 *
 * @author Ahmed Hafez
 */
public class AdminUserRepo extends AbstractRepo<AdminUser>{
    
    public AdminUserRepo() {
        super(AdminUser.class);
    }
    
}
