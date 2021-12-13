package com.mafei.stacksaga.common.comiunication.beans.request.transaction;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetTransactionFullSummaryRequest implements Serializable {
    private String aggregator_tx_uid;
}
