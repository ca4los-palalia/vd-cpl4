package com.cplsys.aisa.launcher;

import javax.swing.SwingUtilities;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

@Repository
public class AISALauncher {

	public static void main(String[] args) {
		ConfigurableApplicationContext beans = null;
		String[] contextPaths = new String[] { "spring/applicationContext.xml" };
		beans = new ClassPathXmlApplicationContext(contextPaths);
		Runnable application = beans.getBean(AISA.class);
		try {
			SwingUtilities.invokeAndWait(application);
			System.out.println("AISA.run()");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
