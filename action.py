#coding=gbk
 
__author__ = 'Administrator'

import sys
import win32gui
import win32api
import win32con
import os
import time

classname = "Afx:400000:b:10005:6:6f6045d"
titlename = "网上股票交易系统5.0"

#字符转键盘代码  
def keyboarddic(key):
    #判断是否是小数点
    if(key=='.'):
        return 110
    #转为数字
    key = int(key)
    if (key==0):
        return 96
    elif (key==1):
        return 97
    elif (key==2):
        return 98
    elif (key==3):
        return 99
    elif (key==4):
        return 100
    elif (key==5):
        return 101
    elif (key==6):
        return 102
    elif (key==7):
        return 103
    elif (key==8):
        return 104
    elif (key==9):
        return 105
    else:
        return 0
        
#模拟键盘输入指定的num
def inputnum(num):
    #代码转数组 601016->6,0,1,0,1,6
    listnum = list(num)
    for list_char in listnum:
        keycode = keyboarddic(list_char)
        if(keycode==0):
            os._exit(0)
        else:
            win32api.keybd_event(keycode,0,0,0)
            win32api.keybd_event(keycode,0,win32con.KEYEVENTF_KEYUP,0)
def buy_stock(stock_id,stock_price,stock_sum):
    if not stock_id:
        os._exit(0)
    if not stock_sum:
        os._exit(0)
    if( not stock_id.isdigit() or not len(stock_id)==6):
        os._exit(0)
    if( not stock_sum.isdigit()):
        os._exit(0)

    #1 先按F1打开买入界面  然后刷新一下

    #卖出界面F2
    win32api.keybd_event(113,0,0,0)	    # F2
    win32api.keybd_event(113,0,win32con.KEYEVENTF_KEYUP,0)  #释放按键
    
    #买入界面F1
    win32api.keybd_event(112,0,0,0)	    # F1
    win32api.keybd_event(112,0,win32con.KEYEVENTF_KEYUP,0)  #释放按键
    time.sleep(0.01)

    #刷新F5
    win32api.keybd_event(116,0,0,0)	    # F5
    win32api.keybd_event(116,0,win32con.KEYEVENTF_KEYUP,0)  #释放按键
    time.sleep(0.01)

    #六遍Backspace按键删除证券代码中的信息
    for i in range(1,8):
        win32api.keybd_event(8,0,0,0)	    # Backspace
        win32api.keybd_event(8,0,win32con.KEYEVENTF_KEYUP,0)  #释放按键
    
    
    #2  输入要买的代码
    inputnum(stock_id)
    #3  按tab切到买入价格
    win32api.keybd_event(9,0,0,0)
    win32api.keybd_event(9,0,win32con.KEYEVENTF_KEYUP,0)
    time.sleep(0.1)
    #输入买入价格
    inputnum(stock_price)

    #4  按tab切换到买入数量
    win32api.keybd_event(9,0,0,0)
    win32api.keybd_event(9,0,win32con.KEYEVENTF_KEYUP,0)
    time.sleep(0.01)
    #5  输入数量
    inputnum(stock_sum)

    #6  点击买入按钮B
    win32api.keybd_event(66,0,0,0)
    win32api.keybd_event(66,0,win32con.KEYEVENTF_KEYUP,0)
    time.sleep(0.1)

    #7  点击确认买入Y
    #win32api.keybd_event(89,0,0,0)
    #win32api.keybd_event(89,0,win32con.KEYEVENTF_KEYUP,0)
    
    #执行完成后打印日志
    #print('买入股票代码:'+stock_id+'  买入价格:'+stock_price+'  买入数量:'+stock_sum)
    print 0
    
    
def sell_stock(stock_id,stock_price,stock_sum):
    if not stock_id:
        os._exit(0)
    if not stock_sum:
        os._exit(0)
    if( not stock_id.isdigit() or not len(stock_id)==6):
        os._exit(0)
    if( not stock_sum.isdigit()):
        os._exit(0)

    #1 先按F1打开买入界面  然后刷新一下

    #买入界面F1
    win32api.keybd_event(112,0,0,0)	    # F1
    win32api.keybd_event(112,0,win32con.KEYEVENTF_KEYUP,0)  #释放按键
    
    #卖出界面F2
    win32api.keybd_event(113,0,0,0)	    # F2
    win32api.keybd_event(113,0,win32con.KEYEVENTF_KEYUP,0)  #释放按键

    #刷新F5
    win32api.keybd_event(116,0,0,0)	    # F5
    win32api.keybd_event(116,0,win32con.KEYEVENTF_KEYUP,0)  #释放按键

    #六遍Backspace按键删除证券代码中的信息
    for i in range(1,8):
        win32api.keybd_event(8,0,0,0)	    # Backspace
        win32api.keybd_event(8,0,win32con.KEYEVENTF_KEYUP,0)  #释放按键
    
    
    #2  输入要卖的代码
    inputnum(stock_id)
    #3  按tab切到卖出价格
    win32api.keybd_event(9,0,0,0)
    win32api.keybd_event(9,0,win32con.KEYEVENTF_KEYUP,0)
    time.sleep(0.1)
    #输入卖出价格
    inputnum(stock_price)

    #4  按tab切换到卖出数量
    win32api.keybd_event(9,0,0,0)
    win32api.keybd_event(9,0,win32con.KEYEVENTF_KEYUP,0)
    time.sleep(0.01)
    #5  输入数量
    inputnum(stock_sum)

    #6  点击卖出按钮S
    win32api.keybd_event(83,0,0,0)
    win32api.keybd_event(83,0,win32con.KEYEVENTF_KEYUP,0)
    time.sleep(0.1)

    #7  点击确认买入Y
    #win32api.keybd_event(89,0,0,0)
    #win32api.keybd_event(89,0,win32con.KEYEVENTF_KEYUP,0)
    
    #执行完成后打印日志
    #print('卖出股票代码:'+stock_id+'  卖出价格:'+stock_price+'  卖出数量:'+stock_sum)    
    print 0

