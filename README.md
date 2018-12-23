# javasnippets

https://github.com/claudiajs/example-projects#web-api
https://github.com/eugenp/tutorials



aws lambda create-function --function-name "hello1" --runtime "nodejs6.10" --role "arn:aws:iam::938210480070:role/lambda_basic_execution" --handler "app/index.handler" --zip-file "fileb://c:/Users/a289431/app.zip" --region "us-east-1"




Concepts
1.0	Javascript
Scope
Global and local. Any variable declared outside of a function belongs to the global scope, and is therefore accessible from anywhere in your code. 
Context 
Context is always the value of the this keyword which is a reference to the object that “owns” the currently executing code.apply, bind and call
Inherintance Prototyping
Todas las funciones tienen una propiedad especial llamada prototype	
Function declaration vs Function expresion
Its assigned to a variable
Promises
Just chain ajax calls calling then function
High order functions
A higher order function is a function that takes a function as an argument, or returns a function
React Lifecycle
Redux
Test / Mocha /Jasmine / Karma / jest
Callbackhell/Asyncawait/Superagent/axios/fetch/ iteratemap
MongoDB/Mongoose/ express
Auth0
Webpack/ grunt/bower
Jquery selectors yAPI
Clousure/Module Pattern
FlexBox/Saas
Flexbox - a form of styling often used in React applications that allows components and elements to expand based on portions of the screen. Allows dynamic resizing over hard-coding pixel sizes that may not fit on certain devices.
React
ReactJS does not update the Real DOM directly but it updates the Virtual DOM.This is why updating Real DOM is slow.
React Lifecycle
Yeoman http://yeoman.io/codelab/run-unit-tests.html
Hoisting
In JavaScript, variable and functions are hoisted. Basically, the JavaScript interpreter looks ahead to find all variable declarations and then hoists them to the top of the function where they're declared For example:

foo(); // Here foo is still undefined 
var foo = function foo(){ 
 	return 12; 
}; 


Behind the scene of the code above looks like this:
var foo = undefined;
    foo(); // Here foo is undefined 
 	   foo = function foo(){
 	      / Some code stuff
      }
3.0	Patterns and design
Creational
Singleton
	Abstract Factory
	Builder
Structural
Facade
	Decorator
Behavioral
Template method
Observer
Strategy
Algorithms
O(1), O(Logn), O(n), O(nLogn),O(n2),O(n!)
SOLID
S
SRP
Single responsibility principle 
O
OCP 
Open/closed principle
“software entities … should be open for extension, but closed for modification.”
L
LSP 
Liskov substitution principle
“objects should be replaceable with instances of their subtypes without altering the correctness of that program.”.
I
ISP 
Interface segregation principle
“many client-specific interfaces are better than one general-purpose interface.”
D
DIP 
Dependency inversion principle
one should “Depend upon Abstractions. Do not depend upon concretions.”
4.0	Java
Functional Interfaces
@FunctionalInterface
Lambda Expressions and Streams

Stream is a source of objects having functions in combination to lambda expresions Intermediate and terminal

Predicate Checks a condition and returns a boolean value as result In filter() method in java.util.stream.Stream which is used to remove elements in the stream that don’t match the given condition (i.e., predicate) as argument. 

Consumer Operation that takes an argument but returns nothing In forEach() method in collections and in java.util.stream.Stream; this method is used for traversing all the elements in the collection or stream. 

Function Functions that take an argument and return a result In map() method in java.util.stream.Stream to transform or operate on the passed value and return a result.

Supplier Operation that returns a value to the caller (the returned value could be same or different values) In generate() method in java.util.stream.Stream to create an infinite stream of elements.
Reduce
Stream operation reduce() combines a stream into a single object
Type of bound
Unbounded wildcard ? List l =new ArrayList(); 
Wildcard with an upper bound ? extends type List l =new ArrayList(); 
Wildcard with a lower bound ? super type List l =new ArrayList();

List<? extends Number> list = new ArrayList<Integer>(); The upper-bounded wildcard says that any class that extends Number or Number itself can be used as the formal parameter type:

