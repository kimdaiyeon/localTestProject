package jpa;

import lombok.Getter;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
public abstract class BaseEntityWithUser {
    @Column(name="REG_USER", nullable = false, updatable = false)
    protected String regUser;

    @Column(name="MOD_USER", nullable = false)
    protected String modUser;

    public void changeDataUser(String modUser) {
        this.modUser = modUser;
    }
}
