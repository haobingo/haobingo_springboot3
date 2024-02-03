package space.haobingo.exception;

import lombok.Getter;

import java.io.Serial;

/**
 * @ Description： 自定义的业务异常。当我们的系统出现异常时，返回该异常给前端
 * @ Author： 程序员好冰
 * @ Date： 2024/02/03/22:16
 */
@Getter
public class ServiceException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误提示
     */
    private String message;
    /**
     * 错误明细，内部调试错误
     */
    private String detailMessage;

    /**
     * 空构造方法，避免反序列化问题
     */
    public ServiceException() {
    }

    public ServiceException(String message) {
        this.message = message;
    }

    public ServiceException(Integer code,String message) {
        this.message = message;
        this.code = code;
    }

    public ServiceException setMessage(String message) {
        this.message = message;
        return this;
    }
}
