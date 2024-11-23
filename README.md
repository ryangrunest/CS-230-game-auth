# GameAuth

## How to start the GameAuth application

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/gameauth-0.0.1-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

## Health Check

To see your applications health enter url `http://localhost:8081/healthcheck`

This application uses Dropwizard to implement Basic Auth, by following the documentation below:

https://howtodoinjava.com/dropwizard-tutorials/
https://howtodoinjava.com/dropwizard/dropwizard-basic-auth-security-example/#1-maven
https://howtodoinjava.com/dropwizard/client-configuration-and-examples/#1-maven-dependency
