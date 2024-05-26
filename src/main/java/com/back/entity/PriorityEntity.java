package com.back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity(name = "PRIORITY")
@Data
@Builder
@AllArgsConstructor
public class PriorityEntity {
    @Id
    private int priorityId;
    private String priorityNm; // 우선순위 명
    private int level; // 레벨
    public PriorityEntity() {};
}
