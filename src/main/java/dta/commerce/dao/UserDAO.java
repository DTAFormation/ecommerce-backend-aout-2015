package dta.commerce.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import dta.commerce.persistance.User;

public class UserDAO implements IUserDAO {
	
	@PersistenceContext(unitName="my_pu") private EntityManager em;
	
	/* (non-Javadoc)
	 * @see dta.commerce.dao.IUserDAO#addUser(dta.commerce.persistaUserdmin)
	 */
	@Override
	public void addUser(User user){
		em.persist(user);

	}

	/* (non-Javadoc)
	 * @see dta.commerce.dao.IUserDAO#deleteUser(int)
	 */
	@Override
	public void deleteUser(int idUser) {
		User u = getUser(idUser);
		u.setActif(false);
		em.merge(u);
	}

	/* (non-Javadoc)
	 * @see dta.commerce.dao.IUsernDAO#updateUser(dta.commerce.persistance.User)
	 */
	@Override
	public void updateUser(User User) {
		em.merge(User);
	}

	/* (non-Javadoc)
	 * @see dta.commerce.dao.IUserDAO#listerUser()
	 */
	@Override
	@Transactional
	public List<User> listerUser() {
		return em.createNamedQuery("User.findAll").getResultList();
	}
	
	@Override
	@Transactional
	public User getUser(Integer user) {
		String textQuery="Select u from User as u where u.id=:id";
		TypedQuery<User> query=em.createQuery(textQuery, User.class);
		query.setParameter("id",user);
		User myUser=query.getSingleResult();
		return myUser;
	}
	
	@Override
	@Transactional
	public User getInfosUser(String pLogin, String pMdp){
		String textQuery="Select u from User as u where u.login = :login and u.password = :mdp";
		TypedQuery<User> query=em.createQuery(textQuery, User.class);
		query.setParameter("login",pLogin);
		query.setParameter("mdp",pMdp);
		User user=query.getSingleResult();
		
		return user;
	}
	
	/**
	 * Getter & setters
	 */
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
}
