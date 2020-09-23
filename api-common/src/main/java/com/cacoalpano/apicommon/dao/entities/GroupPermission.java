package com.cacoalpano.apicommon.dao.entities;

import com.cacoalpano.apicommon.dao.entities.audit.Audit;
import com.cacoalpano.apicommon.dao.entities.audit.AuditListener;
import com.cacoalpano.apicommon.dao.entities.audit.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "group_permissions")
@EntityListeners(AuditListener.class)
public class GroupPermission implements Auditable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "group_id")
    private Integer groupId;
    @Column(name = "permission_id")
    private Integer permissionId;
    @Embedded
    private Audit audit;
}
