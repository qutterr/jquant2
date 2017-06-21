package com.jquent2.calc;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * Created by qutterr on 2017/6/17.13:44:38
 */
@WebServlet(name = "StockServlet")
public class StockServlet extends HttpServlet {
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
            //状态参数  1:买入 0:卖出  3:全部撤单  4:刷新  5:查询资金
            if(action.equalsIgnoreCase("0")){
                System.out.println("卖出");
                Const.getInstance().setLock(true);
                String rlt = StockAction.sell(stockid, price, count);
                JSONObject jsonObject = new JSONObject();
                if(rlt.equalsIgnoreCase("-1")){
                    jsonObject.put("result",false);//卖出失败
                }else{
                    jsonObject.put("result",true);//卖出ok
                }
                out.print(jsonObject.toString());
                Const.getInstance().setLock(false);
            }else if(action.equalsIgnoreCase("1")){
                System.out.println("买入");
                Const.getInstance().setLock(true);
                String rlt = StockAction.buy(stockid, price, count);
                JSONObject jsonObject = new JSONObject();
                if(rlt.equalsIgnoreCase("-1")){
                    jsonObject.put("result",false);//买入失败
                }else{
                    jsonObject.put("result",true);//买入ok
                }
                out.print(jsonObject.toString());
                Const.getInstance().setLock(false);
            }else if(action.equalsIgnoreCase("2")){
                System.out.println(action);
            }else if(action.equalsIgnoreCase("3")){
                System.out.println("全部撤单");
                Const.getInstance().setLock(true);
                String rlt = StockAction.quanbuchedan();
                JSONObject jsonObject = new JSONObject();
                if(rlt.equalsIgnoreCase("-1")){
                    jsonObject.put("result",false);//查询失败
                }else{
                    jsonObject.put("result",true);//撤单ok
                }
                out.print(jsonObject.toString());
                Const.getInstance().setLock(false);
            }else if(action.equalsIgnoreCase("4")){
                System.out.println("刷新");
                String rlt = StockAction.shuaxin();
                JSONObject jsonObject = new JSONObject();
                if(rlt.equalsIgnoreCase("-1")){
                    jsonObject.put("result",false);//查询失败
                }else{
                    jsonObject.put("result",true);//刷新ok
                }
                out.print(jsonObject.toString());
            }else if(action.equalsIgnoreCase("5")){
                System.out.println("查询资金");
                Const.getInstance().setLock(true);
                String zijin = StockAction.chaxunzijin();
                JSONObject jsonObject = new JSONObject();
                if(zijin.equalsIgnoreCase("-1")){
                    jsonObject.put("result",false);//查询失败
                }else{
                    String[] zijins = zijin.split("#");
                    jsonObject.put("result",true);//查询成功
                    jsonObject.put("balance",zijins[0]);//资金余额
                    jsonObject.put("freezing",zijins[1]);//冻结金额
                    jsonObject.put("amount",zijins[2]);//可用金额
                    jsonObject.put("available",zijins[3]);//可取金额
                    jsonObject.put("worth",zijins[4]);//股票市值
                    jsonObject.put("totalassets", zijins[5]);//总 资 产
                }
                out.print(jsonObject.toString());
                Const.getInstance().setLock(false);
            }else if(action.equalsIgnoreCase("6")){
                System.out.println(action);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }


}
