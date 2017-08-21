package com.jquent2.calc;

import com.alibaba.fastjson.JSONArray;
import com.po.dto.CtpToEchartsDto;
import jquant.CtpDataService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by zcy on 2017/8/18.23:19:39
 */
@WebServlet(name = "CtpDataServlet")
public class CtpDataServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("application/json;charset=gbk");
        request.setCharacterEncoding("gbk");

        String action = (String) request.getParameter("action");
        if(action.equalsIgnoreCase("ticket")){
            CtpDataService ctpDataService = new CtpDataService();
            List<CtpToEchartsDto> ctpToEchartsDtos =  ctpDataService.getCtpToEchartsDtos();
            String json = JSONArray.toJSONString(ctpToEchartsDtos);
            out.print(json);
        }else if(action.equalsIgnoreCase("ticket20")){
            Integer ticksize = 20;
            try{
                ticksize = Integer.parseInt((String) request.getParameter("ticksize"));
            }catch (Exception e){

            }
            CtpDataService ctpDataService = new CtpDataService();
            List<CtpToEchartsDto> ctpToEchartsDtos =  ctpDataService.getCtp20ToEchartsDtos(ticksize);
            String json = JSONArray.toJSONString(ctpToEchartsDtos);
            out.print(json);
        }else{

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
