package com.skm.user.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.ServiceRegistryAwareService;

public class HibernateUtil {
	
	private final static SessionFactory FACTORY = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		return factory;
	}

	public static SessionFactory getSessionFactory() {
		return FACTORY;
	}

	public static Session openSession() {
		return FACTORY.openSession();
	}

	public static void close(Session session) {
		if(session != null)	session.close();
	}

}