With a lower bound, we are telling Java that the list will be a list of String objects or a list of some objects that are a superclass of String. Either way, it is safe to add a String to that list.
Memory management
Memory in Java is divided into Two principal regions, Stack and Heap, The references to objects are placed on the Stack and the Objects in The heap, also there is another called Metaspace,the sole reason for having a young generation in the first place is to optimize the performance of garbage collection (GC). -Xmx -Xms
Garbage collection
Is elegible, when an object cannot be reached to a reference,mark and sweep, generational java collection, if they live longer, its likely to live forever, the young generation, the old generation, and permgen will surveve forever, metadata for classes are placed into the permgen.-Xmx512m and -Xms150m
Strong  - makes the referenced object not eligible for GC. builder classes. eg StringBuilder Weak - is a reference which is eligible for GC.
Soft - is a kind of reference whose object is eligible for GC until memory is avaiable. Best for image cache. It will hold them till the memory is available.
Phantom - is a kind of reference whose object is directly eligible for GC.
5.0	Threads
Multithreading
A thread is a ligthweigth process, ExecutorService  is going to reuse the threads in the threadpool. it uses submit.
Threads are independent because they all have separate path of execution that’s the reason if an exception occurs in one thread, it doesn’t affect the execution of other threads. All threads of a process share the common memory. The process of executing multiple threads simultaneously is known as multithreading.
Thread pool
 A thread pool is a group of pre-instantiated reusable threads that are available to perform a set of arbitrary tasks. 
