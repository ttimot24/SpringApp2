/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springapp.hibernate.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import springapp.entity.Branch;

/**
 *
 * @author tarjanit
 */
@Repository
@Transactional
public class BranchHBDao {
  
  @Autowired
  private SessionFactory _sessionFactory;
  
  private Session getSession() {
    return _sessionFactory.getCurrentSession();
  }

  public void save(Branch branch) {
    getSession().save(branch);
  }
  
  public void delete(Branch branch) {
    getSession().delete(branch);
  }
  
  @SuppressWarnings("unchecked")
  public List getAll() {
    return getSession().createQuery("FROM sttm_branch").list();
  }


  public Branch getById(long id) {
    return (Branch) getSession().load(Branch.class, id);
  }

  public void update(Branch branch) {
    getSession().update(branch);
  }
 

}