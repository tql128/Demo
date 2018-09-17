package cn.tedu.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//控制器类并不要求实现Controller接口！
//控制器类中处理请求的方法的声明是可以根据需求来决定的 没有统一的标准
@Controller
public class UserController {
	//使用@RequestMapping注解来设置请求路径与处理请求的方法对应关系
  @RequestMapping("reg.do")
	public String showReg(){
		return "reg";
	}
}
