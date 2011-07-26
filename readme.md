<< master >>

	http://github.com/astubbs/wicket-contrib-groovy

	jar_org:  now not running
	jar13  :  Wikect 1.3.7 base
						add Wikect 1.2 class add
						edit pom.xml
						src import change
	jar14  :  Wikect 1.4.15 base
						add Wikect 1.2 class add
						edit pom.xml
						src import change

-------------------------------------------------------------------
<< Wikect >>

MavenRepo
	http://mvnrepository.com/artifact/org.apache.wicket/wicket

setting)
	<dependency>
    <groupId>org.apache.wicket</groupId>
    <artifactId>wicket</artifactId>
    <version>1.4.15</version>
	</dependency>


 1.4.15:  It reserves it as moved to org.apache.wicket.Components.class that setModel and getModel are different.
			setModel => setDefaultModel
			getModel => getDefaultModel

			refarence(1.3=>1.4 Migrate): http://d.hatena.ne.jp/gishi_yama/20100625/1277479390

			Javadoc : http://wicket.apache.org/apidocs/1.4/

 1.3.7 Javadoc: http://wicket.apache.org/apidocs/1.3/

	javadoc & source downloading 
		http://repo2.maven.org/maven2/org/apache/wicket/wicket/


----------------------------------------------------------------------------------------------

WicketBuilder using reference 
 http://wicketstuff.org/confluence/display/STUFFWIKI/WicketBuilder

case Java)
	Form form = new Form("contactForm"){
	    protected void onSubmit()
	    {
	        try {
	            ((Contact)getModel().getModelObject()).save();
	        }
	        catch(SomeCrazyException e) {
	            throw new RuntimeException("I don't know what to do with this.  Just fail.", e);
	        }
	    }
	};

	form.add(new RequiredTextField("firstname");
	form.add(new RequiredTextField("lastname").add(StringValidator.maximumLength(32));
	add(form);


case Groovy)
	WicketBuilder builder = new WicketBuilder(this)
	builder.form("contactForm", model:new CompoundPropertyModel(contact),
	    onSubmit:{ model.modelObject.save() })
	{
	    requiredTextField("firstname")
	    requiredTextField("lastname")
	    {add(StringValidator.maximumLength(32))}
	}


<< Databinder >>

setting)
 <repositories>
  <repository>
    <id>databinder</id>
    <name>Databinder repository</name>
    <url>http://databinder.net/repo/</url>
  </repository>
 </repositories>

 Repo     http://databinder.net/repo/net/databinder/
 Javadoc: http://databinder.net/javadoc/index.html?net/databinder/components/package-summary.html


 It is impossible because the component is separate now if it doesn't individually specify it. 

-------------------------------------------------------------------------------------------
<< Other >>

[groovyとApache WicketでWeb Applicationを作成する]
	http://groovyarekore.blogspot.com/2009/10/groovyapache-wicketweb-application.html

Wicket Tester
	http://d.hatena.ne.jp/yamkazu/20080802/1217751174
	http://shin1o.blogspot.com/2009/04/gaejavawicket.html
	http://www.gside.org/blowg/e/user/tma/entry/200706010130


Wicket Reference
	http://hondou.homedns.org/pukiwiki/pukiwiki.php?Wicket%20Quick%20Start%20%A4%CF%A1%A2%A4%C9%A4%A6%C6%B0%A4%A4%A4%C6%A4%A4%A4%EB%A4%CE%A4%AB%A1%A9
	IBM)
		http://www.ibm.com/developerworks/jp/web/library/wa-aj-wicket/
	Gihyo)
		http://gihyo.jp/dev/feature/01/wicket/0001
	CodeZine)
		http://codezine.jp/article/detail/4459
	MyCom)
		http://journal.mycom.co.jp/articles/2006/05/08/wicket/index.html


