package com.mafei.stacksaga.common.comiunication;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@RequiredArgsConstructor
public class RequestResponseEntity implements Serializable {
    private final String actionKey;
    private Entity entity;
}
