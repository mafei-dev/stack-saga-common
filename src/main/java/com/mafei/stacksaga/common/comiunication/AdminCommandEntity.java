package com.mafei.stacksaga.common.comiunication;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.mafei.stacksaga.common.resources.StaticData;
import lombok.*;

import java.io.Serializable;
import java.util.Map;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
@NoArgsConstructor
public class AdminCommandEntity implements Serializable {
    private StaticData.AdminCommands command;
    private Map<String, Object> commandsDetails;
}
