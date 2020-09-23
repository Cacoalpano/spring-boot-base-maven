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
@Table(name ="group")
@EntityListeners(AuditListener.class)
public class Group implements Auditable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Embedded
    private Audit audit;
}