Volatile 
The Java programming language allows threads to access shared variables. As a rule, to ensure that shared variables are consistently and reliably updated, a thread should ensure that it has exclusive use of such variables by obtaining a lock that, conventionally, enforces mutual exclusion for those shared variables
Lock for an object
Actually, the lock is obtained for an object and not for a piece of code.The obtained lock is held until all the statements in that block complete execution. Semaphore and Mutex to limit the number of threads to access resources. Semaphores – Restrict the number of threads that can access a resource. Example, limit max 10 connections to access a file simultaneously. Mutex – Only one thread to access a resource at once. Example, when a client is accessing a file, no one else should have access the same file at the same time.
Race condition
Threads share memory, and they can concurrently modify data. A race condition occurs when two or more threads can access shared data and they try to change it at the same time.
Synchronized keyword
You can use it in two forms: synchronized blocks and synchronized methods, and avoid the problem called race conditions.
Atomicity
Atomic is the property of an operation to be carried out as a single unit of execution without any interference by another thread. An atomic operation is one that occurs without interference by another thread.Single thread does the write and read operations together (atomically). 
Futures and Calleable
submit() in ExecutorService returns a Future object that can be used to determine if the task is complete. You can use the isDone() method in the Future class to check if the task is complete and then use the get() method to fetch the task result.If the task is still executing when you call future.get(), this get() method will block until the task execution completes, it will wait until the value is done generating. 
Intrinsic Lock  
Enforcing exclusive access to an object's state.
The mechanism that Java uses to support synchronization is the monitor  mutual exclusion and cooperation.In Java, any Object can be used as a monitor, along with the synchronized keyword.
Memory leak
If overall memory utilization is increasing continuously despite garbage collection, there is a memory leak, which will inevitably lead to an out-of-memory error.
Parallel streams 
Split the elements into multiple chunks, process each chunk with different threads
ThreadLocal
The ThreadLocal class in Java enables you to create variables that can only be read and written by the same thread.
6.0	Spring
What is Loose Coupling?
What is a Dependency?
What is IOC (Inversion of Control)?
What is Dependency Injection?
Can you give few examples of Dependency Injection?
What is Auto Wiring?
What are the important roles of an IOC Container?
What are Bean Factory and Application Context?
Can you compare Bean Factory with Application Context?
How do you create an application context with Spring?
How does Spring know where to search for Components or Beans?
What is a Component Scan?
How do you define a component scan in XML and Java Configurations?
How is it done with Spring Boot?
What does @Component signify?
What does @Autowired signify?
What’s the difference Between @Controller, @Component, @Repository, and @Service Annotations in Spring?
What is the default scope of a bean?
Are Spring beans thread safe?
What are the other scopes available?
How is Spring’s singleton bean different from Gang of Four Singleton Pattern?
What are the different types of dependency injections?
What is setter injection?
What is constructor injection?
How do you choose between setter and constructor injections?
What are the different options available to create Application Contexts for Spring?
What is the difference between XML and Java Configurations for Spring?
How do you choose between XML and Java Configurations for Spring?
How does Spring do Autowiring?
What are the different kinds of matching used by Spring for Autowiring?
How do you debug problems with Spring Framework?
How do you solve NoUniqueBeanDefinitionException?
How do you solve NoSuchBeanDefinitionException?
What is @Primary?
What is @Qualifier?
What is CDI (Contexts and Dependency Injection)?
Does Spring Support CDI?
Would you recommed to use CDI or Spring Annotations?
What are the major features in different versions of Spring?
What are new features in Spring Framework 4.0?
What are new features in Spring Framework 5.0?
What are important Spring Modules?
What are important Spring Projects?
What is the simplest way of ensuring that we are using single version of all Spring related dependencies?
Name some of the design patterns used in Spring Framework?
What do you think about Spring Framework?
Why is Spring Popular?
Can you give a big picture of the Spring Framework?
Spring MVC
What is Model 1 architecture?
What is Model 2 architecture?
What is Model 2 Front Controller architecture?
Can you show an example controller method in Spring MVC?
Can you explain a simple flow in Spring MVC?
What is a ViewResolver?
What is Model?
What is ModelAndView?
What is a RequestMapping?
What is Dispatcher Servlet?
How do you set up Dispatcher Servlet?
What is a form backing object?
How is validation done using Spring MVC?
What is BindingResult?
How do you map validation results to your view?
What are Spring Form Tags?
What is a Path Variable?
What is a Model Attribute?
What is a Session Attribute?
What is a init binder?
How do you set default date format with Spring?
Why is Spring MVC so popular?
Spring Boot
What is Spring Boot?
What are the important Goals of Spring Boot?
What are the important Features of Spring Boot?
Compare Spring Boot vs Spring?
Compare Spring Boot vs Spring MVC?
What is the importance of @SpringBootApplication?
What is Auto Configuration?
How can we find more information about Auto Configuration?
What is an embedded server? Why is it important?
What is the default embedded server with Spring Boot?
What are the other embedded servers supported by Spring Boot?
What are Starter Projects?
Can you give examples of important starter projects?
What is Starter Parent?
What are the different things that are defined in Starter Parent?
How does Spring Boot enforce common dependency management for all its Starter projects?
What is Spring Initializr?
What is application.properties?
What are some of the important things that can customized in application.properties?
How do you externalize configuration using Spring Boot?
How can you add custom application properties using Spring Boot?
What is @ConfigurationProperties?
What is a profile?
How do you define beans for a specific profile?
How do you create application configuration for a specific profile?
How do you have different configuration for different environments?
What is Spring Boot Actuator?
How do you monitor web services using Spring Boot Actuator?
How do you find more information about your application envrionment using Spring Boot?
What is a CommandLineRunner?
Springboot developer tools
Database Connectivity - JDBC, Spring JDBC & JPA
What is Spring JDBC? How is different from JDBC?
What is a JdbcTemplate?
What is a RowMapper?
What is JPA?
What is Hibernate?
How do you define an entity in JPA?
What is an Entity Manager?
What is a Persistence Context?
How do you map relationships in JPA?
What are the different types of relationships in JPA?
How do you define One to One Mapping in JPA?
How do you define One to Many Mapping in JPA?
How do you define Many to Many Mapping in JPA?
How do you define a datasource in a Spring Context?
What is the use of persistence.xml
How do you configure Entity Manager Factory and Transaction Manager?
How do you define transaction management for Spring – Hibernate integration?
Spring Data
What is Spring Data?
What is the need for Spring Data?
What is Spring Data JPA?
What is a CrudRepository?
What is a PagingAndSortingRepository?
Unit Testing
How does Spring Framework Make Unit Testing Easy?
What is Mockito?
What is your favorite mocking framework?
How do you do mock data with Mockito?
What are the different mocking annotations that you worked with?
What is MockMvc?
What is @WebMvcTest?
What is @MockBean?
How do you write a unit test with MockMVC?
What is JSONAssert?
How do you write an integration test with Spring Boot?
What is @SpringBootTest?
What is @LocalServerPort?
What is TestRestTemplate?
AOP
What are cross cutting concerns?
How do you implement cross cutting concerns in a web application?
If you would want to log every request to a web application, what are the options you can think of?
If you would want to track performance of every request, what options can you think of?
What is an Aspect and Pointcut in AOP?
What are the different types of AOP advices?
What is weaving?
Compare Spring AOP vs AspectJ?
SOAP Web Services
What is a Web Service?
What is SOAP Web Service?
What is SOAP?
Waht is a SOAP Envelope?
What is SOAP Header and SOAP Body?
Can you give an example of SOAP Request and SOAP Response?
What is a SOAP Header? What kind of information is sent in a SOAP Header?
Can you give an example of a SOAP Header with Authentication information?
What is WSDL (Web Service Definition Language)?
What are the different parts of a WSDL?
What is Contract First Approach?
What is an XSD?
Can you give an example of an XSD?
What is JAXB?
How do you configure a JAXB Plugin?
What is an Endpoint?
Can you show an example endpoint written with Spring Web Services?
What is a MessageDispatcherServlet?
How do you configure a MessageDispatcherServlet?
How do you generate a WSDL using Spring Web Services?
How do you implement error handling for SOAP Web Services?
What is a SOAP Fault?
RESTful Web Services
What is REST?
What are the key concepts in designing RESTful API?
What are the Best Practices of RESTful Services?
Can you show the code for an example Get Resource method with Spring REST?
What happens when we return a bean from a Request Mapping Method?
What is GetMapping and what are the related methods available in Spring MVC?
Can you show the code for an example Post Resource method with Spring REST?
What is the appropriate HTTP Response Status for successful execution of a Resource Creation?
Why do we use ResponseEntity in a RESTful Service?
What is HATEOAS?
Can you give an Example Response for HATEOAS?
How do we implement it using Spring?
How do you document RESTful web services?
Can you give a brief idea about Swagger Documentation?
How do you automate generation of Swagger Documentation from RESTful Web Services?
How do you add custom information to Swagger Documentation generated from RESTful Web Services?
What is Swagger-UI?
What is "Representation" of a Resource?
What is Content Negotiation?
Which HTTP Header is used for Content Negotiation?
How do we implement it using Spring Boot?
How do you add XML support to your RESTful Services built with Spring Boot?
How do you implement Exception Handling for RESTFul Web Services?
What are the best practices related to Exception Handling with respect to RESTful Web Services?
What are the different error status that you would return in RESTful Web Services?
How would you implement them using Spring Boot?
What HTTP Response Status do you return for validation errors?
How do you handle Validation Errors with RESTful Web Services?
Why do we need Versioning for RESTful Web Services?
What are the versioning options that are available?
How do you implement Versioning for RESTful Web Services?

