package marketing.company.translator.config;

import marketing.company.repo.config.RepositoryConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Import(RepositoryConfig.class)

@ComponentScan(basePackages ="marketing.company.translator")

@Configuration
public class TranslatorConfig
{
    public TranslatorConfig()
    {
    }
    public void TranslatorConfigs()
    {

    }
}
