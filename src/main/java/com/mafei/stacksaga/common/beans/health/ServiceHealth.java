package com.mafei.stacksaga.common.beans.health;

import com.mafei.stacksaga.common.enums.ServiceHealthStatus;
import com.mafei.stacksaga.common.resources.StackSAGAProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ServiceHealth implements Cloneable, Serializable {
    private String id;
    private ServiceHealthStatus serviceHealthStatus;
    private StackSAGAProperties.CircuitBreakerMeta circuitBreakerMeta;
    private Integer failedRequestCount;
    private Integer halfOpenCount;
    private Boolean isNextRequestExecutable = true;

    @Override
    public ServiceHealth clone() {
        try {
            ServiceHealth clone = (ServiceHealth) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
