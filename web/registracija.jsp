<%-- 
    Document   : registracija
    Created on : Aug 21, 2017, 5:04:22 PM
    Author     : Ognjen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div id="reg1">
<form method="post" action="registracija">
    <input class="form-control" type="text" name="ime" placeholder="Ime" maxlength="60">
    <input class="form-control" type="text" name="prezime" placeholder="Prezime" maxlength="60">
    <input class="form-control" type="text" name="adresa" placeholder="Adresa" maxlength="120">
    <input class="form-control" type="text" name="grad" placeholder="Grad" maxlength="60">
    <input class="form-control" type="text" name="telefon" placeholder="Telefon" maxlength="30" onkeypress='return event.charCode >= 48 && event.charCode <= 57' required>
    <input class="form-control" type="email" name="email" placeholder="E-mail" maxlength="60" required>
    <input class="form-control" type="password" name="password" placeholder="Password" maxlength="60" required>
    
    <input id="btnok1" class="btn btn-primary btn-lg" type="submit" value="U redu">
</form>
</div>
<%@include file="footer.jsp" %>