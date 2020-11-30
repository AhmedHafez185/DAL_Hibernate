/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmed.dal.repository;

import com.ahmed.dal.entity.City;
import static com.ahmed.dal.util.HibernateManager.getCurrentSession;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.query.Query;

/**
 *
 * @author Ahmed Hafez
 * @param <E>
 */
public interface CommonRepo<E>{
    public E add(E entity);
    public E update(E entity);
    public void remove(Integer id);
    public E findById(Integer id);
    public List<E> findList() ;
}
