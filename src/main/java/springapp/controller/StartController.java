package springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {
    
    @Transactional
    @RequestMapping({"/","/index"})
    public String index(ModelMap model) {
        
        model.put("message", "This is a start up message!");
        model.put("os",System.getProperty("os.name"));
         
      return "index";
    }
    
    @RequestMapping("/shutdown")
    public void shutdown() {
        System.exit(0);
    }
     
  
}
