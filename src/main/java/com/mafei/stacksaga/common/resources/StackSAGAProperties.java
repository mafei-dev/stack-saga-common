package com.mafei.stacksaga.common.resources;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Validated
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

    @ToString
    @Data
    public static class CircuitBreakerMeta {
        private Integer maxAttempts = 10;
        private Integer halfOpenRate = 10;
    }
}