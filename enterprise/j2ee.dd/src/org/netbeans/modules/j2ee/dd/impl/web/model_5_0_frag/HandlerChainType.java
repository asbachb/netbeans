/**
 *	This generated bean class HandlerChainType matches the schema element 'handler-chainType'.
 *  The root bean class is WebFragment
 *
 *	===============================================================
 *	
 *	
 *	        The handler-chain element defines the handlerchain. 
 *	        Handlerchain can be defined such that the handlers in the
 *	        handlerchain operate,all ports of a service, on a specific
 *	        port or on a list of protocol-bindings. The choice of elements
 *	        service-name-pattern, port-name-pattern and protocol-bindings
 *	        are used to specify whether the handlers in handler-chain are
 *	        for a service, port or protocol binding. If none of these 
 *	        choices are specified with the handler-chain element then the
 *	        handlers specified in the handler-chain will be applied on 
 *	        everything.
 *	        
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class HandlerChainType extends org.netbeans.modules.schema2beans.BaseBean
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String SERVICE_NAME_PATTERN = "ServiceNamePattern";	// NOI18N
	static public final String PORT_NAME_PATTERN = "PortNamePattern";	// NOI18N
	static public final String PROTOCOL_BINDINGS = "ProtocolBindings";	// NOI18N
	static public final String HANDLER = "Handler";	// NOI18N

	public HandlerChainType() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public HandlerChainType(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(4);
		this.createProperty("service-name-pattern", 	// NOI18N
			SERVICE_NAME_PATTERN, Common.SEQUENCE_OR | 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("port-name-pattern", 	// NOI18N
			PORT_NAME_PATTERN, Common.SEQUENCE_OR | 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("protocol-bindings", 	// NOI18N
			PROTOCOL_BINDINGS, Common.SEQUENCE_OR | 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			String.class);
		this.createProperty("handler", 	// NOI18N
			HANDLER, 
			Common.TYPE_1_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			HandlerType.class);
		this.createAttribute(HANDLER, "id", "Id", 
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
	public void setServiceNamePattern(java.lang.String value) {
		this.setValue(SERVICE_NAME_PATTERN, value);
		if (value != null) {
			// It's a mutually exclusive property.
			setPortNamePattern(null);
			setProtocolBindings(null);
		}
	}

	//
	public java.lang.String getServiceNamePattern() {
		return (java.lang.String)this.getValue(SERVICE_NAME_PATTERN);
	}

	// This attribute is mandatory
	public void setPortNamePattern(java.lang.String value) {
		this.setValue(PORT_NAME_PATTERN, value);
		if (value != null) {
			// It's a mutually exclusive property.
			setServiceNamePattern(null);
			setProtocolBindings(null);
		}
	}

	//
	public java.lang.String getPortNamePattern() {
		return (java.lang.String)this.getValue(PORT_NAME_PATTERN);
	}

	// This attribute is mandatory
	public void setProtocolBindings(String value) {
		this.setValue(PROTOCOL_BINDINGS, value);
		if (value != null) {
			// It's a mutually exclusive property.
			setServiceNamePattern(null);
			setPortNamePattern(null);
		}
	}

	//
	public String getProtocolBindings() {
		return (String)this.getValue(PROTOCOL_BINDINGS);
	}

	// This attribute is an array containing at least one element
	public void setHandler(int index, HandlerType value) {
		this.setValue(HANDLER, index, value);
	}

	//
	public HandlerType getHandler(int index) {
		return (HandlerType)this.getValue(HANDLER, index);
	}

	// Return the number of properties
	public int sizeHandler() {
		return this.size(HANDLER);
	}

	// This attribute is an array containing at least one element
	public void setHandler(HandlerType[] value) {
		this.setValue(HANDLER, value);
	}

	//
	public HandlerType[] getHandler() {
		return (HandlerType[])this.getValues(HANDLER);
	}

	// Add a new element returning its index in the list
	public int addHandler(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.HandlerType value) {
		int positionOfNewItem = this.addValue(HANDLER, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeHandler(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.HandlerType value) {
		return this.removeValue(HANDLER, value);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public HandlerType newHandlerType() {
		return new HandlerType();
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
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
		// Validating property serviceNamePattern
		if (getServiceNamePattern() != null) {
			{
				boolean patternPassed = false;
				if ((getServiceNamePattern()).matches("\\*|([[_A-Za-z]][[-._A-Za-z0-9]]*:)?[[_A-Za-z]][[-._A-Za-z0-9]]*\\*?")) {
					patternPassed = true;
				}
				restrictionFailure = !patternPassed;
			}
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getServiceNamePattern()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "serviceNamePattern", this);	// NOI18N
			}
		}
		// Validating property portNamePattern
		if (getPortNamePattern() != null) {
			{
				boolean patternPassed = false;
				if ((getPortNamePattern()).matches("\\*|([[_A-Za-z]][[-._A-Za-z0-9]]*:)?[[_A-Za-z]][[-._A-Za-z0-9]]*\\*?")) {
					patternPassed = true;
				}
				restrictionFailure = !patternPassed;
			}
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getPortNamePattern()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "portNamePattern", this);	// NOI18N
			}
		}
		// Validating property protocolBindings
		// Validating property handler
		if (sizeHandler() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("sizeHandler() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "handler", this);	// NOI18N
		}
		for (int _index = 0; _index < sizeHandler(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.HandlerType element = getHandler(_index);
			if (element != null) {
				element.validate();
			}
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("ServiceNamePattern");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getServiceNamePattern();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(SERVICE_NAME_PATTERN, 0, str, indent);

		str.append(indent);
		str.append("PortNamePattern");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getPortNamePattern();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(PORT_NAME_PATTERN, 0, str, indent);

		str.append(indent);
		str.append("ProtocolBindings");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getProtocolBindings();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(PROTOCOL_BINDINGS, 0, str, indent);

		str.append(indent);
		str.append("Handler["+this.sizeHandler()+"]");	// NOI18N
		for(int i=0; i<this.sizeHandler(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getHandler(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(HANDLER, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("HandlerChainType\n");	// NOI18N
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
            version="5.0">
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
      This is the XML Schema for the Servlet 5.0 deployment descriptor.
      The deployment descriptor must be named "META-INF/web-fragment.xml"
      in the web fragment's jar file.  All Servlet deployment descriptors
      must indicate the web application schema by using the Jakarta EE
      namespace:
      
      https://jakarta.ee/xml/ns/jakartaee
      
      and by indicating the version of the schema by
      using the version element as shown below:
      
      <web-fragment xmlns="https://jakarta.ee/xml/ns/jakartaee"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="..."
      version="5.0">
      ...
      </web-fragment>
      
      The instance documents may indicate the published version of
      the schema using the xsi:schemaLocation attribute for Jakarta EE
      namespace with the following location:
      
      https://jakarta.ee/xml/ns/jakartaee/web-fragment_5_0.xsd
      
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

  <xsd:include schemaLocation="web-common_5_0.xsd"/>


<!-- **************************************************** -->

  <xsd:element name="web-fragment"
               type="jakartaee:web-fragmentType">
    <xsd:annotation>
      <xsd:documentation>

        The web-fragment element is the root of the deployment
        descriptor for a web fragment.  Note that the sub-elements
        of this element can be in the arbitrary order. Because of
        that, the multiplicity of the elements of distributable,
        session-config, welcome-file-list, jsp-config, login-config,
        and locale-encoding-mapping-list was changed from "?" to "*"
        in this schema.  However, the deployment descriptor instance
        file must not contain multiple elements of session-config,
        jsp-config, and login-config. When there are multiple elements of
        welcome-file-list or locale-encoding-mapping-list, the container
        must concatenate the element contents.  The multiple occurence
        of the element distributable is redundant and the container
        treats that case exactly in the same way when there is only
        one distributable.
        
      </xsd:documentation>
    </xsd:annotation>
    <xsd:unique name="web-common-servlet-name-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The servlet element contains the name of a servlet.
          The name must be unique within the web application.
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:servlet"/>
      <xsd:field xpath="jakartaee:servlet-name"/>
    </xsd:unique>
    <xsd:unique name="web-common-filter-name-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The filter element contains the name of a filter.
          The name must be unique within the web application.
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:filter"/>
      <xsd:field xpath="jakartaee:filter-name"/>
    </xsd:unique>
    <xsd:unique name="web-common-ejb-local-ref-name-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The ejb-local-ref-name element contains the name of an 
          enterprise bean reference. The enterprise bean reference
          is an entry in the web application's environment and is relative
          to the java:comp/env context.  The name must be unique within
          the web application.
          
          It is recommended that name is prefixed with "ejb/".
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:ejb-local-ref"/>
      <xsd:field xpath="jakartaee:ejb-ref-name"/>
    </xsd:unique>
    <xsd:unique name="web-common-ejb-ref-name-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The ejb-ref-name element contains the name of an  
          enterprise bean reference. The enterprise bean reference 
          is an entry in the web application's environment and is relative 
          to the java:comp/env context.  The name must be unique within
          the web application.
          
          It is recommended that name is prefixed with "ejb/".
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:ejb-ref"/>
      <xsd:field xpath="jakartaee:ejb-ref-name"/>
    </xsd:unique>
    <xsd:unique name="web-common-resource-env-ref-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The resource-env-ref-name element specifies the name of
          a resource environment reference; its value is the
          environment entry name used in the web application code.
          The name is a JNDI name relative to the java:comp/env
          context and must be unique within a web application.
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:resource-env-ref"/>
      <xsd:field xpath="jakartaee:resource-env-ref-name"/>
    </xsd:unique>
    <xsd:unique name="web-common-message-destination-ref-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The message-destination-ref-name element specifies the name of
          a message destination reference; its value is the
          environment entry name used in the web application code.
          The name is a JNDI name relative to the java:comp/env
          context and must be unique within a web application.
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:message-destination-ref"/>
      <xsd:field xpath="jakartaee:message-destination-ref-name"/>
    </xsd:unique>
    <xsd:unique name="web-common-res-ref-name-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The res-ref-name element specifies the name of a
          resource manager connection factory reference.  The name
          is a JNDI name relative to the java:comp/env context.
          The name must be unique within a web application.
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:resource-ref"/>
      <xsd:field xpath="jakartaee:res-ref-name"/>
    </xsd:unique>
    <xsd:unique name="web-common-env-entry-name-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The env-entry-name element contains the name of a web
          application's environment entry.  The name is a JNDI
          name relative to the java:comp/env context.  The name
          must be unique within a web application.
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:env-entry"/>
      <xsd:field xpath="jakartaee:env-entry-name"/>
    </xsd:unique>
    <xsd:key name="web-common-role-name-key">
      <xsd:annotation>
        <xsd:documentation>

          A role-name-key is specified to allow the references
          from the security-role-refs.
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:security-role"/>
      <xsd:field xpath="jakartaee:role-name"/>
    </xsd:key>
    <xsd:keyref name="web-common-role-name-references"
                refer="jakartaee:web-common-role-name-key">
      <xsd:annotation>
        <xsd:documentation>

          The keyref indicates the references from
          security-role-ref to a specified role-name.
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:servlet/jakartaee:security-role-ref"/>
      <xsd:field xpath="jakartaee:role-link"/>
    </xsd:keyref>
  </xsd:element>


<!-- **************************************************** -->

  <xsd:complexType name="web-fragmentType">
    <xsd:choice minOccurs="0"
                maxOccurs="unbounded">
      <xsd:element name="name"
                   type="jakartaee:java-identifierType"/>
      <xsd:group ref="jakartaee:web-commonType"/>
      <xsd:element name="ordering"
                   type="jakartaee:orderingType"/>
    </xsd:choice>
    <xsd:attributeGroup ref="jakartaee:web-common-attributes"/>
  </xsd:complexType>


<!-- **************************************************** -->

  <xsd:complexType name="orderingType">
    <xsd:annotation>
      <xsd:documentation>

        Please see section 8.2.2 of the specification for details.
        
      </xsd:documentation>
    </xsd:annotation>
    <xsd:sequence>
      <xsd:element name="after"
                   type="jakartaee:ordering-orderingType"
                   minOccurs="0"
                   maxOccurs="1"/>
      <xsd:element name="before"
                   type="jakartaee:ordering-orderingType"
                   minOccurs="0"
                   maxOccurs="1"/>
    </xsd:sequence>
  </xsd:complexType>


<!-- **************************************************** -->

  <xsd:complexType name="ordering-orderingType">
    <xsd:annotation>
      <xsd:documentation>

        This element contains a sequence of "name" elements, each of
        which
        refers to an application configuration resource by the "name"
        declared on its web.xml fragment.  This element can also contain
        a single "others" element which specifies that this document
        comes
        before or after other documents within the application.
        See section 8.2.2 of the specification for details.
        
      </xsd:documentation>
    </xsd:annotation>
    <xsd:sequence>
      <xsd:element name="name"
                   type="jakartaee:java-identifierType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="others"
                   type="jakartaee:ordering-othersType"
                   minOccurs="0"
                   maxOccurs="1"/>
    </xsd:sequence>
  </xsd:complexType>

</xsd:schema>

*/