IOC is a patern, and depencency injection is a implementation.

The term annotated class can refer to any of the following.
A class annotated with @Configuration
A component (i.e., a class annotated with @Component, @Service, @Repository, etc.)
A JSR-330 compliant class that is annotated with javax.inject annotations
Any other class that contains @Bean-methods
Consult the Javadoc for @Configuration and @Bean for further information regarding the configuration and semantics of annotated classes.
As of Spring Framework 4.0, this annotation may be used as a meta-annotation to create custom composed annotations.

Spring is a group of enterprise technologies comforming a portafolio of solutions for JEE technology. But Spring core is a container.
org.springframework.context.ApplicationContext represents the Spring IoC container.
Autowired
Annotation │ Meaning 
@Component │ generic stereotype for any Spring-managed component
@Repository│ stereotype for persistence layer
@Service │ stereotype for service layer 
@Controller│ stereotype for presentation layer (spring-mvc)
 @Component | generic stereotype for any Spring-managed component 
 @Controller| stereotype for presentation layer (spring-mvc) 
 @Service | stereotype for service layer 
 @Repository| stereotype for persistence layer
 
Annotation-driven indicates to Spring that it should scan for annotated beans, and to not just rely on XML bean configuration. Component-scan indicates where to look for those beans.EnableS 

@Configuration and @Autowired.
<context:annotation-context>
<context:component-scan base-package=””>

Because <context:annotation-context/> is switched on, the container will recognize and register the @Configuration annotation and process the @Bean methods declared in AppConfig properly. 
Because <context:component-scan/> in bean configuration file, it means, enable auto scanning feature in Spring. The base-package is indicate where are your components stored, Spring will scan this folder and find out the bean (annotated with @Component) and register it in Spring container.
@ComponentScan without any arguments. All of your application components (@Component, @Service, @Repository, @Controller etc.) will be automatically found and registered as Spring Beans.
<!-- POJOs labeled with the @Controller and @Service annotations are auto-detected.-->
<context:component-scan base-package="org.springframework.samples.petclinic.web"/>
Spring MVC
Each DispatcherServlet dispatches requests to registered handlers (Controller interface implementations or POJOs annotated with @Controller) .Controllers are responsible for the mechanics of interaction with the user and ultimately delegate action to the Business/Persistence Layers.
Logical view names returned by Controllers will be mapped to physical paths using the configured 'prefix' and 'suffix' properties.
URLBasedViewResolver
<mvc:annotation-driven conversion-service="conversionService"/>
DispatcherServlet that handles all the HTTP requests and responses.
Viewresolver, takes a prefix and a sufix to resolves the view, to find the view to match the logic view to the phisical view.
@Controller so Spring will consider it when handling incoming web requests.
@RequestMapping annotation provides “routing” information. It is telling Spring that any HTTP request with the path “/” should be mapped to the home method
Methods in your controller are mapped to HTTP using @RequestMapping annotations.
 Spring’s dispatcher servlet: acts as a front controller between the Spring application and its clients. 
