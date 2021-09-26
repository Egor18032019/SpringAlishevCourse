package org.springcourse.first;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.springcourse.first")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
