<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>


    
            <c:forEach var="auto" items="${auti}">
                <a href="detalji?id=${auto.id}">
                    <div class="auto">
                    <c:if test="${auto.slika==null}">
                        <img src="slike/Auti/audi.jpg" width="220" height="150">
                    </c:if>
                    <c:if test="${auto.slika!=null}">
                        <img src="slike/Auti/${auto.slika}" width="220" height="150">
                    </c:if>
                    <h4 style="color: white;">${auto.cena} €</h4>

                    <h5 style="color: white;">${auto.marka}<br>${auto.model}</h5>
                
                    </div>
                </a>
            </c:forEach>
    
    

<%@include file="footer.jsp" %>