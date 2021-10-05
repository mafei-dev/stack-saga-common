package com.mafei.stacksaga.common.comiunication.beans.response.transaction;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AggregatorTransactionStateDTO implements Serializable {
    private String tx_state_uid;
    private byte[] tx_state;
    private String executor_uid;
    private String executor_class;

}
