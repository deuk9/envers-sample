package com.example.enverssample.config;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import java.time.LocalDateTime;

@Entity
@RevisionEntity
public class HistoryEntity {

    @Id
    @RevisionNumber
    @GeneratedValue
    private Long rev;

    @RevisionTimestamp
    private LocalDateTime eventTime;
}
