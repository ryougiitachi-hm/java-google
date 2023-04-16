package per.itachi.java.google.guice.app.service.impl;

import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import per.itachi.java.google.guice.app.service.UserService;

public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    /**
     * By default, guice won't perform method annotated by PostConstruct.
     * */
    @PostConstruct
    public void init() {
        LOGGER.info("UserServiceImpl has initialized. ");
    }

    @Override
    public void addUser(String username) {
        LOGGER.info("The user {} is added", username);
    }

}
