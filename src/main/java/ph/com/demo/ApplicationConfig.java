package ph.com.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Created by nikkinicholas on 8/13/17.
 */
@Configuration
@PropertySources({
    @PropertySource(value={"classpath:application.properties"}),
    @PropertySource(value={"file:properties/application-${spring.profiles.active}.properties"}, ignoreResourceNotFound=true)
})
public class ApplicationConfig {
}
