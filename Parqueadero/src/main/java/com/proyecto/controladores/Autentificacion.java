package com.proyecto.controladores;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Autentificacion")
public class Autentificacion extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");

       
        if (username.equals("admin") && password.equals("contrasena_admin")) {
       
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("role", "admin");
            response.sendRedirect("registro.jsp"); 
        } else if (username.equals("usuario") && password.equals("contrasena_usuario")) {
       
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("role", "usuario");
            response.sendRedirect("registro.jsp"); 
        } else {
            // Credenciales inválidas
            response.sendRedirect("login.jsp?error=1"); // Redirige a la página de inicio de sesión con un mensaje de error
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Cierre de sesión
        HttpSession session = request.getSession();
        session.invalidate(); // Cierra la sesión del usuario
        response.sendRedirect("registro.jsp"); // Redirige a la página de inicio de sesión
    }
}


