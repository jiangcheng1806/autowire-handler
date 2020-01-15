package org.myspring.autowirehandler.aop;

import org.myspring.autowirehandler.ioc.BeanHelper;
import org.myspring.autowirehandler.ioc.ClassHelper;
import org.myspring.autowirehandler.ioc.ClassUtil;
import org.myspring.autowirehandler.ioc.IocHelper;
import org.myspring.autowirehandler.mvc.ControllerHelper;

public final class HelperLoader {
    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                AopHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }
}