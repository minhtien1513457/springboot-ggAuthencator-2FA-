# How to run
1. ``docker build -t ga-example .``
2. ``docker run -d -p 8080:8080 ga-example``
3. Visit http://localhost:8080/swagger-ui.html#

**USERS TO USE**
1. alice@gmail.com
2. kek@kek.com

**User the new relic**
1. mvn clean install(gerate the jar file)
2. java -javaagent:.\newrelic-agent-8.9.1.jar -jar .\target\google-auth-demo-0.0.1-SNAPSHOT.jar