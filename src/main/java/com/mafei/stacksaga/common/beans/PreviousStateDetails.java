package com.mafei.stacksaga.common.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PreviousStateDetails {
    private Date start_time;
    private Date end_time;
    // if the previous tx is success or not
    private Integer is_success;

}
