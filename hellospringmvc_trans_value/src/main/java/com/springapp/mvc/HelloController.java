package com.springapp.mvc;

import org.iridium.hello.entity.Cup;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/hello/world")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "hello";
    }

    /**
     * 传递单个参数，接受前端传来的名为 hello 的参数，并打印到后台
     *
     * @param hello
     * @return
     */
    @RequestMapping(value = "/1", method = {RequestMethod.POST})
    public String helloWorld1(String hello) {
        System.out.println(hello);
        return "hello";
    }

    /**
     * 传递单个参数，接受前端传来的名为 hello 的参数，并打印到后台
     *
     * @param request
     * @return
     */
    @RequestMapping("/2")
    public String helloWorld2(HttpServletRequest request) {
        String result = request.getParameter("hello");
        System.out.println(result);
        return "hello";
    }

    /**
     * 传递一个 POJO，从前端的 form 里传来的只是一个个 cup 对象的属性值。属性名和 Cup 的属性名一致。
     *
     * @param cup
     * @return
     */
    @RequestMapping("/3")
    public String helloworld3(Cup cup) {
        System.out.println(cup.getColor());
        System.out.println(cup.getWeight());
        return "hello3";
    }

    /**
     * 传递多个值，从前端的 form 里传来的值的属性名和本函数的入口参数函数名一致。
     *
     * @param color
     * @param weight
     * @return
     */
    @RequestMapping("/4")
    public String helloworld3(String color, Integer weight) {
        System.out.println(color);
        System.out.println(weight);
        return "hello3";
    }

    /**
     * 后台封装一个 model，传给前端用 el 表示就可以了。
     *
     * @return
     */
    @RequestMapping("/5")
    public ModelAndView helloworld5() {
        Cup cup = new Cup();
        cup.setColor("red");
        cup.setWeight(123);

        Map<String, Cup> cupMap = new HashMap();
        cupMap.put("c", cup);
        return new ModelAndView("hello5", cupMap);
    }

    /**
     * 上面方法/5的另一种表达方式
     * @param cupMap
     * @return
     */
    @RequestMapping("/6")
    public ModelAndView helloworld6(Map cupMap) {
        Cup cup = new Cup();
        cup.setColor("red");
        cup.setWeight(123);

        cupMap.put("c", cup);
        return new ModelAndView("hello5", cupMap);
    }

    /**
     * 还是上面方法/5的另一种表达方式
     * @param cupMap
     * @return
     */
    @RequestMapping("/7")
    public String helloworld7(Map cupMap){
        Cup cup = new Cup();
        cup.setColor("red");
        cup.setWeight(123);

        cupMap.put("c", cup);
        return "hello5";
    }
}