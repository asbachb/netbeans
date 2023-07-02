#Signature file v4.1
#Version 1.54.0

CLSS public com.sun.faces.RIConstants
fld public final static int FLOW_DEFINITION_ID_SUFFIX_LENGTH
fld public final static int FLOW_IN_JAR_PREFIX_LENGTH
fld public final static java.lang.Class<?>[] EMPTY_CLASS_ARGS
fld public final static java.lang.Object[] EMPTY_METH_ARGS
fld public final static java.lang.String ALL_MEDIA = "*/*"
fld public final static java.lang.String ANNOTATED_CLASSES = "com.sun.faces.AnnotatedClasses"
fld public final static java.lang.String APPLICATION_XML_CONTENT_TYPE = "application/xml"
fld public final static java.lang.String CDI_BEAN_MANAGER = "com.sun.faces.cdi.BeanManager"
fld public final static java.lang.String CHAR_ENCODING = "UTF-8"
fld public final static java.lang.String DEFAULT_LIFECYCLE = "com.sun.faces.DefaultLifecycle"
fld public final static java.lang.String DEFAULT_STATEMANAGER = "com.sun.faces.DefaultStateManager"
fld public final static java.lang.String DOCUMENT_NAMESPACE = "https://jakarta.ee/xml/ns/jakartaee"
fld public final static java.lang.String DOCUMENT_VERSION = "4.0"
fld public final static java.lang.String DYNAMIC_ACTIONS = "com.sun.faces.DynamicActions"
fld public final static java.lang.String DYNAMIC_CHILD_COUNT = "com.sun.faces.DynamicChildCount"
fld public final static java.lang.String DYNAMIC_COMPONENT = "com.sun.faces.DynamicComponent"
fld public final static java.lang.String ERROR_PAGE_PRESENT_KEY_NAME = "com.sun.faces.errorPagePresent"
fld public final static java.lang.String FACELETS_ENCODING_KEY = "facelets.Encoding"
fld public final static java.lang.String FACES_CONFIG_VERSION = "com.sun.faces.facesConfigVersion"
fld public final static java.lang.String FACES_PREFIX = "com.sun.faces."
fld public final static java.lang.String FACES_SERVLET_MAPPINGS = "com.sun.faces.FacesServletMappings"
fld public final static java.lang.String FACES_SERVLET_REGISTRATION = "com.sun.faces.FacesServletRegistration"
fld public final static java.lang.String FLOW_DEFINITION_ID_SUFFIX = "-flow.xml"
fld public final static java.lang.String FLOW_DISCOVERY_CDI_HELPER_BEAN_NAME = "csfFLOWDISCOVERYCDIHELPER"
fld public final static java.lang.String FLOW_IN_JAR_PREFIX = "META-INF/flows"
fld public final static java.lang.String HTML_BASIC_RENDER_KIT = "com.sun.faces.HTML_BASIC"
fld public final static java.lang.String HTML_CONTENT_TYPE = "text/html"
fld public final static java.lang.String NO_VALUE = ""
fld public final static java.lang.String PUSH_RESOURCE_URLS_KEY_NAME = "com.sun.faces.resourceUrls"
fld public final static java.lang.String SAVED_STATE = "com.sun.faces.savedState"
fld public final static java.lang.String SAVESTATE_FIELD_DELIMITER = "~"
fld public final static java.lang.String SAVESTATE_FIELD_MARKER = "~com.sun.faces.saveStateFieldMarker~"
fld public final static java.lang.String TEXT_XML_CONTENT_TYPE = "text/xml"
fld public final static java.lang.String TLV_RESOURCE_LOCATION = "com.sun.faces.resources.Resources"
fld public final static java.lang.String TREE_HAS_DYNAMIC_COMPONENTS = "com.sun.faces.TreeHasDynamicComponents"
fld public final static java.lang.String VIEWID_KEY_NAME = "com.sun.faces.viewId"
fld public final static java.lang.String XHTML_CONTENT_TYPE = "application/xhtml+xml"
supr java.lang.Object

CLSS public jakarta.faces.FacesException
cons public init()
cons public init(java.lang.String)
cons public init(java.lang.String,java.lang.Throwable)
cons public init(java.lang.Throwable)
meth public java.lang.Throwable getCause()
supr java.lang.RuntimeException
hfds cause,serialVersionUID

CLSS public abstract interface jakarta.faces.FacesWrapper<%0 extends java.lang.Object>
meth public abstract {jakarta.faces.FacesWrapper%0} getWrapped()

