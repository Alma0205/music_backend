@echo off
set JAVA_HOME=C:\Users\CESDE\AppData\Roaming\Code\User\globalStorage\pleiades.java-extension-pack-jdk\java\17
set PATH=%JAVA_HOME%\bin;C:\Users\CESDE\.maven\maven-3.9.15\bin;%PATH%
mvn spring-boot:run
pause