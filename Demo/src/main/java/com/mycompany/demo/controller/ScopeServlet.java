/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

/**
 *
 * @author 20113
 */
@WebServlet("/scope")
public class ScopeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // request scope
        request.setAttribute("requestData", "Dữ liệu trong Request Scope");

        // session scope
        HttpSession session = request.getSession();
        session.setAttribute("sessionData", "Dữ liệu trong Session Scope");

        // application scope
        ServletContext app = getServletContext();
        app.setAttribute("appData", "Dữ liệu trong Application Scope");

        request.getRequestDispatcher("scope.jsp").forward(request, response);
    }
}
