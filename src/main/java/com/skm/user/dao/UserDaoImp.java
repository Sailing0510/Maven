package com.skm.user.dao;

import org.hibernate.Session;

import com.skm.user.model.User;
import com.skm.user.util.HibernateUtil;

public class UserDaoImp implements UserDao {

	public void add(User user) {
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.close(session);
		}
	}

	public User loadByUser(String userName) {
		User user = null;
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			user = (User) session
					.createQuery(
							"from t_permission_user_info where user_name=?")
					.setParameter(0, userName).uniqueResult();
		} finally {
			HibernateUtil.close(session);
		}
		return user;
	}

}
