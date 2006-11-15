/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.uima.taeconfigurator.wizards;

import org.eclipse.ui.INewWizard;

/**
 * Create a new file resource in the provided container. 
 * If the container resource (a folder or a project) is selected 
 * in the workspace when the wizard is opened, it will accept 
 * it as the target container. If a sample multi-page editor 
 * is registered for the same extension, it will be able to open it.
 * 
 * Following Eclipse conventions, the new Wizard will actually create
 * the resource in the file system and in the Eclipse resource space,
 * with initial contents, and then open the resource with the CDE.
 */

public class FlowControllerNewWizard extends AbstractNewWizard implements INewWizard {

  public FlowControllerNewWizard () {
    super("New Flow Controller Descriptor File");
  }
  
	public void addPages() {
		page = new FlowControllerNewWizardPage(selection);
		addPage(page);
	}
	
	public String getPrototypeDescriptor(String name) {
	  return "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"
	  +  "<flowControllerDescription xmlns=\"http://uima.apache.org/resourceSpecifier\">\n"
	  +  "<frameworkImplementation>org.apache.uima.java</frameworkImplementation>\n"
	  +  "<implementationName></implementationName>\n"
	  +  "<processingResourceMetaData>\n"
    +      "<name>" + name + "</name>\n"
    +      "<description></description>\n"
    +      "<version>1.0</version>\n"
    +      "<vendor></vendor>\n"
    +      "<configurationParameters></configurationParameters>\n"
    +      "<configurationParameterSettings></configurationParameterSettings>\n"
    +      "<typeSystemDescription></typeSystemDescription>\n"
    +      "<typePriorities></typePriorities>\n"
    +      "<fsIndexCollection></fsIndexCollection>\n"
    +      "<capabilities>\n"
    +        "<capability>\n"
    +          "<inputs></inputs>\n"
    +          "<outputs></outputs>\n"
    +          "<languagesSupported></languagesSupported>\n"
    +        "</capability>\n"
    +      "</capabilities>\n"
	  +  "</processingResourceMetaData>\n"
    +  "<externalResourceDependencies></externalResourceDependencies>\n"
    +  "<resourceManagerConfiguration></resourceManagerConfiguration>\n"

	  +  "</flowControllerDescription>";
	}
}
