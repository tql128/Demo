package cn.tedu.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//�������ಢ��Ҫ��ʵ��Controller�ӿڣ�
//���������д�������ķ����������ǿ��Ը��������������� û��ͳһ�ı�׼
@Controller
public class UserController {
	//ʹ��@RequestMappingע������������·���봦������ķ�����Ӧ��ϵ
  @RequestMapping("reg.do")
	public String showReg(){
		return "reg";
	}
}
