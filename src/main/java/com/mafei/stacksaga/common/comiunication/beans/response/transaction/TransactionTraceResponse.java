package com.mafei.stacksaga.common.comiunication.beans.response.transaction;

import com.mafei.stacksaga.common.enums.ExecutorType;
import com.mafei.stacksaga.common.enums.TXStateAction;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionTraceResponse implements Serializable {
    private String aggregator_tx_uid;
    private String current_tx_status;
    private String aggregator_uid;
    private String aggregator_class;
    private String primary_service_uid;
    private String primary_service_name;
    private String primary_service_group_uid;
    private String primary_service_group_name;
    private Date init_datetime;
    private Date start_datetime;
    private Date last_action_datetime;
    private Integer has_revert;
    private Integer has_revert_error;
    private Integer is_accessing;
    private TreeMap<Integer,TransactionState> transactionStates;


    @Data
    @ToString
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TransactionState {
        private String tx_state_uid;
        private Date init_datetime;
        private Integer order;
        private TXStateAction action;
        private Date e_start_datetime;
        private Date e_end_datetime;
        //ExecutorEntity
        private String executor_uid;
        private String executor_class;
        private String related_service;
        private ExecutorType executor_type;

        private String state_revert_detail_uid;
        private Date ss_state_revert_detail_init_datetime;
        private Integer is_success;
        private String tx_execution_log_uid;
        private Date ss_tx_execution_log_start_datetime;
        private Date ss_tx_execution_log_end_datetime;
        private Date ss_tx_execution_log_init_datetime;
        private Integer ss_tx_execution_log_is_success;
    }
}