CLSS public final jakarta.faces.FactoryFinder
fld public final static java.lang.String APPLICATION_FACTORY = "jakarta.faces.application.ApplicationFactory"
fld public final static java.lang.String CLIENT_WINDOW_FACTORY = "jakarta.faces.lifecycle.ClientWindowFactory"
fld public final static java.lang.String EXCEPTION_HANDLER_FACTORY = "jakarta.faces.context.ExceptionHandlerFactory"
fld public final static java.lang.String EXTERNAL_CONTEXT_FACTORY = "jakarta.faces.context.ExternalContextFactory"
fld public final static java.lang.String FACELET_CACHE_FACTORY = "jakarta.faces.view.facelets.FaceletCacheFactory"
fld public final static java.lang.String FACES_CONTEXT_FACTORY = "jakarta.faces.context.FacesContextFactory"
fld public final static java.lang.String FLASH_FACTORY = "jakarta.faces.context.FlashFactory"
fld public final static java.lang.String FLOW_HANDLER_FACTORY = "jakarta.faces.flow.FlowHandlerFactory"
fld public final static java.lang.String LIFECYCLE_FACTORY = "jakarta.faces.lifecycle.LifecycleFactory"
fld public final static java.lang.String PARTIAL_VIEW_CONTEXT_FACTORY = "jakarta.faces.context.PartialViewContextFactory"
fld public final static java.lang.String RENDER_KIT_FACTORY = "jakarta.faces.render.RenderKitFactory"
fld public final static java.lang.String SEARCH_EXPRESSION_CONTEXT_FACTORY = "jakarta.faces.component.search.SearchExpressionContextFactory"
fld public final static java.lang.String TAG_HANDLER_DELEGATE_FACTORY = "jakarta.faces.view.facelets.TagHandlerDelegateFactory"
fld public final static java.lang.String VIEW_DECLARATION_LANGUAGE_FACTORY = "jakarta.faces.view.ViewDeclarationLanguageFactory"
fld public final static java.lang.String VISIT_CONTEXT_FACTORY = "jakarta.faces.component.visit.VisitContextFactory"
meth public static java.lang.Object getFactory(java.lang.String)
meth public static void releaseFactories()
meth public static void setFactory(java.lang.String,java.lang.String)
supr java.lang.Object
hfds FACTORIES_CACHE

CLSS public abstract interface java.io.Serializable

CLSS public java.lang.Exception
cons protected init(java.lang.String,java.lang.Throwable,boolean,boolean)
cons public init()
cons public init(java.lang.String)
cons public init(java.lang.String,java.lang.Throwable)
cons public init(java.lang.Throwable)
supr java.lang.Throwable

CLSS public java.lang.Object
cons public init()
meth protected java.lang.Object clone() throws java.lang.CloneNotSupportedException
meth protected void finalize() throws java.lang.Throwable
meth public boolean equals(java.lang.Object)
meth public final java.lang.Class<?> getClass()
meth public final void notify()
meth public final void notifyAll()
meth public final void wait() throws java.lang.InterruptedException
meth public final void wait(long) throws java.lang.InterruptedException
meth public final void wait(long,int) throws java.lang.InterruptedException
meth public int hashCode()
meth public java.lang.String toString()

CLSS public java.lang.RuntimeException
cons protected init(java.lang.String,java.lang.Throwable,boolean,boolean)
cons public init()
cons public init(java.lang.String)
cons public init(java.lang.String,java.lang.Throwable)
cons public init(java.lang.Throwable)
supr java.lang.Exception

CLSS public java.lang.Throwable
cons protected init(java.lang.String,java.lang.Throwable,boolean,boolean)
cons public init()
cons public init(java.lang.String)
cons public init(java.lang.String,java.lang.Throwable)
cons public init(java.lang.Throwable)
intf java.io.Serializable
meth public final java.lang.Throwable[] getSuppressed()
meth public final void addSuppressed(java.lang.Throwable)
meth public java.lang.StackTraceElement[] getStackTrace()
meth public java.lang.String getLocalizedMessage()
meth public java.lang.String getMessage()
meth public java.lang.String toString()
meth public java.lang.Throwable fillInStackTrace()
meth public java.lang.Throwable getCause()
meth public java.lang.Throwable initCause(java.lang.Throwable)
meth public void printStackTrace()
meth public void printStackTrace(java.io.PrintStream)
meth public void printStackTrace(java.io.PrintWriter)
meth public void setStackTrace(java.lang.StackTraceElement[])
supr java.lang.Object

