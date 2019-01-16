package com.yif.tools;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * 响应消息
 * Created by fengy on 2017/1/16 0016.
 */
@Component
public class ResponseAsJson<T> {

    /**
     * I18N消息源
     */
    private static MessageSource messageSource;

    @Autowired
    private void setMessageSource(MessageSource messageSource) {
        ResponseAsJson.messageSource = messageSource;
    }

    /**
     * 是否成功
     */
    @JsonProperty(value = "success")
    private boolean success;


    /**
     * 消息
     */
    @JsonProperty(value = "msg")
    private String msg;

    /**
     * 内容
     */
    @JsonProperty(value = "data")
    private T data;

    /**
     * 响应信息
     * @param success 是否成功
     * @param errCode 错误代码
     * @param errMsg 错误消息
     * @param content 内容
     */
    public ResponseAsJson(boolean success, String msg, T content) {
        this.success = success;
        this.msg = msg;
        this.data = content;
    }

    /**
     * 成功但无内容的响应信息
     */
    public ResponseAsJson() {
        this(true, null, null);
    }

    /**
     * 成功且有内容的响应信息
     * @param content 响应内容
     */
    public ResponseAsJson(T content) {
        this(true, null, content);
    }

    public ResponseAsJson(String msg, T content){
        this(true, msg, content);
    }

    /**
     * 错误响应信息
     * @param errCode 错误代码
     * @param args 错误消息参数
     */
    public ResponseAsJson(String errCode, Object... args) {
        this(false,  messageSource.getMessage(errCode, args, errCode, Locale.getDefault()),
                null);
    }

    /**
     * 获取 是否成功
     */
    public boolean isSuccess() {
        return this.success;
    }

    /**
     * 设置 是否成功
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
