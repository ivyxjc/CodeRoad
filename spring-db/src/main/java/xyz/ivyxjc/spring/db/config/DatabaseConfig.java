package xyz.ivyxjc.spring.db.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

/**
 * @author Ivyxjc
 * @since 4/21/2018
 */
@Configuration
@ComponentScan(basePackages = {"xyz.ivyxjc.spring.db"})
@EnableJpaRepositories(basePackages = {"xyz.ivyxjc.spring.db.dao"})
public class DatabaseConfig {

    @Bean(name = "entityManagerFactory")
    public EntityManagerFactory defaultEntityManagerFactory(DataSource dataSource,
        HibernateJpaVendorAdapter jpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean lef = new LocalContainerEntityManagerFactoryBean();
        lef.setDataSource(dataSource);
        lef.setPackagesToScan("xyz.ivyxjc.spring.db.bean");
        lef.setJpaVendorAdapter(jpaVendorAdapter);
        //lef.setPersistenceUnitName("defaultPersistenceUnit");
        lef.afterPropertiesSet();
        return lef.getObject();
    }

    @Bean
    public HibernateJpaVendorAdapter buildJpaVendorAdapter() {
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setGenerateDdl(true);
        jpaVendorAdapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
        return jpaVendorAdapter;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(DataSource dataSource) {
        return new NamedParameterJdbcTemplate(dataSource);
    }
}
