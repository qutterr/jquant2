$(function () {
    var data = [];
    var data2 = [];
    var data3 = [];
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
            data: ['模拟数据', '模拟数据2', '模拟数据3'],
            itemGap: 20,
            textStyle: {
                color: '#000000',
                fontSize: 14
            }
        },
        tooltip: {
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
        },
        xAxis: {
            type: 'time',
            splitLine: {
                show: false
            }
        },
        yAxis: [{
            type: 'value',
            boundaryGap: [0, '100%'],
            position:'left',
            splitLine: {
                show: false
            }
        },{
            type: 'value',
            boundaryGap: [0, '100%'],
            position:'right',
            splitLine: {
                show: false
            }
        }],
        series: [{
            name: '模拟数据',
            type: 'line',
            showSymbol: false,
            smooth:true,
            hoverAnimation: false,
            data: data
        },{
            name: '模拟数据2',
            type: 'line',
            showSymbol: false,
            smooth:true,
            hoverAnimation: false,
            data: data2
        },{
            name: '模拟数据3',
            type: 'line',
            showSymbol: false,
            smooth:true,
            hoverAnimation: false,
            yAxisIndex:1,
            data: data3
        }]
    };
    myChart.setOption(option);

    setInterval(function () {

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
    }, 500);
});