 <%-- 
    Document   : index
    Created on : Aug 18, 2017, 5:47:57 PM
    Author     : Ognjen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css">
        <title>CarShop</title>
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous"><link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
        
    </head>
    <body>
        
        <div id="wrapper">
            <div id="header">
                <div id="logo">
                    <a href="index"><img id="logo" src="slike/stranica/logo.jpg"></a>
                </div><!-- kraj diva logo -->
                <div id="reg">
                    
                    
                        <c:if test="${sessionScope.ulogovan==null}">
                                <a href="registracija.jsp"><button type="button" class="btn btn-info">Registruj se!</button></a>
                        </c:if>
                        
                                
                                
                 <div id="custom-search-input">
                     <form action="pretraga">
                            <div class="input-group col-md-12">
                                <input type="text" class="search-query form-control" placeholder="   Pretraga" />
                                <span class="input-group-btn">
                                    <button class="btn btn-danger" type="submit">
                                        <span class=" glyphicon glyphicon-search"></span>
                                    </button>
                                </span>
                            </div>
                         </form>
                        </div>              
                                
                                
                                
                                
                    
                    
                    
                </div>
            </div><!-- kraj diva header -->
                <div id="nav">
                    
                    <ul>
                        <c:choose>
                        <c:when test="${sessionScope.ulogovan!=null}">
                                <li><a href="logout">Logout</a></li>
                        </c:when>
                        <c:otherwise>
                        <li><a href="login.jsp">Login</a></li>
                        </c:otherwise>
                        </c:choose>
                        <li><a href="dodaj.jsp">Dodaj oglas</a></li>
                        <li><a href="kontakt.jsp">Kontakt</a></li>
                        <li><a href="onama.jsp">O nama</a></li>
                        <li><a href="index">Početna</a></li>
                    </ul>
                    
                
            </div><!-- kraj diva nav -->
            
            
            <div id="marke">
                <p id="najtrazeniji">Najtraženije marke:</p>
                <form action="marke">
                <a href="marke?marka=Volkswagen"><img src="slike/marke/vw.jpg" alt="Volkswagen" title="Volkswagen"></a>
                <a href="marke?marka=Audi"><img src="slike/marke/audi.png" alt="Audi" title="Audi"></a>
                <a href="marke?marka=BMW"><img src="slike/marke/bmw.gif" alt="BMW" title="BMW"></a>
                <a href="marke?marka=Fiat"><img src="slike/marke/fiat.png" alt="Fiat" title="Fiat"></a>
                <a href="marke?marka=Mercedes"><img src="slike/marke/mercedes.jpg" alt="Mercedes" title="Mercedes"></a>
                <a href="marke?marka=Opel"><img src="slike/marke/opel.jpg" alt="Opel" title="Opel"></a>
                <a href="marke?marka=Peugeot"><img src="slike/marke/peugeot.png" alt="Peugeot" title="Peugeot"></a>
                <a href="marke?marka=Renault"><img src="slike/marke/renault.jpg" alt="Renault" title="Renault"></a>
                <a href="marke?marka=Alfa Romeo"><img src="slike/marke/alfa.gif" alt="Alfa Romeo" title="Alfa Romeo"></a>
                <a href="marke?marka=Toyota"><img src="slike/marke/toyota.png" alt="Toyota" title="Toyota"></a>
                </form>
                
            </div>
<c:if test="${poruka!=null}">
                <div class="alert alert-success col-md-4" align="center">
                    ${poruka}<br><br>
                </div>
    </c:if>
    <c:if test="${poruka1!=null}">
                <div class="alert alert-danger col-md-4" align="center">
                    ${poruka1}<br><br>
                </div>
    </c:if>