package com.mafei.stacksaga.common.comiunication.beans.request.transaction;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetTransactionRequest implements Serializable {
    private String instance_id;
    private String service_group;
    private String tx_status;
    private String from;
    private String to;
}
