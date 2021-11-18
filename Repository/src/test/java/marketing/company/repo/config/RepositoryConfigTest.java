package marketing.company.repo.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("marketing.company.repo.persistence")
@EntityScan("marketing.company.domain.persistence")
@PropertySource(value = "classpath:DataBase-test.properties")
class RepositoryConfigTest
{


}