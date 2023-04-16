package per.itachi.java.google.guice.app.service.config;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import per.itachi.java.google.guice.app.service.UserService;
import per.itachi.java.google.guice.app.service.impl.UserServiceImpl;

public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
//        super.configure(); // no need because it is empty method.
        bind(UserService.class).to(UserServiceImpl.class).in(Scopes.SINGLETON);
//        bind(Object.class); // for concrete class instead of interface.
    }
}
