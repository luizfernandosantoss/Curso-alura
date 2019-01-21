package org.casadocodigo.conf;

import javax.persistence.EntityManagerFactory;
import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
public class JPAConfiguration {


    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
       LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();

       JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
       //Falar qual adptador sera utilizado;
       factoryBean.setJpaVendorAdapter(vendorAdapter);

        DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/casadocodigo","root","");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");

        factoryBean.setDataSource(dataSource);
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
        properties.setProperty("hibernate.show_sql","true");
        properties.setProperty("hibernate.hbm2ddl.auto","update");

        factoryBean.setJpaProperties(properties);

        factoryBean.setPackagesToScan("org.casadocodigo.models");

        return factoryBean;

    }

    @Bean
    public JpaTransactionManager transactioManager(EntityManagerFactory emf){
        return new JpaTransactionManager(emf);
    }
}
