package com.xinguan.exception;



import com.xinguan.utils.CodeMsg;
import com.xinguan.utils.ResultData;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {


    @ExceptionHandler(value = Exception.class)
    public ResultData<String> exceptionHandler(Exception e) {
        if (e instanceof GlobalException) {
            GlobalException ex = (GlobalException) e;
            return ResultData.error(ex.getCm());
        } else if (e instanceof UnauthorizedException) {
            return ResultData.error(CodeMsg.USERLIST_ERR);
        } else if (e instanceof AuthorizationException) {
            return ResultData.error(CodeMsg.ERR);
        } else if (e instanceof RuntimeException) {
            return ResultData.error(7001, e.getMessage());
        }
        return ResultData.error(CodeMsg.SERVER_ERROR);

    }
}
