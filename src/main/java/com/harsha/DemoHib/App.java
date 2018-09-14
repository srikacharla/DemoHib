package com.harsha.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		Alien harsha = new Alien();
    		harsha.setAid(101);
    		harsha.setColour("Black");
    		harsha.setAname("sri");
    		
    		Configuration con = new Configuration();
    		
    		SessionFactory sf = con.buildSessionFactory();
    		
    		Session session = sf.openSession();
    		session.save(harsha);
    }
}
