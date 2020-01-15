package autowirehandler.framework.mvc;

import autowirehandler.framework.ioc.BeanHelper;
import autowirehandler.framework.ioc.ClassHelper;
import autowirehandler.framework.ioc.ClassUtil;
import autowirehandler.framework.ioc.IocHelper;

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
