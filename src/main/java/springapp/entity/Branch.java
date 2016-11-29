/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.springframework.transaction.annotation.Transactional;




/**
 *
 * @author tarjanit
 */
@Entity
@Table(name = "sttm_branch")
@Transactional
public class Branch {

  // The entity fields (private)  
  
  @Id
  private int branch_code;
  
  @NotNull
  private String branch_name;

  
    public Branch() {
    }
  
     public Branch(int branch_code, String branch_name) {
        this.branch_code = branch_code;
        this.branch_name = branch_name;
    }

    public long getBranchCode() {
        return branch_code;
    }

    public void setBranchCode(int branch_code) {
        this.branch_code = branch_code;
    }

    public String getBranchName() {
        return branch_name;
    }

    public void setBranchName(String branch_name) {
        this.branch_name = branch_name;
    }

    @Override
    public String toString() {
        return "Branch{" + "branch_code=" + branch_code + ", branch_name=" + branch_name + '}';
    }

  
  
  
  
}