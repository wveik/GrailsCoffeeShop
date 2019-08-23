import ru.yandex.Customer
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_src_customer_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/customer/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: customerInstance, field: 'phone', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("customer.phone.label"),'default':("Phone")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['name':("phone"),'type':("number"),'value':(customerInstance.phone),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: customerInstance, field: 'firstName', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("customer.firstName.label"),'default':("First Name")],-1)
printHtmlPart(5)
invokeTag('textField','g',19,['name':("firstName"),'value':(customerInstance?.firstName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: customerInstance, field: 'lastName', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("customer.lastName.label"),'default':("Last Name")],-1)
printHtmlPart(5)
invokeTag('textField','g',28,['name':("lastName"),'value':(customerInstance?.lastName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: customerInstance, field: 'email', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("customer.email.label"),'default':("Email")],-1)
printHtmlPart(5)
invokeTag('field','g',37,['type':("email"),'name':("email"),'value':(customerInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: customerInstance, field: 'totalPoints', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("customer.totalPoints.label"),'default':("Total Points")],-1)
printHtmlPart(5)
invokeTag('field','g',46,['name':("totalPoints"),'type':("number"),'max':("10"),'value':(customerInstance.totalPoints)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: customerInstance, field: 'awards', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("customer.awards.label"),'default':("Awards")],-1)
printHtmlPart(10)
for( a in (customerInstance?.awards) ) {
printHtmlPart(11)
createTagBody(2, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',58,['controller':("award"),'action':("show"),'id':(a.id)],2)
printHtmlPart(12)
}
printHtmlPart(13)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'award.label', default: 'Award')]))
})
invokeTag('link','g',61,['controller':("award"),'action':("create"),'params':(['customer.id': customerInstance?.id])],1)
printHtmlPart(14)
expressionOut.print(hasErrors(bean: customerInstance, field: 'orders', 'error'))
printHtmlPart(15)
invokeTag('message','g',70,['code':("customer.orders.label"),'default':("Orders")],-1)
printHtmlPart(10)
for( o in (customerInstance?.orders) ) {
printHtmlPart(11)
createTagBody(2, {->
expressionOut.print(o?.encodeAsHTML())
})
invokeTag('link','g',76,['controller':("onlineOrder"),'action':("show"),'id':(o.id)],2)
printHtmlPart(12)
}
printHtmlPart(13)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'onlineOrder.label', default: 'OnlineOrder')]))
})
invokeTag('link','g',79,['controller':("onlineOrder"),'action':("create"),'params':(['customer.id': customerInstance?.id])],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1566563561828L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
