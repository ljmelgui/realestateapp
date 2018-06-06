package com.ljmelgui.di_demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {


    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleBean Constructor");
    }

    //BeanNameAware setBeanName
    @Override
    public void setBeanName(String name) {
        System.out.println("## My Bean Name is: " + name);
    }

    //BeanFactoryAware setBeanFactory
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory has been set");
    }

    //ApplicationContextAware setApplicationContext
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context has been set");
    }

    //BeanPostProcessor call beforeInit
    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## The Post Construct annotated method has been called");
    }

    //InitializingBean afterPropertiesSet
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleBean has its properties set!");
    }

    //BeanPostProcessor call afterInit
    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }


    @PreDestroy
    public void preDestroy() {
        System.out.println("## The Predestroy annotated method has been called");
    }


    //DisposableBean destroy
    @Override
    public void destroy() throws Exception {
        System.out.println("## The Lifecycle bean has been terminated");

    }



}