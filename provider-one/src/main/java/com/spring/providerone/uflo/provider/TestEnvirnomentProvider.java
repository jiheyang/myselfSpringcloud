package com.spring.providerone.uflo.provider;

import org.hibernate.SessionFactory;
import org.springframework.transaction.PlatformTransactionManager;
import com.bstek.uflo.env.EnvironmentProvider;

public class TestEnvirnomentProvider implements EnvironmentProvider {
    private SessionFactory sessionFactory;
    private PlatformTransactionManager platformTransactionManager;


    @Override
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void setPlatformTransactionManager(PlatformTransactionManager platformTransactionManager) {
        this.platformTransactionManager = platformTransactionManager;
    }

    @Override
    public PlatformTransactionManager getPlatformTransactionManager() {
        return platformTransactionManager;
    }

    @Override
    public String getLoginUser() {
        return null;
    }

    @Override
    public String getCategoryId() {
        return "anonymous";
    }
}
