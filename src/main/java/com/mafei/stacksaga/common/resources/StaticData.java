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
        String INSTANCE_ID_PATTERN = "%s_%s";
        String INSTANCE_OWN_HEALTH_REQUEST_TOPIC = "INSTANCE_" + INSTANCE_ID_PATTERN;
        String HEALTH_REQUEST_FROM_ADMIN_TOPIC = "HEALTH_REQUEST_FROM_ADMIN_TOPIC";
        String CLUSTERS_INFO_UPDATED_TOPIC = "CLUSTERS_INFO_UPDATED_TOPIC";
        String NEW_SERVER_UP_TOPIC = "NEW_SERVER_UP_TOPIC";
        String SERVER_NAMES_KEY = "SERVER_NAMES";
        String PRIMARY_SERVICE_KEY = "PRIMARY_SERVICE";
    }

}
