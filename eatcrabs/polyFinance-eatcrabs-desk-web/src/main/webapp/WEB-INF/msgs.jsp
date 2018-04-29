<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<json:object>
    <json:property name="code" value="0"/>
    <json:property name="message" value="消息请求成功"/>
    <json:property name="count" value="${count}"
    <json:array name="msgs" var="msg" items="${msgs}">
        <json:object>
            <json:property name="msgId" value="${msg.id}"/>
            <json:property name="msgTitle" value="${msg.title}"/>
            <json:property name="msgContent" value="${msg.content}"/>
            <json:property name="lookUp" value="${msg.read}"/>
            <json:property name="createTime" value="${msg.createAt}"/>
        </json:object>
    </json:array>
</json:object>