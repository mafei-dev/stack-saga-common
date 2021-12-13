package com.mafei.stacksaga.common.comiunication.beans.response.transaction;

import lombok.*;

import java.io.Serializable;
import java.sql.Date;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AggregatorTransactionStateDTO implements Serializable {
    private String tx_state_uid;
    private byte[] tx_state;
    private Integer order;
    private String action;
    private String e_start_datetime;
    private String e_end_datetime;
    private String executor_uid;
    private String executor_class;
    private String related_service;
    private String executor_type;
}
