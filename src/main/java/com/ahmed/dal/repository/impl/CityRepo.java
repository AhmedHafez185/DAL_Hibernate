/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmed.dal.repository.impl;

import com.ahmed.dal.entity.City;
import com.ahmed.dal.repository.AbstractRepo;
import com.ahmed.dal.repository.CommonRepo;
import static com.ahmed.dal.util.HibernateManager.getCurrentSession;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.query.Query;

public class CityRepo extends AbstractRepo<City> {

    /**
     *
     * @author Ahmed Hafez
     */
    public CityRepo(){
        super(City.class);
        this.setDefaultOrder("nameAr");
    }
    public List<City> findLike(String keyword) {
        String pattern = "%" + keyword + "%";
        CriteriaBuilder criteriaBuilder = getCurrentSession().getCriteriaBuilder();
        CriteriaQuery<City> cityCriteriaQuery = criteriaBuilder.createQuery(City.class);
        Root<City> from = cityCriteriaQuery.from(City.class);
        cityCriteriaQuery.select(from);

        cityCriteriaQuery.where(criteriaBuilder.or(
                criteriaBuilder.like(from.get("nameEn"), pattern),
                criteriaBuilder.like(from.get("nameAr"), pattern)
        )
        );
        cityCriteriaQuery.orderBy(criteriaBuilder.asc(from.get("nameAr")));
        Query<City> cityQuery = getCurrentSession().createQuery(cityCriteriaQuery);
        List<City> cityList = cityQuery.getResultList();
        return cityList;

    }

    public Long count(String keyword) {
        String pattern = "%" + keyword + "%";
        CriteriaBuilder criteriaBuilder = getCurrentSession().getCriteriaBuilder();
        CriteriaQuery<Long> cityCriteriaQuery = criteriaBuilder.createQuery(Long.class);
        Root<City> from = cityCriteriaQuery.from(City.class);
        cityCriteriaQuery.select(criteriaBuilder.count(from));

        cityCriteriaQuery.where(criteriaBuilder.or(
                criteriaBuilder.like(from.get("nameEn"), pattern),
                criteriaBuilder.like(from.get("nameAr"), pattern)
        )
        );
        cityCriteriaQuery.orderBy(criteriaBuilder.asc(from.get("nameAr")));
        Query<Long> cityQuery = getCurrentSession().createQuery(cityCriteriaQuery);
        List<Long> cityCount = cityQuery.getResultList();
        return cityCount.get(0);
    }

    public List<City> findListByHQL(String keyword) {
        String hql = "FROM City "
                + "WHERE nameEn LIKE :n OR nameAr LIKE :n "
                + "ORDER BY nameAr";
        Query cityQuery = getCurrentSession().createQuery(hql);
        String pattern = "%" + keyword + "%";
        cityQuery.setParameter("n", pattern);
        List<City> cityList = cityQuery.getResultList();
        return cityList;

    }

    
}
