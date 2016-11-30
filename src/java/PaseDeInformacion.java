/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PaseDeInformacion extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String nombre1=request.getParameter("nombre1");
        String pais1=request.getParameter("pais1");
        
        String nombre2=request.getParameter("nombre2");
        String pais2=request.getParameter("pais2");
        
        String nombre3=request.getParameter("nombre3");
        String pais3=request.getParameter("pais4");
        
        request.setAttribute("nombre1", nombre1);
        request.setAttribute("nombre2", nombre2);
        request.setAttribute("nombre3", nombre3);
        
        request.setAttribute("pais1",pais1);
        request.setAttribute("pais2",pais2);
        request.setAttribute("pais3",pais3);
        
        request.getRequestDispatcher("form1.jsp").forward(request, response);
        
        try (PrintWriter out = response.getWriter()) {
            
            
       
        response.setContentType("text/html;charset=UTF-8");
            
            
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PaseDeInformacion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Nombre1: " + request.getParameter("nombre1") + "</h1>");
            out.println("<h1>Pais1: " + request.getParameter("pais1") + "</h1>");
            out.println("<h1>Nombre2: " + request.getParameter("nombre2") + "</h1>");
            out.println("<h1>Pais2: " + request.getParameter("pais2") + "</h1>");
            out.println("<h1>Nombre3: " + request.getParameter("nombre3") + "</h1>");
            out.println("<h1>Pais3: " + request.getParameter("pais3") + "</h1>");
            out.println("</body>");
            out.println("</html>");
        */
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
