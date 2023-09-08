package com.jaxb;

import com.jaxb.service.marshallService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    private final marshallService marshallServicel;

    public MyRunner(marshallService marshallServicel) {
        this.marshallServicel = marshallServicel;
    }

    @Override
    public void run(String... args) throws Exception {

        marshallServicel.jsonObject();

    }
}
