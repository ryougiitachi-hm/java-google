package per.itachi.java.google.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Scope;
import com.google.inject.Scopes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import per.itachi.java.google.guice.app.service.UserService;
import per.itachi.java.google.guice.app.service.config.ServiceModule;
import per.itachi.java.google.guice.app.service.impl.UserServiceImpl;

public class GuiceApp {

    public static void main(String[] args) {
//        Injector injector = Guice.createInjector(binder -> {
//            binder.bind(UserService.class).to(UserServiceImpl.class).in(Scopes.SINGLETON);
//        });
        Collection<Module> moduleList = new ArrayList<>();
        moduleList.add(new ServiceModule());
        Injector injector = Guice.createInjector(moduleList);
        UserService userService = injector.getInstance(UserService.class);
        userService.addUser("i");
    }
}
