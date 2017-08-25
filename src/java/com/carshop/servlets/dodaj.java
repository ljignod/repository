/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carshop.servlets;

import com.carshop.model.Auto;
import com.carshop.model.HibernateUtil;
import com.carshop.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ognjen
 */
@WebServlet(name = "dodaj", urlPatterns = {"/dodaj"})
@MultipartConfig
public class dodaj extends HttpServlet {

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
            HttpSession httpsession = request.getSession();
            User u = (User)httpsession.getAttribute("ulogovan");
            
            Transaction tx = session.beginTransaction();
            Auto a = new Auto();
            a.setCena(Integer.valueOf(request.getParameter("cena")));
            a.setGorivo(request.getParameter("gorivo"));
            a.setMarka(request.getParameter("marka"));
            a.setGodiste(Integer.valueOf(request.getParameter("godiste")));
            a.setKubikaza(Integer.valueOf(request.getParameter("kubikaza")));
            a.setMenjac(request.getParameter("menjac"));
            a.setModel(request.getParameter("model"));
            a.setOpis(request.getParameter("opis"));
            a.setTip(request.getParameter("tip"));
            a.setKilometraza(Integer.valueOf(request.getParameter("kilometraza")));
            a.setTelefon(u.getTelefon());
            a.setEmail(u.getEmail());
            a.setVrata(request.getParameter("vrata"));
            session.save(a);
            tx.commit();
            session.close();
            
            request.setAttribute("poruka", "<strong>Uspešno ste se dodali oglas!</strong>");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch(Exception ex){
            request.setAttribute("poruka1", "<strong>Neuspešno dodavanje!<br>Pokušajte ponovo!</strong>");
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
