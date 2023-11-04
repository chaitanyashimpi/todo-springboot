package com.cratonik.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	@RequestMapping("say-hello")
	@ResponseBody
	public String SayHello() {
		return "Hello! What are you learning today?";
	}

	@RequestMapping("say-html")
	@ResponseBody
	public String SayHtml() {

		StringBuffer sb = new StringBuffer();

		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My First HTML Page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append(" <h1>This is my first HTML Page</h1>");
		sb.append("</body>");
		sb.append("</html>");

		return sb.toString();
	}

	@RequestMapping("say-jsp")
	public String SayJSP() {
		return "sayHello";
	}
}
