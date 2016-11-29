package springapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import springapp.entity.Branch;
import springapp.hibernate.dao.BranchHBDao;
import springapp.jpa.dao.BranchJPADao;

@RestController
public class StartController {
    
    @RequestMapping({"/","/index"})
    public ModelAndView index() {

     ModelAndView mav = new ModelAndView();

     mav.setViewName("index");
     String str = "Hello World!";

     mav.addObject("message", str);

     return mav;
    }
    
    @RequestMapping("/shutdown")
    public void shutdown() {
        System.exit(0);
    }
    
   /* @RequestMapping
    public String _404() {     
        return "404 - Not found";
    }*/
  
    
  @Autowired
  private BranchHBDao branchDao;  
  
  
}
