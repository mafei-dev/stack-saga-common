package com.mafei.stacksaga.common.resources;

import com.mafei.stacksaga.common.beans.health.ServiceHealth;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class StaticData {

    /**
     * instance topic = [INSTANCE_TOPIC_PREFIX+server name + instance id]
     */
    public final static Map<String, ServiceHealth> SERVICE_HEALTH_DATA = new HashMap<>();
    public final static SimpleDateFormat STACK_SAGA_DATE_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    public final static Long EXTRA_EXPIRE_TIME = Duration.ofSeconds(30).toMillis();

    public interface Channels {
        String INSTANCE_ID_PATTERN_FORMATTER = "%s_%s";
        String SERVICE_PATTERN_KEY_FORMATTER = "SERVICE_%s";
        String INSTANCE_OWN_HEALTH_REQUEST_TOPIC = "INSTANCE_" + INSTANCE_ID_PATTERN_FORMATTER;
        String HEALTH_REQUEST_FROM_ADMIN_TOPIC = "HEALTH_REQUEST_FROM_ADMIN_TOPIC";
        String CLUSTERS_INFO_UPDATED_TOPIC = "CLUSTERS_INFO_UPDATED_TOPIC";
        String NEW_SERVER_UP_TOPIC = "NEW_SERVER_UP_TOPIC";
        /**
         * SERVER_GROUP_TOPIC
         * this topic for receives the data request for related to the service group from admin
         */
        String SERVER_GROUP_TOPIC_FORMATTER = "SERVICE_GROUP_%s";
        String TEMPORARY_SERVER_GROUP_TRANSACTION_TOPIC_FORMATTER = "WS_TRANSACTION_%s";
        String SERVER_NAMES_KEY = "SERVER_NAMES";
        String PRIMARY_SERVICE_KEY = "PRIMARY_SERVICE";
        String PRIMARY_SERVICE_DETAIL_KEY = "PRIMARY_SERVICE_DETAIL";
        String HEALTH_REFRESH_REQUEST_EVENT = "HEALTH_REFRESH_REQUEST_EVENT";
        String HEALTH_REFRESH_RESPONSE_EVENT = "HEALTH_REFRESH_RESPONSE_EVENT";
        String ADMIN_COMMANDS = "ADMIN_COMMANDS";
        String ADMIN_SERVER_KEY = "ADMIN_SERVER_DETAILS";

    }

    public enum AdminCommands {
        DISABLE_CB,
        ENABLE_CB,
        REFRESH_STATUS,
    }

}
