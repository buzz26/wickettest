//refarence Groovy Goodness: Groovlets as Lightweight Servlets
//   http://mrhaki.blogspot.com/2009/10/groovy-goodness-groovlets-as.html
//

//@Grab(group='org.apache.tomcat', module='jsp-api', version='6.0.29')
//@Grab('javax.servlet:servlet-api:2.4') //not good working
@Grab(group='org.mortbay.jetty', module='jetty-embedded', version='6.1.14')

import org.mortbay.jetty.Server
import org.mortbay.jetty.servlet.*
import groovy.servlet.*

def startJetty() {
    def jetty = new Server(9090)
    
    def context = new Context(jetty, '/', Context.SESSIONS)  // Allow sessions.
    context.resourceBase = '.'  // Look in current dir for Groovy scripts.
    context.addServlet(GroovyServlet, '*.groovy')  // All files ending with .groovy will be served.
    context.setAttribute('version', '1.0')  // Set an context attribute.
    
    jetty.start()
}

println "Starting Jetty, press Ctrl+C to stop."
println "=> http://localhost:9090/serverinfo.groovy browsing"
startJetty()
