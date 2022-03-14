/**
 *	This generated bean class WebFragment matches the schema element 'web-fragment'.
 *
 *	===============================================================
 *	
 *	
 *	        This group keeps the usage of the contained JNDI environment
 *	        reference elements consistent across Jakarta EE deployment descriptors.
 *	        
 *	      
 *	===============================================================
 *
 *	This class matches the root element of the XML Schema,
 *	and is the root of the following bean graph:
 *
 *	webFragment <web-fragment> : WebFragment
 *		[attr: version CDATA #REQUIRED 5.0 : java.lang.String] 	[enumeration (5.0)]
 *		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		[attr: metadata-complete CDATA #IMPLIED  : boolean]
 *		(
 *		  | name <name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | description <description> : java.lang.String[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | icon <icon> : IconType[0,n]
 *		  | | 	[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	smallIcon <small-icon> : java.lang.String[0,1]
 *		  | | 	largeIcon <large-icon> : java.lang.String[0,1]
 *		  | | distributable <distributable> : EmptyType
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | contextParam <context-param> : ParamValueType
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	paramName <param-name> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	paramValue <param-value> : java.lang.String
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | filter <filter> : FilterType
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	icon <icon> : IconType[0,n]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		smallIcon <small-icon> : java.lang.String[0,1]
 *		  | | 		largeIcon <large-icon> : java.lang.String[0,1]
 *		  | | 	filterName <filter-name> : java.lang.String 	[minLength (1)]
 *		  | | 	filterClass <filter-class> : java.lang.String[0,1]
 *		  | | 	asyncSupported <async-supported> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 	initParam <init-param> : ParamValueType[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		description <description> : java.lang.String[0,n]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		paramName <param-name> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		paramValue <param-value> : java.lang.String
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | filterMapping <filter-mapping> : FilterMappingType
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	filterName <filter-name> : java.lang.String 	[minLength (1)]
 *		  | | 	(
 *		  | | 	  | urlPattern <url-pattern> : java.lang.String
 *		  | | 	  | servletName <servlet-name> : java.lang.String 	[minLength (1)]
 *		  | | 	)[1,n]
 *		  | | 	dispatcher <dispatcher> : java.lang.String[0,n] 	[enumeration (FORWARD), enumeration (INCLUDE), enumeration (REQUEST), enumeration (ASYNC), enumeration (ERROR), maxOccurs (5)]
 *		  | | listener <listener> : ListenerType
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	icon <icon> : IconType[0,n]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		smallIcon <small-icon> : java.lang.String[0,1]
 *		  | | 		largeIcon <large-icon> : java.lang.String[0,1]
 *		  | | 	listenerClass <listener-class> : java.lang.String
 *		  | | servlet <servlet> : ServletType
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	icon <icon> : IconType[0,n]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		smallIcon <small-icon> : java.lang.String[0,1]
 *		  | | 		largeIcon <large-icon> : java.lang.String[0,1]
 *		  | | 	servletName <servlet-name> : java.lang.String 	[minLength (1)]
 *		  | | 	(
 *		  | | 	  | servletClass <servlet-class> : java.lang.String
 *		  | | 	  | jspFile <jsp-file> : java.lang.String
 *		  | | 	)[0,1]
 *		  | | 	initParam <init-param> : ParamValueType[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		description <description> : java.lang.String[0,n]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		paramName <param-name> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		paramValue <param-value> : java.lang.String
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	loadOnStartup <load-on-startup> : String[0,1] 	[enumeration ()]
 *		  | | 	enabled <enabled> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 	asyncSupported <async-supported> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 	runAs <run-as> : RunAsType[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		description <description> : java.lang.String[0,n]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		roleName <role-name> : java.lang.String
 *		  | | 	securityRoleRef <security-role-ref> : SecurityRoleRefType[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		description <description> : java.lang.String[0,n]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		roleName <role-name> : java.lang.String
 *		  | | 		roleLink <role-link> : java.lang.String[0,1]
 *		  | | 	multipartConfig <multipart-config> : MultipartConfigType[0,1]
 *		  | | 		location <location> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		maxFileSize <max-file-size> : long[0,1]
 *		  | | 		maxRequestSize <max-request-size> : long[0,1]
 *		  | | 		fileSizeThreshold <file-size-threshold> : java.math.BigInteger[0,1]
 *		  | | servletMapping <servlet-mapping> : ServletMappingType
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	servletName <servlet-name> : java.lang.String 	[minLength (1)]
 *		  | | 	urlPattern <url-pattern> : java.lang.String[1,n]
 *		  | | sessionConfig <session-config> : SessionConfigType
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	sessionTimeout <session-timeout> : java.math.BigInteger[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	cookieConfig <cookie-config> : CookieConfigType[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		name <name> : java.lang.String[0,1] 	[minLength (1)]
 *		  | | 		domain <domain> : java.lang.String[0,1] 	[minLength (1)]
 *		  | | 		path <path> : java.lang.String[0,1] 	[minLength (1)]
 *		  | | 		comment <comment> : java.lang.String[0,1] 	[minLength (1)]
 *		  | | 		httpOnly <http-only> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 		secure <secure> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 		maxAge <max-age> : java.math.BigInteger[0,1]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	trackingMode <tracking-mode> : java.lang.String[0,n] 	[enumeration (COOKIE), enumeration (URL), enumeration (SSL), maxOccurs (3)]
 *		  | | mimeMapping <mime-mapping> : MimeMappingType
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	extension <extension> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	mimeType <mime-type> : java.lang.String 	[pattern ([^\p{Cc}^\s]+/[^\p{Cc}^\s]+)]
 *		  | | welcomeFileList <welcome-file-list> : WelcomeFileListType
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	welcomeFile <welcome-file> : java.lang.String[1,n]
 *		  | | errorPage <error-page> : ErrorPageType
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	(
 *		  | | 	  | errorCode <error-code> : long 	[pattern (\d{3})]
 *		  | | 	  | exceptionType <exception-type> : java.lang.String
 *		  | | 	)[0,1]
 *		  | | 	location <location> : java.lang.String 	[pattern (/.*)]
 *		  | | jspConfig <jsp-config> : JspConfigType
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	taglib <taglib> : TaglibType[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		taglibUri <taglib-uri> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		taglibLocation <taglib-location> : java.lang.String
 *		  | | 	jspPropertyGroup <jsp-property-group> : JspPropertyGroupType[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		description <description> : java.lang.String[0,n]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		icon <icon> : IconType[0,n]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			smallIcon <small-icon> : java.lang.String[0,1]
 *		  | | 			largeIcon <large-icon> : java.lang.String[0,1]
 *		  | | 		urlPattern <url-pattern> : java.lang.String[1,n]
 *		  | | 		elIgnored <el-ignored> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 		pageEncoding <page-encoding> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		scriptingInvalid <scripting-invalid> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 		isXml <is-xml> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 		includePrelude <include-prelude> : java.lang.String[0,n]
 *		  | | 		includeCoda <include-coda> : java.lang.String[0,n]
 *		  | | 		deferredSyntaxAllowedAsLiteral <deferred-syntax-allowed-as-literal> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 		trimDirectiveWhitespaces <trim-directive-whitespaces> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 		defaultContentType <default-content-type> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		buffer <buffer> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		errorOnUndeclaredNamespace <error-on-undeclared-namespace> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | securityConstraint <security-constraint> : SecurityConstraintType
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	webResourceCollection <web-resource-collection> : WebResourceCollectionType[1,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		webResourceName <web-resource-name> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		description <description> : java.lang.String[0,n]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		urlPattern <url-pattern> : java.lang.String[1,n]
 *		  | | 		(
 *		  | | 		  | httpMethod <http-method> : java.lang.String[1,n] 	[pattern ([!-~-[\(\)<>@,;:"/\[\]?=\{\}\\\p{Z}]]+)]
 *		  | | 		  | httpMethodOmission <http-method-omission> : java.lang.String[1,n] 	[pattern ([!-~-[\(\)<>@,;:"/\[\]?=\{\}\\\p{Z}]]+)]
 *		  | | 		)[0,1]
 *		  | | 	authConstraint <auth-constraint> : AuthConstraintType[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		description <description> : java.lang.String[0,n]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		roleName <role-name> : java.lang.String[0,n]
 *		  | | 	userDataConstraint <user-data-constraint> : UserDataConstraintType[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		description <description> : java.lang.String[0,n]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		transportGuarantee <transport-guarantee> : java.lang.String 	[enumeration (NONE), enumeration (INTEGRAL), enumeration (CONFIDENTIAL)]
 *		  | | loginConfig <login-config> : LoginConfigType
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	authMethod <auth-method> : java.lang.String[0,1]
 *		  | | 	realmName <realm-name> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	formLoginConfig <form-login-config> : FormLoginConfigType[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		formLoginPage <form-login-page> : java.lang.String 	[pattern (/.*)]
 *		  | | 		formErrorPage <form-error-page> : java.lang.String 	[pattern (/.*)]
 *		  | | securityRole <security-role> : SecurityRoleType
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	roleName <role-name> : java.lang.String
 *		  | | envEntry <env-entry> : EnvEntryType[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	envEntryName <env-entry-name> : java.lang.String
 *		  | | 	envEntryType <env-entry-type> : java.lang.String[0,1]
 *		  | | 	envEntryValue <env-entry-value> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	mappedName <mapped-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	injectionTarget <injection-target> : InjectionTargetType[0,n]
 *		  | | 		injectionTargetClass <injection-target-class> : java.lang.String
 *		  | | 		injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | 	lookupName <lookup-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | ejbRef <ejb-ref> : EjbRefType[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	ejbRefName <ejb-ref-name> : java.lang.String
 *		  | | 	ejbRefType <ejb-ref-type> : java.lang.String[0,1] 	[enumeration (Entity), enumeration (Session)]
 *		  | | 	home <home> : java.lang.String[0,1]
 *		  | | 	remote <remote> : java.lang.String[0,1]
 *		  | | 	ejbLink <ejb-link> : java.lang.String[0,1]
 *		  | | 	mappedName <mapped-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	injectionTarget <injection-target> : InjectionTargetType[0,n]
 *		  | | 		injectionTargetClass <injection-target-class> : java.lang.String
 *		  | | 		injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | 	lookupName <lookup-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | ejbLocalRef <ejb-local-ref> : EjbLocalRefType[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	ejbRefName <ejb-ref-name> : java.lang.String
 *		  | | 	ejbRefType <ejb-ref-type> : java.lang.String[0,1] 	[enumeration (Entity), enumeration (Session)]
 *		  | | 	localHome <local-home> : java.lang.String[0,1]
 *		  | | 	local <local> : java.lang.String[0,1]
 *		  | | 	ejbLink <ejb-link> : java.lang.String[0,1]
 *		  | | 	mappedName <mapped-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	injectionTarget <injection-target> : InjectionTargetType[0,n]
 *		  | | 		injectionTargetClass <injection-target-class> : java.lang.String
 *		  | | 		injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | 	lookupName <lookup-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | serviceRef <service-ref> : ServiceRefType[0,n] 	[key name='service-ref_handler-name-key']
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	icon <icon> : IconType[0,n]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		smallIcon <small-icon> : java.lang.String[0,1]
 *		  | | 		largeIcon <large-icon> : java.lang.String[0,1]
 *		  | | 	serviceRefName <service-ref-name> : java.lang.String
 *		  | | 	serviceInterface <service-interface> : java.lang.String
 *		  | | 	serviceRefType <service-ref-type> : java.lang.String[0,1]
 *		  | | 	wsdlFile <wsdl-file> : java.net.URI[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	jaxrpcMappingFile <jaxrpc-mapping-file> : java.lang.String[0,1]
 *		  | | 	serviceQname <service-qname> : javax.xml.namespace.QName[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	portComponentRef <port-component-ref> : PortComponentRefType[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		serviceEndpointInterface <service-endpoint-interface> : java.lang.String
 *		  | | 		enableMtom <enable-mtom> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 		mtomThreshold <mtom-threshold> : java.math.BigInteger[0,1] 	[minInclusive (0)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		addressing <addressing> : AddressingType[0,1]
 *		  | | 			enabled <enabled> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 			required <required> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 			responses <responses> : java.lang.String[0,1] 	[enumeration (ANONYMOUS), enumeration (NON_ANONYMOUS), enumeration (ALL)]
 *		  | | 		respectBinding <respect-binding> : RespectBindingType[0,1]
 *		  | | 			enabled <enabled> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 		portComponentLink <port-component-link> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| handler <handler> : HandlerType[0,n]
 *		  | | 	| 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 	description <description> : java.lang.String[0,n]
 *		  | | 	| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	| 	displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 	| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	| 	icon <icon> : IconType[0,n]
 *		  | | 	| 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 		smallIcon <small-icon> : java.lang.String[0,1]
 *		  | | 	| 		largeIcon <large-icon> : java.lang.String[0,1]
 *		  | | 	| 	handlerName <handler-name> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 	| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 	handlerClass <handler-class> : java.lang.String
 *		  | | 	| 	initParam <init-param> : ParamValueType[0,n]
 *		  | | 	| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 		description <description> : java.lang.String[0,n]
 *		  | | 	| 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	| 		paramName <param-name> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 	| 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 		paramValue <param-value> : java.lang.String
 *		  | | 	| 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 	soapHeader <soap-header> : javax.xml.namespace.QName[0,n]
 *		  | | 	| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 	soapRole <soap-role> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 	| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 	portName <port-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 	| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| handlerChains <handler-chains> : HandlerChainsType[0,1]
 *		  | | 	| 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 	handlerChain <handler-chain> : HandlerChainType[0,n]
 *		  | | 	| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 		(
 *		  | | 	| 		  | serviceNamePattern <service-name-pattern> : java.lang.String 	[pattern (\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?)]
 *		  | | 	| 		  | portNamePattern <port-name-pattern> : java.lang.String 	[pattern (\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?)]
 *		  | | 	| 		  | protocolBindings <protocol-bindings> : String
 *		  | | 	| 		)[0,1]
 *		  | | 	| 		handler <handler> : HandlerType[1,n]
 *		  | | 	| 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 			description <description> : java.lang.String[0,n]
 *		  | | 	| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	| 			displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 	| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	| 			icon <icon> : IconType[0,n]
 *		  | | 	| 				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 				smallIcon <small-icon> : java.lang.String[0,1]
 *		  | | 	| 				largeIcon <large-icon> : java.lang.String[0,1]
 *		  | | 	| 			handlerName <handler-name> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 	| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 			handlerClass <handler-class> : java.lang.String
 *		  | | 	| 			initParam <init-param> : ParamValueType[0,n]
 *		  | | 	| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 				description <description> : java.lang.String[0,n]
 *		  | | 	| 					[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 					[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	| 				paramName <param-name> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 	| 					[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 				paramValue <param-value> : java.lang.String
 *		  | | 	| 					[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 			soapHeader <soap-header> : javax.xml.namespace.QName[0,n]
 *		  | | 	| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 			soapRole <soap-role> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 	| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 			portName <port-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 	| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	mappedName <mapped-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	injectionTarget <injection-target> : InjectionTargetType[0,n]
 *		  | | 		injectionTargetClass <injection-target-class> : java.lang.String
 *		  | | 		injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | 	lookupName <lookup-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | resourceRef <resource-ref> : ResourceRefType[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	resRefName <res-ref-name> : java.lang.String
 *		  | | 	resType <res-type> : java.lang.String[0,1]
 *		  | | 	resAuth <res-auth> : java.lang.String[0,1] 	[enumeration (Application), enumeration (Container)]
 *		  | | 	resSharingScope <res-sharing-scope> : java.lang.String[0,1] 	[enumeration (Shareable), enumeration (Unshareable)]
 *		  | | 	mappedName <mapped-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	injectionTarget <injection-target> : InjectionTargetType[0,n]
 *		  | | 		injectionTargetClass <injection-target-class> : java.lang.String
 *		  | | 		injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | 	lookupName <lookup-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | resourceEnvRef <resource-env-ref> : ResourceEnvRefType[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	resourceEnvRefName <resource-env-ref-name> : java.lang.String
 *		  | | 	resourceEnvRefType <resource-env-ref-type> : java.lang.String[0,1]
 *		  | | 	mappedName <mapped-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	injectionTarget <injection-target> : InjectionTargetType[0,n]
 *		  | | 		injectionTargetClass <injection-target-class> : java.lang.String
 *		  | | 		injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | 	lookupName <lookup-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | messageDestinationRef <message-destination-ref> : MessageDestinationRefType[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	messageDestinationRefName <message-destination-ref-name> : java.lang.String
 *		  | | 	messageDestinationType <message-destination-type> : java.lang.String[0,1]
 *		  | | 	messageDestinationUsage <message-destination-usage> : java.lang.String[0,1] 	[enumeration (Consumes), enumeration (Produces), enumeration (ConsumesProduces)]
 *		  | | 	messageDestinationLink <message-destination-link> : java.lang.String[0,1]
 *		  | | 	mappedName <mapped-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	injectionTarget <injection-target> : InjectionTargetType[0,n]
 *		  | | 		injectionTargetClass <injection-target-class> : java.lang.String
 *		  | | 		injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | 	lookupName <lookup-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | persistenceContextRef <persistence-context-ref> : PersistenceContextRefType[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	persistenceContextRefName <persistence-context-ref-name> : java.lang.String
 *		  | | 	persistenceUnitName <persistence-unit-name> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	persistenceContextType <persistence-context-type> : java.lang.String[0,1] 	[enumeration (Transaction), enumeration (Extended)]
 *		  | | 	persistenceContextSynchronization <persistence-context-synchronization> : java.lang.String[0,1] 	[enumeration (Synchronized), enumeration (Unsynchronized)]
 *		  | | 	persistenceProperty <persistence-property> : PropertyType[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		name <name> : java.lang.String
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		value <value> : java.lang.String
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	mappedName <mapped-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	injectionTarget <injection-target> : InjectionTargetType[0,n]
 *		  | | 		injectionTargetClass <injection-target-class> : java.lang.String
 *		  | | 		injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | persistenceUnitRef <persistence-unit-ref> : PersistenceUnitRefType[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	persistenceUnitRefName <persistence-unit-ref-name> : java.lang.String
 *		  | | 	persistenceUnitName <persistence-unit-name> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	mappedName <mapped-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	injectionTarget <injection-target> : InjectionTargetType[0,n]
 *		  | | 		injectionTargetClass <injection-target-class> : java.lang.String
 *		  | | 		injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | postConstruct <post-construct> : LifecycleCallbackType[0,n]
 *		  | | 	lifecycleCallbackClass <lifecycle-callback-class> : java.lang.String[0,1]
 *		  | | 	lifecycleCallbackMethod <lifecycle-callback-method> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | preDestroy <pre-destroy> : LifecycleCallbackType[0,n]
 *		  | | 	lifecycleCallbackClass <lifecycle-callback-class> : java.lang.String[0,1]
 *		  | | 	lifecycleCallbackMethod <lifecycle-callback-method> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | dataSource <data-source> : DataSourceType[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	name <name> : java.lang.String
 *		  | | 	className <class-name> : java.lang.String[0,1]
 *		  | | 	serverName <server-name> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	portNumber <port-number> : java.math.BigInteger[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	databaseName <database-name> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	url <url> : java.lang.String[0,1] 	[pattern (jdbc:(.*):(.*))]
 *		  | | 	user <user> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	password <password> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	property2 <property> : PropertyType[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		name <name> : java.lang.String
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		value <value> : java.lang.String
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	loginTimeout <login-timeout> : java.math.BigInteger[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	transactional <transactional> : boolean[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	isolationLevel <isolation-level> : java.lang.String[0,1] 	[enumeration (TRANSACTION_READ_UNCOMMITTED), enumeration (TRANSACTION_READ_COMMITTED), enumeration (TRANSACTION_REPEATABLE_READ), enumeration (TRANSACTION_SERIALIZABLE)]
 *		  | | 	initialPoolSize <initial-pool-size> : java.math.BigInteger[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	maxPoolSize <max-pool-size> : java.math.BigInteger[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	minPoolSize <min-pool-size> : java.math.BigInteger[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	maxIdleTime <max-idle-time> : java.math.BigInteger[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	maxStatements <max-statements> : java.math.BigInteger[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | jmsConnectionFactory <jms-connection-factory> : JmsConnectionFactoryType[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | jmsDestination <jms-destination> : JmsDestinationType[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | mailSession <mail-session> : MailSessionType[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | connectionFactory <connection-factory> : ConnectionFactoryResourceType[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | administeredObject <administered-object> : AdministeredObjectType[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | messageDestination <message-destination> : MessageDestinationType
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | localeEncodingMappingList <locale-encoding-mapping-list> : LocaleEncodingMappingListType
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | ordering <ordering> : OrderingType
 *		)[0,n]
 *	... etc ...
 *
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;
import java.io.*;

// BEGIN_NOI18N

public class WebFragment extends org.netbeans.modules.schema2beans.BaseBean
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	private static final String SERIALIZATION_HELPER_CHARSET = "UTF-8";	// NOI18N

	static public final String VERSION = "Version";	// NOI18N
	static public final String ID = "Id";	// NOI18N
	static public final String METADATACOMPLETE = "MetadataComplete";	// NOI18N
	static public final String NAME = "Name";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String DISPLAY_NAME = "DisplayName";	// NOI18N
	static public final String DISPLAYNAMEID = "DisplayNameId";	// NOI18N
	static public final String DISPLAYNAMEXMLLANG = "DisplayNameXmlLang";	// NOI18N
	static public final String ICON = "Icon";	// NOI18N
	static public final String DISTRIBUTABLE = "Distributable";	// NOI18N
	static public final String CONTEXT_PARAM = "ContextParam";	// NOI18N
	static public final String FILTER = "Filter";	// NOI18N
	static public final String FILTER_MAPPING = "FilterMapping";	// NOI18N
	static public final String LISTENER = "Listener";	// NOI18N
	static public final String SERVLET = "Servlet";	// NOI18N
	static public final String SERVLET_MAPPING = "ServletMapping";	// NOI18N
	static public final String SESSION_CONFIG = "SessionConfig";	// NOI18N
	static public final String MIME_MAPPING = "MimeMapping";	// NOI18N
	static public final String WELCOME_FILE_LIST = "WelcomeFileList";	// NOI18N
	static public final String ERROR_PAGE = "ErrorPage";	// NOI18N
	static public final String JSP_CONFIG = "JspConfig";	// NOI18N
	static public final String SECURITY_CONSTRAINT = "SecurityConstraint";	// NOI18N
	static public final String LOGIN_CONFIG = "LoginConfig";	// NOI18N
	static public final String SECURITY_ROLE = "SecurityRole";	// NOI18N
	static public final String ENV_ENTRY = "EnvEntry";	// NOI18N
	static public final String EJB_REF = "EjbRef";	// NOI18N
	static public final String EJB_LOCAL_REF = "EjbLocalRef";	// NOI18N
	static public final String SERVICE_REF = "ServiceRef";	// NOI18N
	static public final String RESOURCE_REF = "ResourceRef";	// NOI18N
	static public final String RESOURCE_ENV_REF = "ResourceEnvRef";	// NOI18N
	static public final String MESSAGE_DESTINATION_REF = "MessageDestinationRef";	// NOI18N
	static public final String PERSISTENCE_CONTEXT_REF = "PersistenceContextRef";	// NOI18N
	static public final String PERSISTENCE_UNIT_REF = "PersistenceUnitRef";	// NOI18N
	static public final String POST_CONSTRUCT = "PostConstruct";	// NOI18N
	static public final String PRE_DESTROY = "PreDestroy";	// NOI18N
	static public final String DATA_SOURCE = "DataSource";	// NOI18N
	static public final String JMS_CONNECTION_FACTORY = "JmsConnectionFactory";	// NOI18N
	static public final String JMS_DESTINATION = "JmsDestination";	// NOI18N
	static public final String MAIL_SESSION = "MailSession";	// NOI18N
	static public final String CONNECTION_FACTORY = "ConnectionFactory";	// NOI18N
	static public final String ADMINISTERED_OBJECT = "AdministeredObject";	// NOI18N
	static public final String MESSAGE_DESTINATION = "MessageDestination";	// NOI18N
	static public final String LOCALE_ENCODING_MAPPING_LIST = "LocaleEncodingMappingList";	// NOI18N
	static public final String ORDERING = "Ordering";	// NOI18N

	public WebFragment() {
		this(null, Common.USE_DEFAULT_VALUES);
	}

	public WebFragment(org.w3c.dom.Node doc, int options) {
		this(Common.NO_DEFAULT_VALUES);
		try {
			initFromNode(doc, options);
		}
		catch (Schema2BeansException e) {
			throw new RuntimeException(e);
		}
	}
	protected void initFromNode(org.w3c.dom.Node doc, int options) throws Schema2BeansException
	{
		if (doc == null)
		{
			doc = GraphManager.createRootElementNode("web-fragment");	// NOI18N
			if (doc == null)
				throw new Schema2BeansException(Common.getMessage(
					"CantCreateDOMRoot_msg", "web-fragment"));
		}
		Node n = GraphManager.getElementNode("web-fragment", doc);	// NOI18N
		if (n == null)
			throw new Schema2BeansException(Common.getMessage(
				"DocRootNotInDOMGraph_msg", "web-fragment", doc.getFirstChild().getNodeName()));

		this.graphManager.setXmlDocument(doc);

		// Entry point of the createBeans() recursive calls
		this.createBean(n, this.graphManager());
		this.initialize(options);
	}
	public WebFragment(int options)
	{
		super(comparators, runtimeVersion);
		initOptions(options);
	}
	protected void initOptions(int options)
	{
		// The graph manager is allocated in the bean root
		this.graphManager = new GraphManager(this);
		this.createRoot("web-fragment", "WebFragment",	// NOI18N
			Common.TYPE_1 | Common.TYPE_BEAN, WebFragment.class);

		// Properties (see root bean comments for the bean graph)
		initPropertyTables(39);
		this.createProperty("name", 	// NOI18N
			NAME, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("description", 	// NOI18N
			DESCRIPTION, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(DESCRIPTION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute(DESCRIPTION, "xml:lang", "XmlLang", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("display-name", 	// NOI18N
			DISPLAY_NAME, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(DISPLAY_NAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute(DISPLAY_NAME, "xml:lang", "XmlLang", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("icon", 	// NOI18N
			ICON, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			IconType.class);
		this.createAttribute(ICON, "xml:lang", "XmlLang", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute(ICON, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("distributable", 	// NOI18N
			DISTRIBUTABLE, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			EmptyType.class);
		this.createAttribute(DISTRIBUTABLE, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("context-param", 	// NOI18N
			CONTEXT_PARAM, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ParamValueType.class);
		this.createAttribute(CONTEXT_PARAM, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("filter", 	// NOI18N
			FILTER, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			FilterType.class);
		this.createAttribute(FILTER, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("filter-mapping", 	// NOI18N
			FILTER_MAPPING, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			FilterMappingType.class);
		this.createAttribute(FILTER_MAPPING, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("listener", 	// NOI18N
			LISTENER, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ListenerType.class);
		this.createAttribute(LISTENER, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("servlet", 	// NOI18N
			SERVLET, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ServletType.class);
		this.createAttribute(SERVLET, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("servlet-mapping", 	// NOI18N
			SERVLET_MAPPING, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ServletMappingType.class);
		this.createAttribute(SERVLET_MAPPING, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("session-config", 	// NOI18N
			SESSION_CONFIG, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			SessionConfigType.class);
		this.createAttribute(SESSION_CONFIG, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("mime-mapping", 	// NOI18N
			MIME_MAPPING, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			MimeMappingType.class);
		this.createAttribute(MIME_MAPPING, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("welcome-file-list", 	// NOI18N
			WELCOME_FILE_LIST, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			WelcomeFileListType.class);
		this.createAttribute(WELCOME_FILE_LIST, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("error-page", 	// NOI18N
			ERROR_PAGE, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ErrorPageType.class);
		this.createAttribute(ERROR_PAGE, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("jsp-config", 	// NOI18N
			JSP_CONFIG, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			JspConfigType.class);
		this.createAttribute(JSP_CONFIG, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("security-constraint", 	// NOI18N
			SECURITY_CONSTRAINT, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			SecurityConstraintType.class);
		this.createAttribute(SECURITY_CONSTRAINT, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("login-config", 	// NOI18N
			LOGIN_CONFIG, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			LoginConfigType.class);
		this.createAttribute(LOGIN_CONFIG, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("security-role", 	// NOI18N
			SECURITY_ROLE, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			SecurityRoleType.class);
		this.createAttribute(SECURITY_ROLE, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("env-entry", 	// NOI18N
			ENV_ENTRY, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			EnvEntryType.class);
		this.createAttribute(ENV_ENTRY, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("ejb-ref", 	// NOI18N
			EJB_REF, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			EjbRefType.class);
		this.createAttribute(EJB_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("ejb-local-ref", 	// NOI18N
			EJB_LOCAL_REF, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			EjbLocalRefType.class);
		this.createAttribute(EJB_LOCAL_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("service-ref", 	// NOI18N
			SERVICE_REF, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ServiceRefType.class);
		this.createAttribute(SERVICE_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("resource-ref", 	// NOI18N
			RESOURCE_REF, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ResourceRefType.class);
		this.createAttribute(RESOURCE_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("resource-env-ref", 	// NOI18N
			RESOURCE_ENV_REF, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ResourceEnvRefType.class);
		this.createAttribute(RESOURCE_ENV_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("message-destination-ref", 	// NOI18N
			MESSAGE_DESTINATION_REF, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			MessageDestinationRefType.class);
		this.createAttribute(MESSAGE_DESTINATION_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("persistence-context-ref", 	// NOI18N
			PERSISTENCE_CONTEXT_REF, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			PersistenceContextRefType.class);
		this.createAttribute(PERSISTENCE_CONTEXT_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("persistence-unit-ref", 	// NOI18N
			PERSISTENCE_UNIT_REF, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			PersistenceUnitRefType.class);
		this.createAttribute(PERSISTENCE_UNIT_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("post-construct", 	// NOI18N
			POST_CONSTRUCT, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			LifecycleCallbackType.class);
		this.createProperty("pre-destroy", 	// NOI18N
			PRE_DESTROY, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			LifecycleCallbackType.class);
		this.createProperty("data-source", 	// NOI18N
			DATA_SOURCE, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			DataSourceType.class);
		this.createAttribute(DATA_SOURCE, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("jms-connection-factory", 	// NOI18N
			JMS_CONNECTION_FACTORY, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			JmsConnectionFactoryType.class);
		this.createAttribute(JMS_CONNECTION_FACTORY, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("jms-destination", 	// NOI18N
			JMS_DESTINATION, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			JmsDestinationType.class);
		this.createAttribute(JMS_DESTINATION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("mail-session", 	// NOI18N
			MAIL_SESSION, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			MailSessionType.class);
		this.createAttribute(MAIL_SESSION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("connection-factory", 	// NOI18N
			CONNECTION_FACTORY, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ConnectionFactoryResourceType.class);
		this.createAttribute(CONNECTION_FACTORY, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("administered-object", 	// NOI18N
			ADMINISTERED_OBJECT, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			AdministeredObjectType.class);
		this.createAttribute(ADMINISTERED_OBJECT, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("message-destination", 	// NOI18N
			MESSAGE_DESTINATION, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			MessageDestinationType.class);
		this.createAttribute(MESSAGE_DESTINATION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("locale-encoding-mapping-list", 	// NOI18N
			LOCALE_ENCODING_MAPPING_LIST, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			LocaleEncodingMappingListType.class);
		this.createAttribute(LOCALE_ENCODING_MAPPING_LIST, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("ordering", 	// NOI18N
			ORDERING, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			OrderingType.class);
		this.createAttribute("version", "Version", 
						AttrProp.CDATA | AttrProp.REQUIRED,
						null, "5.0");
		this.createAttribute("id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute("metadata-complete", "MetadataComplete", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.initialize(options);
	}

	// Setting the default values of the properties
	void initialize(int options) {
		setDefaultNamespace("https://jakarta.ee/xml/ns/jakartaee");
		if ((options & Common.USE_DEFAULT_VALUES) == Common.USE_DEFAULT_VALUES) {
			setVersion("5.0");
		}

	}

	// This attribute is mandatory
	public void setVersion(java.lang.String value) {
		setAttributeValue(VERSION, value);
	}

	//
	public java.lang.String getVersion() {
		return getAttributeValue(VERSION);
	}

	// This attribute is optional
	public void setId(java.lang.String value) {
		setAttributeValue(ID, value);
	}

	//
	public java.lang.String getId() {
		return getAttributeValue(ID);
	}

	// This attribute is optional
	public void setMetadataComplete(boolean value) {
		setAttributeValue(METADATACOMPLETE, ""+value);
	}

	//
	public boolean isMetadataComplete() {
		return (getAttributeValue(METADATACOMPLETE) == null) ? false : ("true".equalsIgnoreCase(getAttributeValue(METADATACOMPLETE)) || "1".equals(getAttributeValue(METADATACOMPLETE)));
	}

	// This attribute is an array, possibly empty
	public void setName(int index, java.lang.String value) {
		this.setValue(NAME, index, value);
	}

	//
	public java.lang.String getName(int index) {
		return (java.lang.String)this.getValue(NAME, index);
	}

	// Return the number of properties
	public int sizeName() {
		return this.size(NAME);
	}

	// This attribute is an array, possibly empty
	public void setName(java.lang.String[] value) {
		this.setValue(NAME, value);
	}

	//
	public java.lang.String[] getName() {
		return (java.lang.String[])this.getValues(NAME);
	}

	// Add a new element returning its index in the list
	public int addName(java.lang.String value) {
		int positionOfNewItem = this.addValue(NAME, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeName(java.lang.String value) {
		return this.removeValue(NAME, value);
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
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public java.lang.String[] getDescription() {
		return (java.lang.String[])this.getValues(DESCRIPTION);
	}

	// Add a new element returning its index in the list
	public int addDescription(java.lang.String value) {
		int positionOfNewItem = this.addValue(DESCRIPTION, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
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
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public java.lang.String[] getDisplayName() {
		return (java.lang.String[])this.getValues(DISPLAY_NAME);
	}

	// Add a new element returning its index in the list
	public int addDisplayName(java.lang.String value) {
		int positionOfNewItem = this.addValue(DISPLAY_NAME, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
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
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public IconType[] getIcon() {
		return (IconType[])this.getValues(ICON);
	}

	// Add a new element returning its index in the list
	public int addIcon(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.IconType value) {
		int positionOfNewItem = this.addValue(ICON, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeIcon(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.IconType value) {
		return this.removeValue(ICON, value);
	}

	// This attribute is an array, possibly empty
	public void setDistributable(int index, EmptyType value) {
		this.setValue(DISTRIBUTABLE, index, value);
	}

	//
	public EmptyType getDistributable(int index) {
		return (EmptyType)this.getValue(DISTRIBUTABLE, index);
	}

	// Return the number of properties
	public int sizeDistributable() {
		return this.size(DISTRIBUTABLE);
	}

	// This attribute is an array, possibly empty
	public void setDistributable(EmptyType[] value) {
		this.setValue(DISTRIBUTABLE, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public EmptyType[] getDistributable() {
		return (EmptyType[])this.getValues(DISTRIBUTABLE);
	}

	// Add a new element returning its index in the list
	public int addDistributable(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.EmptyType value) {
		int positionOfNewItem = this.addValue(DISTRIBUTABLE, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeDistributable(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.EmptyType value) {
		return this.removeValue(DISTRIBUTABLE, value);
	}

	// This attribute is an array, possibly empty
	public void setContextParam(int index, ParamValueType value) {
		this.setValue(CONTEXT_PARAM, index, value);
	}

	//
	public ParamValueType getContextParam(int index) {
		return (ParamValueType)this.getValue(CONTEXT_PARAM, index);
	}

	// Return the number of properties
	public int sizeContextParam() {
		return this.size(CONTEXT_PARAM);
	}

	// This attribute is an array, possibly empty
	public void setContextParam(ParamValueType[] value) {
		this.setValue(CONTEXT_PARAM, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public ParamValueType[] getContextParam() {
		return (ParamValueType[])this.getValues(CONTEXT_PARAM);
	}

	// Add a new element returning its index in the list
	public int addContextParam(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ParamValueType value) {
		int positionOfNewItem = this.addValue(CONTEXT_PARAM, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeContextParam(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ParamValueType value) {
		return this.removeValue(CONTEXT_PARAM, value);
	}

	// This attribute is an array, possibly empty
	public void setFilter(int index, FilterType value) {
		this.setValue(FILTER, index, value);
	}

	//
	public FilterType getFilter(int index) {
		return (FilterType)this.getValue(FILTER, index);
	}

	// Return the number of properties
	public int sizeFilter() {
		return this.size(FILTER);
	}

	// This attribute is an array, possibly empty
	public void setFilter(FilterType[] value) {
		this.setValue(FILTER, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public FilterType[] getFilter() {
		return (FilterType[])this.getValues(FILTER);
	}

	// Add a new element returning its index in the list
	public int addFilter(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.FilterType value) {
		int positionOfNewItem = this.addValue(FILTER, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeFilter(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.FilterType value) {
		return this.removeValue(FILTER, value);
	}

	// This attribute is an array, possibly empty
	public void setFilterMapping(int index, FilterMappingType value) {
		this.setValue(FILTER_MAPPING, index, value);
	}

	//
	public FilterMappingType getFilterMapping(int index) {
		return (FilterMappingType)this.getValue(FILTER_MAPPING, index);
	}

	// Return the number of properties
	public int sizeFilterMapping() {
		return this.size(FILTER_MAPPING);
	}

	// This attribute is an array, possibly empty
	public void setFilterMapping(FilterMappingType[] value) {
		this.setValue(FILTER_MAPPING, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public FilterMappingType[] getFilterMapping() {
		return (FilterMappingType[])this.getValues(FILTER_MAPPING);
	}

	// Add a new element returning its index in the list
	public int addFilterMapping(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.FilterMappingType value) {
		int positionOfNewItem = this.addValue(FILTER_MAPPING, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeFilterMapping(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.FilterMappingType value) {
		return this.removeValue(FILTER_MAPPING, value);
	}

	// This attribute is an array, possibly empty
	public void setListener(int index, ListenerType value) {
		this.setValue(LISTENER, index, value);
	}

	//
	public ListenerType getListener(int index) {
		return (ListenerType)this.getValue(LISTENER, index);
	}

	// Return the number of properties
	public int sizeListener() {
		return this.size(LISTENER);
	}

	// This attribute is an array, possibly empty
	public void setListener(ListenerType[] value) {
		this.setValue(LISTENER, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public ListenerType[] getListener() {
		return (ListenerType[])this.getValues(LISTENER);
	}

	// Add a new element returning its index in the list
	public int addListener(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ListenerType value) {
		int positionOfNewItem = this.addValue(LISTENER, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeListener(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ListenerType value) {
		return this.removeValue(LISTENER, value);
	}

	// This attribute is an array, possibly empty
	public void setServlet(int index, ServletType value) {
		this.setValue(SERVLET, index, value);
	}

	//
	public ServletType getServlet(int index) {
		return (ServletType)this.getValue(SERVLET, index);
	}

	// Return the number of properties
	public int sizeServlet() {
		return this.size(SERVLET);
	}

	// This attribute is an array, possibly empty
	public void setServlet(ServletType[] value) {
		this.setValue(SERVLET, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public ServletType[] getServlet() {
		return (ServletType[])this.getValues(SERVLET);
	}

	// Add a new element returning its index in the list
	public int addServlet(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ServletType value) {
		int positionOfNewItem = this.addValue(SERVLET, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeServlet(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ServletType value) {
		return this.removeValue(SERVLET, value);
	}

	// This attribute is an array, possibly empty
	public void setServletMapping(int index, ServletMappingType value) {
		this.setValue(SERVLET_MAPPING, index, value);
	}

	//
	public ServletMappingType getServletMapping(int index) {
		return (ServletMappingType)this.getValue(SERVLET_MAPPING, index);
	}

	// Return the number of properties
	public int sizeServletMapping() {
		return this.size(SERVLET_MAPPING);
	}

	// This attribute is an array, possibly empty
	public void setServletMapping(ServletMappingType[] value) {
		this.setValue(SERVLET_MAPPING, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public ServletMappingType[] getServletMapping() {
		return (ServletMappingType[])this.getValues(SERVLET_MAPPING);
	}

	// Add a new element returning its index in the list
	public int addServletMapping(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ServletMappingType value) {
		int positionOfNewItem = this.addValue(SERVLET_MAPPING, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeServletMapping(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ServletMappingType value) {
		return this.removeValue(SERVLET_MAPPING, value);
	}

	// This attribute is an array, possibly empty
	public void setSessionConfig(int index, SessionConfigType value) {
		this.setValue(SESSION_CONFIG, index, value);
	}

	//
	public SessionConfigType getSessionConfig(int index) {
		return (SessionConfigType)this.getValue(SESSION_CONFIG, index);
	}

	// Return the number of properties
	public int sizeSessionConfig() {
		return this.size(SESSION_CONFIG);
	}

	// This attribute is an array, possibly empty
	public void setSessionConfig(SessionConfigType[] value) {
		this.setValue(SESSION_CONFIG, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public SessionConfigType[] getSessionConfig() {
		return (SessionConfigType[])this.getValues(SESSION_CONFIG);
	}

	// Add a new element returning its index in the list
	public int addSessionConfig(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.SessionConfigType value) {
		int positionOfNewItem = this.addValue(SESSION_CONFIG, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeSessionConfig(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.SessionConfigType value) {
		return this.removeValue(SESSION_CONFIG, value);
	}

	// This attribute is an array, possibly empty
	public void setMimeMapping(int index, MimeMappingType value) {
		this.setValue(MIME_MAPPING, index, value);
	}

	//
	public MimeMappingType getMimeMapping(int index) {
		return (MimeMappingType)this.getValue(MIME_MAPPING, index);
	}

	// Return the number of properties
	public int sizeMimeMapping() {
		return this.size(MIME_MAPPING);
	}

	// This attribute is an array, possibly empty
	public void setMimeMapping(MimeMappingType[] value) {
		this.setValue(MIME_MAPPING, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public MimeMappingType[] getMimeMapping() {
		return (MimeMappingType[])this.getValues(MIME_MAPPING);
	}

	// Add a new element returning its index in the list
	public int addMimeMapping(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.MimeMappingType value) {
		int positionOfNewItem = this.addValue(MIME_MAPPING, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeMimeMapping(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.MimeMappingType value) {
		return this.removeValue(MIME_MAPPING, value);
	}

	// This attribute is an array, possibly empty
	public void setWelcomeFileList(int index, WelcomeFileListType value) {
		this.setValue(WELCOME_FILE_LIST, index, value);
	}

	//
	public WelcomeFileListType getWelcomeFileList(int index) {
		return (WelcomeFileListType)this.getValue(WELCOME_FILE_LIST, index);
	}

	// Return the number of properties
	public int sizeWelcomeFileList() {
		return this.size(WELCOME_FILE_LIST);
	}

	// This attribute is an array, possibly empty
	public void setWelcomeFileList(WelcomeFileListType[] value) {
		this.setValue(WELCOME_FILE_LIST, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public WelcomeFileListType[] getWelcomeFileList() {
		return (WelcomeFileListType[])this.getValues(WELCOME_FILE_LIST);
	}

	// Add a new element returning its index in the list
	public int addWelcomeFileList(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.WelcomeFileListType value) {
		int positionOfNewItem = this.addValue(WELCOME_FILE_LIST, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeWelcomeFileList(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.WelcomeFileListType value) {
		return this.removeValue(WELCOME_FILE_LIST, value);
	}

	// This attribute is an array, possibly empty
	public void setErrorPage(int index, ErrorPageType value) {
		this.setValue(ERROR_PAGE, index, value);
	}

	//
	public ErrorPageType getErrorPage(int index) {
		return (ErrorPageType)this.getValue(ERROR_PAGE, index);
	}

	// Return the number of properties
	public int sizeErrorPage() {
		return this.size(ERROR_PAGE);
	}

	// This attribute is an array, possibly empty
	public void setErrorPage(ErrorPageType[] value) {
		this.setValue(ERROR_PAGE, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public ErrorPageType[] getErrorPage() {
		return (ErrorPageType[])this.getValues(ERROR_PAGE);
	}

	// Add a new element returning its index in the list
	public int addErrorPage(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ErrorPageType value) {
		int positionOfNewItem = this.addValue(ERROR_PAGE, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeErrorPage(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ErrorPageType value) {
		return this.removeValue(ERROR_PAGE, value);
	}

	// This attribute is an array, possibly empty
	public void setJspConfig(int index, JspConfigType value) {
		this.setValue(JSP_CONFIG, index, value);
	}

	//
	public JspConfigType getJspConfig(int index) {
		return (JspConfigType)this.getValue(JSP_CONFIG, index);
	}

	// Return the number of properties
	public int sizeJspConfig() {
		return this.size(JSP_CONFIG);
	}

	// This attribute is an array, possibly empty
	public void setJspConfig(JspConfigType[] value) {
		this.setValue(JSP_CONFIG, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public JspConfigType[] getJspConfig() {
		return (JspConfigType[])this.getValues(JSP_CONFIG);
	}

	// Add a new element returning its index in the list
	public int addJspConfig(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.JspConfigType value) {
		int positionOfNewItem = this.addValue(JSP_CONFIG, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeJspConfig(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.JspConfigType value) {
		return this.removeValue(JSP_CONFIG, value);
	}

	// This attribute is an array, possibly empty
	public void setSecurityConstraint(int index, SecurityConstraintType value) {
		this.setValue(SECURITY_CONSTRAINT, index, value);
	}

	//
	public SecurityConstraintType getSecurityConstraint(int index) {
		return (SecurityConstraintType)this.getValue(SECURITY_CONSTRAINT, index);
	}

	// Return the number of properties
	public int sizeSecurityConstraint() {
		return this.size(SECURITY_CONSTRAINT);
	}

	// This attribute is an array, possibly empty
	public void setSecurityConstraint(SecurityConstraintType[] value) {
		this.setValue(SECURITY_CONSTRAINT, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public SecurityConstraintType[] getSecurityConstraint() {
		return (SecurityConstraintType[])this.getValues(SECURITY_CONSTRAINT);
	}

	// Add a new element returning its index in the list
	public int addSecurityConstraint(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.SecurityConstraintType value) {
		int positionOfNewItem = this.addValue(SECURITY_CONSTRAINT, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeSecurityConstraint(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.SecurityConstraintType value) {
		return this.removeValue(SECURITY_CONSTRAINT, value);
	}

	// This attribute is an array, possibly empty
	public void setLoginConfig(int index, LoginConfigType value) {
		this.setValue(LOGIN_CONFIG, index, value);
	}

	//
	public LoginConfigType getLoginConfig(int index) {
		return (LoginConfigType)this.getValue(LOGIN_CONFIG, index);
	}

	// Return the number of properties
	public int sizeLoginConfig() {
		return this.size(LOGIN_CONFIG);
	}

	// This attribute is an array, possibly empty
	public void setLoginConfig(LoginConfigType[] value) {
		this.setValue(LOGIN_CONFIG, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public LoginConfigType[] getLoginConfig() {
		return (LoginConfigType[])this.getValues(LOGIN_CONFIG);
	}

	// Add a new element returning its index in the list
	public int addLoginConfig(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.LoginConfigType value) {
		int positionOfNewItem = this.addValue(LOGIN_CONFIG, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeLoginConfig(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.LoginConfigType value) {
		return this.removeValue(LOGIN_CONFIG, value);
	}

	// This attribute is an array, possibly empty
	public void setSecurityRole(int index, SecurityRoleType value) {
		this.setValue(SECURITY_ROLE, index, value);
	}

	//
	public SecurityRoleType getSecurityRole(int index) {
		return (SecurityRoleType)this.getValue(SECURITY_ROLE, index);
	}

	// Return the number of properties
	public int sizeSecurityRole() {
		return this.size(SECURITY_ROLE);
	}

	// This attribute is an array, possibly empty
	public void setSecurityRole(SecurityRoleType[] value) {
		this.setValue(SECURITY_ROLE, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public SecurityRoleType[] getSecurityRole() {
		return (SecurityRoleType[])this.getValues(SECURITY_ROLE);
	}

	// Add a new element returning its index in the list
	public int addSecurityRole(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.SecurityRoleType value) {
		int positionOfNewItem = this.addValue(SECURITY_ROLE, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeSecurityRole(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.SecurityRoleType value) {
		return this.removeValue(SECURITY_ROLE, value);
	}

	// This attribute is an array, possibly empty
	public void setEnvEntry(int index, EnvEntryType value) {
		this.setValue(ENV_ENTRY, index, value);
	}

	//
	public EnvEntryType getEnvEntry(int index) {
		return (EnvEntryType)this.getValue(ENV_ENTRY, index);
	}

	// Return the number of properties
	public int sizeEnvEntry() {
		return this.size(ENV_ENTRY);
	}

	// This attribute is an array, possibly empty
	public void setEnvEntry(EnvEntryType[] value) {
		this.setValue(ENV_ENTRY, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public EnvEntryType[] getEnvEntry() {
		return (EnvEntryType[])this.getValues(ENV_ENTRY);
	}

	// Add a new element returning its index in the list
	public int addEnvEntry(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.EnvEntryType value) {
		int positionOfNewItem = this.addValue(ENV_ENTRY, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeEnvEntry(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.EnvEntryType value) {
		return this.removeValue(ENV_ENTRY, value);
	}

	// This attribute is an array, possibly empty
	public void setEjbRef(int index, EjbRefType value) {
		this.setValue(EJB_REF, index, value);
	}

	//
	public EjbRefType getEjbRef(int index) {
		return (EjbRefType)this.getValue(EJB_REF, index);
	}

	// Return the number of properties
	public int sizeEjbRef() {
		return this.size(EJB_REF);
	}

	// This attribute is an array, possibly empty
	public void setEjbRef(EjbRefType[] value) {
		this.setValue(EJB_REF, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public EjbRefType[] getEjbRef() {
		return (EjbRefType[])this.getValues(EJB_REF);
	}

	// Add a new element returning its index in the list
	public int addEjbRef(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.EjbRefType value) {
		int positionOfNewItem = this.addValue(EJB_REF, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeEjbRef(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.EjbRefType value) {
		return this.removeValue(EJB_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setEjbLocalRef(int index, EjbLocalRefType value) {
		this.setValue(EJB_LOCAL_REF, index, value);
	}

	//
	public EjbLocalRefType getEjbLocalRef(int index) {
		return (EjbLocalRefType)this.getValue(EJB_LOCAL_REF, index);
	}

	// Return the number of properties
	public int sizeEjbLocalRef() {
		return this.size(EJB_LOCAL_REF);
	}

	// This attribute is an array, possibly empty
	public void setEjbLocalRef(EjbLocalRefType[] value) {
		this.setValue(EJB_LOCAL_REF, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public EjbLocalRefType[] getEjbLocalRef() {
		return (EjbLocalRefType[])this.getValues(EJB_LOCAL_REF);
	}

	// Add a new element returning its index in the list
	public int addEjbLocalRef(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.EjbLocalRefType value) {
		int positionOfNewItem = this.addValue(EJB_LOCAL_REF, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeEjbLocalRef(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.EjbLocalRefType value) {
		return this.removeValue(EJB_LOCAL_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setServiceRef(int index, ServiceRefType value) {
		this.setValue(SERVICE_REF, index, value);
	}

	//
	public ServiceRefType getServiceRef(int index) {
		return (ServiceRefType)this.getValue(SERVICE_REF, index);
	}

	// Return the number of properties
	public int sizeServiceRef() {
		return this.size(SERVICE_REF);
	}

	// This attribute is an array, possibly empty
	public void setServiceRef(ServiceRefType[] value) {
		this.setValue(SERVICE_REF, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public ServiceRefType[] getServiceRef() {
		return (ServiceRefType[])this.getValues(SERVICE_REF);
	}

	// Add a new element returning its index in the list
	public int addServiceRef(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ServiceRefType value) {
		int positionOfNewItem = this.addValue(SERVICE_REF, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeServiceRef(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ServiceRefType value) {
		return this.removeValue(SERVICE_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setResourceRef(int index, ResourceRefType value) {
		this.setValue(RESOURCE_REF, index, value);
	}

	//
	public ResourceRefType getResourceRef(int index) {
		return (ResourceRefType)this.getValue(RESOURCE_REF, index);
	}

	// Return the number of properties
	public int sizeResourceRef() {
		return this.size(RESOURCE_REF);
	}

	// This attribute is an array, possibly empty
	public void setResourceRef(ResourceRefType[] value) {
		this.setValue(RESOURCE_REF, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public ResourceRefType[] getResourceRef() {
		return (ResourceRefType[])this.getValues(RESOURCE_REF);
	}

	// Add a new element returning its index in the list
	public int addResourceRef(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ResourceRefType value) {
		int positionOfNewItem = this.addValue(RESOURCE_REF, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeResourceRef(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ResourceRefType value) {
		return this.removeValue(RESOURCE_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setResourceEnvRef(int index, ResourceEnvRefType value) {
		this.setValue(RESOURCE_ENV_REF, index, value);
	}

	//
	public ResourceEnvRefType getResourceEnvRef(int index) {
		return (ResourceEnvRefType)this.getValue(RESOURCE_ENV_REF, index);
	}

	// Return the number of properties
	public int sizeResourceEnvRef() {
		return this.size(RESOURCE_ENV_REF);
	}

	// This attribute is an array, possibly empty
	public void setResourceEnvRef(ResourceEnvRefType[] value) {
		this.setValue(RESOURCE_ENV_REF, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public ResourceEnvRefType[] getResourceEnvRef() {
		return (ResourceEnvRefType[])this.getValues(RESOURCE_ENV_REF);
	}

	// Add a new element returning its index in the list
	public int addResourceEnvRef(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ResourceEnvRefType value) {
		int positionOfNewItem = this.addValue(RESOURCE_ENV_REF, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeResourceEnvRef(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ResourceEnvRefType value) {
		return this.removeValue(RESOURCE_ENV_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setMessageDestinationRef(int index, MessageDestinationRefType value) {
		this.setValue(MESSAGE_DESTINATION_REF, index, value);
	}

	//
	public MessageDestinationRefType getMessageDestinationRef(int index) {
		return (MessageDestinationRefType)this.getValue(MESSAGE_DESTINATION_REF, index);
	}

	// Return the number of properties
	public int sizeMessageDestinationRef() {
		return this.size(MESSAGE_DESTINATION_REF);
	}

	// This attribute is an array, possibly empty
	public void setMessageDestinationRef(MessageDestinationRefType[] value) {
		this.setValue(MESSAGE_DESTINATION_REF, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public MessageDestinationRefType[] getMessageDestinationRef() {
		return (MessageDestinationRefType[])this.getValues(MESSAGE_DESTINATION_REF);
	}

	// Add a new element returning its index in the list
	public int addMessageDestinationRef(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.MessageDestinationRefType value) {
		int positionOfNewItem = this.addValue(MESSAGE_DESTINATION_REF, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeMessageDestinationRef(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.MessageDestinationRefType value) {
		return this.removeValue(MESSAGE_DESTINATION_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setPersistenceContextRef(int index, PersistenceContextRefType value) {
		this.setValue(PERSISTENCE_CONTEXT_REF, index, value);
	}

	//
	public PersistenceContextRefType getPersistenceContextRef(int index) {
		return (PersistenceContextRefType)this.getValue(PERSISTENCE_CONTEXT_REF, index);
	}

	// Return the number of properties
	public int sizePersistenceContextRef() {
		return this.size(PERSISTENCE_CONTEXT_REF);
	}

	// This attribute is an array, possibly empty
	public void setPersistenceContextRef(PersistenceContextRefType[] value) {
		this.setValue(PERSISTENCE_CONTEXT_REF, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public PersistenceContextRefType[] getPersistenceContextRef() {
		return (PersistenceContextRefType[])this.getValues(PERSISTENCE_CONTEXT_REF);
	}

	// Add a new element returning its index in the list
	public int addPersistenceContextRef(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.PersistenceContextRefType value) {
		int positionOfNewItem = this.addValue(PERSISTENCE_CONTEXT_REF, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removePersistenceContextRef(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.PersistenceContextRefType value) {
		return this.removeValue(PERSISTENCE_CONTEXT_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setPersistenceUnitRef(int index, PersistenceUnitRefType value) {
		this.setValue(PERSISTENCE_UNIT_REF, index, value);
	}

	//
	public PersistenceUnitRefType getPersistenceUnitRef(int index) {
		return (PersistenceUnitRefType)this.getValue(PERSISTENCE_UNIT_REF, index);
	}

	// Return the number of properties
	public int sizePersistenceUnitRef() {
		return this.size(PERSISTENCE_UNIT_REF);
	}

	// This attribute is an array, possibly empty
	public void setPersistenceUnitRef(PersistenceUnitRefType[] value) {
		this.setValue(PERSISTENCE_UNIT_REF, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public PersistenceUnitRefType[] getPersistenceUnitRef() {
		return (PersistenceUnitRefType[])this.getValues(PERSISTENCE_UNIT_REF);
	}

	// Add a new element returning its index in the list
	public int addPersistenceUnitRef(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.PersistenceUnitRefType value) {
		int positionOfNewItem = this.addValue(PERSISTENCE_UNIT_REF, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removePersistenceUnitRef(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.PersistenceUnitRefType value) {
		return this.removeValue(PERSISTENCE_UNIT_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setPostConstruct(int index, LifecycleCallbackType value) {
		this.setValue(POST_CONSTRUCT, index, value);
	}

	//
	public LifecycleCallbackType getPostConstruct(int index) {
		return (LifecycleCallbackType)this.getValue(POST_CONSTRUCT, index);
	}

	// Return the number of properties
	public int sizePostConstruct() {
		return this.size(POST_CONSTRUCT);
	}

	// This attribute is an array, possibly empty
	public void setPostConstruct(LifecycleCallbackType[] value) {
		this.setValue(POST_CONSTRUCT, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public LifecycleCallbackType[] getPostConstruct() {
		return (LifecycleCallbackType[])this.getValues(POST_CONSTRUCT);
	}

	// Add a new element returning its index in the list
	public int addPostConstruct(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.LifecycleCallbackType value) {
		int positionOfNewItem = this.addValue(POST_CONSTRUCT, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removePostConstruct(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.LifecycleCallbackType value) {
		return this.removeValue(POST_CONSTRUCT, value);
	}

	// This attribute is an array, possibly empty
	public void setPreDestroy(int index, LifecycleCallbackType value) {
		this.setValue(PRE_DESTROY, index, value);
	}

	//
	public LifecycleCallbackType getPreDestroy(int index) {
		return (LifecycleCallbackType)this.getValue(PRE_DESTROY, index);
	}

	// Return the number of properties
	public int sizePreDestroy() {
		return this.size(PRE_DESTROY);
	}

	// This attribute is an array, possibly empty
	public void setPreDestroy(LifecycleCallbackType[] value) {
		this.setValue(PRE_DESTROY, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public LifecycleCallbackType[] getPreDestroy() {
		return (LifecycleCallbackType[])this.getValues(PRE_DESTROY);
	}

	// Add a new element returning its index in the list
	public int addPreDestroy(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.LifecycleCallbackType value) {
		int positionOfNewItem = this.addValue(PRE_DESTROY, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removePreDestroy(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.LifecycleCallbackType value) {
		return this.removeValue(PRE_DESTROY, value);
	}

	// This attribute is an array, possibly empty
	public void setDataSource(int index, DataSourceType value) {
		this.setValue(DATA_SOURCE, index, value);
	}

	//
	public DataSourceType getDataSource(int index) {
		return (DataSourceType)this.getValue(DATA_SOURCE, index);
	}

	// Return the number of properties
	public int sizeDataSource() {
		return this.size(DATA_SOURCE);
	}

	// This attribute is an array, possibly empty
	public void setDataSource(DataSourceType[] value) {
		this.setValue(DATA_SOURCE, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public DataSourceType[] getDataSource() {
		return (DataSourceType[])this.getValues(DATA_SOURCE);
	}

	// Add a new element returning its index in the list
	public int addDataSource(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.DataSourceType value) {
		int positionOfNewItem = this.addValue(DATA_SOURCE, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeDataSource(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.DataSourceType value) {
		return this.removeValue(DATA_SOURCE, value);
	}

	// This attribute is an array, possibly empty
	public void setJmsConnectionFactory(int index, JmsConnectionFactoryType value) {
		this.setValue(JMS_CONNECTION_FACTORY, index, value);
	}

	//
	public JmsConnectionFactoryType getJmsConnectionFactory(int index) {
		return (JmsConnectionFactoryType)this.getValue(JMS_CONNECTION_FACTORY, index);
	}

	// Return the number of properties
	public int sizeJmsConnectionFactory() {
		return this.size(JMS_CONNECTION_FACTORY);
	}

	// This attribute is an array, possibly empty
	public void setJmsConnectionFactory(JmsConnectionFactoryType[] value) {
		this.setValue(JMS_CONNECTION_FACTORY, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public JmsConnectionFactoryType[] getJmsConnectionFactory() {
		return (JmsConnectionFactoryType[])this.getValues(JMS_CONNECTION_FACTORY);
	}

	// Add a new element returning its index in the list
	public int addJmsConnectionFactory(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.JmsConnectionFactoryType value) {
		int positionOfNewItem = this.addValue(JMS_CONNECTION_FACTORY, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeJmsConnectionFactory(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.JmsConnectionFactoryType value) {
		return this.removeValue(JMS_CONNECTION_FACTORY, value);
	}

	// This attribute is an array, possibly empty
	public void setJmsDestination(int index, JmsDestinationType value) {
		this.setValue(JMS_DESTINATION, index, value);
	}

	//
	public JmsDestinationType getJmsDestination(int index) {
		return (JmsDestinationType)this.getValue(JMS_DESTINATION, index);
	}

	// Return the number of properties
	public int sizeJmsDestination() {
		return this.size(JMS_DESTINATION);
	}

	// This attribute is an array, possibly empty
	public void setJmsDestination(JmsDestinationType[] value) {
		this.setValue(JMS_DESTINATION, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public JmsDestinationType[] getJmsDestination() {
		return (JmsDestinationType[])this.getValues(JMS_DESTINATION);
	}

	// Add a new element returning its index in the list
	public int addJmsDestination(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.JmsDestinationType value) {
		int positionOfNewItem = this.addValue(JMS_DESTINATION, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeJmsDestination(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.JmsDestinationType value) {
		return this.removeValue(JMS_DESTINATION, value);
	}

	// This attribute is an array, possibly empty
	public void setMailSession(int index, MailSessionType value) {
		this.setValue(MAIL_SESSION, index, value);
	}

	//
	public MailSessionType getMailSession(int index) {
		return (MailSessionType)this.getValue(MAIL_SESSION, index);
	}

	// Return the number of properties
	public int sizeMailSession() {
		return this.size(MAIL_SESSION);
	}

	// This attribute is an array, possibly empty
	public void setMailSession(MailSessionType[] value) {
		this.setValue(MAIL_SESSION, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public MailSessionType[] getMailSession() {
		return (MailSessionType[])this.getValues(MAIL_SESSION);
	}

	// Add a new element returning its index in the list
	public int addMailSession(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.MailSessionType value) {
		int positionOfNewItem = this.addValue(MAIL_SESSION, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeMailSession(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.MailSessionType value) {
		return this.removeValue(MAIL_SESSION, value);
	}

	// This attribute is an array, possibly empty
	public void setConnectionFactory(int index, ConnectionFactoryResourceType value) {
		this.setValue(CONNECTION_FACTORY, index, value);
	}

	//
	public ConnectionFactoryResourceType getConnectionFactory(int index) {
		return (ConnectionFactoryResourceType)this.getValue(CONNECTION_FACTORY, index);
	}

	// Return the number of properties
	public int sizeConnectionFactory() {
		return this.size(CONNECTION_FACTORY);
	}

	// This attribute is an array, possibly empty
	public void setConnectionFactory(ConnectionFactoryResourceType[] value) {
		this.setValue(CONNECTION_FACTORY, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public ConnectionFactoryResourceType[] getConnectionFactory() {
		return (ConnectionFactoryResourceType[])this.getValues(CONNECTION_FACTORY);
	}

	// Add a new element returning its index in the list
	public int addConnectionFactory(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ConnectionFactoryResourceType value) {
		int positionOfNewItem = this.addValue(CONNECTION_FACTORY, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeConnectionFactory(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ConnectionFactoryResourceType value) {
		return this.removeValue(CONNECTION_FACTORY, value);
	}

	// This attribute is an array, possibly empty
	public void setAdministeredObject(int index, AdministeredObjectType value) {
		this.setValue(ADMINISTERED_OBJECT, index, value);
	}

	//
	public AdministeredObjectType getAdministeredObject(int index) {
		return (AdministeredObjectType)this.getValue(ADMINISTERED_OBJECT, index);
	}

	// Return the number of properties
	public int sizeAdministeredObject() {
		return this.size(ADMINISTERED_OBJECT);
	}

	// This attribute is an array, possibly empty
	public void setAdministeredObject(AdministeredObjectType[] value) {
		this.setValue(ADMINISTERED_OBJECT, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public AdministeredObjectType[] getAdministeredObject() {
		return (AdministeredObjectType[])this.getValues(ADMINISTERED_OBJECT);
	}

	// Add a new element returning its index in the list
	public int addAdministeredObject(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.AdministeredObjectType value) {
		int positionOfNewItem = this.addValue(ADMINISTERED_OBJECT, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setMessageDestination(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeAdministeredObject(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.AdministeredObjectType value) {
		return this.removeValue(ADMINISTERED_OBJECT, value);
	}

	// This attribute is an array, possibly empty
	public void setMessageDestination(int index, MessageDestinationType value) {
		this.setValue(MESSAGE_DESTINATION, index, value);
	}

	//
	public MessageDestinationType getMessageDestination(int index) {
		return (MessageDestinationType)this.getValue(MESSAGE_DESTINATION, index);
	}

	// Return the number of properties
	public int sizeMessageDestination() {
		return this.size(MESSAGE_DESTINATION);
	}

	// This attribute is an array, possibly empty
	public void setMessageDestination(MessageDestinationType[] value) {
		this.setValue(MESSAGE_DESTINATION, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setLocaleEncodingMappingList(null);
		}
	}

	//
	public MessageDestinationType[] getMessageDestination() {
		return (MessageDestinationType[])this.getValues(MESSAGE_DESTINATION);
	}

	// Add a new element returning its index in the list
	public int addMessageDestination(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.MessageDestinationType value) {
		int positionOfNewItem = this.addValue(MESSAGE_DESTINATION, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setLocaleEncodingMappingList(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeMessageDestination(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.MessageDestinationType value) {
		return this.removeValue(MESSAGE_DESTINATION, value);
	}

	// This attribute is an array, possibly empty
	public void setLocaleEncodingMappingList(int index, LocaleEncodingMappingListType value) {
		this.setValue(LOCALE_ENCODING_MAPPING_LIST, index, value);
	}

	//
	public LocaleEncodingMappingListType getLocaleEncodingMappingList(int index) {
		return (LocaleEncodingMappingListType)this.getValue(LOCALE_ENCODING_MAPPING_LIST, index);
	}

	// Return the number of properties
	public int sizeLocaleEncodingMappingList() {
		return this.size(LOCALE_ENCODING_MAPPING_LIST);
	}

	// This attribute is an array, possibly empty
	public void setLocaleEncodingMappingList(LocaleEncodingMappingListType[] value) {
		this.setValue(LOCALE_ENCODING_MAPPING_LIST, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
		}
	}

	//
	public LocaleEncodingMappingListType[] getLocaleEncodingMappingList() {
		return (LocaleEncodingMappingListType[])this.getValues(LOCALE_ENCODING_MAPPING_LIST);
	}

	// Add a new element returning its index in the list
	public int addLocaleEncodingMappingList(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.LocaleEncodingMappingListType value) {
		int positionOfNewItem = this.addValue(LOCALE_ENCODING_MAPPING_LIST, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setDescription(null);
			setDisplayName(null);
			setIcon(null);
			setDistributable(null);
			setContextParam(null);
			setFilter(null);
			setFilterMapping(null);
			setListener(null);
			setServlet(null);
			setServletMapping(null);
			setSessionConfig(null);
			setMimeMapping(null);
			setWelcomeFileList(null);
			setErrorPage(null);
			setJspConfig(null);
			setSecurityConstraint(null);
			setLoginConfig(null);
			setSecurityRole(null);
			setEnvEntry(null);
			setEjbRef(null);
			setEjbLocalRef(null);
			setServiceRef(null);
			setResourceRef(null);
			setResourceEnvRef(null);
			setMessageDestinationRef(null);
			setPersistenceContextRef(null);
			setPersistenceUnitRef(null);
			setPostConstruct(null);
			setPreDestroy(null);
			setDataSource(null);
			setJmsConnectionFactory(null);
			setJmsDestination(null);
			setMailSession(null);
			setConnectionFactory(null);
			setAdministeredObject(null);
			setMessageDestination(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeLocaleEncodingMappingList(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.LocaleEncodingMappingListType value) {
		return this.removeValue(LOCALE_ENCODING_MAPPING_LIST, value);
	}

	// This attribute is an array, possibly empty
	public void setOrdering(int index, OrderingType value) {
		this.setValue(ORDERING, index, value);
	}

	//
	public OrderingType getOrdering(int index) {
		return (OrderingType)this.getValue(ORDERING, index);
	}

	// Return the number of properties
	public int sizeOrdering() {
		return this.size(ORDERING);
	}

	// This attribute is an array, possibly empty
	public void setOrdering(OrderingType[] value) {
		this.setValue(ORDERING, value);
	}

	//
	public OrderingType[] getOrdering() {
		return (OrderingType[])this.getValues(ORDERING);
	}

	// Add a new element returning its index in the list
	public int addOrdering(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.OrderingType value) {
		int positionOfNewItem = this.addValue(ORDERING, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeOrdering(org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.OrderingType value) {
		return this.removeValue(ORDERING, value);
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
	public EmptyType newEmptyType() {
		return new EmptyType();
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
	public FilterType newFilterType() {
		return new FilterType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public FilterMappingType newFilterMappingType() {
		return new FilterMappingType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public ListenerType newListenerType() {
		return new ListenerType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public ServletType newServletType() {
		return new ServletType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public ServletMappingType newServletMappingType() {
		return new ServletMappingType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public SessionConfigType newSessionConfigType() {
		return new SessionConfigType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public MimeMappingType newMimeMappingType() {
		return new MimeMappingType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public WelcomeFileListType newWelcomeFileListType() {
		return new WelcomeFileListType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public ErrorPageType newErrorPageType() {
		return new ErrorPageType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public JspConfigType newJspConfigType() {
		return new JspConfigType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public SecurityConstraintType newSecurityConstraintType() {
		return new SecurityConstraintType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public LoginConfigType newLoginConfigType() {
		return new LoginConfigType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public SecurityRoleType newSecurityRoleType() {
		return new SecurityRoleType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public EnvEntryType newEnvEntryType() {
		return new EnvEntryType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public EjbRefType newEjbRefType() {
		return new EjbRefType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public EjbLocalRefType newEjbLocalRefType() {
		return new EjbLocalRefType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public ServiceRefType newServiceRefType() {
		return new ServiceRefType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public ResourceRefType newResourceRefType() {
		return new ResourceRefType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public ResourceEnvRefType newResourceEnvRefType() {
		return new ResourceEnvRefType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public MessageDestinationRefType newMessageDestinationRefType() {
		return new MessageDestinationRefType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public PersistenceContextRefType newPersistenceContextRefType() {
		return new PersistenceContextRefType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public PersistenceUnitRefType newPersistenceUnitRefType() {
		return new PersistenceUnitRefType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public LifecycleCallbackType newLifecycleCallbackType() {
		return new LifecycleCallbackType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public DataSourceType newDataSourceType() {
		return new DataSourceType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public JmsConnectionFactoryType newJmsConnectionFactoryType() {
		return new JmsConnectionFactoryType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public JmsDestinationType newJmsDestinationType() {
		return new JmsDestinationType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public MailSessionType newMailSessionType() {
		return new MailSessionType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public ConnectionFactoryResourceType newConnectionFactoryResourceType() {
		return new ConnectionFactoryResourceType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public AdministeredObjectType newAdministeredObjectType() {
		return new AdministeredObjectType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public MessageDestinationType newMessageDestinationType() {
		return new MessageDestinationType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public LocaleEncodingMappingListType newLocaleEncodingMappingListType() {
		return new LocaleEncodingMappingListType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public OrderingType newOrderingType() {
		return new OrderingType();
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}
	//
	// This method returns the root of the bean graph
	// Each call creates a new bean graph from the specified DOM graph
	//
	public static WebFragment createGraph(org.w3c.dom.Node doc) {
		return new WebFragment(doc, Common.NO_DEFAULT_VALUES);
	}

	public static WebFragment createGraph(java.io.File f) throws java.io.IOException {
		java.io.InputStream in = new java.io.FileInputStream(f);
		try {
			return createGraph(in, false);
		} finally {
			in.close();
		}
	}

	public static WebFragment createGraph(java.io.InputStream in) {
		return createGraph(in, false);
	}

	public static WebFragment createGraph(java.io.InputStream in, boolean validate) {
		try {
			Document doc = GraphManager.createXmlDocument(in, validate);
			return createGraph(doc);
		}
		catch (Exception t) {
			throw new RuntimeException(Common.getMessage(
				"DOMGraphCreateFailed_msg",
				t));
		}
	}

	//
	// This method returns the root for a new empty bean graph
	//
	public static WebFragment createGraph() {
		return new WebFragment();
	}

	public void validate() throws org.netbeans.modules.schema2beans.ValidateException {
		boolean restrictionFailure = false;
		boolean restrictionPassed = false;
		// Validating property version
		if (getVersion() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getVersion() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "version", this);	// NOI18N
		}
		final java.lang.String[] enumRestrictionVersion = {"5.0"};
		restrictionFailure = true;
		for (int _index2 = 0; _index2 < enumRestrictionVersion.length; 
			++_index2) {
			if (enumRestrictionVersion[_index2].equals(getVersion())) {
				restrictionFailure = false;
				break;
			}
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getVersion() enumeration test", org.netbeans.modules.schema2beans.ValidateException.FailureType.ENUM_RESTRICTION, "version", this);	// NOI18N
		}
		// Validating property id
		if (getId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "id", this);	// NOI18N
			}
		}
		// Validating property metadataComplete
		// Validating property name
		for (int _index = 0; _index < sizeName(); ++_index) {
			java.lang.String element = getName(_index);
			if (element != null) {
				{
					boolean patternPassed = false;
					if ((element).matches("($|_|\\p{L})(\\p{L}|\\p{Nd}|_|$)*")) {
						patternPassed = true;
					}
					restrictionFailure = !patternPassed;
				}
				if (restrictionFailure) {
					throw new org.netbeans.modules.schema2beans.ValidateException("element", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "name", this);	// NOI18N
				}
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
		// Validating property distributable
		for (int _index = 0; _index < sizeDistributable(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.EmptyType element = getDistributable(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property contextParam
		for (int _index = 0; _index < sizeContextParam(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ParamValueType element = getContextParam(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property filter
		for (int _index = 0; _index < sizeFilter(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.FilterType element = getFilter(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property filterMapping
		for (int _index = 0; _index < sizeFilterMapping(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.FilterMappingType element = getFilterMapping(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property listener
		for (int _index = 0; _index < sizeListener(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ListenerType element = getListener(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property servlet
		for (int _index = 0; _index < sizeServlet(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ServletType element = getServlet(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property servletMapping
		for (int _index = 0; _index < sizeServletMapping(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ServletMappingType element = getServletMapping(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property sessionConfig
		for (int _index = 0; _index < sizeSessionConfig(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.SessionConfigType element = getSessionConfig(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property mimeMapping
		for (int _index = 0; _index < sizeMimeMapping(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.MimeMappingType element = getMimeMapping(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property welcomeFileList
		for (int _index = 0; _index < sizeWelcomeFileList(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.WelcomeFileListType element = getWelcomeFileList(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property errorPage
		for (int _index = 0; _index < sizeErrorPage(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ErrorPageType element = getErrorPage(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property jspConfig
		for (int _index = 0; _index < sizeJspConfig(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.JspConfigType element = getJspConfig(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property securityConstraint
		for (int _index = 0; _index < sizeSecurityConstraint(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.SecurityConstraintType element = getSecurityConstraint(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property loginConfig
		for (int _index = 0; _index < sizeLoginConfig(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.LoginConfigType element = getLoginConfig(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property securityRole
		for (int _index = 0; _index < sizeSecurityRole(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.SecurityRoleType element = getSecurityRole(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property envEntry
		for (int _index = 0; _index < sizeEnvEntry(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.EnvEntryType element = getEnvEntry(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property ejbRef
		for (int _index = 0; _index < sizeEjbRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.EjbRefType element = getEjbRef(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property ejbLocalRef
		for (int _index = 0; _index < sizeEjbLocalRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.EjbLocalRefType element = getEjbLocalRef(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property serviceRef
		for (int _index = 0; _index < sizeServiceRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ServiceRefType element = getServiceRef(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property resourceRef
		for (int _index = 0; _index < sizeResourceRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ResourceRefType element = getResourceRef(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property resourceEnvRef
		for (int _index = 0; _index < sizeResourceEnvRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ResourceEnvRefType element = getResourceEnvRef(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property messageDestinationRef
		for (int _index = 0; _index < sizeMessageDestinationRef(); 
			++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.MessageDestinationRefType element = getMessageDestinationRef(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property persistenceContextRef
		for (int _index = 0; _index < sizePersistenceContextRef(); 
			++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.PersistenceContextRefType element = getPersistenceContextRef(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property persistenceUnitRef
		for (int _index = 0; _index < sizePersistenceUnitRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.PersistenceUnitRefType element = getPersistenceUnitRef(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property postConstruct
		for (int _index = 0; _index < sizePostConstruct(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.LifecycleCallbackType element = getPostConstruct(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property preDestroy
		for (int _index = 0; _index < sizePreDestroy(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.LifecycleCallbackType element = getPreDestroy(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property dataSource
		for (int _index = 0; _index < sizeDataSource(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.DataSourceType element = getDataSource(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property jmsConnectionFactory
		for (int _index = 0; _index < sizeJmsConnectionFactory(); 
			++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.JmsConnectionFactoryType element = getJmsConnectionFactory(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property jmsDestination
		for (int _index = 0; _index < sizeJmsDestination(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.JmsDestinationType element = getJmsDestination(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property mailSession
		for (int _index = 0; _index < sizeMailSession(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.MailSessionType element = getMailSession(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property connectionFactory
		for (int _index = 0; _index < sizeConnectionFactory(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.ConnectionFactoryResourceType element = getConnectionFactory(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property administeredObject
		for (int _index = 0; _index < sizeAdministeredObject(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.AdministeredObjectType element = getAdministeredObject(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property messageDestination
		for (int _index = 0; _index < sizeMessageDestination(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.MessageDestinationType element = getMessageDestination(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property localeEncodingMappingList
		for (int _index = 0; _index < sizeLocaleEncodingMappingList(); 
			++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.LocaleEncodingMappingListType element = getLocaleEncodingMappingList(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property ordering
		for (int _index = 0; _index < sizeOrdering(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_5_0_frag.OrderingType element = getOrdering(_index);
			if (element != null) {
				element.validate();
			}
		}
	}

	// Special serializer: output XML as serialization
	private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException{
		out.defaultWriteObject();
		final int MAX_SIZE = 0XFFFF;
		final ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try{
			write(baos, SERIALIZATION_HELPER_CHARSET);
			final byte [] array = baos.toByteArray();
			final int numStrings = array.length / MAX_SIZE;
			final int leftover = array.length % MAX_SIZE;
			out.writeInt(numStrings + (0 == leftover ? 0 : 1));
			out.writeInt(MAX_SIZE);
			int offset = 0;
			for (int i = 0; i < numStrings; i++){
				out.writeUTF(new String(array, offset, MAX_SIZE, SERIALIZATION_HELPER_CHARSET));
				offset += MAX_SIZE;
			}
			if (leftover > 0){
				final int count = array.length - offset;
				out.writeUTF(new String(array, offset, count, SERIALIZATION_HELPER_CHARSET));
			}
		}
		catch (Schema2BeansException ex){
			throw new Schema2BeansRuntimeException(ex);
		}
	}
	// Special deserializer: read XML as deserialization
	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException{
		try{
			in.defaultReadObject();
			init(comparators, runtimeVersion);
			// init(comparators, new GenBeans.Version(1, 0, 8))
			final int numStrings = in.readInt();
			final int max_size = in.readInt();
			final StringBuilder sb = new StringBuilder(numStrings * max_size);
			for (int i = 0; i < numStrings; i++){
				sb.append(in.readUTF());
			}
			ByteArrayInputStream bais = new ByteArrayInputStream(sb.toString().getBytes(SERIALIZATION_HELPER_CHARSET));
			Document doc = GraphManager.createXmlDocument(bais, false);
			initOptions(Common.NO_DEFAULT_VALUES);
			initFromNode(doc, Common.NO_DEFAULT_VALUES);
		}
		catch (Schema2BeansException e){
			throw new RuntimeException(e);
		}
	}

	public void _setSchemaLocation(String location) {
		if (beanProp().getAttrProp("xsi:schemaLocation", true) == null) {
			createAttribute("xmlns:xsi", "xmlns:xsi", AttrProp.CDATA | AttrProp.IMPLIED, null, "http://www.w3.org/2001/XMLSchema-instance");
			setAttributeValue("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
			createAttribute("xsi:schemaLocation", "xsi:schemaLocation", AttrProp.CDATA | AttrProp.IMPLIED, null, location);
		}
		setAttributeValue("xsi:schemaLocation", location);
	}

	public String _getSchemaLocation() {
		if (beanProp().getAttrProp("xsi:schemaLocation", true) == null) {
			createAttribute("xmlns:xsi", "xmlns:xsi", AttrProp.CDATA | AttrProp.IMPLIED, null, "http://www.w3.org/2001/XMLSchema-instance");
			setAttributeValue("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
			createAttribute("xsi:schemaLocation", "xsi:schemaLocation", AttrProp.CDATA | AttrProp.IMPLIED, null, null);
		}
		return getAttributeValue("xsi:schemaLocation");
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("Name["+this.sizeName()+"]");	// NOI18N
		for(int i=0; i<this.sizeName(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getName(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(NAME, i, str, indent);
		}

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
		str.append("Distributable["+this.sizeDistributable()+"]");	// NOI18N
		for(int i=0; i<this.sizeDistributable(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getDistributable(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(DISTRIBUTABLE, i, str, indent);
		}

		str.append(indent);
		str.append("ContextParam["+this.sizeContextParam()+"]");	// NOI18N
		for(int i=0; i<this.sizeContextParam(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getContextParam(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(CONTEXT_PARAM, i, str, indent);
		}

		str.append(indent);
		str.append("Filter["+this.sizeFilter()+"]");	// NOI18N
		for(int i=0; i<this.sizeFilter(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getFilter(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(FILTER, i, str, indent);
		}

		str.append(indent);
		str.append("FilterMapping["+this.sizeFilterMapping()+"]");	// NOI18N
		for(int i=0; i<this.sizeFilterMapping(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getFilterMapping(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(FILTER_MAPPING, i, str, indent);
		}

		str.append(indent);
		str.append("Listener["+this.sizeListener()+"]");	// NOI18N
		for(int i=0; i<this.sizeListener(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getListener(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(LISTENER, i, str, indent);
		}

		str.append(indent);
		str.append("Servlet["+this.sizeServlet()+"]");	// NOI18N
		for(int i=0; i<this.sizeServlet(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getServlet(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(SERVLET, i, str, indent);
		}

		str.append(indent);
		str.append("ServletMapping["+this.sizeServletMapping()+"]");	// NOI18N
		for(int i=0; i<this.sizeServletMapping(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getServletMapping(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(SERVLET_MAPPING, i, str, indent);
		}

		str.append(indent);
		str.append("SessionConfig["+this.sizeSessionConfig()+"]");	// NOI18N
		for(int i=0; i<this.sizeSessionConfig(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getSessionConfig(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(SESSION_CONFIG, i, str, indent);
		}

		str.append(indent);
		str.append("MimeMapping["+this.sizeMimeMapping()+"]");	// NOI18N
		for(int i=0; i<this.sizeMimeMapping(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getMimeMapping(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(MIME_MAPPING, i, str, indent);
		}

		str.append(indent);
		str.append("WelcomeFileList["+this.sizeWelcomeFileList()+"]");	// NOI18N
		for(int i=0; i<this.sizeWelcomeFileList(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getWelcomeFileList(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(WELCOME_FILE_LIST, i, str, indent);
		}

		str.append(indent);
		str.append("ErrorPage["+this.sizeErrorPage()+"]");	// NOI18N
		for(int i=0; i<this.sizeErrorPage(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getErrorPage(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(ERROR_PAGE, i, str, indent);
		}

		str.append(indent);
		str.append("JspConfig["+this.sizeJspConfig()+"]");	// NOI18N
		for(int i=0; i<this.sizeJspConfig(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getJspConfig(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(JSP_CONFIG, i, str, indent);
		}

		str.append(indent);
		str.append("SecurityConstraint["+this.sizeSecurityConstraint()+"]");	// NOI18N
		for(int i=0; i<this.sizeSecurityConstraint(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getSecurityConstraint(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(SECURITY_CONSTRAINT, i, str, indent);
		}

		str.append(indent);
		str.append("LoginConfig["+this.sizeLoginConfig()+"]");	// NOI18N
		for(int i=0; i<this.sizeLoginConfig(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getLoginConfig(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(LOGIN_CONFIG, i, str, indent);
		}

		str.append(indent);
		str.append("SecurityRole["+this.sizeSecurityRole()+"]");	// NOI18N
		for(int i=0; i<this.sizeSecurityRole(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getSecurityRole(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(SECURITY_ROLE, i, str, indent);
		}

		str.append(indent);
		str.append("EnvEntry["+this.sizeEnvEntry()+"]");	// NOI18N
		for(int i=0; i<this.sizeEnvEntry(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getEnvEntry(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(ENV_ENTRY, i, str, indent);
		}

		str.append(indent);
		str.append("EjbRef["+this.sizeEjbRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeEjbRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getEjbRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(EJB_REF, i, str, indent);
		}

		str.append(indent);
		str.append("EjbLocalRef["+this.sizeEjbLocalRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeEjbLocalRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getEjbLocalRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(EJB_LOCAL_REF, i, str, indent);
		}

		str.append(indent);
		str.append("ServiceRef["+this.sizeServiceRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeServiceRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getServiceRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(SERVICE_REF, i, str, indent);
		}

		str.append(indent);
		str.append("ResourceRef["+this.sizeResourceRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeResourceRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getResourceRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(RESOURCE_REF, i, str, indent);
		}

		str.append(indent);
		str.append("ResourceEnvRef["+this.sizeResourceEnvRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeResourceEnvRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getResourceEnvRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(RESOURCE_ENV_REF, i, str, indent);
		}

		str.append(indent);
		str.append("MessageDestinationRef["+this.sizeMessageDestinationRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeMessageDestinationRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getMessageDestinationRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(MESSAGE_DESTINATION_REF, i, str, indent);
		}

		str.append(indent);
		str.append("PersistenceContextRef["+this.sizePersistenceContextRef()+"]");	// NOI18N
		for(int i=0; i<this.sizePersistenceContextRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getPersistenceContextRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(PERSISTENCE_CONTEXT_REF, i, str, indent);
		}

		str.append(indent);
		str.append("PersistenceUnitRef["+this.sizePersistenceUnitRef()+"]");	// NOI18N
		for(int i=0; i<this.sizePersistenceUnitRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getPersistenceUnitRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(PERSISTENCE_UNIT_REF, i, str, indent);
		}

		str.append(indent);
		str.append("PostConstruct["+this.sizePostConstruct()+"]");	// NOI18N
		for(int i=0; i<this.sizePostConstruct(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getPostConstruct(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(POST_CONSTRUCT, i, str, indent);
		}

		str.append(indent);
		str.append("PreDestroy["+this.sizePreDestroy()+"]");	// NOI18N
		for(int i=0; i<this.sizePreDestroy(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getPreDestroy(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(PRE_DESTROY, i, str, indent);
		}

		str.append(indent);
		str.append("DataSource["+this.sizeDataSource()+"]");	// NOI18N
		for(int i=0; i<this.sizeDataSource(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getDataSource(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(DATA_SOURCE, i, str, indent);
		}

		str.append(indent);
		str.append("JmsConnectionFactory["+this.sizeJmsConnectionFactory()+"]");	// NOI18N
		for(int i=0; i<this.sizeJmsConnectionFactory(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getJmsConnectionFactory(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(JMS_CONNECTION_FACTORY, i, str, indent);
		}

		str.append(indent);
		str.append("JmsDestination["+this.sizeJmsDestination()+"]");	// NOI18N
		for(int i=0; i<this.sizeJmsDestination(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getJmsDestination(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(JMS_DESTINATION, i, str, indent);
		}

		str.append(indent);
		str.append("MailSession["+this.sizeMailSession()+"]");	// NOI18N
		for(int i=0; i<this.sizeMailSession(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getMailSession(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(MAIL_SESSION, i, str, indent);
		}

		str.append(indent);
		str.append("ConnectionFactory["+this.sizeConnectionFactory()+"]");	// NOI18N
		for(int i=0; i<this.sizeConnectionFactory(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getConnectionFactory(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(CONNECTION_FACTORY, i, str, indent);
		}

		str.append(indent);
		str.append("AdministeredObject["+this.sizeAdministeredObject()+"]");	// NOI18N
		for(int i=0; i<this.sizeAdministeredObject(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getAdministeredObject(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(ADMINISTERED_OBJECT, i, str, indent);
		}

		str.append(indent);
		str.append("MessageDestination["+this.sizeMessageDestination()+"]");	// NOI18N
		for(int i=0; i<this.sizeMessageDestination(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getMessageDestination(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(MESSAGE_DESTINATION, i, str, indent);
		}

		str.append(indent);
		str.append("LocaleEncodingMappingList["+this.sizeLocaleEncodingMappingList()+"]");	// NOI18N
		for(int i=0; i<this.sizeLocaleEncodingMappingList(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getLocaleEncodingMappingList(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(LOCALE_ENCODING_MAPPING_LIST, i, str, indent);
		}

		str.append(indent);
		str.append("Ordering["+this.sizeOrdering()+"]");	// NOI18N
		for(int i=0; i<this.sizeOrdering(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getOrdering(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(ORDERING, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("WebFragment\n");	// NOI18N
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
