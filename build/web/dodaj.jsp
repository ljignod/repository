<%-- 
    Document   : dodaj
    Created on : Aug 20, 2017, 1:06:08 PM
    Author     : Ognjen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<script type="text/javascript" src="js/bootstrap-filestyle.min.js"> </script>
<c:choose>
<c:when test="${sessionScope.ulogovan!=null}">
                    
                

    <div id="dodaj1">

        <form method="post" action="dodaj" enctype="multipart/form-data">
            
                <select class="form-control" name="marka">
                    <option selected disabled>Marka</option>
                    <option class="dodaj" value="Alfa Romeo">Alfa Romeo</option>
                    <option value="Audi">Audi</option>
                    <option value="BMW">Bmw</option>
                    <option value="Fiat">Fiat</option>
                    <option value="Mercedes">Mercedes</option>
                    <option value="Opel">Opel</option>
                    <option value="Peugeot">Peugeot</option>
                    <option value="Renault">Renault</option>
                    <option value="Toyota">Toyota</option>
                    <option value="Volkswagen">Volkswagen</option>
                </select>

                <select class="form-control" name="tip" >
                    <option selected disabled>Tip karoserije</option>
                    <option value="Limuzina">Limuzina</option>
                    <option value="Hecbek">Hečbek</option>
                    <option value="Karavan">Karavan</option>
                    <option value="Kupe">Kupe</option>
                    <option value="Kabriolet">Kabriolet</option>
                    <option value="MiniVan">MiniVan</option>
                    <option value="Dzip/SUV">Džip/SUV</option>
                    <option value="Pickup">Pickup</option>
                </select>
            
                <select class="form-control" name="vrata">
                    <option selected disabled>Broj vrata</option>
                    <option value="2/3">2/3 vrata</option>
                    <option value="4/5">4/5 vrata</option>
                </select>
            
                <select class="form-control" name="menjac">
                    <option selected disabled>Menjač</option>
                    <option value="Manuelni">Manuelni</option>
                    <option value="Automatski">Automatski</option>
                </select>
                
                <select class="form-control" name="gorivo">
                    <option selected disabled>Gorivo</option>
                    <option value="Benzin">Benzin</option>
                    <option value="Dizel">Dizel</option>
                </select>
            
                <select class="form-control" id="godiste" name="godiste"><option selected disabled>Godište</option></select>

                
                 
                 <div class="input-group">
                <label class="input-group-btn">
                    <span class="btn btn-info">
                        Browse&hellip; <input type="file" name="slika" style="display: none;" multiple>
                    </span>
                </label>
                <input type="text" class="form-control" readonly>
                </div>
                <span class="help-block">
                &nbsp&nbsp&nbsp&nbsp&nbspIzaberite jednu ili više fotografija
                </span>
                 
    </div>
    <div id="dodaj2">
        
        <input class="form-control" type="text" name="model" maxlength="200" placeholder="Model">
        
        <input class="form-control" type="text" name="cena" maxlength="9" placeholder="Cena (€)" onkeypress='return event.charCode >= 48 && event.charCode <= 57'>
         
        <input class="form-control" type="text" name="kubikaza" maxlength="5" placeholder="Kubikaža (cm&sup3;)" onkeypress='return event.charCode >= 48 && event.charCode <= 57'>
        
        <input class="form-control" type="text" name="kilometraza" maxlength="9" placeholder="Kilometraža (km)" onkeypress='return event.charCode >= 48 && event.charCode <= 57'>
        
        <textarea class="form-control" name="opis" cols="40" rows="5" placeholder="Opis automobila" maxlength="2000"></textarea>
        
        <input type="submit" value="Dodaj" id="btnok" class="btn btn-primary btn-lg">
        
    </div>
                    <script>
                    var min = 1930,
                    max = new Date().getFullYear(),
                    select = document.getElementById('godiste');

                    for (var i = max; i>=min; i--){
                       var opt = document.createElement('option');
                       opt.value = i;
                       opt.innerHTML = i+(' god.');
                       select.appendChild(opt);
                    }
        </script>
        <script>$(function() {

            // We can attach the `fileselect` event to all file inputs on the page
            $(document).on('change', ':file', function() {
              var input = $(this),
                  numFiles = input.get(0).files ? input.get(0).files.length : 1,
                  label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
              input.trigger('fileselect', [numFiles, label]);
            });

            // We can watch for our custom `fileselect` event like this
            $(document).ready( function() {
                $(':file').on('fileselect', function(event, numFiles, label) {

                    var input = $(this).parents('.input-group').find(':text'),
                        log = numFiles > 1 ? numFiles + ' files selected' : label;

                    if( input.length ) {
                        input.val(log);
                    } else {
                        if( log ) alert(log);
                    }

                });
            });

          });
        </script>

            </form>
    </c:when> <c:otherwise>
        <div class="alert alert-danger col-md-4" id="alert" align="center">
            <strong><a href="login.jsp">Uloguj se</a> da bi dodao oglas!</strong>
                </div>
    </c:otherwise>
        </c:choose>
        
<%@include file="footer.jsp" %>