def flushed_stock():
    #卖出界面F2
    win32api.keybd_event(113,0,0,0)	    # F2
    win32api.keybd_event(113,0,win32con.KEYEVENTF_KEYUP,0)  #释放按键
    time.sleep(0.01)
    #刷新F5
    win32api.keybd_event(116,0,0,0)	    # F5
    win32api.keybd_event(116,0,win32con.KEYEVENTF_KEYUP,0)  #释放按键
    print 0
    
def quanbuchedan():
    #撤单界面F3
    win32api.keybd_event(114,0,0,0)	    # F3
    win32api.keybd_event(114,win32con.KEYEVENTF_KEYUP,0)  #释放按键
    time.sleep(0.1)

    #刷新一下
    win32api.keybd_event(116,0,0,0)	    # F5
    win32api.keybd_event(116,win32con.KEYEVENTF_KEYUP,0)  #释放按键
    time.sleep(0.5)

    #按Z全部撤单
    win32api.keybd_event(90,0,0,0)	    # Z
    win32api.keybd_event(90,win32con.KEYEVENTF_KEYUP,0)  #释放按键
    print 0
    
def chaxunzijin(parent):

    #查询资金股票
    if not parent:
        return
    #查询界面F4
    win32api.keybd_event(115,0,0,0)	    # F4
    win32api.keybd_event(115,win32con.KEYEVENTF_KEYUP,0)  #释放按键
    time.sleep(0.1)
    #刷新一下
    win32api.keybd_event(116,0,0,0)	    # F4
    win32api.keybd_event(116,win32con.KEYEVENTF_KEYUP,0)  #释放按键
    time.sleep(0.5)
    hWndChildList = []
    zijin = []
    win32gui.EnumChildWindows(parent, lambda hWnd, param: param.append(hWnd),  hWndChildList)
    for i, h in enumerate(hWndChildList):
        if(win32gui.GetWindowText(h)=='查询资金股票' and win32gui.GetClassName(h)=='Static'):
            zijin.append(hWndChildList[i])
            zijin.append(hWndChildList[i+1])
            zijin.append(hWndChildList[i+2])
            zijin.append(hWndChildList[i+3])
            zijin.append(hWndChildList[i+4])
            zijin.append(hWndChildList[i+5])
            zijin.append(hWndChildList[i+6])
            zijin.append(hWndChildList[i+7])
            zijin.append(hWndChildList[i+8])
            zijin.append(hWndChildList[i+9])
            zijin.append(hWndChildList[i+10])
            zijin.append(hWndChildList[i+11])
            zijin.append(hWndChildList[i+12])
    #show_windows(zijin)
    if len(zijin)==13:
        formatzijin = []
        formatzijin.append(win32gui.GetWindowText(zijin[4]))#资金余额
        formatzijin.append(win32gui.GetWindowText(zijin[5]))#冻结金额
        formatzijin.append(win32gui.GetWindowText(zijin[6]))#可用金额
        formatzijin.append(win32gui.GetWindowText(zijin[10]))#可取金额
        formatzijin.append(win32gui.GetWindowText(zijin[11]))#股票市值
        formatzijin.append(win32gui.GetWindowText(zijin[12]))#总 资 产
        print(formatzijin[0]+'#'+formatzijin[1]+'#'+formatzijin[2]+'#'+formatzijin[3]+'#'+formatzijin[4]+'#'+formatzijin[5])    
    
    
#获取句柄

    
global hwnd
hwnd = win32gui.FindWindow(None, titlename)
if(hwnd>0):
    #获得焦点
    win32gui.SetForegroundWindow(hwnd)
    time.sleep(0.1)
    #买入界面F1
    win32api.keybd_event(112,0,0,0)	    # F5
    win32api.keybd_event(112,0,win32con.KEYEVENTF_KEYUP,0)  #释放按键

    #刷新F5
    #win32api.keybd_event(116,0,0,0)	    # F5
    #win32api.keybd_event(116,0,win32con.KEYEVENTF_KEYUP,0)  #释放按键
    #time.sleep(0.5)

    ##状态参数  1:买入 0:卖出  3:全部撤单  4:刷新  5:查询资金 
    if(sys.argv[1]=='1'):
        buy_stock(sys.argv[2],sys.argv[3],sys.argv[4])
    elif(sys.argv[1]=='0'):
        sell_stock(sys.argv[2],sys.argv[3],sys.argv[4])
    elif(sys.argv[1]=='3'):
        quanbuchedan()    
    elif(sys.argv[1]=='4'):
        flushed_stock()
    elif(sys.argv[1]=='5'):
        chaxunzijin(hwnd)
    else:
        print '参数'+sys.argv[1]+'不支持!'
        os._exit(0)
    #flushed_stock()
    
else:
    os._exit(0)


    
