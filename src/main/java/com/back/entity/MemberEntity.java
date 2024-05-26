package com.back.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity(name = "MEMBER")
@Data
@Builder
@AllArgsConstructor
public class MemberEntity {
    @Id
    private int memberId;
    @Column
    private String userId; // 아이디
    @Column
    private String userNm; // 사용자명
    @Column
    private String userPwd; // 비밀번호
    @Column
    private String userChkPwd; // 비밀번호 확인
    @Column
    private String userRoles; // 사요자 권한(역할)
    @Column
    private String nickNm; // 닉네임
    @Column
    private String email; // 이메일
    @Column
    private int projectId; // 프로젝트 아이디(외래키)

    public MemberEntity() {};
}
