package com.cacoalpano.apicommon.dao.entities.audit;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.sql.Timestamp;

@Getter
@Setter
public class Audit {
    @Column(name = "del_flag")
    private Boolean delFlag;
    @Column(name = "time_created")
    private Timestamp timeCreated;
    @Column(name = "time_updated")
    private Timestamp timeUpdated;
    @Column(name = "user_created")
    private Long userCreated;
    @Column(name = "user_updated")
    private Long userUpdated;


}
