/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

/**
 *
 * @author 20113
 */
@WebListener
public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Ứng dụng được khởi tạo!");
        sce.getServletContext().setAttribute("appName", "Scope Listener Filter Demo");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Ứng dụng bị dừng!");
    }
}
