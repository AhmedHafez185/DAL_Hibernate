/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmed.dal.repository.impl;

import com.ahmed.dal.entity.Area;
import com.ahmed.dal.entity.City;
import com.ahmed.dal.repository.AbstractRepo;
import com.ahmed.dal.repository.CommonRepo;
import java.util.List;
import static com.ahmed.dal.util.HibernateManager.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.query.Query;

/**
 *
 * @author Ahmed Hafez
 */
public class AreaRepo extends AbstractRepo<Area>{

    public AreaRepo() {
        super(Area.class);
    }

    
}
