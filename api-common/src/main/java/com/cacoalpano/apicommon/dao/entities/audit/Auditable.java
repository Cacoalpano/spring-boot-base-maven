package com.cacoalpano.apicommon.dao.entities.audit;

public interface Auditable {
    Audit getAudit();
    void setAudit(Audit audit);
}
