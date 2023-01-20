package org.ujar.bs.msg.amqp.producing.hello.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@EnableConfigurationProperties({AmqpQueuesProperties.class})
class ApplicationConfig {
}