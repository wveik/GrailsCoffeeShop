<%@ page import="ru.yandex.Customer" %>



<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'awards', 'error')} ">
	<label for="awards">
		<g:message code="customer.awards.label" default="Awards" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${customerInstance?.awards?}" var="a">
    <li><g:link controller="award" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="award" action="create" params="['customer.id': customerInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'award.label', default: 'Award')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="customer.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="email" required="" value="${customerInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'firstName', 'error')} required">
	<label for="firstName">
		<g:message code="customer.firstName.label" default="First Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="firstName" required="" value="${customerInstance?.firstName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'lastName', 'error')} required">
	<label for="lastName">
		<g:message code="customer.lastName.label" default="Last Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lastName" required="" value="${customerInstance?.lastName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'orders', 'error')} ">
	<label for="orders">
		<g:message code="customer.orders.label" default="Orders" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${customerInstance?.orders?}" var="o">
    <li><g:link controller="onlineOrder" action="show" id="${o.id}">${o?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="onlineOrder" action="create" params="['customer.id': customerInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'onlineOrder.label', default: 'OnlineOrder')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'phone', 'error')} required">
	<label for="phone">
		<g:message code="customer.phone.label" default="Phone" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="phone" type="number" value="${customerInstance.phone}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'totalPoints', 'error')} required">
	<label for="totalPoints">
		<g:message code="customer.totalPoints.label" default="Total Points" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="totalPoints" type="number" value="${customerInstance.totalPoints}" required=""/>

</div>

