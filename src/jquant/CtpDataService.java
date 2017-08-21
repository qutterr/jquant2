package jquant;

import com.po.dto.CtpToEchartsDto;
import com.po.futures.CtpData2;
import jquant2.util.DbBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;

/**
 * Created by zcy on 2017/8/18.22:47:00
 */
public class CtpDataService {
    public static <E> void forEach(
            Iterable<? extends E> elements, BiConsumer<Integer, ? super E> action) {
        Objects.requireNonNull(elements);
        Objects.requireNonNull(action);

        int index = 0;
        for (E element : elements) {
            action.accept(index++, element);
        }
    }
    public List<CtpData2> getCtpdata2s(){
        String sql = "SELECT * FROM ctpdata2";
        return DbBuilder.getListBean(sql,CtpData2.class);
    }

    public List<CtpToEchartsDto> getCtpToEchartsDtos(){
        List<CtpData2> ctpData2List = getCtpdata2s();
        List<CtpToEchartsDto> ctpToEchartsDtos = new ArrayList<>();
        //构建dto
        //ctpData2List.forEach();
        /*CtpDataService.forEach(ctpData2List,(index,cd)->{
            System.out.println(index + " -> " + cd);
        });*/
        int i = 0;
        if(ctpData2List.size()>0){
            for(CtpData2 cd : ctpData2List){
                CtpToEchartsDto dto = new CtpToEchartsDto();
                if(i==0){
                    dto.setVolume(0);
                }else {
                    dto.setVolume(cd.getVolume()-ctpData2List.get(i-1).getVolume());
                }
                dto.setAsk(cd.getAskPrice1());
                dto.setInterest(cd.getOpenInterest());
                String _data = cd.getActionDay()+" "+cd.getUpdateTime()+" "+cd.getUpdateMillisec();
                try {
                    Date date = new SimpleDateFormat("yyyyMMdd HH:mm:ss SSS").parse(_data);
                    dto.setDatetime(date);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                ctpToEchartsDtos.add(dto);
                i++;
            }
        }
        return ctpToEchartsDtos;
    }

    /**
     * 20个ticket合起来
     * @return
     */
    public List<CtpToEchartsDto> getCtp20ToEchartsDtos(int size){
        List<CtpData2> ctpData2List = getCtpdata2s();
        List<CtpToEchartsDto> ctpToEchartsDtos = new ArrayList<>();
        int i = 0;
        int j = 0;
        if(ctpData2List.size()>size){
            Double avgask = 0.0;
            Integer avgvolume = 0;
            Double avginterest = 0.0;
            for(CtpData2 cd : ctpData2List){
                CtpToEchartsDto dto = new CtpToEchartsDto();
                avgask = avgask+cd.getAskPrice1();
                if(i==0){
                    //avgvolume = avgvolume+cd.getVolume();
                }else {
                    avgvolume = avgvolume+(cd.getVolume()-ctpData2List.get(i-1).getVolume());
                }
                avginterest = avginterest+cd.getOpenInterest();

                if(i!=0 && i%(size-1)==0){
                    avgask = avgask/size;
                    avgvolume = avgvolume/size;
                    avginterest = avginterest/size;
                    if(ctpToEchartsDtos.size()==0){
                        dto.setVolume(avgvolume);
                    }else{
                        dto.setVolume(avgvolume-ctpToEchartsDtos.get(j-1).getVolume());
                    }
                    dto.setAsk(avgask);
                    dto.setInterest(avginterest);
                    String _data = cd.getActionDay()+" "+cd.getUpdateTime()+" "+cd.getUpdateMillisec();
                    try {
                        Date date = new SimpleDateFormat("yyyyMMdd HH:mm:ss SSS").parse(_data);
                        dto.setDatetime(date);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    ctpToEchartsDtos.add(dto);
                    j++;
                    avgask = 0.0;
                    avgvolume = 0;
                    avginterest = 0.0;
                }
                i++;
            }
        }
        return ctpToEchartsDtos;
    }

    public List<CtpToEchartsDto> getCtp20ToEchartsDtos(){
        return getCtp20ToEchartsDtos(20);
    }

    public static void main(String[] args) {
        /*for(int i=0 ; i<3123;i++){
            if(i%20==0){
                System.out.println(i);
            }
        }*/

        CtpDataService ctpDataService = new CtpDataService();
        List<CtpToEchartsDto> ctpToEchartsDtos =  ctpDataService.getCtp20ToEchartsDtos();
        System.out.println();
    }
}
