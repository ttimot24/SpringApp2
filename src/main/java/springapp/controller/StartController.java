package springapp.controller;


import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {
    
    @Transactional
    @RequestMapping({"/","/index"})
    public String index(Map<String, Object> model) {
        
        model.put("message", "Hellllloooooooo");
        //model.addAttribute("message", "Hellllloooooooo");
         
      return "index";
    }
    
    @RequestMapping("/shutdown")
    public void shutdown() {
        System.exit(0);
    }
    
   /* @RequestMapping
    public String _404() {     
        return "404 - Not found";
    }*/
 
  
}
