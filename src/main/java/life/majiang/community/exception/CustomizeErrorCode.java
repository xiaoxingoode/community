package life.majiang.community.exception;

public enum CustomizeErrorCode  implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001,"你找的问题不在了11"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何问题或评论进行回复"),
    NO_LOGIN(2003,"未登录不能进行评论,请先登录"),
    SYS_ERROR(2004,"页面错误11"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在"),
    COMMENT_NOT_FOUNT(2006,"你操作的评论不存在了"),
    COMMENT_IS_EMPTY(2007,"输入内容不能为空");

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
        this.code = code;
        this.message = message;
    }




}
