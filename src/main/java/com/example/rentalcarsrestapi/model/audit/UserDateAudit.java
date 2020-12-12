package com.example.rentalcarsrestapi.model.audit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
//@JsonIgnoreProperties(value = {"creatorUser", "lastModifierUser"})
public abstract class UserDateAudit extends DateAudit{

    @CreatedBy
    private String creatorUser;

    @LastModifiedBy
    private String lastModifierUser;

    public String getCreatorUser() {
        return creatorUser;
    }

    public void setCreatorUser(String creatorUser) {
        this.creatorUser = creatorUser;
    }

    public String getLastModifierUser() {
        return lastModifierUser;
    }

    public void setLastModifierUser(String lastModifierUser) {
        this.lastModifierUser = lastModifierUser;
    }
}
