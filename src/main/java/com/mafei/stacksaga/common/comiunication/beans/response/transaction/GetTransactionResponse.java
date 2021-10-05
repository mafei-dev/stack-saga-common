package com.mafei.stacksaga.common.comiunication.beans.response.transaction;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetTransactionResponse implements Serializable {
    private String request_token;
    /**
     * if success or not
     */
    private String status;
    private List<AggregatorTransactionDataDTO> transactionDataList;
}
