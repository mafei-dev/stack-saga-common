package com.mafei.stacksaga.common.comiunication.beans.response.transaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExecutorDataDTO implements Serializable {
    private String executor_uid;
    private String executor_class;
    private String related_service;
    private String executor_type;
    private Integer order;
}
