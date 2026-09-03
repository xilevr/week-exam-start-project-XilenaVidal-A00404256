package service;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/expedition")
public class ServletExpedition extends HttpServlet{
    private ExpeditionService courseService;

}
