//@Grab(group='junit', module='junit', version='3.8.1')

import wicket.contrib.groovy.builder.*
import org.apache.wicket.model.*
import org.apache.wicket.markup.html.form.*
import org.apache.wicket.validation.validator.*
import org.apache.wicket.markup.html.*
import org.apache.wicket.markup.html.basic.*
import org.apache.wicket.PageParameters;

import org.apache.wicket.Application;
import org.apache.wicket.protocol.http.WebApplication;

public class WicketApplication extends WebApplication {
  public WicketApplication() {
    System.out.println("WicketApplication constructor()");
  }

  @Override
  public String getConfigurationType() {
    return Application.DEPLOYMENT;
  }

  @Override
  protected void init() {
    super.init();
    mountBookmarkablePage("/home", HomePage.class);
  }

  public Class<HomePage> getHomePage() {
    return HomePage.class;
  }
}

import org.apache.wicket.MarkupContainer
import org.apache.wicket.markup.html.WebMarkupContainer

public class HomePage extends WebPage {
    public HomePage(final PageParameters parameters) {
        println parameters?.dump()
        MarkupContainer page = new WebMarkupContainer("1")
        WicketBuilder builder = new WicketBuilder(page)
        builder.form('normalForm'){
            add(new Label("name", "If you see this message wicket is properly configured and running"));
        }
        /*
        builder.form("contactForm", model:new CompoundPropertyModel(contact),onSubmit:{ model.modelObject.save() }){
            requiredTextField("firstname")
            requiredTextField("lastname"){
                add(StringValidator.maximumLength(32))
            }
        }
        */
        add(new Label("message", "If you see this message wicket is properly configured and running"));
    }  
}

//def application = new WicketApplication()
//application.getHomePage()
//new HomePage().renderPage()

import org.apache.wicket.util.tester.WicketTester
import junit.framework.*

WicketTester tester = new WicketTester(new WicketApplication())
tester.startPage(new HomePage())
println tester.dump()
//tester.assertRenderedPage(HomePage.class)
