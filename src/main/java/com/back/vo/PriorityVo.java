package com.back.vo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PriorityVo {
    private String priorityNm;
    private int level;
}
