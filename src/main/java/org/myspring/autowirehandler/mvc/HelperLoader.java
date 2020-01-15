package org.myspring.autowirehandler.mvc;

import org.myspring.autowirehandler.ioc.BeanHelper;
import org.myspring.autowirehandler.ioc.ClassHelper;
import org.myspring.autowirehandler.ioc.ClassUtil;
import org.myspring.autowirehandler.ioc.IocHelper;

public class HelperLoader {
    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }
}
