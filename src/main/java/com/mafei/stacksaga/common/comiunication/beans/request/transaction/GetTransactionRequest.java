package com.mafei.stacksaga.common.comiunication.beans.request.transaction;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetTransactionRequest implements Serializable {
    private String request_token;
    private String response_topic;
    private String service_group;
    private String from;
    private String to;
    private Boolean for_all_date;
}
