/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package wicket.contrib.groovy.builder.impl.databinder;

import org.apache.wicket.markup.html.WebPage
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.model.Model
import org.apache.wicket.markup.html.form.Form
import wicket.contrib.groovy.builder.WicketBuilder

class ComponentTestsPage extends WebPage {

  	public ComponentTestsPage()
  	{
  		WicketBuilder builder = new WicketBuilder(page)
		
  		builder.styleLink('styleLink', class:ComponentTestsPage.class)
//  		builder.styleLink('styleLink2', class:"wicket.contrib.groovy.builder.impl.databinder.ComponentTestsPage")
  		
  		//Not testing this yet.  Need to build a test hibernate setup
//  		builder.dataForm('dataForm', class:DataObject.class)
  	}
  	
  	
}