The dispatcher servlet intercepts all requests coming to the application and consults the Handler Mapping for which controller to be invoked to handle the requests.
Handler Mapping: is responsible to find appropriate controllers that handle specific requests. The mapping between request URLs and controller classes is done via XML configuration or annotations.
Controller: is responsible to process the requests by calling other business/service classes. The output can be attached to model objects which will be sent to the view. To know which view will be rendered, the controller consults the View Resolver. View Resolver: finds the physical view files from the logical names.View: physical view files which can be JSP, HTML, XML, Velocity template, etc.
Spring security
@EnableWebSecurity
extends WebSecurityConfigurerAdapter 

The first thing you need to do is add the following filter declaration to your web.xml file:
<filter>
  <filter-name>springSecurityFilterChain</filter-name>
  <filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class>
</filter>

<filter-mapping>
  <filter-name>springSecurityFilterChain</filter-name>
  <url-pattern>/*</url-pattern>
</filter-mapping>
     
This provides a hook into the Spring Security web infrastructure. DelegatingFilterProxy is a Spring Framework class which delegates to a filter implementation which is defined as a Spring bean in your application context. In this case, the bean is named “springSecurityFilterChain”, which is an internal infrastructure bean created by the namespace to handle web security. Note that you should not use this bean name yourself. Once you've added this to your web.xml, you're ready to start editing your application context file. Web security services are configured using the <http> element.
2.2.2 A Minimal <http> Configuration
All you need to enable web security to begin with is
 <http auto-config='true'>
    <intercept-url pattern="/**" access="ROLE_USER" />
  </http>
  


Which says that we want all URLs within our application to be secured, requiring the role ROLE_USER to access them.

Spring batch
Job repositories are abstractions responsible of the storing and updating of metadata information related to Job instance executions and Job contexts. 
Paralel processing (Multi-threaded Step and Parallel )
Using the split tag

http://docs.spring.io/spring-batch/reference/html/configureStep.html#interceptingStepExecution
https://www.youtube.com/watch?v=4unuv-oKkCA
-Since skip is really just a special case of retry (with limit 0)
-ItemReadListener, for errors on read, and anItemWriteListener, for errors on write.
Repeat, retry, restart, skip
-Spring batch admon
-Dont optimize unnecesarely
Options to improve:
	-Multithreading steps in parralel
	-Remote chunking
	-Partitioning the steps
	-Spring batch integration 
Provides Feedback Listeners, sofisticated routing	

The execution of business services can sometimes fail due to concurrency issues (for example, deadlock loser). If the operation is retried, it is quite likely it will succeed next time round. For business services where it is appropriate to retry in such conditions (idempotent operations that don’t need to go back to the user for conflict resolution), we’d like to transparently retry the operation to avoid the client seeing a PessimisticLockingFailureException. This is a requirement that clearly cuts across multiple services in the service layer, and hence is ideal for implementing via an aspect.
7.0	Transactions

<!-- transaction manager -->
<bean
id="transactionManager" class="org.springframework.orm.jpa.JpaTransactionManager" 
/>
<tx:annotation-driven transaction-manager="transactionManager" />

It must be Atomic, Consistent, Isolatable, and Durable.Transactions is a series of process considered as a unit of work.Two phases commit, is a distributed algorithm that coordinates all the processes,Stateless Session Beans are used when there is no need to preserve the state of objects between several business transactions.Because the client interacts (“talks”) with its bean, this state is often called the conversational state.Session beans are transactional and completely thread-safe.Oracle Database must coordinate transaction control over a network and maintain data consistency, even if a network or system failure occurs.

In EJB3, there are exactly 6 possible propagation values: REQUIRED (default), REQUIRES_NEW, SUPPORTS, NOT_SUPPORTED, MANDATORY and NEVER. Spring adds support for NESTED (see below).
Isolation Level 
(Posible incorrection and visibility, the most the better consistency)
The isolation property is important when more than one bank clerk changes the information of a system at the same time. A withdrawal or deposit could be implemented as a three-step process: First the amount of the account is read from the database; then something is subtracted from or added to the amount read from the database; and at last the new amount is written to the database. Without transaction isolation several bad things could happen. For example, if two processes read the amount of account A at the same time, and each independently added or subtracted something before writing the new amount to the database, the first change would be incorrectly overwritten by the last.
SERIALIZABLE: se satisface la condición WHERE de la consulta, el nuevo registro sería el fantasma. éste nivel prohíbe lecturas sucias, lecturas repetibles y lecturas fantasma, la situación donde se hace una consulta, se obtiene una serie de registros, y una transacción inserta un nuevo registro donde
REPEATABLE_READ:éste nivel prohibe lecturas sobre filas que no tengan cambios guardados, también prohibe la situación donde una transacción lee un registro, una segunda transacción altera el registro, y la primera transacción vuelve a leer el registro, obteniendo así diferentes valores la segunda ocasión.
READ_COMMITED: éste nivel, hace que la transacción sólo lea registros que ya estén guardados
READ_UNCOMMITED:éste nivel, hace lo contrario que el anterior, te permite lecturas sobre registros que aún no estén guardados (lecturas sucias), puede provocar que tus consultas contengan registros inválidos

Optimistic vs pessimistic lock
Concurrent users trying to modify the same data at the same time, some of the user 2 has already and the las commit wins, some updates are lost, we want to prevent that situation.

Versioning and optimistic 
@Version
Is not very likely that the lost updates too happen frequently, doesnt need a lock in the db,An update to that column when an update happens Use optimistic most of the time, use pesimistic (lock the table) on single transaction context. *But just to check, optimistic means "don't lock the table while reading" and pessimistic means "lock the table while reading."
Transactional isolation is usually implemented by locking whatever is accessed in a transaction. There are two different approaches to transactional locking: Pessimistic locking and optimistic locking.
Transactional isolation is usually implemented by locking whatever is accessed in a transaction. There are two different approaches to transactional locking: Pessimistic locking and optimistic locking.
The disadvantage of pessimistic locking is that a resource is locked from the time it is first accessed in a transaction until the transaction is finished, making it inaccessible to other transactions during that time. If most transactions simply look at the resource and never change it, an exclusive lock may be overkill as it may cause lock contention, and optimistic locking may be a better approach. With pessimistic locking, locks are applied in a fail-safe way. In the banking application example, an account is locked as soon as it is accessed in a transaction. Attempts to use the account in other transactions while it is locked will either result in the other process being delayed until the account lock is released, or that the process transaction will be rolled back. The lock exists until the transaction has either been committed or rolled back.
With optimistic locking, a resource is not actually locked when it is first is accessed by a transaction. Instead, the state of the resource at the time when it would have been locked with the pessimistic locking approach is saved. Other transactions are able to concurrently access to the resource and the possibility of conflicting changes is possible. At commit time, when the resource is about to be updated in persistent storage, the state of the resource is read from storage again and compared to the state that was saved when the resource was first accessed in the transaction. If the two states differ, a conflicting update was made, and the transaction will be rolled back.
In the banking application example, the amount of an account is saved when the account is first accessed in a transaction. If the transaction changes the account amount, the amount is read from the store again just before the amount is about to be updated. If the amount has changed since the transaction began, the transaction will fail itself, otherwise the new amount is written to persistent storage.

If you specify readOnly as true, the flush mode will be set as FlushMode.NEVER in the current Hibernate Session preventing the session from commiting the transaction.

@Transactional(readOnly = true)
<tx:annotation-driven mode="aspectj" />
Spring AOP
Crosscutting concerns, are layers involved in certain aspects in the transaction, logging, security
Intercept method calls, around,before and after 
To enable is necessary:
<aop:aspectj-autoproxy></aspectj-autoproxy>
Pointcut is an expression
<beanid="myTxManager" class="org.springframework.orm.hibernate3.HibernateTransactionManager">
    <property name="sessionFactory" ref="mySessionFactory"/>
  </bean>
  
  <aop:config>
<aop:pointcutid="productServiceMethods" expression="execution(* product.ProductService.*(..))"/>
    <aop:advisor advice-ref="txAdvice" pointcut-ref="productServiceMethods"/>
  </aop:config>

  <tx:advice id="txAdvice" transaction-manager="myTxManager">
    <tx:attributes>
      <tx:method name="increasePrice*" propagation="REQUIRED"/>
      <tx:method name="someOtherBusinessMethod" propagation="REQUIRES_NEW"/>
      <tx:method name="*" propagation="SUPPORTS" read-only="true"/>
    </tx:attributes>
  </tx:advice>

  <bean id="myProductService" class="product.SimpleProductService">
    <property name="productDao" ref="myProductDao"/>
  </bean>

Transaction attributes
Transaction <tx:annotation-driven />
In addition to the rollback directives, you must also specify the transaction attribute, which defines how the transaction should behave.
 The Java platform supports six types of transaction attributes, regardless of whether you are using EJB or the Spring Framework:
    Required
    Mandatory
    RequiresNew
    Supports
    NotSupported
    Never

Interceptor
Each interceptor gets a chance to do what they want with the message. This can include reading it, transforming it, processing headers, validating the message, etc.It requires a service class and an address to publish the service on.
8.0	Hibernate / JPA
NamedQuery
Inheritance strategy
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) 
@Inheritance(strategy=InheritanceType.JOINED) // to be used when you want to test JOINED strategy for inheritance mapping
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) // to be used when you want to test TABLE_PER_CLASS (Table per concrete class) strategy for inheritance mapping
Hibernate uses default values, its gonna use the name of the name of the entity name, and the name of the attributes to name of the columns
@Embeddable means it will be persisted as a value type, with no identifier
SessionFactory
OpensessioninView-LazyInitializationException
@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")
public Integer getId() { ... }  

One to one 
@Entity
public class Customer implements Serializable {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="passport_fk")
    public Passport getPassport() {
        ...
    }

@Entity
public class Passport implements Serializable {
    @OneToOne(mappedBy = "passport")
    public Customer getOwner() {
    ...
}     
N+1 problem 
By default one-to-one and many-to-one are EAGER_FETCH,  one for the parent and one for the children
just change Eager to Lazy and create the left join fetch
the lazy=false to fetch-”join” always,  fetch-”select” 
fetching="join" If you do fetching="join" it will retrive all the information in a single select statement.
However if the number of elements in the list gets bigger we would like to see for the batch-fetching thousands of elements.

Transient, persistent , detached
Mapping strategy 
1)@Inheritance(strategy=InheritanceType.SINGLE_TABLE) table(table per class hierarchy (discriminator)) (not very good sgenerates a null columns)
2)@Inheritance(strategy=InheritanceType.JOINED)(sublclassing inheritance)
3)@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
4)@MappedSupperClass

The mappedBy property is what we use to tell Hibernate which variable we are using to represent the parent class in our child class.

The “inverse” keyword is always declare in one-to-many and many-to-many relationship (many-to-one doesn’t has inverse keyword), it means which side is responsible to take care of the relationship.
In short, the “inverse” is decide which side will update the foreign key, while “cascade” is decide what’s the follow by operation should execute. 
Cascade
In order to avoid calling the save method twice
Fetching Strategy
1. Join Fetching
2. Batch Fetching
3. Select Fetching
4. Sub-select Fetching
Batch fetching
Refers to a strategy that mixes first level cache and a batch select to load the childrens by sending a list ef elements as a query parameters. 
Load vs get
Load  will always return a “proxy” (Hibernate term) without hitting the database. If no row found , it will throws an ObjectNotFoundException
Query Parameters
Query parameters are the most common type of parameters. They appear at the end of a URL following a question mark. Query parameters are optional and non unique, so they can be specified multiple times in the URL. The client could describe the page number (offset) and the amount of information on the page (limit), for example:
GET http://example.com/v1/artists?limit=20&offset=3

8.0	Webservices 
@Path("persons")
@GET
@Produces({ "application/xml", "application/json" })
// Ideally this state should be stored in a database
@EJB
PersonSessionBean bean;
@FormParam("name") String name, @FormParam("age") int age
@PathParam("name") String name

Backbone 
Backbone is pre-configured to sync with a RESTful API
Collections and models form a direct mapping of Rest resources using the following methods:
GET  /books/ .... collection.fetch();
POST /books/ .... collection.create();
GET  /books/1 ... model.fetch();
PUT  /books/1 ... model.save();
DEL  /books/1 ... model.destroy();

@WebService, rest
1)collections and instances uris
2)get, post, put and delete,
3)Lightweigth, similar to webpages.
4)Use nouns not verbs, and plural
5)idempotent get, put, delete, calling multiple times has effect only first time
6)cashing Get responses
7)Backbone.Collection. Set the url property (or function) on a collection to reference its location on the server. Models within the collection will use url to construct URLs of their own.
Filtering and pagination in Rest offset and limit,Products, accounts, messages, profiles, categories, subscripions, 
http://www.ibm.com/developerworks/webservices/tutorials/ws-jax/ws-jax.html
Architectural style, its an online API, verbs describe a set of operations, http verbs: PUT, GET, POST, DELETE A Web service is a set of functions that can be invoked over the Internet.
Resources are URI to distinguish nouns
Result codes, result of the server[s attempt to satisfy the request
Jackson wich is the library for marshalling Javascript
Hipermedia controls HATEOAS

@javax.jws.WebService
The starting point for developing a JAX-WS web service is a Java class annotated with the javax.jws.WebService annotation.
<jaxws:endpoint> bean which sets up a server side endpoint.

JAX-B
JAXB enables data-binding capabilities by providing a convenient way to map an XML schema to a representation in Java code.Code first: Start with a Java class, and use annotations to generate both a WSDL file and a Java interface.Data is marshalled from XML to Java and vice versa via the JAXB data-binding.

Webservice client
Typical artifacts generated are classes that provide conversion of Java objects to XML, and the WSDL file and XSD schema based on the service interface.
The web service client in turn deals with the Java object (the JAXB-generated class), Retrieves a proxy to the service which uses generated artifact code to invoke the order-processing web service.
Service class , which act as stubs for web service invocation. The stubs are responsible for creating SOAP requests from JAXB annotations and converting the SOAP response back to the Java object.The class that your clients use to make requests to the web service
Invokes the port's processOrder method, passing the OrderBean instance created in the second list item above.
Gets the OrderBean response from the service and prints the order ID.
rest apis examples
https://framework.zend.com/manual/2.4/en/user-guide/routing-and-controllers.html
Microservices
Those companies started with monolithic applications, which rapidly evolved into decomposed services, which then communicated via RESTful APIs 
Polimorphism
Polymorphism is the ability of a single interface to support multiple underlying forms.
Design
Create the DataModel
Coordinating and schedule all task 
Use cases are important tools in analisys
Prototype the interfaces
Identify the scope, and actors 

Caching is all about application performance optimization and it sits between your application and the database to avoid the number of database hits as many as possible to give a better performance for performance critical applications.

@Cacheable is used to demarcate methods that are cacheable - that is, methods for whom the result is stored into the cache so on subsequent invocations (with the same arguments), the value in the cache is returned without having to actually execute the method
Deployment descriptors
org.springframework.web.context.ContextLoaderListener
Read only transaction
Hibernate optimizes sessions so that they never flush (i.e. never push changes from the cache to the underlying database)
JSP/Servlet
A "request" in server-side processing refers to the transaction between a browser and the server.When someone clicks or enters a URL, the browser sends a "request" to the server for that URL, and shows the data returned.
As a part of this "request", various data is available, including the file the browser wants from the server, and if the request is coming from pressing a SUBMIT button, the information the user has entered in the form fields. A session is an object associated with a visitor.  Data can be put in the session and retrieved from it, much like a Hashtable.  A different set of data is kept for each visitor to the site. 

Struts
This class is to determine where the results of the Action will be sent once its processing is complete.ActionServlet is a simple servlet which is the backbone of all Struts applications
Actionform
ActionServlet
The controller (ActionServlet) will call an Action for each request based on the below action-mappings.

Log4j
trace, debug, error, info warn

Jersey vs Spring MVC
Both @Path and @RequestMapping support extracting path variables from the URL:

PL-SQL
Just as a file pointer marks the current position in an open file, a cursor marks the current position in a result set.

Financial
Significant visualization  of data, drill down, real time performance needs, hierarchy Trading application,  accounting system and an anti money laundry and security web application, amongst others like reports 
Balance,Portfolio,Account,Transaction,QuotationDTO,BalanceEntries,AccountInfo,OptionDTO,OrderDTO,ConversionModel,ConversionRule,Money,FinanceConfiguration,FinanceFactory,FinanceCalendar,AbstractInvoice, calculateTax(TaxModel, date), Money.Jar

BPM Credits
https://docs.oracle.com/cd/E13214_01/wli/docs70/bpmtutor/ch1.htm#1263946

11.0	Functional programming	
Stream 
A stream is a sequence of data elements made available over time.,Filter, Map, disctinct, sort, reduce, foreach
Conditional Autowiring
Marker Interface
12.0 AWS
The two primary ways you are charged for using Lambda are the number of time your code is executed (execution request), and how long it takes for your code to execute (execution duration).

13.0 Docker and Kubernetes

Kubernetes is an open-source system for automating deployment, scaling, and management of containerized applications.
13.0 Testing

14.0	Soft skills
Frustration
Stay focused, take action, be positive, stimate the time together, start small, Poorly defined requirements, Poorly defined requirements lead to poorly defined scope and constantly changing requirements. Incomplete information and insufficient participation from key subject matter experts.prioritize the defined requirements first.Gains customer and stakeholder feedback on features sooner rather than later.Requirements always change as teams and customers learn more about the system as the project progresses, 2. Splits large requirements into small slices, Defers the less important requirements to another release

Team member 
Rigth attitude, be open, be positive, efficiently, high quality, planning and executing, be approachable, product manager or the consumer



