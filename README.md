#  spring-boot-template
This is an basis Example of an Spring Boot app with running Github Action

##  Features
- Spring Boot current 20231218 Version
- Java 21
- Maven
- GitHub Action with Sonarcube, dependencies to external an pixomia internal public repos, deploying to github packages and...


## preconditions in github settings 
create two envoirment secrets:
PAT => your personal access token => needes for the get artefaktes/dep from other personal repos 
SONAR-TOKEN => the Sonarcloud Token to connet it to the sonarcloud