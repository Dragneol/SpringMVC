/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dtos.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author DuongPTHSE62871
 */
@Controller
public class LoginController {

    @RequestMapping(value = "login")
    public ModelAndView showLogin() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("loginForm", new UserDTO());
        return mav;
    }
    
//    @RequestMapping(value = "login")
//    public String hello(Model model) {
//        model.addAttribute("greeting", "Hello Spring MVC");
//        return "helloworld";
//    }

//    @Override
//    protected ModelAndView handleRequestInternal(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
