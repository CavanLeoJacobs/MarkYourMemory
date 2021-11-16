package marketing.company.web.config;


import marketing.company.logic.config.LogicConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import(LogicConfig.class)
@ComponentScan(basePackages =
        {
               "marketing.company.web",
                "marketing.company.web.controller",
                "marketing.company.web.exceptions"
        }
)
@PropertySource(value = "classpath:application.properties")
@PropertySource(value = "classpath:application.yml")
@PropertySource(value = "classpath:logback.xml")
//@PropertySource(value = "webapp.WEB-INF.web.xml");
public class ApplicationConfig {
        public ApplicationConfig()
        {
        }
}