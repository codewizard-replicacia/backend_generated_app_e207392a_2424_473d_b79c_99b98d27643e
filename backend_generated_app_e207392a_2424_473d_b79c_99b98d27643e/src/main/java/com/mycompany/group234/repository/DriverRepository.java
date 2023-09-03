package com.mycompany.group234.repository;


import com.mycompany.group234.model.Driver;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class DriverRepository extends SimpleJpaRepository<Driver, String> {
    private final EntityManager em;
    public DriverRepository(EntityManager em) {
        super(Driver.class, em);
        this.em = em;
    }
    @Override
    public List<Driver> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"Driver\"", Driver.class).getResultList();
    }
}