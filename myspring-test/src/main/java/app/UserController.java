package app;

import org.myspring.autowirehandler.ioc.Autowired;
import org.myspring.autowirehandler.ioc.Controller;
import org.myspring.autowirehandler.ioc.RequestMapping;
import org.myspring.autowirehandler.ioc.RequestMethod;
import org.myspring.autowirehandler.mvc.View;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //用户列表
    @RequestMapping(value = "/userList",method = RequestMethod.GET)
    public View getUserList(){
        List<User> userList = userService.getAllUser();
        return new View("index.jsp").addModel("userList",userList);
    }
}
