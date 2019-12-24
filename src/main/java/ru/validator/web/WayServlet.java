package ru.validator.web;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.validator.model.Way;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;

public class WayServlet extends javax.servlet.http.HttpServlet {

    private ConfigurableApplicationContext springContext;
    private WayController wayController;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        springContext = new ClassPathXmlApplicationContext("spring/spring-app.xml");
        wayController = springContext.getBean(WayController.class);
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        request.setAttribute("ways", wayController.getAll());
        request.setAttribute("lat123", wayController.getLat());
        request.setAttribute("lon123", wayController.getLon());
        request.getRequestDispatcher("/connectivity.jsp").forward(request, response);

    }
}
