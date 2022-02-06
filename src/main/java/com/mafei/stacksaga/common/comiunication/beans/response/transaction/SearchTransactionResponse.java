package com.mafei.stacksaga.common.comiunication.beans.response.transaction;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchTransactionResponse implements Serializable {
    private String aggregator_tx_uid;
    private String current_tx_status;
    private String aggregator_uid;
    private String aggregator_class;
    private String primary_service_uid;
    private String primary_service_name;
    private String primary_service_group_uid;
    private String primary_service_group_name;
}
