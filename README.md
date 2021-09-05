# Online-Talent-Recruitment-System
Online Talent recruitment system built with spring boot and a microservice architecture


## Development Environment：
### Software Tools and technologies used ：
* Jdk8、mysql5.7、H2 Database、intelliJ Idea Ultimate, maven (for dependency management)
* Spring boot, Spring CLoud, Netflix Eureka ,Hibernate, Swagger

* Project Initialisation and running 
    To be able to run the whole project it is necessary to understand that the
    system is made of smaller services which are all projects on their own.
    To run the project:
    -Clone the repository
    -Import the modules into your project (from existing sources) preferably starting from the demoeureka module(this is the module that serves as the eureka server)
    -Make sure to import the maven dependenciesin all modules
    -to run a service go to the file with the main class(DemoeurekaApplication or demoeureka module) right click and select run.
    -Do same for any microservice you want to run 






* Project address
    * Eureka server lives at  
    	http://localhost:8761/
    	Note: you can use this page to check which services are up and running
    The links to the various services are as follows:
    * http://localhost:8081/companies
    
    * http://localhost:8082/users
    
    * http://localhost:8083/persons
    
    * http://localhost:8084/news
    
    * http://localhost:8085/givejobinfos
    
    * http://localhost:8086/resumes
    
    * http://localhost:8087/getjobinfos
    
    


### More detailed process Reference：
