package com.learn.scope.beanscope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class ClassA{}


@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
class ClassB{}

@ComponentScan
public class BeanscopeApplication {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanscopeApplication.class);
		
		System.out.println("Class A : "+ctx.getBean(ClassA.class));
		System.out.println("Class A : "+ctx.getBean(ClassA.class));
		System.out.println("Class A : "+ctx.getBean(ClassA.class));
		System.out.println("Class A : "+ctx.getBean(ClassA.class));
		System.out.println("Class A : "+ctx.getBean(ClassA.class));
		
		System.out.println("Class B : "+ctx.getBean(ClassB.class));
		System.out.println("Class B : "+ctx.getBean(ClassB.class));
		System.out.println("Class B : "+ctx.getBean(ClassB.class));
		System.out.println("Class B : "+ctx.getBean(ClassB.class));
		System.out.println("Class B : "+ctx.getBean(ClassB.class));
		
		
		
	}

}
