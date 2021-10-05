package com.mafei.stacksaga.common.comiunication;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.mafei.stacksaga.common.enums.WSEvent;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
public class SWEntity implements Serializable {
    private WSEvent event;
    private String response_topic;
    private String request_token = "NONE";
    private Object body;
}
