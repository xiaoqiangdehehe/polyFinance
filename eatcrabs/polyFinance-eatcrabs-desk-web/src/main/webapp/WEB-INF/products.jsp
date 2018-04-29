<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<json:object>
    <json:property name="code" value="0"/>
    <json:property name="message" value="产品列表"/>
    <json:property name="count" value="${count}"/>
    <json:array name="products" var="product" items="${products}">
        <json:property name="productId" value="${product.id}"/>
        <json:property name="productName" value="${product.name}"/>
        <json:property name="annualizedReturn" value="${product.rate}"/>
        <json:property name="lockDate" value="${product.term}"/>
        <json:property name="startAmount" value="${product.least}"/>
        <json:property name="moduleType" value="${product.type}"/>
    </json:array>
</json:object>