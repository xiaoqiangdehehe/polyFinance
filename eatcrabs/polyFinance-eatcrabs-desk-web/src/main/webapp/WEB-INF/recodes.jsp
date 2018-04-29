<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<json:object>
    <json:property name="code" value="0"/>
    <json:property name="message" value="交易记录"/>
    <json:property name="count" value="20"/>

    <json:array name="transactions">
        <json:object>
            <json:property name="transactionId" value="01"/>
            <json:property name="type" value="1"/>
            <json:property name="amount" value="10000"/>
            <json:property name="status" value="1"/>
            <json:property name="productId" value="88"/>
            <json:property name="productName" value="聚财一号"/>
            <json:property name="createAt" value="15645846156"/>
        </json:object>

        <json:object>
            <json:property name="transactionId" value="01"/>
            <json:property name="type" value="1"/>
            <json:property name="amount" value="10000"/>
            <json:property name="status" value="1"/>
            <json:property name="productId" value="88"/>
            <json:property name="productName" value="聚财一号"/>
            <json:property name="createAt" value="15645846156"/>
        </json:object>

    </json:array>
</json:object>