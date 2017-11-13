package com.smart.router.compiler.util;

import javax.annotation.processing.Messager;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic;

/**
 * Created by Harry.Kong.
 * Time 2017/11/8.
 * Email kongpengcheng@aliyun.com.
 * Description:日志
 */
public class Logger {
    private Messager messager;

    public Logger(Messager messager) {
        this.messager = messager;
    }

    public void info(CharSequence info) {
        messager.printMessage(Diagnostic.Kind.NOTE, info);
    }

    public void info(Element element, CharSequence info) {
        messager.printMessage(Diagnostic.Kind.NOTE, info, element);
    }

    public void warn(CharSequence info) {
        messager.printMessage(Diagnostic.Kind.WARNING, info);
    }

    public void warn(Element element, CharSequence info) {
        messager.printMessage(Diagnostic.Kind.WARNING, info, element);
    }

    public void error(CharSequence info) {
        messager.printMessage(Diagnostic.Kind.ERROR, info);
    }

    public void error(Element element, CharSequence info) {
        messager.printMessage(Diagnostic.Kind.ERROR, info, element);
    }
}
