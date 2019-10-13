package app.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author faith.huan 2019-10-13 9:42
 */
@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {

    @RequestMapping("/test1")
    public String index(){
        return "test1";
    }

    @RequestMapping("/test2")
    public String test2(){
        return "test2";
    }

    @RequestMapping("/test3")
    public String test3(HttpServletRequest request){

        WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(request.getSession().getServletContext());
        System.out.println("test3 called");
        log.info("");
        return "test3";
    }

}
