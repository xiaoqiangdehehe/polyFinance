<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<json:object>
    <json:property name="count" value="${count}"/>
    <json:array name="banners" var="banner" items="${banners}">
        <json:object>
            <json:property name="id" value="${banner.id}"/>
            <json:property name="title" value="${banner.name}"/>
            <json:property name="updateAt" value="${banner.updateAt}"/>
            <json:property name="online" value="${banner.online}"/>
            <json:property name="img" value="${banner.img}"/>
        </json:object>
    </json:array>
</json:object>