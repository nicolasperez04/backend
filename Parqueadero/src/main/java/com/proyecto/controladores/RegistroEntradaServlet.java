package com.proyecto.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registrarEntrada")
public class RegistroEntradaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Recupera los datos del formulario
        String placa = request.getParameter("placa");
        String horaEntrada = request.getParameter("horaEntrada");
        String ubicacion = request.getParameter("ubicacion");
        String tipoVehiculo = request.getParameter("tipoVehiculo");

        // Aquí puedes realizar el procesamiento adicional, como guardar los datos en la base de datos.

        // Redirige a una página de confirmación
        response.sendRedirect("confirmacion.jsp");
    }
}

