package com.example.enverssample.config;

import lombok.NoArgsConstructor;
import org.hibernate.envers.RevisionListener;

@NoArgsConstructor
public class CustomRevisionListener implements RevisionListener {

    @Override
    public void newRevision(Object revisionEntity) {
        if (revisionEntity instanceof HistoryEntity historyEntity) {
        }
    }
}
