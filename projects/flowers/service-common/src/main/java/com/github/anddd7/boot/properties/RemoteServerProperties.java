package com.github.anddd7.boot.properties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Configuration
@ConfigurationProperties(prefix = "remote")
public class RemoteServerProperties {

  private String baseURL;
  private String contextURL;

  public String getURI() {
    return baseURL + contextURL;
  }
}