package org.example.test;


import org.example.dao.JDBCInsertDao;
import org.example.domain.JDBCInsert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringJDBCWithInsertingRecordInDB {
    public static void main(String[] args) {
       // we can create bean using Two ways one is Bean Factory and second is ApplicationContext
        // WE can inject the bean in IOC container in Two ways one is Setter getter and constructor
        // We can Configure bean in bean factory using only XML based configuration
        // We can Configure bean in ApplicationContext using three ways 1.XML based 2.Annotation 3.Java configuration
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        JDBCInsertDao jdbcInsertDao = applicationContext.getBean("JDBCInsertDao",JDBCInsertDao.class);

        JDBCInsert jdbcInsert = new JDBCInsert();
        jdbcInsert.setInsertId(1);
        jdbcInsert.setTitle("First Application ");
        jdbcInsert.setDescription("This is my JDBC insert Application");
        jdbcInsert.setDuration(10);
        jdbcInsert.setStatus("TEST");
        System.out.println(jdbcInsertDao.insertProjects(jdbcInsert));


    }
}