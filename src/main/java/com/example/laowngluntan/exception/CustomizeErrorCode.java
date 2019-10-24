package com.example.laowngluntan.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode{
    QUESTION_NOT_FOUN(2001,"你找的问题不在了，要不要换个试试？"),
    TARGET_PARAN_NOT_FOUND(2002,"为选中任何问题或评论进行回复"),
    NO_LOGIN(2003,"当前操作需要登录，请登陆后重试"),
    SYS_ERROP(2004,"您太猛了，服务器崩溃了，稍等片刻。"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006,"你回复的评论不在了，要不要换个试试？"),
    CONTENT_IS_EMPTY(2007,"输入内容不能为空"),
    READ_NOTIFICATION_FAIL(2008,"兄弟，你系不系黑客？系的话加个扣扣呗交流交流，1985680256"),
    NOTIFICATION_NOT_FOUND(2009,"消息莫非是长翅膀飞走了？"),
    FILE_UPLOAD_FAIL(2010,"图片上传失败")
    ;
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }


    private Integer code;
    private String message;
    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}
