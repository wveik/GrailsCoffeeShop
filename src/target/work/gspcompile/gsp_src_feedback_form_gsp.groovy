import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_src_feedback_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/feedback/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('textField','g',3,['name':("firstName"),'value':(firstName)],-1)
printHtmlPart(1)
invokeTag('textArea','g',8,['name':("comments"),'value':(comments)],-1)
printHtmlPart(2)
invokeTag('passwordField','g',14,['name':("password"),'value':(password)],-1)
printHtmlPart(3)
invokeTag('checkBox','g',19,['name':("notify"),'value':(notify)],-1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
expressionOut.print(it.label)
printHtmlPart(5)
expressionOut.print(it.radio)
printHtmlPart(6)
})
invokeTag('radioGroup','g',29,['name':("gender"),'labels':(['Male','Female', 'other']),'values':(['M','F', 'O']),'value':(gender)],1)
printHtmlPart(7)
invokeTag('select','g',34,['from':(['Internet','Friend','Other']),'name':("marketing"),'value':(marketing)],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1566544062687L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
