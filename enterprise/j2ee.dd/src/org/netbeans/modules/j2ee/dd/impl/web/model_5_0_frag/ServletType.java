/**
 *	This generated bean class ServletType matches the schema element 'servletType'.
 *  The root bean class is WebFragment
 *
 *	===============================================================
 *	
 *	
 *	        This group keeps the usage of the contained description related
 *	        elements consistent across Jakarta EE deployment descriptors.
 *	        
 *	        All elements may occur multiple times with different languages,
 *	        to support localization of the content.
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

public class ServletType extends org.netbeans.modules.schema2beans.BaseBean
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String DISPLAY_NAME = "DisplayName";	// NOI18N
	static public final String DISPLAYNAMEID = "DisplayNameId";	// NOI18N
	static public final String DISPLAYNAMEXMLLANG = "DisplayNameXmlLang";	// NOI18N
	static public final String ICON = "Icon";	// NOI18N
	static public final String SERVLET_NAME = "ServletName";	// NOI18N
	static public final String SERVLET_CLASS = "ServletClass";	// NOI18N
	static public final String JSP_FILE = "JspFile";	// NOI18N
	static public final String INIT_PARAM = "InitParam";	// NOI18N
	static public final String LOAD_ON_STARTUP = "LoadOnStartup";	// NOI18N
	static public final String ENABLED = "Enabled";	// NOI18N
	static public final String ASYNC_SUPPORTED = "AsyncSupported";	// NOI18N
	static public final String RUN_AS = "RunAs";	// NOI18N
	static public final String SECURITY_ROLE_REF = "SecurityRoleRef";	// NOI18N
	static public final String MULTIPART_CONFIG = "MultipartConfig";	// NOI18N

	public ServletType() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public ServletType(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(13);
		this.createProperty("description", 	// NOI18N
			DESCRIPTION, 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(DESCRIPTION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute(DESCRIPTION, "xml:lang", "XmlLang", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("display-name", 	// NOI18N
			DISPLAY_NAME, 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(DISPLAY_NAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute(DISPLAY_NAME, "xml:lang", "XmlLang", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("icon", 	// NOI18N
			ICON, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			IconType.class);
		this.createAttribute(ICON, "xml:lang", "XmlLang", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute(ICON, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("servlet-name", 	// NOI18N
			SERVLET_NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("servlet-class", 	// NOI18N
			SERVLET_CLASS, Common.SEQUENCE_OR | 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("jsp-file", 	// NOI18N
			JSP_FILE, Common.SEQUENCE_OR | 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("init-param", 	// NOI18N
			INIT_PARAM, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ParamValueType.class);
		this.createAttribute(INIT_PARAM, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("load-on-startup", 	// NOI18N
			LOAD_ON_STARTUP, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			String.class);
		this.createProperty("enabled", 	// NOI18N
			ENABLED, 
			Common.TYPE_0_1 | Common.TYPE_BOOLEAN | Common.TYPE_SHOULD_NOT_BE_EMPTY | Common.TYPE_KEY, 
			Boolean.class);
		this.createProperty("async-supported", 	// NOI18N
			ASYNC_SUPPORTED, 
			Common.TYPE_0_1 | Common.TYPE_BOOLEAN | Common.TYPE_SHOULD_NOT_BE_EMPTY | Common.TYPE_KEY, 
			Boolean.class);
		this.createProperty("run-as", 	// NOI18N
			RUN_AS, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			RunAsType.class);
		this.createAttribute(RUN_AS, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("security-role-ref", 	// NOI18N
			SECURITY_ROLE_REF, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			SecurityRoleRefType.class);
		this.createAttribute(SECURITY_ROLE_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("multipart-config", 	// NOI18N
			MULTIPART_CONFIG, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			MultipartConfigType.class);
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

	// This attribute is an array, possibly empty
	public void setDescription(int index, java.lang.String value) {
		this.setValue(DESCRIPTION, index, value);
	}

	//
	public java.lang.String getDescription(int index) {
		return (java.lang.String)this.getValue(DESCRIPTION, index);
	}

	// Return the number of properties
	public int sizeDescription() {
		return this.size(DESCRIPTION);
	}

	// This attribute is an array, possibly empty
	public void setDescription(java.lang.String[] value) {
		this.setValue(DESCRIPTION, value);
	}

	//
	public java.lang.String[] getDescription() {
		return (java.lang.String[])this.getValues(DESCRIPTION);
	}

	// Add a new element returning its index in the list
	public int addDescription(java.lang.String value) {
		int positionOfNewItem = this.addValue(DESCRIPTION, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeDescription(java.lang.String value) {
		return this.removeValue(DESCRIPTION, value);
	}

	// This attribute is an array, possibly empty
	public void setDescriptionId(int index, java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DESCRIPTION) == 0) {
			addValue(DESCRIPTION, "");
		}
		setAttributeValue(DESCRIPTION, index, "Id", value);
	}

	//
	public java.lang.String getDescriptionId(int index) {
		// If our element does not exist, then the attribute does not exist.
		if (size(DESCRIPTION) == 0) {
			return null;
		} else {
			return getAttributeValue(DESCRIPTION, index, "Id");
		}
	}

	// Return the number of properties
	public int sizeDescriptionId() {
		return this.size(DESCRIPTION);
	}

	// This attribute is an array, possibly empty
	public void setDescriptionXmlLang(int index, java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DESCRIPTION) == 0) {
			addValue(DESCRIPTION, "");
		}
		setAttributeValue(DESCRIPTION, index, "XmlLang", value);
	}

	//
	public java.lang.String getDescriptionXmlLang(int index) {
		// If our element does not exist, then the attribute does not exist.
		if (size(DESCRIPTION) == 0) {
			return null;
		} else {
			return getAttributeValue(DESCRIPTION, index, "XmlLang");
		}
	}

	// Return the number of properties
	public int sizeDescriptionXmlLang() {
		return this.size(DESCRIPTION);
	}

	// This attribute is an array, possibly empty
	public void setDisplayName(int index, java.lang.String value) {
		this.setValue(DISPLAY_NAME, index, value);
	}

	//
	public java.lang.String getDisplayName(int index) {
		return (java.lang.String)this.getValue(DISPLAY_NAME, index);
	}

	// Return the number of properties
	public int sizeDisplayName() {
		return this.size(DISPLAY_NAME);
	}

	// This attribute is an array, possibly empty
	public void setDisplayName(java.lang.String[] value) {
		this.setValue(DISPLAY_NAME, value);
	}

	//
	public java.lang.String[] getDisplayName() {
		return (java.lang.String[])this.getValues(DISPLAY_NAME);
	}

	// Add a new element returning its index in the list
	public int addDisplayName(java.lang.String value) {
		int positionOfNewItem = this.addValue(DISPLAY_NAME, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeDisplayName(java.lang.String value) {
		return this.removeValue(DISPLAY_NAME, value);
	}

	// This attribute is an array, possibly empty
	public void setDisplayNameId(int index, java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DISPLAY_NAME) == 0) {
			addValue(DISPLAY_NAME, "");
		}
		setAttributeValue(DISPLAY_NAME, index, "Id", value);
	}

	//
	public java.lang.String getDisplayNameId(int index) {
		// If our element does not exist, then the attribute does not exist.
		if (size(DISPLAY_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(DISPLAY_NAME, index, "Id");
		}
	}

	// Return the number of properties
	public int sizeDisplayNameId() {
		return this.size(DISPLAY_NAME);
	}

	// This attribute is an array, possibly empty
	public void setDisplayNameXmlLang(int index, java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DISPLAY_NAME) == 0) {
			addValue(DISPLAY_NAME, "");
		}
		setAttributeValue(DISPLAY_NAME, index, "XmlLang", value);
	}

	//
	public java.lang.String getDisplayNameXmlLang(int index) {
		// If our element does not exist, then the attribute does not exist.
		if (size(DISPLAY_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(DISPLAY_NAME, index, "XmlLang");
		}
	}

	// Return the number of properties
	public int sizeDisplayNameXmlLang() {
		return this.size(DISPLAY_NAME);
	}

	// This attribute is an array, possibly empty
	public void setIcon(int index, IconType value) {
		this.setValue(ICON, index, value);
	}

	//
	public IconType getIcon(int index) {
		return (IconType)this.getValue(ICON, index);
	}

	// Return the number of properties
	public int sizeIcon() {
		return this.size(ICON);
	}

	// This attribute is an array, possibly empty
	public void setIcon(IconType[] value) {
		this.setValue(ICON, value);
	}

	//
	public IconType[] getIcon() {
		return (IconType[])this.getValues(ICON);
	}

	// Add a new element returning its index in the list
	public int addIcon(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.IconType value) {
		int positionOfNewItem = this.addValue(ICON, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeIcon(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.IconType value) {
		return this.removeValue(ICON, value);
	}

	// This attribute is mandatory
	public void setServletName(java.lang.String value) {
		this.setValue(SERVLET_NAME, value);
	}

	//
	public java.lang.String getServletName() {
		return (java.lang.String)this.getValue(SERVLET_NAME);
	}

	// This attribute is mandatory
	public void setServletClass(java.lang.String value) {
		this.setValue(SERVLET_CLASS, value);
		if (value != null) {
			// It's a mutually exclusive property.
			setJspFile(null);
		}
	}

	//
	public java.lang.String getServletClass() {
		return (java.lang.String)this.getValue(SERVLET_CLASS);
	}

	// This attribute is mandatory
	public void setJspFile(java.lang.String value) {
		this.setValue(JSP_FILE, value);
		if (value != null) {
			// It's a mutually exclusive property.
			setServletClass(null);
		}
	}

	//
	public java.lang.String getJspFile() {
		return (java.lang.String)this.getValue(JSP_FILE);
	}

	// This attribute is an array, possibly empty
	public void setInitParam(int index, ParamValueType value) {
		this.setValue(INIT_PARAM, index, value);
	}

	//
	public ParamValueType getInitParam(int index) {
		return (ParamValueType)this.getValue(INIT_PARAM, index);
	}

	// Return the number of properties
	public int sizeInitParam() {
		return this.size(INIT_PARAM);
	}

	// This attribute is an array, possibly empty
	public void setInitParam(ParamValueType[] value) {
		this.setValue(INIT_PARAM, value);
	}

	//
	public ParamValueType[] getInitParam() {
		return (ParamValueType[])this.getValues(INIT_PARAM);
	}

	// Add a new element returning its index in the list
	public int addInitParam(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ParamValueType value) {
		int positionOfNewItem = this.addValue(INIT_PARAM, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeInitParam(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ParamValueType value) {
		return this.removeValue(INIT_PARAM, value);
	}

	// This attribute is optional
	public void setLoadOnStartup(String value) {
		this.setValue(LOAD_ON_STARTUP, value);
	}

	//
	public String getLoadOnStartup() {
		return (String)this.getValue(LOAD_ON_STARTUP);
	}

	// This attribute is optional
	public void setEnabled(boolean value) {
		this.setValue(ENABLED, (value ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
	}

	//
	public boolean isEnabled() {
		Boolean ret = (Boolean)this.getValue(ENABLED);
		if (ret == null)
			ret = (Boolean)Common.defaultScalarValue(Common.TYPE_BOOLEAN);
		return ((java.lang.Boolean)ret).booleanValue();
	}

	// This attribute is optional
	public void setAsyncSupported(boolean value) {
		this.setValue(ASYNC_SUPPORTED, (value ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
	}

	//
	public boolean isAsyncSupported() {
		Boolean ret = (Boolean)this.getValue(ASYNC_SUPPORTED);
		if (ret == null)
			ret = (Boolean)Common.defaultScalarValue(Common.TYPE_BOOLEAN);
		return ((java.lang.Boolean)ret).booleanValue();
	}

	// This attribute is optional
	public void setRunAs(RunAsType value) {
		this.setValue(RUN_AS, value);
	}

	//
	public RunAsType getRunAs() {
		return (RunAsType)this.getValue(RUN_AS);
	}

	// This attribute is an array, possibly empty
	public void setSecurityRoleRef(int index, SecurityRoleRefType value) {
		this.setValue(SECURITY_ROLE_REF, index, value);
	}

	//
	public SecurityRoleRefType getSecurityRoleRef(int index) {
		return (SecurityRoleRefType)this.getValue(SECURITY_ROLE_REF, index);
	}

	// Return the number of properties
	public int sizeSecurityRoleRef() {
		return this.size(SECURITY_ROLE_REF);
	}

	// This attribute is an array, possibly empty
	public void setSecurityRoleRef(SecurityRoleRefType[] value) {
		this.setValue(SECURITY_ROLE_REF, value);
	}

	//
	public SecurityRoleRefType[] getSecurityRoleRef() {
		return (SecurityRoleRefType[])this.getValues(SECURITY_ROLE_REF);
	}

	// Add a new element returning its index in the list
	public int addSecurityRoleRef(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.SecurityRoleRefType value) {
		int positionOfNewItem = this.addValue(SECURITY_ROLE_REF, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeSecurityRoleRef(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.SecurityRoleRefType value) {
		return this.removeValue(SECURITY_ROLE_REF, value);
	}

	// This attribute is optional
	public void setMultipartConfig(MultipartConfigType value) {
		this.setValue(MULTIPART_CONFIG, value);
	}

	//
	public MultipartConfigType getMultipartConfig() {
		return (MultipartConfigType)this.getValue(MULTIPART_CONFIG);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public IconType newIconType() {
		return new IconType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public ParamValueType newParamValueType() {
		return new ParamValueType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public RunAsType newRunAsType() {
		return new RunAsType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public SecurityRoleRefType newSecurityRoleRefType() {
		return new SecurityRoleRefType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public MultipartConfigType newMultipartConfigType() {
		return new MultipartConfigType();
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
		// Validating property description
		// Validating property descriptionId
		// Validating property descriptionXmlLang
		// Validating property displayName
		for (int _index = 0; _index < sizeDisplayName(); ++_index) {
			java.lang.String element = getDisplayName(_index);
			if (element != null) {
				// has whitespace restriction
				if (restrictionFailure) {
					throw new org.netbeans.modules.schema2beans.ValidateException("element whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "displayName", this);	// NOI18N
				}
			}
		}
		// Validating property displayNameId
		// Validating property displayNameXmlLang
		// Validating property icon
		for (int _index = 0; _index < sizeIcon(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.IconType element = getIcon(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property servletName
		if (getServletName() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getServletName() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "servletName", this);	// NOI18N
		}
		if ((getServletName()).length() < 1) {
			restrictionFailure = true;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getServletName() minLength (1)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "servletName", this);	// NOI18N
		}
		// Validating property servletClass
		// Validating property jspFile
		// Validating property initParam
		for (int _index = 0; _index < sizeInitParam(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ParamValueType element = getInitParam(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property loadOnStartup
		restrictionPassed = false;
		if (getLoadOnStartup() != null) {
			{
				final java.lang.String[] enumRestrictionLoadOnStartup = {""};
				restrictionFailure = true;
				for (int _index2 = 0; 
					_index2 < enumRestrictionLoadOnStartup.length; ++_index2) {
					if (enumRestrictionLoadOnStartup[_index2].equals(getLoadOnStartup())) {
						restrictionFailure = false;
						break;
					}
				}
				if (!restrictionPassed) {
					restrictionPassed = !restrictionFailure;
				}
				restrictionFailure = false;
			}
			if (!restrictionPassed) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getLoadOnStartup()", org.netbeans.modules.schema2beans.ValidateException.FailureType.ALL_RESTRICTIONS, "loadOnStartup", this);	// NOI18N
			}
		}
		// Validating property enabled
		{
			boolean patternPassed = false;
			if ((isEnabled() ? "true" : "false").matches("(true|false)")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("isEnabled()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "enabled", this);	// NOI18N
		}
		// Validating property asyncSupported
		{
			boolean patternPassed = false;
			if ((isAsyncSupported() ? "true" : "false").matches("(true|false)")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("isAsyncSupported()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "asyncSupported", this);	// NOI18N
		}
		// Validating property runAs
		if (getRunAs() != null) {
			getRunAs().validate();
		}
		// Validating property securityRoleRef
		for (int _index = 0; _index < sizeSecurityRoleRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.SecurityRoleRefType element = getSecurityRoleRef(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property multipartConfig
		if (getMultipartConfig() != null) {
			getMultipartConfig().validate();
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("Description["+this.sizeDescription()+"]");	// NOI18N
		for(int i=0; i<this.sizeDescription(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getDescription(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(DESCRIPTION, i, str, indent);
		}

		str.append(indent);
		str.append("DisplayName["+this.sizeDisplayName()+"]");	// NOI18N
		for(int i=0; i<this.sizeDisplayName(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getDisplayName(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(DISPLAY_NAME, i, str, indent);
		}

		str.append(indent);
		str.append("Icon["+this.sizeIcon()+"]");	// NOI18N
		for(int i=0; i<this.sizeIcon(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getIcon(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(ICON, i, str, indent);
		}

		str.append(indent);
		str.append("ServletName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getServletName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(SERVLET_NAME, 0, str, indent);

		str.append(indent);
		str.append("ServletClass");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getServletClass();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(SERVLET_CLASS, 0, str, indent);

		str.append(indent);
		str.append("JspFile");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getJspFile();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(JSP_FILE, 0, str, indent);

		str.append(indent);
		str.append("InitParam["+this.sizeInitParam()+"]");	// NOI18N
		for(int i=0; i<this.sizeInitParam(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getInitParam(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(INIT_PARAM, i, str, indent);
		}

		str.append(indent);
		str.append("LoadOnStartup");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getLoadOnStartup();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(LOAD_ON_STARTUP, 0, str, indent);

		str.append(indent);
		str.append("Enabled");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append((this.isEnabled()?"true":"false"));
		this.dumpAttributes(ENABLED, 0, str, indent);

		str.append(indent);
		str.append("AsyncSupported");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append((this.isAsyncSupported()?"true":"false"));
		this.dumpAttributes(ASYNC_SUPPORTED, 0, str, indent);

		str.append(indent);
		str.append("RunAs");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getRunAs();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(RUN_AS, 0, str, indent);

		str.append(indent);
		str.append("SecurityRoleRef["+this.sizeSecurityRoleRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeSecurityRoleRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getSecurityRoleRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(SECURITY_ROLE_REF, i, str, indent);
		}

		str.append(indent);
		str.append("MultipartConfig");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getMultipartConfig();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(MULTIPART_CONFIG, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("ServletType\n");	// NOI18N
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
