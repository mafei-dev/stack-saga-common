package com.mafei.stacksaga.common.comiunication.beans.response.transaction;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TXExecutionLogDTO {
    private String tx_execution_log_uid;
    private String datetime;
    private String start_datetime;
    private String end_datetime;
    private Integer is_success;
    private LogTypes log_type;

    //from tx_state
    private String tx_state_uid;
    private Integer order;
    private String action;
    private byte[] tx_state;

    //from ExecutorEntity
    private String executor_uid;
    private String executor_class;
    private String related_service;
    private String executor_type;


    public enum LogTypes {
        PROCESS,
        PROCESS_REVERT
    }
}
