
package com.reg;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Reg extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
      
        String name=req.getParameter("u_n");
        String pass=req.getParameter("u_p");
        String email=req.getParameter("u_e");
        String gender=req.getParameter("u_g");
        String course=req.getParameter("u_c");
        String cond=req.getParameter("condition");
        if(cond!=null){
        if(cond.equals("checked")){
          out.println("<h1>Name: "+name+"</h1>");
          out.println("<h1>Email: "+email+"</h1>");
          out.println("<h1>Course: "+course+"</h1>");
          //
          //jdbc you can use this place
          //
          //forward Succ servle...
         RequestDispatcher rd=req.getRequestDispatcher("success");
         rd.forward(req, resp);
          
        }else{
            out.println("<h1>you have not accept term and condition</h1>");
        }
        }else{
            out.println("you have not accept term and condition");
           RequestDispatcher rd=req.getRequestDispatcher("index.html");
              rd.include(req, resp);
                   
        }
         
    }
   
}
