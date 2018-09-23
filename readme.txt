eps-pri, eps-dr, and eps-pri-2 illustrate running 3 intercommunicating eureka server instances.  
This example has them running side-by-side on localhost
-- which is unrealistic in production
-- but does illustrate how multiple instances collaborate
-- requires you to add on your hosts file the following entries:
    - 127.0.0.1		eureka.netsgroup.com
    - 127.0.0.1		eureka0pri.netsgroup.com
    - 127.0.0.1		eureka0dr.netsgroup.com
    - 127.0.0.1		eureka1pri.netsgroup.com

After packaging jars issuing the following command:
mvn clean package

Run by opening 3 separate command prompts:

java -jar -Dspring.profiles.active=eps-pri eureka-server.jar
java -jar -Dspring.profiles.active=eps-dr eureka-server.jar
java -jar -Dspring.profiles.active=eps-pri-2 eureka-server.jar

then run 3 separate client services:

java -jar -Dspring.profiles.active=eps-pri eureka-client.jar
java -jar -Dspring.profiles.active=eps-dr eureka-client.jar
java -jar -Dspring.profiles.active=eps-pri-2 eureka-client.jar
