package ir.maktabExcersice.repositories;

import ir.maktabExcersice.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public void createCustomer(Customer customer) {
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(customer);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<Customer> getCustomerList() {
        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
        return entityManager.createQuery("from Customer",Customer.class).getResultList();
    }
}
