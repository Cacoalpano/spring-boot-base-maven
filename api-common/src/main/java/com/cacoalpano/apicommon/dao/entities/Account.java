package com.cacoalpano.apicommon.dao.entities;

import com.cacoalpano.apicommon.dao.entities.audit.Audit;
import com.cacoalpano.apicommon.dao.entities.audit.AuditListener;
import com.cacoalpano.apicommon.dao.entities.audit.Auditable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name ="accounts")
@EntityListeners(AuditListener.class)
@Getter
@Setter
public class Account implements Auditable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name ="is_active")
    private Boolean isActive;
    @Column(name = "group_id")
    private Integer groupId;

    @Embedded
    private Audit audit;

}
