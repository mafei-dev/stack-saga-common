package com.mafei.stacksaga.common.beans.health;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
public class InstanceDetail implements Serializable {
    private String instance_id;
    private String instance_name;
    private String service_name;
    private String last_updated_datetime;
    private String status;
    private String lats_server_up_datetime;
    // TODO: 9/18/2021 add config data each server from property file

}
