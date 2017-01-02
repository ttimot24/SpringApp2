package springapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String index(ModelMap model) {
        
     List<Branch> all = branchDao.getAll();

     model.addAttribute("list",all);
     
     all.get(0).getBranchCode();

     return "branches";
    }
    
    @RequestMapping("/view")
    public String view(int id) {
        
        ModelMap model = new ModelMap();
        
         model.addAttribute("message", branchDao.getById(id).toString());

     return "branches";
    }
    
        
  @Autowired
  private BranchHBDao branchDao;
}
