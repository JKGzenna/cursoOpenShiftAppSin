package com.juanluisgzenna.openshift.aplicacion;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/aplicacion" })
public class Aplicacion extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8532332299687592651L;

	@Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Salida GET");
        response.getWriter().println("Salida GET version master");  
        response.getWriter().flush();
    }

    @Override
    protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Salida POST");
        response.getWriter().println("Salida POST");
        response.getWriter().flush();

    }

}
