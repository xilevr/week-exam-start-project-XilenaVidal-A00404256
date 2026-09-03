package service;


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Expedition;

import java.io.IOException;

@WebServlet("/expedition")
public class ServletExpedition extends HttpServlet{
    private ExpeditionService expeditionService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        expeditionService = Application.getContext()
                .getBean("expeditionService", ExpeditionService.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Expeditions register<h1>");

        resp.getWriter().println("<ul>");
        for (Expedition expedition : expeditionService.getExpedition()) {
            resp.getWriter().println("<li>" + expedition + "</li>");
        }
        resp.getWriter().println("</ul>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String ExpeditionName = req.getParameter("expeditionName");
        String code = req.getParameter("code");
        String Region = req.getParameter("lala");
        String BaseCamp = req.getParameter("lall");
        String Leader = req.getParameter("laa");
        String StarDate = req.getParameter("12-02-2000");
        String EndDate = req.getParameter("20-5-2001");
        String Estate = getInitParameter("slkf");
        String level = Integer.parseInt(req.getParameter("level"));
        //System.out.println("doPost: " + id + " - " + name);
        .
        Expedition expedition = new Expedition(id, name, code, Region, BaseCamp, Leader, StartDate, EndDate, Estate);

        boolean saved = expeditionService.addExpedition(expedition);
        if (saved) {
            resp.getWriter().println("Expedition register: " + expedition);
        } else {
            resp.getWriter().println("It was not possible to record the expedition.");
        }
    }



}



