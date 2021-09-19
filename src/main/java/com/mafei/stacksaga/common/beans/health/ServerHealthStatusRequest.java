package com.mafei.stacksaga.common.beans.health;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ServerHealthStatusRequest implements Serializable {
    private String server_topic;
}
