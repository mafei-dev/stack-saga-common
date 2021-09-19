package com.mafei.stacksaga.common.resources;

import com.mafei.stacksaga.common.beans.health.ServiceHealth;

import java.util.HashMap;
import java.util.Map;

public class StaticData {

    /**
     * instance topic = [INSTANCE_TOPIC_PREFIX+server name + instance id]
     */
    public final static Map<String, ServiceHealth> SERVICE_HEALTH_DATA = new HashMap<>();

    public interface Channels {
        String INSTANCE_OWN_HEALTH_REQUEST_TOPIC = "INSTANCE_%s_%s";
        String HEALTH_REQUEST_FROM_ADMIN_TOPIC = "HEALTH_REQUEST_FROM_ADMIN_TOPIC";
        String CLUSTERS_INFO = "CLUSTERS_INFO";
    }

}
