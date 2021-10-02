package com.mafei.stacksaga.common.comiunication.beans.response.transaction;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDataDTO implements Serializable {
    private String txId;
}
