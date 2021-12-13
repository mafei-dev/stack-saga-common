package com.mafei.stacksaga.common.comiunication.beans.response.transaction;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AggregatorTransactionDataFullSummaryDTO implements Serializable {

    private String aggregator_tx_uid;
    private String start_date_time;
    private String final_tx_status;
    private String final_action_date_time;
    private String aggregator_uid;
    private String aggregator_class;
    private String primary_service_group_name;
    private String primary_service_group_uid;
    private String primary_service_uid;
    private String primary_service_name;
    private List<ExecutorDataDTO> executorList;
    private List<AggregatorTransactionStateDTO> states;
    private List<TXExecutionLogDTO> logs;

}
