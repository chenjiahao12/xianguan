package com.xinguan.exception;


import com.xinguan.utils.CodeMsg;

/**
 * 获取运行时的异常
 */
public class GlobalException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private CodeMsg cm;

	private String errorMsg;

	public GlobalException(String message){
		super(message);
		this.errorMsg = message;
	}
	
	public GlobalException(CodeMsg cm) {
		super(cm.toString());
		this.cm = cm;
	}

	public CodeMsg getCm() {
		return cm;
	}

}
