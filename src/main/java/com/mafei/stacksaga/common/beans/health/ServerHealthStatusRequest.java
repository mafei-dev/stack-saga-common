package com.mafei.stacksaga.common.beans.health;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
public class ServerHealthStatusRequest implements Serializable {
    private String server_health_for;
    private String server_topic;
}
