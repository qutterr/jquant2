package com.jquent2.calc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Map;

/**
 * Created by qutterr on 2017/6/14.10:58:37
 */
@WebServlet(name = "CalcServlet")
public class CalcServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        HttpServletRequest httpRequest=(HttpServletRequest)request;

        Map<String, String[]> params = request.getParameterMap();
        String queryString = "";
        for (String key : params.keySet()) {
            String[] values = params.get(key);
            for (int i = 0; i < values.length; i++) {
                String value = values[i];
                queryString += key + "=" + value + "&";
            }
        }
        // 去掉最后一个空格
        queryString = queryString.substring(0, queryString.length() - 1);
        System.out.println("queryString:"+queryString);
        System.out.println("RemoteUser:"+request.getRemoteUser());
        System.out.println("ServerName:"+request.getServerName());
        System.out.println("ServletPath:"+httpRequest.getServletPath());


    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
