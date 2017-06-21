目前支持
    /**
     * 买入指定股票
     * @param stockid 股票代码
     * @param price 指定价格
     * @param count 指定数量
     */
1 买入股票 
请求http://localhost/stockServlet?action=1&stockid=601016&price=2.33&count=100&psw=123

    /**
     * 卖出指定股票
     * @param stockid 股票代码
     * @param price 指定价格
     * @param count 指定数量
     */
2 买入股票 
请求http://localhost/stockServlet?action=0&stockid=601016&price=2.33&count=100&psw=123

3查询可用资金
请求http://localhost/sstockServlet?action=5&psw=123
返回
{
	"result": true,  查询成功标志
	"amount": "124.35",  可用金额
	"balance": "124.35", 资金余额
	"freezing": "12.00", 冻结金额
	"available": "623.35",  可取金额
	"totalassets": "723.35", 总 资 产
	"worth": "123.00" 股票市值
}

4 刷新
请求http://localhost/sstockServlet?action=4&psw=123
5 全部撤单
请求http://localhost/sstockServlet?action=3&psw=123


