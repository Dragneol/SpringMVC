/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Name;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import services.HelloService;

/**
 *
 * @author DuongPTHSE62871
 */
public class HelloController extends SimpleFormController {

    private HelloService helloService;

    public HelloService getHelloService() {
        return helloService;
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public HelloController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(Name.class);
        setCommandName("name");
        setSuccessView("helloView");
        setFormView("nameView");
    }

//    @Override
//    protected void doSubmitAction(Object command) throws Exception {
//        throw new UnsupportedOperationException("Not yet implemented");
//    }
    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request,
            HttpServletResponse response,
            Object command,
            BindException errors) throws Exception {

        ModelAndView mv = new ModelAndView(getSuccessView());
        Name name = (Name) command;
        mv.addObject("helloMessage", helloService.sayHello(name.getValue()));
        return mv;
    }

}
