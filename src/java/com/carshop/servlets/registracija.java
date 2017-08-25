/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carshop.servlets;

import com.carshop.model.HibernateUtil;
import com.carshop.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ognjen
 */
@WebServlet(name = "registracija", urlPatterns = {"/registracija"})
public class registracija extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try{
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        User u = new User();
        
        u.setIme(request.getParameter("ime"));
        u.setPrezime(request.getParameter("prezime"));
        u.setAdresa(request.getParameter("adresa"));
        u.setGrad(request.getParameter("grad"));
        u.setTelefon(request.getParameter("telefon"));
        u.setEmail(request.getParameter("email"));
        
        try {
            u.setPassword(DatatypeConverter.printHexBinary(
            MessageDigest.getInstance("MD5").digest(request.getParameter("password").getBytes("UTF-8"))));
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
            
        session.save(u);
        tx.commit();
        session.close();
        
        request.setAttribute("poruka", "<strong>Uspešno ste se registrovali!</strong>");
        request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch(Exception ex){
            request.setAttribute("poruka1", "<strong>Registracija neuspešna!<br>Pokušajte ponovo!</strong>");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            ex.printStackTrace();
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
