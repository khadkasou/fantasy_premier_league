package com.swifttech.fantasy.generic;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;

@Getter
@Setter
@MappedSuperclass
@RequiredArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity<PK extends Serializable> {
    @Column(updatable = false, nullable = false)
    @GeneratedValue
    @Id
    PK id;

    @Version
    private int version;
}
