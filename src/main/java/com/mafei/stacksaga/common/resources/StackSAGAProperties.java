package com.mafei.stacksaga.common.resources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

@Validated
@Configuration
@ConfigurationProperties(prefix = "stacksaga")
@ToString
@Data
public class StackSAGAProperties implements Serializable {

    @NotNull(message = "The service group name is required.")
    private String serviceGroupName;
    @NotNull(message = "The service id is required.")
    private String serviceId;
    @NotNull(message = "The component scan path(s) is required.")
    private String[] componentScan;
    private Long liveUpdate;
    private boolean showStartUpSummary = true;
    private boolean showStartUpConfiguredSteps = true;
    private boolean showTransactionSummary = true;
    private Integer corePoolSize = 5;
    private Integer maxPoolSize = 5;
    private Integer queueCapacity = 100;
    private String JdbcUrl;
    private String driverClassName;
    private String username;
    private String password;
    private Map<String, CircuitBreakerMeta> circuitBreakerMeta = new HashMap<>();

    public void setServiceId(String serviceId) {
        if (serviceId.startsWith("-")) {
            this.serviceId = serviceId.substring(1);
        } else {
            this.serviceId = serviceId;
        }
    }

    @ToString
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CircuitBreakerMeta implements Serializable {
        private Integer maxAttempts = 10;
        private Integer halfOpenRate = 10;
    }
}