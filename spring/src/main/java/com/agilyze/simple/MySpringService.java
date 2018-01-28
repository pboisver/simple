package com.agilyze.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Service;

/**
 * Send a greeting to system out on creation
 */
@Service
public class MySpringService {

    @Autowired  // This bean comes from the Spring Boot application lifecycle framework. Your IDE may not find it.
    ApplicationArguments args;

    public MySpringService() {
        System.out.println("Hello from MyService!");

    }

    public void sayHi() {

        for (String buddy : args.getNonOptionArgs()) {
            final String greeting = String.format("Hey there, %s", buddy);

            System.out.println(greeting);

        }

    }

}
