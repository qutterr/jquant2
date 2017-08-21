package com.jquent2.calc;

import com.alibaba.fastjson.JSONObject;
import jquant2.futures.CollectTickData;
import jquant2.futures.CollectTickDataThread4RBAndHCSingleton;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zcy on 2017/8/11.23:39:48
 */
@WebServlet(name = "FutureServlet")
public class FutureServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("application/json;charset=gbk");
        request.setCharacterEncoding("gbk");

        String action = (String) request.getParameter("action");
        String psw = (String) request.getParameter("psw");
        String stockid = (String) request.getParameter("stockid");
        String price = (String) request.getParameter("price");
        String count = (String) request.getParameter("count");
        if(!psw.equalsIgnoreCase("123")){

        }else{
            if(action.equalsIgnoreCase("collect")){
                String status = (String) request.getParameter("status");
                Thread collect = CollectTickDataThread4RBAndHCSingleton.getInstance();
                if(status.equalsIgnoreCase("on")){
                    if(CollectTickDataThread4RBAndHCSingleton.getInstance().iscollect()){

                    }else {
                        collect.start();
                    }
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("result",true);
                    out.print(jsonObject.toString());
                }else if(status.equalsIgnoreCase("off")){
                    if(collect!=null){
                        CollectTickDataThread4RBAndHCSingleton.getInstance().UnInitialMdApi();
                        CollectTickDataThread4RBAndHCSingleton.getInstance().setnullInstance();
                    }
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("result",true);
                    out.print(jsonObject.toString());
                }


            }else if (action.equalsIgnoreCase("isCollected")){
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("isCollect",CollectTickDataThread4RBAndHCSingleton.getInstance().iscollect());
                jsonObject.put("result",true);
                out.print(jsonObject.toString());
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
