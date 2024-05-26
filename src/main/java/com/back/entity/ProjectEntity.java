package com.back.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity(name = "PROJECT")
@Data
@Builder
@AllArgsConstructor
public class ProjectEntity {
    @Id
    private int projectId;
    @Column
    private String projectNm;
    @Column
    private String projectDesc;
    public ProjectEntity() {};
}
