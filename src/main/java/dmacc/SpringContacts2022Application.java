/**
 * @author Aaron Carpenter - acarpenter5@dmacc.edu
 * CIS175 - Fall 2023
 * Oct 16, 2023
 */

package dmacc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import dmacc.beans.Contact;
import dmacc.controller.BeanConfiguration;

@SpringBootApplication
public class SpringContacts2022Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringContacts2022Application.class, args);
        ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Contact c = appContext.getBean("contact", Contact.class);
        System.out.println(c.toString());
    }
}
