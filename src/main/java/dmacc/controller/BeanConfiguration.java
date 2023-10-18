
/**
 * @author Aaron Carpenter - acarpenter5@dmacc.edu
 * CIS175 - Fall 2023
 * Oct 16, 2023
 */

package dmacc.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import dmacc.beans.Address;
import dmacc.beans.Contact;

@SpringBootApplication
public class BeanConfiguration {

    @PersistenceContext
    private static EntityManager em;

    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Contact contact = appContext.getBean(Contact.class);
        Address address = appContext.getBean(Address.class);

        persistToDatabase(contact, address);
    }

    @Transactional
    private static void persistToDatabase(Contact contact, Address address) {
        em.persist(contact);
        em.persist(address);
    }
}


