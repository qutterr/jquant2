package jquant2.util;

import javax.sql.DataSource;

import com.po.EquInfo;
import com.po.NewsHeat;
import com.po.StockPrice;
import com.po.futures.CtpData;
import jquant2.util.config.PropertiesConfig;
import jquant2.util.config.PropertiesService;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.KeyedHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by zcy on 2017/8/9.20:36:58
 */
public class DbBuilder {
    private static DataSource dataSource;
    private static Logger logger = Logger.getLogger(DbBuilder.class);

    private DbBuilder() {
    }

    public static DataSource getDataSource() {
        if (DbBuilder.dataSource == null) {
            try {
                PropertiesConfig config = PropertiesService.getApplicationConfig();
                BasicDataSource dbcpDataSource = new BasicDataSource();
                dbcpDataSource.setUrl(config.getProperty("jdbc.url"));
                dbcpDataSource.setDriverClassName(config.getProperty("jdbc.driver"));
                dbcpDataSource.setUsername(config.getProperty("jdbc.username"));
                dbcpDataSource.setPassword(config.getProperty("jdbc.password"));
                dbcpDataSource.setDefaultAutoCommit(Boolean.parseBoolean(config.getProperty("dbcp.defaultAutoCommit")));
                dbcpDataSource.setMaxActive(Integer.parseInt(config.getProperty("dbcp.maxActive")));
                dbcpDataSource.setMaxIdle(Integer.parseInt(config.getProperty("dbcp.maxIdle")));
                dbcpDataSource.setMaxWait(Integer.parseInt(config.getProperty("dbcp.maxWait")));
                DbBuilder.dataSource = (DataSource) dbcpDataSource;


                logger.info("dbcp Data source initialization success !");
            } catch (Exception ex) {
                logger.info("dbcp Data source initialization failed" + ex.getMessage());
            }
        }
        return DbBuilder.dataSource;
    }

