package com.mafei.stacksaga.common.beans.health;

import com.mafei.stacksaga.common.enums.ServiceHealthStatus;
import com.mafei.stacksaga.common.resources.StackSAGAProperties;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ServiceHealth implements Cloneable {
    private ServiceHealthStatus serviceHealthStatus;
    private StackSAGAProperties.CircuitBreakerMeta circuitBreakerMeta;
    private Integer failedRequestCount;
    private Integer halfOpenCount;
    private boolean isNextRequestExecutable = true;

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
