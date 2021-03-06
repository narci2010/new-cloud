package com.framework.auth.component.social.qq.config;

import com.framework.auth.config.SocialPropertiesConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author summer
 * @date 2018/1/19
 * QQ登录参数配置
 */
@Configuration
@ConfigurationProperties(prefix = "cloud.social.qq")
public class SocialQQPropertiesConfig extends SocialPropertiesConfig {
}
