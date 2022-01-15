package com.mafei.stacksaga.common.beans.health;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
public class InstanceDetail implements Serializable {
    private static final long serialVersionUID = 14L;
    private String instance_id;
    private String service_name;
    private Long start_up_datetime;
    private Long up_time;
    private Long last_updated_datetime;
    private String status;
    private Long lats_server_up_datetime;
    // TODO: 9/18/2021 add config data each server from property file
    /**
     * if it is a refresh, there shou have a refresh key.
     * that means it is being happened by an admin request.
     * otherwise, it is the naturel publish
     */
    private Boolean is_refresh;
    private String refresh_token;

    public InstanceDetail() {
    }
}
