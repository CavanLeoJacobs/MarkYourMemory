package marketing.company.logic.config;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import marketing.company.translator.config.TranslatorConfig;

@Configuration
@Import(TranslatorConfig.class)
@ComponentScan(basePackages =
        {
                "marketing.company.logic",
                "marketing.company.logic.flow.impl"
        })
public class LogicConfig
{
        public LogicConfig() {
        }
}
