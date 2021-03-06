package com.mafei.stacksaga.common.comiunication;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.mafei.stacksaga.common.enums.RedisEvents;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
public class RedisEntity implements Serializable {
    private RedisEvents event;
    private String for_server_group;
    private String response_topic;
    private String instance_id;
    private String request_key = "NONE";
    private Object body;
    private String response_status;


    public RedisEntity() {
    }

    public RedisEntity(RedisEvents event) {
        this.event = event;
    }

    public RedisEntity(RedisEvents event, Object body) {
        this.event = event;
        this.body = body;
    }


}
