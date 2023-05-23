<%-- 
    Document   : StudentRecord
    Created on : 14-Jul-2022, 16:06:01
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Purchase Registration</title>
    </head>
    <body>
        <s:form action="addSchemeRecords" method="post">            
            <s:textfield label="Seminar" name="showScheme.seminar"/>
            <s:textfield label="Purchase of Books" name="showScheme.purchaseBooks"/>
            <s:textfield label="Purchase of Furniture" name="showScheme.purchaseFurniture"/>
            <s:textfield label="Cost of CM" name="showScheme.costofCM"/>
            <s:textfield label="Purchase of Computer" name="showScheme.purchaseComputer"/>
            <s:textfield label="Renovation" name="showScheme.renovation"/>
            <s:textfield label="Organization" name="showScheme.organisation"/>
            <s:textfield label="Publishing" name="showScheme.publishing"/>      
            <s:submit/><s:reset/>
        </s:form>
        <table id="example" class="display" cellspacing="0" width="95%">
            <thead>
                <tr>
                    <th>Seminar</th>
                    <th>Purchase of Books</th>
                    <th>Purchase of Furniture</th>
                    <th>Cost of CM</th>
                    <th>Purchase of Computer</th>
                    <th>Renovation</th>
                    <th>Organization</th>
                    <th>Publishing</th>                    
                    <th>Total</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="data" items="${schemeList}">
                    <tr>                         
                        <td style="text-align: center">${data.seminar}</td>
                        <td style="text-align: center">${data.purchaseBooks}</td>
                        <td style="text-align: center">${data.purchaseFurniture}</td>
                        <td style="text-align: center">${data.costofCM}</td>
                        <td style="text-align: center">${data.purchaseComputer}</td>
                        <td style="text-align: center">${data.renovation}</td>
                        <td style="text-align: center">${data.organisation}</td>
                        <td style="text-align: center">${data.publishing}</td>
                        <td style="text-align: left">${data.total}</td>
                    </tr> 
                </c:forEach>
            <tbody>
     </body>
</html>
