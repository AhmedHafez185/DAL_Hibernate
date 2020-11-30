/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmed.dal.util;

import com.ahmed.dal.entity.Area;
import com.ahmed.dal.entity.City;
import com.ahmed.dal.repository.impl.CityRepo;
import static com.ahmed.dal.util.HibernateManager.getCurrentSession;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.query.Query;
import static com.ahmed.dal.util.HibernateManager.*;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Ahmed Hafez
 */
public class DALMain {

    public static void main(String[] args) {
        try(Session session = getSessionFactory().getCurrentSession()){
            beginTransaction();
            System.out.println("Session Opened");
             City city = session.load(City.class, 3);
//             Set<Area> areas = new HashSet<>();
//             areas.add(new Area(city, "Marg Ar", "Marg En"));
//             areas.add(new Area(city, "Banha Ar", "Banha En"));
//            city.setAreas(areas);
            //session.merge(city);
            System.out.println("City name : "+city.getNameAr());
            commitTransaction();
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
            if(isAliveTransaction())
                
                rollbackTransaction();
        }
    }

}
