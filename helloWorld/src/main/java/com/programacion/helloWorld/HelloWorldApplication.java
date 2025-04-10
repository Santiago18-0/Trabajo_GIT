package com.programacion.helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldApplication {

	public static void main(String[] args) {

		var contexto = new AnnotationConfigApplicationContext(ConfigurationAplication.class);
		SaludarBean saludar = contexto.getBean(SaludarBean.class);
		saludar.helloWorld();

		contexto.close();

	}

}
