<%-- 
    Document   : login
    Created on : Aug 20, 2017, 8:25:59 PM
    Author     : Ognjen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div id="unesi">Unesite vaš email i šifru</div>
<div id="login">
    <form method="post" action="login">
    <div class="col-xs-4">
        <input type="email" class="form-control" placeholder="Email" name="email">
    </div>
    <div class="col-xs-4">
        <input type="password" class="form-control" placeholder="Password" name="password">
        
    </div>
        <input type="submit" class="btn btn-primary btn-lg" id="btnlog" value="Login">
    
  </form>
</div>


<%@include file="footer.jsp" %>