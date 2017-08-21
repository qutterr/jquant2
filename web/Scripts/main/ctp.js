$(function () {
    var btnSpider = $('#btnSpider');
    var data = [];
    var data2 = [];
    var data3 = [];
    var _ctpdataask = [];
    var _ctpdatainte = [];
    var _ctpdatavol = [];
    var now = +new Date(1997, 9, 3);
    var now2 = +new Date(1997, 9, 3);
    var now3 = +new Date(1997, 9, 3);
    var oneDay = 24 * 3600 * 1000;
    var value = Math.random() * 1000;
    var value2 = Math.random() * 1000;
    var value3 = Math.random() * 1000;
    for (var i = 0; i < 100; i++) {
        data.push(randomData());
        data2.push(randomData2());
        data3.push(randomData3());
    }

    function randomData() {
        now = new Date(+now + oneDay);
        value = value + Math.random() * 21 - 10;
        return {
            name: now.toString(),
            value: [
                [now.getFullYear(), now.getMonth() + 1, now.getDate()].join('/'),
                Math.round(value)
            ]
        }
    }

    function getCtpinterestData(data) {
        now = new Date(data.datetime);
        value = data.interest;
        return {
            name: now.toString(),
            value: [
                now,
                value
            ]
        }
    }
    function getCtpvolumeData(data) {
        now = new Date(data.datetime);
        value = data.volume;
        return {
            name: now.toString(),
            value: [
                now,
                value
            ]
        }
    }
    function getCtpaskData(data) {
        now = new Date(data.datetime);
        value = data.ask;
        return {
            name: now.toString(),
            value: [
                now,
                value
            ]
        }
    }


    function randomData2() {
        now2 = new Date(+now + oneDay);
        value2 = value2 + Math.random() * 21 - 10;
        return {
            name: now.toString(),
            value: [
                [now.getFullYear(), now.getMonth() + 1, now.getDate()].join('/'),
                Math.round(value2)
            ]
        }
    }
    function randomData3() {
        now3 = new Date(+now + oneDay);
        value3 = value3 + Math.random() * 21 - 10;
        return {
            name: now.toString(),
            value: [
                [now.getFullYear(), now.getMonth() + 1, now.getDate()].join('/'),
                Math.round(value3)
            ]
        }
    }

    var center = document.getElementById('center');
    var myChart = echarts.init(center);
    var option = {
        title: {
            text: '动态数据'
        },
        legend:{
            bottom: 5,
            data: ['ask', 'vol', 'inte'],
            itemGap: 20,
            textStyle: {
                color: '#000000',
                fontSize: 14
            },
            x: 'left'
        },
        /*tooltip: {
            trigger: 'axis',
            formatter: function(params,ticket,callback){
                //params = params[0];
                var date = new Date(params.name);
                return  + params[0].value[1]+'<br />'
                    + params[1].value[1]+'<br />'
                    + params[2].value[1]+'<br />';
            },
            axisPointer: {
                animation: false
            }
        },*/
        /*toolbox: {
            feature: {
                dataZoom: {
                    yAxisIndex: 'none'
                },
                restore: {},
                saveAsImage: {}
            }
        },*/
        tooltip : {
            trigger: 'axis',
            axisPointer: {
                type: 'cross',
                animation: false,
                label: {
                    backgroundColor: '#505765'
                }
            }
        },
        dataZoom: [{
            show: true,
            realtime: true,
            start: 65,
            end: 85
        },{
            type: 'inside',
            throttle: 50
        }],
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                animation: false
            }
        },
        xAxis: {
            type: 'time',
            splitLine: {
                show: false
            }
        },
        yAxis: [{
            type: 'value',
            //boundaryGap: ['20%', '20%'],
            position:'left',
            offset:50,
            min:'dataMin',
            max:'dataMax',
            splitLine: {
                show: false
            }
        },{
            type: 'value',
            //boundaryGap: ['20%', '20%'],
            min:'dataMin',
            max:'dataMax',
            position:'left',
            splitLine: {
                show: false
            }
        },{
            type: 'value',
            //boundaryGap: ['20%', '20%'],
            position:'right',
            min:'dataMin',
            max:'dataMax',
            splitLine: {
                show: false
            }
        }],
        series: [{
            name: 'ask',
            type: 'line',
            showSymbol: false,
            smooth:true,
            yAxisIndex:0,
            sampling:'average',
            hoverAnimation: false,
            data: data
        },{
            name: 'vol',
            type: 'line',
            showSymbol: false,
            smooth:true,
            yAxisIndex:1,
            sampling:'average',
            hoverAnimation: false,
            data: data2
        },{
            name: 'inte',
            type: 'line',
            showSymbol: false,
            smooth:true,
            sampling:'average',
            hoverAnimation: false,
            yAxisIndex:2,
            data: data3
        }]
    };
    myChart.setOption(option);

    /*setInterval(function () {

        for (var i = 0; i < 5; i++) {
            data.shift();
            data.push(randomData());

            data2.shift();
            data2.push(randomData2());

            data3.shift();
            data3.push(randomData3());
        }

        myChart.setOption({
            series: [{
                data: data
            },{
                data: data2
            },{
                data: data3
            }]
        });
    }, 500);*/

    btnSpider.click(function(){
        if ($(this).linkbutton('options').disabled == true) {
            return false;
        }
        console.log("btnSpider onClick");
        $.post("/ctpDataServlet", {
            action:'ticket20',
            ticksize:'50'
        }, function (data, status) {
            if (status == "success") {
                console.log(data);
                _ctpdatainte = [];
                _ctpdatavol = [];
                _ctpdataask = [];
                $.each(data,function(index, val) {
                    _ctpdatainte.push(getCtpinterestData(val));
                    _ctpdatavol.push(getCtpvolumeData(val));
                    _ctpdataask.push(getCtpaskData(val));
                });

                myChart.setOption({
                    series: [{
                        data: _ctpdataask
                    },{
                        data: _ctpdatavol
                    },{
                        data: _ctpdatainte
                    }]
                });

            } else {
                $.messager.alert("错误", "请求出错", "error");
            }
        }, "json");
    })
});