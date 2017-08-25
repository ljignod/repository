<%-- 
    Document   : detalji
    Created on : Aug 22, 2017, 2:09:52 PM
    Author     : Ognjen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

                    <div id="detalji1">
                        <c:if test="${auto.slika==null}">
                                            <img src="slike/Auti/audi.jpg" width="440" height="300">
                                        </c:if>
                                        <c:if test="${auto.slika!=null}">
                                            <img src="slike/Auti/${auto.slika}" width="440" height="300">
                                        </c:if>
                                        <h3 id="h3detalji" style="color: white;">${auto.marka}<br>${auto.model}</h3>
                    </div>
                    
                    <div id="detalji2">
                        <h3 id="h3cena" style="color: white;">${auto.cena}&nbsp€</h3>
                        
                        <div id="detalji3">
                        <p>${auto.godiste}. godište</p>
                        <p>${auto.kilometraza} km</p>
                        <p>${auto.tip}</p>
                        <p>${auto.gorivo}</p>
                        <p>${auto.kubikaza} cm<sup>3</sup></p>
                        <p>E-mail:<br>${auto.email}</p>
                        <p>Telefon:<br>${auto.telefon}</p>
                        
                        </div>
                        
                    </div>
                        
<%@include file="footer.jsp" %>