    public static Connection getConnection() {
        try {
            DataSource dataSource = DbBuilder.getDataSource();
            return dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection connection) {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static QueryRunner getQueryRunner() {
        return new QueryRunner(DbBuilder.getDataSource());
    }

    /**
     * 得到查询记录的条数
     *
     * @param sql
     *            必须为select count(*) from t_user的格式
     * @return
     */
    public static int getCount(String sql) {
        try {
            QueryRunner runner = DbBuilder.getQueryRunner();
            Object value = runner.query(sql, new ScalarHandler());
            return CommonUtil.objectToInteger(value);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    /**
     * 得到查询记录的条数
     *
     * @param sql
     *            必须为select count(*) from t_user的格式
     * @return
     */
    public static int getCount(Connection connection, String sql) {
        try {
            QueryRunner runner = new QueryRunner();
            Object value = runner.query(connection, sql, new ScalarHandler());
            return CommonUtil.objectToInteger(value);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    /**
     * 得到查询记录的条数
     *
     * @param sql
     *            必须为select count(*) from t_user的格式
     * @param params
     * @return
     */
    public static int getCount(String sql, Object... params) {
        try {
            QueryRunner runner = DbBuilder.getQueryRunner();
            Object value = runner.query(sql, new ScalarHandler(), params);
            return CommonUtil.objectToInteger(value);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    /**
     * 得到查询记录的条数
     *
     * @param sql
     *            必须为select count(*) from t_user的格式
     * @param params
     * @return
     */
    public static int getCount(Connection connection, String sql, Object... params) {
        try {
            QueryRunner runner = new QueryRunner();
            Object value = runner.query(connection, sql, new ScalarHandler(), params);
            return CommonUtil.objectToInteger(value);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    /**
     * 根据传入的sql，查询记录，以数组形式返回第一行记录。 注意：如果有多行记录，只会返回第一行，所以适用场景需要注意，可以使用根据主键来查询的场景
     *
     * @param sql
     * @return
     */
    public static Object[] getFirstRowArray(String sql) {
        try {
            QueryRunner runner = DbBuilder.getQueryRunner();
            return runner.query(sql, new ArrayHandler());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据传入的sql，查询记录，以数组形式返回第一行记录。 注意：如果有多行记录，只会返回第一行，所以适用场景需要注意，可以使用根据主键来查询的场景
     *
     * @param sql
     * @return
     */
    public static Object[] getFirstRowArray(Connection connection, String sql) {
        try {
            QueryRunner runner = new QueryRunner();
            return runner.query(connection, sql, new ArrayHandler());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据传入的sql，查询记录，以数组形式返回第一行记录。 注意：如果有多行记录，只会返回第一行，所以适用场景需要注意，可以使用根据主键来查询的场景
     *
     * @param sql
     * @param params
     * @return
     */
    public static Object[] getFirstRowArray(String sql, Object... params) {
        try {
            QueryRunner runner = DbBuilder.getQueryRunner();
            return runner.query(sql, new ArrayHandler(), params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据传入的sql，查询记录，以数组形式返回第一行记录。 注意：如果有多行记录，只会返回第一行，所以适用场景需要注意，可以使用根据主键来查询的场景
     *
     * @param sql
     * @param params
     * @return
     */
    public static Object[] getFirstRowArray(Connection connection, String sql, Object... params) {
        try {
            QueryRunner runner = new QueryRunner();
            return runner.query(connection, sql, new ArrayHandler(), params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据sql查询返回所有记录，以List数组形式返回
     *
     * @param sql
     * @return
     */
    public static List getListArray(String sql) {
        try {
            QueryRunner runner = DbBuilder.getQueryRunner();
            return runner.query(sql, new ArrayListHandler());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据sql查询返回所有记录，以List数组形式返回
     *
     * @param sql
     * @return
     */
    public static List getListArray(Connection connection, String sql) {
        try {
            QueryRunner runner = new QueryRunner();
            return runner.query(connection, sql, new ArrayListHandler());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据sql查询返回所有记录，以List数组形式返回
     *
     * @param sql
     * @param params
     * @return
     */
    public static List getListArray(String sql, Object... params) {
        try {
            QueryRunner runner = DbBuilder.getQueryRunner();
            return runner.query(sql, new ArrayListHandler(), params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据sql查询返回所有记录，以List数组形式返回
     *
     * @param sql
     * @param params
     * @return
     */
    public static List getListArray(Connection connection, String sql, Object... params) {
        try {
            QueryRunner runner = new QueryRunner();
            return runner.query(connection, sql, new ArrayListHandler(), params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据传入的sql，查询记录，以Map形式返回第一行记录。 注意：如果有多行记录，只会返回第一行，所以适用场景需要注意，可以使用根据主键来查询的场景
     *
     * @param sql
     * @return
     */
    public static Map getFirstRowMap(String sql) {
        try {
            QueryRunner runner = DbBuilder.getQueryRunner();
            return runner.query(sql, new MapHandler());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据传入的sql，查询记录，以Map形式返回第一行记录。 注意：如果有多行记录，只会返回第一行，所以适用场景需要注意，可以使用根据主键来查询的场景
     *
     * @param sql
     * @return
     */
    public static Map getFirstRowMap(Connection connection, String sql) {
        try {
            QueryRunner runner = new QueryRunner();
            return runner.query(connection, sql, new MapHandler());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据传入的sql，查询记录，以Map形式返回第一行记录。 注意：如果有多行记录，只会返回第一行，所以适用场景需要注意，可以使用根据主键来查询的场景
     *
     * @param sql
     * @param params
     * @return
     */
    public static Map getFirstRowMap(String sql, Object... params) {
        try {
            QueryRunner runner = DbBuilder.getQueryRunner();
            return runner.query(sql, new MapHandler(), params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据传入的sql，查询记录，以Map形式返回第一行记录。 注意：如果有多行记录，只会返回第一行，所以适用场景需要注意，可以使用根据主键来查询的场景
     *
     * @param sql
     * @param params
     * @return
     */
    public static Map getFirstRowMap(Connection connection, String sql, Object... params) {
        try {
            QueryRunner runner = new QueryRunner();
            return runner.query(connection, sql, new MapHandler(), params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据传入的sql查询所有记录，以List Map形式返回
     *
     * @param sql
     * @return
     */
    public static List getListMap(String sql) {
        try {
            QueryRunner runner = DbBuilder.getQueryRunner();
            return runner.query(sql, new MapListHandler());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据传入的sql查询所有记录，以List Map形式返回
     *
     * @param sql
     * @return
     */
    public static List getListMap(Connection connection, String sql) {
        try {
            QueryRunner runner = new QueryRunner();
            return runner.query(connection, sql, new MapListHandler());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据传入的sql查询所有记录，以List Map形式返回
     *
     * @param sql
     * @param params
     * @return
     */
    public static List getListMap(String sql, Object... params) {
        try {
            QueryRunner runner = DbBuilder.getQueryRunner();
            return runner.query(sql, new MapListHandler(), params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据传入的sql查询所有记录，以List Map形式返回
     *
     * @param sql
     * @param params
     * @return
     */
    public static List getListMap(Connection connection, String sql, Object... params) {
        try {
            QueryRunner runner = new QueryRunner();
            return runner.query(connection, sql, new MapListHandler(), params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据sql和对象，查询结果并以对象形式返回
     *
     * @param sql
     * @param type
     * @return
     */
    public static Object getBean(String sql, Class type) {
        try {
            QueryRunner runner = DbBuilder.getQueryRunner();
            return runner.query(sql, new BeanHandler(type));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据sql和对象，查询结果并以对象形式返回
     *
     * @param sql
     * @param type
     * @return
     */
    public static Object getBean(Connection connection, String sql, Class type) {
        try {
            QueryRunner runner = new QueryRunner();
            return runner.query(connection, sql, new BeanHandler(type));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据sql和对象，查询结果并以对象形式返回
     *
     * @param sql
     * @param type
     * @param params
     * @return
     */
    public static  Object getBean(String sql, Class type, Object... params) {
        try {
            QueryRunner runner = DbBuilder.getQueryRunner();
            return runner.query(sql, new BeanHandler(type), params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据sql和对象，查询结果并以对象形式返回
     *
     * @param sql
     * @param type
     * @param params
     * @return
     */
    public static  Object getBean(Connection connection, String sql, Class type, Object... params) {
        try {
            QueryRunner runner = new QueryRunner();
            return runner.query(connection, sql, new BeanHandler(type), params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据sql查询list对象
     *
     * @param sql
     * @param type
     * @return
     */
    public static  List getListBean(String sql, Class type) {
        try {
            QueryRunner runner = DbBuilder.getQueryRunner();
            return (List) runner.query(sql, new BeanListHandler(type));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据sql查询list对象
     *
     * @param sql
     * @param type
     * @return
     */
    public static  List getListBean(Connection connection, String sql, Class type) {
        try {
            QueryRunner runner = new QueryRunner();
            return (List) runner.query(connection, sql, new BeanListHandler(type));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据sql查询list对象
     *
     * @param sql
     * @param type
     * @param params
     * @return
     */
    public static  List getListBean(String sql, Class type, Object... params) {
        try {
            QueryRunner runner = DbBuilder.getQueryRunner();
            return (List) runner.query(sql, new BeanListHandler(type), params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 根据sql查询list对象
     *
     * @param sql
     * @param type
     * @param params
     * @return
     */
    public static  List getListBean(Connection connection, String sql, Class type, Object... params) {
        try {
            QueryRunner runner = new QueryRunner();
            return (List) runner.query(connection, sql, new BeanListHandler(type), params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 保存操作
     *
     * @param sql
     * @param params
     * @return
     */
    public static int save(String sql, Object... params) {
        try {
            QueryRunner runner = DbBuilder.getQueryRunner();
            return runner.update(sql, params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    /**
     * 保存操作
     *
     * @param sql
     * @param params
     * @return
     */
    public static int save(Connection connection, String sql, Object... params) {
        try {
            QueryRunner runner = new QueryRunner();
            return runner.update(connection, sql, params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    /**
     * 更新操作
     *
     * @param sql
     * @param params
     * @return
     */
    public static int update(String sql, Object... params) {
        try {
            QueryRunner runner = DbBuilder.getQueryRunner();
            return runner.update(sql, params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    /**
     * 插入操作
     *
     * @param sql
     * @param params
     * @return
     */
    public static int insert(String sql, Object... params) {
        try {
            QueryRunner runner = DbBuilder.getQueryRunner();
            return runner.update(sql, params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    /**
     * 更新操作
     *
     * @param sql
     * @param params
     * @return
     */
    public static int update(Connection connection, String sql, Object... params) {
        try {
            QueryRunner runner = new QueryRunner();
            return runner.update(connection, sql, params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    /**
     * 删除操作
     *
     * @param sql
     * @param params
     * @return
     */
    public static int delete(String sql, Object... params) {
        try {
            QueryRunner runner = DbBuilder.getQueryRunner();
            return runner.update(sql, params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    /**
     * 删除操作
     *
     * @param sql
     * @param params
     * @return
     */
    public static int delete(Connection connection, String sql, Object... params) {
        try {
            QueryRunner runner = new QueryRunner();
            return runner.update(connection, sql, params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    /**
     * 批量操作，包括批量保存、修改、删除
     *
     * @param sql
     * @param params
     * @return
     */
    public static int[] batch(String sql, Object[][] params) {
        try {
            QueryRunner runner = DbBuilder.getQueryRunner();
            return runner.batch(sql, params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 批量操作，包括批量保存、修改、删除
     *
     * @param sql
     * @param params
     * @return
     */
    public static int[] batch(Connection connection, String sql, Object[][] params) {
        try {
            QueryRunner runner = new QueryRunner();
            return runner.batch(connection, sql, params);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 开启事务
     */
    public static void beginTransaction(Connection conn) {
        try {
            // 开启事务
            conn.setAutoCommit(false);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 回滚事务
     */
    public static void rollback(Connection conn) {
        try {
            conn.rollback();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 提交事务
     */
    public static void commit(Connection conn) {
        try {
            conn.commit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static int insertEqu(EquInfo info){
        String sql = "INSERT INTO `equ` (`secID`, `ticker`, `exchangeCD`, `ListSectorCD`, `ListSector`, `transCurrCD`, `secShortName`, `secFullName`, `listStatusCD`, `listDate`, `equTypeCD`, `equType`, `exCountryCD`, `partyID`, `totalShares`, `nonrestFloatShares`, `nonrestfloatA`, `officeAddr`, `primeOperating`, `endDate`, `TShEquity`) ";
        return DbBuilder.insert(sql+"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", info.getSecID(),info.getTicker(),info.getExchangeCD(),
                info.getListSectorCD(),info.getListSector(),info.getTransCurrCD(),info.getSecShortName(),info.getSecFullName(),info.getListStatusCD(),
                info.getListDate(),info.getEquTypeCD(),info.getEquType(),info.getExCountryCD(),info.getPartyID(),info.getTotalShares(),
                info.getNonrestFloatShares(),info.getNonrestfloatA(),info.getOfficeAddr(),info.getPrimeOperating(),info.getEndDate(),info.getTShEquity());
    }

    public static int insertNewsHeat(NewsHeat newsHeat){
        String sql = "INSERT INTO `newsheatindex` (`secID`, `exchangeCD`, `exchangeName`, `ticker`, `secShortName`, `newsPublishDate`, `heatIndex`, `insertTime`, `updateTime`)";
        return DbBuilder.insert(sql+"VALUES(?,?,?,?,?,?,?,?,?)",newsHeat.getSecID(),newsHeat.getExchangeCD(),newsHeat.getExchangeName(),newsHeat.getTicker(),newsHeat.getSecShortName(),newsHeat.getNewsPublishDate(),newsHeat.getHeatIndex(),newsHeat.getInsertTime(),newsHeat.getUpdateTime());
    }

    public static int insertStockPrice(StockPrice price){
        String sql = "INSERT INTO `stockprice` (`secID`, `ticker`, `secShortName`, `secShortNameEN`, `exchangeCD`, `tradeDate`, `preClosePrice`, `openPrice`, `highestPrice`, `lowestPrice`, `closePrice`, `turnoverVol`, `turnovervalue`, `dealAmount`)";
        return DbBuilder.insert(sql+"VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)",price.getSecID(),price.getTicker(),price.getSecShortName(),price.getSecShortNameEN(),price.getExchangeCD(),price.getTradeDate(),price.getPreClosePrice(),price.getOpenPrice(),price.getHighestPrice(),price.getLowestPrice(),price.getClosePrice(),price.getTurnoverVol(),price.getTurnovervalue(),price.getDealAmount());
    }

    public static int insertCtpData(CtpData ctpData){
        String sql ="INSERT INTO `ctpdata` (`actionDay`, `askPrice1`, `askPrice2`, `askPrice3`, `askPrice4`, `askPrice5`, `askVolume1`, `askVolume2`, `askVolume3`, `askVolume4`, `askVolume5`, `averagePrice`, `bidPrice1`, `bidPrice2`, `bidPrice3`, `bidPrice4`, `bidPrice5`, `bidVolume1`, `bidVolume2`, `bidVolume3`, `bidVolume4`, `bidVolume5`, `closePrice`, `currDelta```, `exchangeID`, `exchangeInstID`, `highestPrice`, `instrumentID`, `lastPrice`, `lowerLimitPrice`, `lowestPrice`, `openInterest`, `openPrice`, `preClosePrice`, `preDelta`, `preOpenInterest`, `preSettlementPrice`, `settlementPrice`, `tradingDay`, `turnover`, `updateMillisec`, `updateTime`, `upperLimitPrice`, `volume`)";
        return DbBuilder.insert(sql+"VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                ctpData.getActionDay(),
                ctpData.getAskPrice1(),
                ctpData.getAskPrice2(),
                ctpData.getAskPrice3(),
                ctpData.getAskPrice4(),
                ctpData.getAskPrice5(),
                ctpData.getAskVolume1(),
                ctpData.getAskVolume2(),
                ctpData.getAskVolume3(),
                ctpData.getAskVolume4(),
                ctpData.getAskVolume5(),
                ctpData.getAveragePrice(),
                ctpData.getBidPrice1(),
                ctpData.getBidPrice2(),
                ctpData.getBidPrice3(),
                ctpData.getBidPrice4(),
                ctpData.getBidPrice5(),
                ctpData.getBidVolume1(),
                ctpData.getBidVolume2(),
                ctpData.getBidVolume3(),
                ctpData.getBidVolume4(),
                ctpData.getBidVolume5(),
                ctpData.getClosePrice(),
                ctpData.getCurrDelta(),
                ctpData.getExchangeID(),
                ctpData.getExchangeInstID(),
                ctpData.getHighestPrice(),
                ctpData.getInstrumentID(),
                ctpData.getLastPrice(),
                ctpData.getLowerLimitPrice(),
                ctpData.getLowestPrice(),
                ctpData.getOpenInterest(),
                ctpData.getOpenPrice(),
                ctpData.getPreClosePrice(),
                ctpData.getPreDelta(),
                ctpData.getPreOpenInterest(),
                ctpData.getPreSettlementPrice(),
                ctpData.getSettlementPrice(),
                ctpData.getTradingDay(),
                ctpData.getTurnover(),
                ctpData.getUpdateMillisec(),
                ctpData.getUpdateTime(),
                ctpData.getUpperLimitPrice(),
                ctpData.getVolume()
        );
    }

    public static String dateToStr(Date d){
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(d);
    }

    public static Date strToDate(String d){
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return format.parse(d);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        try {
            //System.out.println(DbBuilder.getCount("select count(*) from usdjpy"));

            /*// 返回ArrayHandler结果,第一行结果：Object[]
            System.out.println("返回ArrayHandler结果......");
            Object[] arrayResult = DbBuilder.getFirstRowArray("select * from T_USER where id=2");
            QueryRunner runner = DbBuilder.getQueryRunner();
            for (int i = 0; i < arrayResult.length; i++) {
                System.out.print(arrayResult[i] + "    ");
            }
            System.out.println();*/

            /*// 返回ArrayListHandler结果
            System.out.println("返回ArrayListHandler结果.........");
            List arrayListResult = DbBuilder.getListArray("select * from T_USER");
            for (int i = 0; i < arrayListResult.size(); i++) {
                for (int j = 0; j < arrayListResult.get(i).length; j++) {
                    System.out.print(arrayListResult.get(i)[j] + "    ");
                }
                System.out.println();
            }
            System.out.println();*/
            /**
             * INSERT INTO `usdjpymin` (`id`, `time`, `ask`, `bid`) VALUES ('1', '2016-10-24 21:35:32', '1.111', '1.222')
             */

            /*// 返回bean 4761165 869104
            OrginData4tick orginData4tick = (OrginData4tick) DbBuilder.getBean("select * from usdjpy where Id=?", OrginData4tick.class, 4761165);
            System.out.println(orginData4tick.toString());
            orginData4tick = (OrginData4tick) DbBuilder.getBean("select * from usdjpy where Id=?", OrginData4tick.class, 869104);
            System.out.println(orginData4tick.toString());*/

            /*// 返回beanlist
            System.out.println("返回BeanList结果......");
            List beanListResult = DbBuilder.getListBean("select * from T_USER", UserDto.class);
            Iterator iter_beanList = beanListResult.iterator();
            while (iter_beanList.hasNext()) {
                System.out.println(iter_beanList.next().getUsername());
            }

            // 返回指定列 SELECT A.secID FROM  MSCIChinaA A
            System.out.println("返回ColumnList结果......");
            List columnResult = runner.query("select * from T_USER", new ColumnListHandler("username"));
            Iterator iter = columnResult.iterator();
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }

            // 返回KeyedHandler结果：Map：map的key为KeyedHandler指定
            System.out.println("返回KeyedHandler结果.........");
            Map keyedResult = runner.query("select * from T_USER", new KeyedHandler(
                    "username"));
            System.out.println(keyedResult.get("username"));

            // MapHandler
            System.out.println("返回MapHandler结果.........");
            Map mapResult = DbBuilder.getFirstRowMap("select * from T_USER");
            Iterator iter_mapResult = mapResult.keySet().iterator();
            while (iter_mapResult.hasNext()) {
                System.out.print(mapResult.get(iter_mapResult.next()) + "   ");
            }
            System.out.println();

            // 返回MapListHandler结果
            System.out.println("返回MapListHandler结果.........");
            List mapListResult = DbBuilder.getListMap("select * from T_USER");
            for (int i = 0; i < mapListResult.size(); i++) {
                Iterator values = mapListResult.get(i).keySet().iterator();
                while (values.hasNext()) {
                    System.out.print(mapListResult.get(i).get(values.next()) + "   ");
                }
                System.out.println();
            }
            Connection conn = DbBuilder.getConnection();
            DbBuilder.beginTransaction(conn);
            System.out.println(DbBuilder.save(conn,"insert into t_user(username,password) values(?,?)", "demo", "demo"));
            DbBuilder.commit(conn);
            DbBuilder.close(conn);
            Object increaseId = runner.query("select last_insert_id()", new ScalarHandler());
            System.out.println(increaseId);*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
