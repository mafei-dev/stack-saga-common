package com.mafei.stacksaga.common.comiunication.beans.request.transaction;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchTransactionRequest implements Serializable {
    private String tx_id_prefix;
    private Integer max_size;
}
