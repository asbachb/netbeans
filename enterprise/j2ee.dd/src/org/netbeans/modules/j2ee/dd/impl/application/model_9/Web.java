/**
 *	This generated bean class Web matches the schema element 'webType'.
 *  The root bean class is Application
 *
 *	===============================================================
 *	
 *	
 *	        The webType defines the web-uri and context-root of
 *	        a web application module.
 *	        
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.application.model_9;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class Web extends org.netbeans.modules.j2ee.dd.impl.common.EnclosingBean
	 implements org.netbeans.modules.j2ee.dd.api.application.Web
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String WEB_URI = "WebUri";	// NOI18N
	static public final String CONTEXT_ROOT = "ContextRoot";	// NOI18N
	static public final String CONTEXTROOTID = "ContextRootId";	// NOI18N

	public Web() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public Web(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(2);
		this.createProperty("web-uri", 	// NOI18N
			WEB_URI, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("context-root", 	// NOI18N
			CONTEXT_ROOT, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(CONTEXT_ROOT, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.initialize(options);
	}

	// Setting the default values of the properties
	void initialize(int options) {

	}

	// This attribute is optional
	public void setId(java.lang.String value) {
		setAttributeValue(ID, value);
	}

	//
	public java.lang.String getId() {
		return getAttributeValue(ID);
	}

	// This attribute is mandatory
	public void setWebUri(java.lang.String value) {
		this.setValue(WEB_URI, value);
	}

	//
	public java.lang.String getWebUri() {
		return (java.lang.String)this.getValue(WEB_URI);
	}

	// This attribute is mandatory
	public void setContextRoot(java.lang.String value) {
		this.setValue(CONTEXT_ROOT, value);
	}

	//
	public java.lang.String getContextRoot() {
		return (java.lang.String)this.getValue(CONTEXT_ROOT);
	}

	// This attribute is optional
	public void setContextRootId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(CONTEXT_ROOT) == 0) {
			setValue(CONTEXT_ROOT, "");
		}
		setAttributeValue(CONTEXT_ROOT, "Id", value);
	}

	//
	public java.lang.String getContextRootId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(CONTEXT_ROOT) == 0) {
			return null;
		} else {
			return getAttributeValue(CONTEXT_ROOT, "Id");
		}
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}

	
                    public String getWebUriId() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                        throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.application.Application.VERSION_1_4);
                    }
                    public void setWebUriId(String value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                        throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.application.Application.VERSION_1_4);
                    }
                
	public void validate() throws org.netbeans.modules.schema2beans.ValidateException {
		boolean restrictionFailure = false;
		boolean restrictionPassed = false;
		// Validating property id
		if (getId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "id", this);	// NOI18N
			}
		}
		// Validating property webUri
		if (getWebUri() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getWebUri() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "webUri", this);	// NOI18N
		}
		// Validating property contextRoot
		if (getContextRoot() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getContextRoot() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "contextRoot", this);	// NOI18N
		}
		// has whitespace restriction
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getContextRoot() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "contextRoot", this);	// NOI18N
		}
		// Validating property contextRootId
		if (getContextRootId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getContextRootId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "contextRootId", this);	// NOI18N
			}
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("WebUri");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getWebUri();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(WEB_URI, 0, str, indent);

		str.append(indent);
		str.append("ContextRoot");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getContextRoot();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(CONTEXT_ROOT, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("Web\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N


/*
		The following schema file has been used for generation:

<?xml version="1.0" encoding="UTF-8"?>
<xsd:schema xmlns="http://www.w3.org/2001/XMLSchema"
            targetNamespace="https://jakarta.ee/xml/ns/jakartaee"
            xmlns:jakartaee="https://jakarta.ee/xml/ns/jakartaee"
            xmlns:xsd="http://www.w3.org/2001/XMLSchema"
            elementFormDefault="qualified"
            attributeFormDefault="unqualified"
            version="9">
  <xsd:annotation>
    <xsd:documentation>

      Copyright (c) 2009, 2020 Oracle and/or its affiliates. All rights reserved.
      
      This program and the accompanying materials are made available under the
      terms of the Eclipse Public License v. 2.0, which is available at
      http://www.eclipse.org/legal/epl-2.0.
      
      This Source Code may also be made available under the following Secondary
      Licenses when the conditions for such availability set forth in the
      Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
      version 2 with the GNU Classpath Exception, which is available at
      https://www.gnu.org/software/classpath/license.html.
      
      SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
      
    </xsd:documentation>
  </xsd:annotation>

  <xsd:annotation>
    <xsd:documentation>
      <![CDATA[
      This is the XML Schema for the application 9 deployment
      descriptor.  The deployment descriptor must be named
      "META-INF/application.xml" in the application's ear file.
      All application deployment descriptors must indicate
      the application schema by using the Jakarta EE namespace:
      
      https://jakarta.ee/xml/ns/jakartaee
      
      and indicate the version of the schema by
      using the version element as shown below:
      
      <application xmlns="https://jakarta.ee/xml/ns/jakartaee"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="https://jakarta.ee/xml/ns/jakartaee 
      	https://jakarta.ee/xml/ns/jakartaee/application_9.xsd"
      version="9">
      ...
      </application>
      
      The instance documents may indicate the published version of
      the schema using the xsi:schemaLocation attribute for Jakarta EE
      namespace with the following location:
      
      https://jakarta.ee/xml/ns/jakartaee/application_9.xsd
      
      ]]>
    </xsd:documentation>
  </xsd:annotation>

  <xsd:annotation>
    <xsd:documentation>

      The following conventions apply to all Jakarta EE
      deployment descriptor elements unless indicated otherwise.
      
      - In elements that specify a pathname to a file within the
      same JAR file, relative filenames (i.e., those not
      starting with "/") are considered relative to the root of
      the JAR file's namespace.  Absolute filenames (i.e., those
      starting with "/") also specify names in the root of the
      JAR file's namespace.  In general, relative names are
      preferred.  The exception is .war files where absolute
      names are preferred for consistency with the Servlet API.
      
    </xsd:documentation>
  </xsd:annotation>

  <xsd:include schemaLocation="jakartaee_9.xsd"/>


<!-- **************************************************** -->

  <xsd:element name="application"
               type="jakartaee:applicationType">
    <xsd:annotation>
      <xsd:documentation>

        The application element is the root element of a Jakarta EE
        application deployment descriptor.
        
      </xsd:documentation>
    </xsd:annotation>
    <xsd:unique name="context-root-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The context-root element content must be unique
          in the ear. 
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:module/jakartaee:web"/>
      <xsd:field xpath="jakartaee:context-root"/>
    </xsd:unique>
    <xsd:unique name="security-role-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The security-role-name element content
          must be unique in the ear.  
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:security-role"/>
      <xsd:field xpath="jakartaee:role-name"/>
    </xsd:unique>
  </xsd:element>


<!-- **************************************************** -->

  <xsd:complexType name="applicationType">
    <xsd:annotation>
      <xsd:documentation>

        The applicationType defines the structure of the
        application. 
        
      </xsd:documentation>
    </xsd:annotation>
    <xsd:sequence>
      <xsd:element name="application-name"
                   type="jakartaee:string"
                   minOccurs="0"/>
      <xsd:group ref="jakartaee:descriptionGroup"/>
      <xsd:element name="initialize-in-order"
                   type="jakartaee:generic-booleanType"
                   minOccurs="0"
                   maxOccurs="1">
        <xsd:annotation>
          <xsd:documentation>

            If initialize-in-order is true, modules must be initialized
            in the order they're listed in this deployment descriptor,
            with the exception of application client modules, which can
            be initialized in any order.
            If initialize-in-order is not set or set to false, the order
            of initialization is unspecified and may be product-dependent.
            
          </xsd:documentation>
        </xsd:annotation>
      </xsd:element>
      <xsd:element name="module"
                   type="jakartaee:moduleType"
                   maxOccurs="unbounded">
        <xsd:annotation>
          <xsd:documentation>

            The application deployment descriptor must have one
            module element for each Jakarta EE module in the
            application package. A module element is defined 
            by moduleType definition. 
            
          </xsd:documentation>
        </xsd:annotation>
      </xsd:element>
      <xsd:element name="security-role"
                   type="jakartaee:security-roleType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="library-directory"
                   type="jakartaee:pathType"
                   minOccurs="0"
                   maxOccurs="1">
        <xsd:annotation>
          <xsd:documentation>

            The library-directory element specifies the pathname
            of a directory within the application package, relative
            to the top level of the application package.  All files
            named "*.jar" in this directory must be made available
            in the class path of all components included in this
            application package.  If this element isn't specified,
            the directory named "lib" is searched.  An empty element
            may be used to disable searching.
            
          </xsd:documentation>
        </xsd:annotation>
      </xsd:element>
      <xsd:element name="env-entry"
                   type="jakartaee:env-entryType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="ejb-ref"
                   type="jakartaee:ejb-refType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="ejb-local-ref"
                   type="jakartaee:ejb-local-refType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:group ref="jakartaee:service-refGroup"/>
      <xsd:element name="resource-ref"
                   type="jakartaee:resource-refType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="resource-env-ref"
                   type="jakartaee:resource-env-refType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="message-destination-ref"
                   type="jakartaee:message-destination-refType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="persistence-context-ref"
                   type="jakartaee:persistence-context-refType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="persistence-unit-ref"
                   type="jakartaee:persistence-unit-refType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="message-destination"
                   type="jakartaee:message-destinationType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="data-source"
                   type="jakartaee:data-sourceType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="jms-connection-factory"
                   type="jakartaee:jms-connection-factoryType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="jms-destination"
                   type="jakartaee:jms-destinationType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="mail-session"
                   type="jakartaee:mail-sessionType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="connection-factory"
                   type="jakartaee:connection-factory-resourceType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="administered-object"
                   type="jakartaee:administered-objectType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
    </xsd:sequence>
    <xsd:attribute name="version"
                   type="jakartaee:dewey-versionType"
                   fixed="9"
                   use="required">
      <xsd:annotation>
        <xsd:documentation>

          The required value for the version is 9.
          
        </xsd:documentation>
      </xsd:annotation>
    </xsd:attribute>
    <xsd:attribute name="id"
                   type="xsd:ID"/>
  </xsd:complexType>


<!-- **************************************************** -->

  <xsd:complexType name="moduleType">
    <xsd:annotation>
      <xsd:documentation>

        The moduleType defines a single Jakarta EE module and contains a
        connector, ejb, java, or web element, which indicates the
        module type and contains a path to the module file, and an
        optional alt-dd element, which specifies an optional URI to
        the post-assembly version of the deployment descriptor.
        
      </xsd:documentation>
    </xsd:annotation>
    <xsd:sequence>
      <xsd:choice>
        <xsd:element name="connector"
                     type="jakartaee:pathType">
          <xsd:annotation>
            <xsd:documentation>

              The connector element specifies the URI of a
              resource adapter archive file, relative to the
              top level of the application package.
              
            </xsd:documentation>
          </xsd:annotation>
        </xsd:element>
        <xsd:element name="ejb"
                     type="jakartaee:pathType">
          <xsd:annotation>
            <xsd:documentation>

              The ejb element specifies the URI of an ejb-jar,
              relative to the top level of the application
              package.
              
            </xsd:documentation>
          </xsd:annotation>
        </xsd:element>
        <xsd:element name="java"
                     type="jakartaee:pathType">
          <xsd:annotation>
            <xsd:documentation>

              The java element specifies the URI of a java
              application client module, relative to the top
              level of the application package.
              
            </xsd:documentation>
          </xsd:annotation>
        </xsd:element>
        <xsd:element name="web"
                     type="jakartaee:webType"/>
      </xsd:choice>
      <xsd:element name="alt-dd"
                   type="jakartaee:pathType"
                   minOccurs="0">
        <xsd:annotation>
          <xsd:documentation>

            The alt-dd element specifies an optional URI to the
            post-assembly version of the deployment descriptor
            file for a particular Jakarta EE module.  The URI must
            specify the full pathname of the deployment
            descriptor file relative to the application's root
            directory. If alt-dd is not specified, the deployer
            must read the deployment descriptor from the default
            location and file name required by the respective
            component specification.
            
          </xsd:documentation>
        </xsd:annotation>
      </xsd:element>
    </xsd:sequence>
    <xsd:attribute name="id"
                   type="xsd:ID"/>
  </xsd:complexType>


<!-- **************************************************** -->

  <xsd:complexType name="webType">
    <xsd:annotation>
      <xsd:documentation>

        The webType defines the web-uri and context-root of
        a web application module.
        
      </xsd:documentation>
    </xsd:annotation>
    <xsd:sequence>
      <xsd:element name="web-uri"
                   type="jakartaee:pathType">
        <xsd:annotation>
          <xsd:documentation>

            The web-uri element specifies the URI of a web
            application file, relative to the top level of the
            application package.
            
          </xsd:documentation>
        </xsd:annotation>
      </xsd:element>
      <xsd:element name="context-root"
                   type="jakartaee:string">
        <xsd:annotation>
          <xsd:documentation>

            The context-root element specifies the context root
            of a web application.
            
          </xsd:documentation>
        </xsd:annotation>
      </xsd:element>
    </xsd:sequence>
    <xsd:attribute name="id"
                   type="xsd:ID"/>
  </xsd:complexType>

</xsd:schema>

*/
