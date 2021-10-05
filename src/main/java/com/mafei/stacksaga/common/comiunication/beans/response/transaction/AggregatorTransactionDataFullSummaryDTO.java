package com.mafei.stacksaga.common.comiunication.beans.response.transaction;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AggregatorTransactionDataFullSummaryDTO extends AggregatorTransactionDataDTO implements Serializable {
    private List<AggregatorTransactionStateDTO> states;
}
