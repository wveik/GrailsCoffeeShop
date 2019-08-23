import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_src_customer_kioskForm_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/customer/_kioskForm.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(welcomeMessage)
printHtmlPart(1)
invokeTag('textField','g',18,['name':("phone"),'class':("form-control"),'placeholder':("Enter your cell number to check in"),'value':(customerInstance?.phone)],-1)
printHtmlPart(2)
createClosureForHtmlPart(3, 1)
invokeTag('link','g',78,['class':("btn btn-danger btn-lg btn-block"),'action':("checkin")],1)
printHtmlPart(4)
invokeTag('submitButton','g',86,['class':("btn btn-success btn-lg btn-block"),'name':("pad"),'value':("Go")],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1566545849814L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
