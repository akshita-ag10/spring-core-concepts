package com.springcore.n12javaconfig;
//this java config file replaced xml config file
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration  														//this annotation tells that this the config file
@ComponentScan(basePackages = "com.springcore.n12javaconfig")			//no need to use @ComponentScan if you are using @Bean and not @Component
class ConfigJavaClass {
	
	@Bean
	public Samosa gettingSamosa() {
		return new Samosa();
	}
	
	@Bean(name= {"helloStu", "temp", "s1"}) 							//can be accessed in context.getBean() by any of these names provided
	//@Bean("helloStu")													//if specific name is not provided to the bean, it will use method name in camelCase(i.e. getOurStudent here) to getBean()
	public Student getOurStudent() {
		Student stu = new Student(gettingSamosa()); //SAMOSA DEPENDANCY INJECTION USING @Bean ANNOTATION
		return stu;
	}
}




//instead of using @Component on bean class and @ComponentScan on Config class
//you can also make a method to get the bean, this mehtod should return bean class object
	

//@Bean annotation on a method says, ok, the obj returned from this method will be taken 
//by IOC container as a bean


//Hence 4 ways of dependancy injection=
//1. autowire in xml
//2. ref in xml
//3. @Autowired in java annotation
//4. @Bean


//Two Ways of Configuration
//1. Xml Config file
//2. Java Config file ((a)ComponentScan or (b) Bean)
