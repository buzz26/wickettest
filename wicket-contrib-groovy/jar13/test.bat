set JAVA_HOME=c:\opt\jdk

%JAVA_HOME%/bin/java  -cp ".;./lib/*;./build/libs/*" groovy.ui.GroovyMain WicketBuilderTest.groovy
pause
