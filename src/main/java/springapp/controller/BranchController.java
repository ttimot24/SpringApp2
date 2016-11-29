/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import springapp.entity.Branch;
import springapp.hibernate.dao.BranchHBDao;

/**
 *
 * @author tarjanit
 */
@Controller
@RequestMapping("/branch")
@Transactional
public class BranchController {
    
    @RequestMapping({"","/"})
    public String index() {
        
     List<Branch> all = branchDao.getAll();
     
     for(Branch each : all){
         System.out.println(all);
     }

     return "asdasd";
    }
    
    @RequestMapping("/view")
    public String view(int id) {
        
        ModelMap model = new ModelMap();
        
         model.addAttribute("branch", branchDao.getById(id));

     return "index";
    }
    
        
  @Autowired
  private BranchHBDao branchDao;  
}
