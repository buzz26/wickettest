set JAVA_HOME=c:\opt\jdk

%JAVA_HOME%/bin/java  -cp ".;./lib/*;./build/libs/*" groovy.ui.GroovyMain wicket_jetty_start.groovy
pause
