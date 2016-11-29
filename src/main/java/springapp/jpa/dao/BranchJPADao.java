/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springapp.jpa.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import springapp.entity.Branch;

/**
 * This class is used to access data for the User entity.
 * Repository annotation allows the component scanning support to find and 
 * configure the DAO wihtout any XML configuration and also provide the Spring 
 * exceptiom translation.
 * Since we've setup setPackagesToScan and transaction manager on
 * DatabaseConfig, any bean method annotated with Transactional will cause
 * Spring to magically call begin() and commit() at the start/end of the
 * method. If exception occurs it will also call rollback().
 */
@Repository
@Transactional
public class BranchJPADao {
  
  /**
   * Save the user in the database.
   */
  public void create(Branch branch) {
    entityManager.persist(branch);
    return;
  }
  
  /**
   * Delete the user from the database.
   */
  public void delete(Branch branch) {
    if (entityManager.contains(branch))
      entityManager.remove(branch);
    else
      entityManager.remove(entityManager.merge(branch));
    return;
  }
  
  /**
   * Return all the users stored in the database.
   */
  @SuppressWarnings("unchecked")
  public List getAll() {
    return entityManager.createQuery("FROM sttm_branch").getResultList();
  }
  
  /**
   * Return the user having the passed id.
   */
  public Branch getById(long id) {
    return entityManager.find(Branch.class, id);
  }

  /**
   * Update the passed user in the database.
   */
  public void update(Branch user) {
    entityManager.merge(user);
    return;
  }

  // Private fields
  
  // An EntityManager will be automatically injected from entityManagerFactory
  // setup on DatabaseConfig class.
  @PersistenceContext
  private EntityManager entityManager;
  
}