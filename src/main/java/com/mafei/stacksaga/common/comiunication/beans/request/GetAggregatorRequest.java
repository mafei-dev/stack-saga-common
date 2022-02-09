package com.mafei.stacksaga.common.comiunication.beans.request;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetAggregatorRequest implements Serializable {
    private Integer limit;
    private Integer page;
    private String namePrefix;
    private String sortDeclaration;
    private String sortBy;
}
