package com.mafei.stacksaga.common.resources;

import com.mafei.stacksaga.common.beans.health.ServiceHealth;

import java.util.HashMap;
import java.util.Map;

public class StaticData {

    /**
     * instance topic = [INSTANCE_TOPIC_PREFIX+server name + instance id]
     */
    public static final String INSTANCE_TOPIC_PREFIX = "INSTANCE_%s_%s";
    public final static Map<String, ServiceHealth> SERVICE_HEALTH_DATA = new HashMap<>();

}
