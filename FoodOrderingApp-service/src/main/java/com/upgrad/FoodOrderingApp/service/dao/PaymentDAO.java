package com.upgrad.FoodOrderingApp.service.dao;

import com.upgrad.FoodOrderingApp.service.entity.PaymentEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PaymentDAO {

    @PersistenceContext
    EntityManager entityManager;

    public List<PaymentEntity> getPayments() {

        return entityManager.createNamedQuery("getPayments", PaymentEntity.class)
                .getResultList();

    }
}
