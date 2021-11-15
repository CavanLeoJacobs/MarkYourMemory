package marketing.company.repo.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages = {
        "marketing.company.repo",
        "marketing.company.repo.controller",
        "marketing.company.repo.exceptions",
        "marketing.company.repo.persistence"})
@Configuration

@EnableTransactionManagement
@EnableJpaRepositories("marketing.company.repo.persistence")
@EntityScan("marketing.company.domain.persistence")
@PropertySource(value = "classpath:DataBase.properties")
public class RepositoryConfig
{
    public RepositoryConfig()
    {



    }
}
