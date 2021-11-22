package marketing.company.repo.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@ComponentScan(basePackages = {
        //"marketing.company.repo",
      //  "marketing.company.repo.controller",
        //"marketing.company.repo.exceptions",
        //"marketing.company.repo.persistence"
        })

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("marketing.company.repo.persistence")
@EntityScan("marketing.company.domain.persistence")
@PropertySource(value = "classpath:DataBase-test.properties")
public class RepositoryConfigTest
{



        private static final String[] ENTITY_PACKAGES_TO_SCAN = {"marketing.company.domain.persistence"};
        private static final String PERSISTENCE_UNIT_NAME = "marketing.company.persistence";
    public RepositoryConfigTest()
    {


    }

        @Bean
        public DataSource dataSource() {
            EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
            return builder.setType(EmbeddedDatabaseType.HSQL)
                   .addScript("script/schema.sql")
                    .addScript("script/data.sql")
                    .build();
        }
        @Bean
        public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
            final LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
            entityManagerFactoryBean.setDataSource(dataSource());
            entityManagerFactoryBean.setPackagesToScan(ENTITY_PACKAGES_TO_SCAN);
            entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
            entityManagerFactoryBean.setJpaProperties(buildJpaProperties());
            entityManagerFactoryBean.setPersistenceUnitName(PERSISTENCE_UNIT_NAME);

            return entityManagerFactoryBean;
        }
        @Bean
        public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {

            JpaTransactionManager transactionManager = new JpaTransactionManager();
            transactionManager.setEntityManagerFactory(entityManagerFactory);
            return transactionManager;
        }
        @Bean
        public JdbcTemplate getJdbcTemplate()
        {
            return new JdbcTemplate(dataSource());
        }

        @Bean
        public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
            return new PersistenceExceptionTranslationPostProcessor();
        }

       public Properties buildJpaProperties() {
            Properties properties = new Properties();
            properties.setProperty("javax.persistence.transactionType", "jta");
            properties.setProperty("hibernate.IntegerCode.use_reflection_optimizer", "true");
            properties.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JTATransactionFactory");
            properties.setProperty("hibernate.query.factory_class", "org.hibernate.hql.internal.classic.ClassicQueryTranslatorFactory");
            properties.setProperty("hibernate.transaction.jta.platform", "org.hibernate.service.jta.platform.Internal.sunOneJtaPlatform");
            properties.setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
            //mine is different
            properties.setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
            properties.setProperty("hibernate.generate_statistics", "false");
            properties.setProperty("hibernate.use_sql_comments", "false");
            properties.setProperty("hibernate.show_sql", "true");
            properties.setProperty("hibernate.format_sql", "true");
            properties.setProperty("hibernate.jdbc.batch_size", "500");
            properties.setProperty("hibernate.order_inserts", "true");
            properties.setProperty("hibernate.order_updates", "true");
            properties.setProperty("hibernate.batch_versioned_data", "true");
            properties.setProperty("hibernate.connection.driver.class", "com.mysql.cj.jdbc.Driver");
            properties.setProperty("hibernate.hibernate.", "update");
            return properties;
        }
    }



