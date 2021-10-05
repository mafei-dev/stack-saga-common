package com.mafei.stacksaga.common.comiunication.beans.response.transaction;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AggregatorTransactionDataDTO implements Serializable {
    private String aggregator_tx_uid;
    private String start_date_time;
    private String final_tx_status;
    private String final_action_date_time;
    private String aggregator_uid;
    private String aggregator_class;
    private String primary_service_uid;
    private String primary_service_name;
    private String primary_service_group_uid;
    private String primary_service_group_name;

}
