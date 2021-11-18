package marketing.company.repo.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("marketing.company.repo.persistence")
@PropertySource(value ="classpath:Database.properties")
public class DataBase
{
    private static final String[] ENTITY_PACKAGES_TO_SCAN = {"marketing.company.domain.persistence"};
    private static final String PERSISTENCE_UNIT_NAME = "marketing.company.persistence";


    public DataBase()
    {

    }

   /*


    @Value("${spring.datasource.url}")
    private String datasourceUrl="jdbc:mysql://localhost/MarketingCompany";
    @Value("${spring.datasource.username}")
    private String username="root";
    @Value("${spring.datasource.password}")
    private String password="29382467MysqlPassword@1";

    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        try {
            dataSource.setUsername(username);
            dataSource.setPassword(password);
            dataSource.setUrl(datasourceUrl);

            //dataSource.getImplicitCachingEnabled(true);
          //  dataSource.setFastConnectionFailoverEnabled(true);
            return dataSource;
        } catch (Exception error)
        {
            throw new RuntimeException("Unable to connect to DB", error);

        }

    }
      */




    @Bean
    public Properties JpaProperties() {
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
/*



spring.datasource.url=jdbc:mysql://localhost:3306/MarketingCompany
spring.datasource.username=root
spring.datasource.password=29382467MysqlPassword@1
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.datasource=marketingcompany
spring.jpa.datasource-platform=org.hibernate.dialect.MySQL5Dialect
spring.jpa.open-in-view=true

 */