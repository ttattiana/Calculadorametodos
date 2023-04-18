/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servelt;

import co.edu.unipiloto.session.calbeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "calServelt", urlPatterns = {"/calServelt"})
public class calServelt extends HttpServlet {

    @EJB
    private calbeanLocal calbean;
    
    

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
        String valor1=request.getParameter("valor1");
        String[] valor = valor1.split(" ");
        int v1 = Integer.parseInt(valor[0]);
        
        String operador = valor[1];
        int v2 = Integer.parseInt(valor[2]);
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet calServelt</title>");            
            out.println("</head>");
            out.println("<body>");
            if(operador.equals("+")){
               out.println("<h1>resultado de la suma es: " + calbean.sum(v1, v2) + "</h1>");
               
            }else if(operador.equals("-")){
                out.println("<h1>resultado de la resta es: " + calbean.restar(v1, v2) + "</h1>");
            }else if(operador.equals("/")){
                out.println("<h1>resultado de la divicion es: " + calbean.dividir(v1, v2) + "</h1>");
            }else if(operador.equals("*")){
                out.println("<h1>resultado de la multiplicacion es: " + calbean.multiplicar(v1, v2) + "</h1>");
            }else if(operador.equals("%")){
                out.println("<h1>resultado del modulo es: " + calbean.modulo(v1, v2) + "</h1>");
            }else if(operador.equals("^")){
                out.println("<h1>resultado es: " + calbean.elevar(v1,v2) + "</h1>");
            }
            out.println("<a href=\"calJsp.jsp\"> volver a calcular</a>");
            out.println("</body>");
            out.println("</html>");
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
