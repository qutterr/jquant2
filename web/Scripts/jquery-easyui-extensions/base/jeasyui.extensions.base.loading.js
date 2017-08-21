/**
* jQuery EasyUI 1.4.3
* Copyright (c) 2009-2015 www.jeasyui.com. All rights reserved.
*
* Licensed under the GPL license: http://www.gnu.org/licenses/gpl.txt
* To use it on other terms please contact us at info@jeasyui.com
* http://www.jeasyui.com/license_commercial.php
*
* jQuery EasyUI 通用插件基础库 扩展
* jeasyui.extensions.base.loading.js
* 开发 流云
* 由 落阳 整理
* 最近更新：2015-10-25
*
* 依赖项：
*   1、jquery.jdirk.js
*   2、jeasyui.extensions.base.css
*
* Copyright (c) 2015 ChenJianwei personal All rights reserved.
*/
(function ($) {

    $.util.namespace("$.easyui");

    // 显示类似于 easyui-datagrid 在加载远程数据时显示的 mask 状态层；该函数定义如下重载方式：
    //      function ()
    //      function (options)，其中 options 为一个格式为
    //          { topMost: bool, locale: jquerySelectorString|jqueryObject|htmlElement, zindex: number, msg: string }
    //          的 json-object；
    // 上述参数中：
    //      topMost 为一个布尔类型参数，默认为 false，表示是否在顶级页面加载此 mask 状态层。
    //      locale  表示加载的区域，可以是一个 jQuery 对象选择器字符串，也可以是一个 jQuery 对象或者 HTML-DOM 对象；默认为字符串 "body"。
    //      zindex  表示遮蔽层的 css-zindex 属性；
    //      msg     表示加载显示的消息文本内容，默认为 "正在加载，请稍等..."；
    // 返回值：返回表示弹出的数据加载框和层的 jQuery 链式对象。
    $.easyui.loading = function (options) {
        var opts = $.extend({}, $.easyui.loading.defaults, options || {}),
            jq = opts.topMost ? $.util.$ : $,
            locale = jq(opts.locale),
            zindex = opts.zindex;
        if (locale.is(".loading-locale") || locale.children(".loading-container").length) {
            return false;
        }
        if (!zindex) {
            var zindexes = locale.children().map(function () {
                var i = $(this).css("z-index");
                return $.isNumeric(i) ? window.parseInt(i) : 0;
            });
            zindex = zindexes.length ? $.array.max(zindexes) : 1;
        }
        if (!locale.is("body")) {
            locale.addClass("loading-locale");
        }
        var container = jq("<div class=\"loading-container\"></div>").css("z-index", ++zindex).appendTo(locale),
            mask = jq("<div class=\"loading-mask datagrid-mask\"></div>").css("z-index", ++zindex).appendTo(container),
            msg = jq("<div class=\"loading-message datagrid-mask-msg\"></div>").css("z-index", ++zindex).html(opts.msg).appendTo(container);
        //msg.css("marginLeft", -msg.outerWidth() / 2);
        var msgWidth = msg.outerWidth();
        msg.css("marginLeft", -msgWidth / 2 + (-msgWidth / 4));
        return mask;
    };

    // $.easyui.loading 方法的默认参数格式
    $.easyui.loading.defaults = {
        topMost: false,
        locale: "body",
        zindex: null,
        msg: "正在加载，请稍等..."
    };


    // 关闭由 $.easyui.loading 方法显示的 "正在加载..." 状态层；该函数定义如下重载方式：
    //      function ()
    //      function (locale)
    //      function (topMost)
    //      function (locale, topMost)
    //      function (topMost, locale)
    //      function (options)，其中 options 为一个格式为 { locale, topMost } 的 JSON-Object
    // 上述参数中：
    //      topMost 为一个布尔类型参数，默认为 false，表示是否在顶级页面加载此 mask 状态层。
    //      locale  表示加载的区域，可以是一个 jQuery 对象选择器字符串，也可以是一个 jQuery 对象或者 HTML-DOM 对象；默认为字符串 "body"；当指定该参数时，表示只关闭指定区域的状态层。
    $.easyui.loaded = function (locale, topMost) {
        var opts = $.extend({}, $.easyui.loaded.defaults);
        if (arguments.length == 1) {
            var val = arguments[0],
                type = typeof (val);
            if (type == "boolean") {
                $.extend(opts, { topMost: val });
            } else if (type == "string" || $.util.isJqueryDOM(val)) {
                $.extend(opts, { locale: val });
            } else {
                $.extend(opts, val);
            }
        } else if (arguments.length >= 2) {
            var val = arguments[0],
                type = typeof (val);
            if (type == "boolean") {
                $.extend(opts, { locale: arguments[1], topMost: arguments[0] });
            } else if (type == "string" || $.util.isJqueryDOM(val)) {
                $.extend(opts, { locale: arguments[0], topMost: arguments[1] });
            } else {
                $.extend(opts, val);
            }
        }
        var jq = opts.topMost ? $.util.$ : $;
        jq(opts.locale).removeClass("loading-locale").children(".loading-container").remove();
    };

    // $.easyui.loaded 方法的默认参数格式
    $.easyui.loaded.defaults = {
        locale: "body",
        topMost: false
    };



    // 更改 jQuery EasyUI 中部分控件的国际化语言显示。
    $.extend($.fn.panel.defaults, { loadingMessage: $.easyui.loading.defaults.msg });
    $.extend($.fn.window.defaults, { loadingMessage: $.easyui.loading.defaults.msg });
    $.extend($.fn.dialog.defaults, { loadingMessage: $.easyui.loading.defaults.msg });
    $.extend($.fn.datagrid.defaults, { loadingMessage: $.easyui.loading.defaults.msg });
    $.extend($.fn.datalist.defaults, { loadingMessage: $.easyui.loading.defaults.msg });
    $.extend($.fn.propertygrid.defaults, { loadingMessage: $.easyui.loading.defaults.msg });
    $.extend($.fn.combogrid.defaults, { loadingMessage: $.easyui.loading.defaults.msg });
    $.extend($.fn.treegrid.defaults, { loadingMessage: $.easyui.loading.defaults.msg });

})(jQuery);