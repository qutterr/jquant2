package com.jquant.analysis;

import com.po.NewsHeat;
import com.po.StockPrice;

/**
 * Created by zcy on 2017/8/10.19:11:13
 */
public class StockPriceToNews {
    private NewsHeat newsHeat;
    private StockPrice stockPrice;

    public StockPrice getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(StockPrice stockPrice) {
        this.stockPrice = stockPrice;
    }

    public NewsHeat getNewsHeat() {
        return newsHeat;
    }

    public void setNewsHeat(NewsHeat newsHeat) {
        this.newsHeat = newsHeat;
    }
}
