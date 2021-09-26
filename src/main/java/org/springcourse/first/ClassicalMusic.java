package org.springcourse.first;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("classicalMusic")
@Scope("singleton")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Rapsodia";
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Do my initialization ......" + this.getClass());
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroy alll" + getClass());
    }
}
