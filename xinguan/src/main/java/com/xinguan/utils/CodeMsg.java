package com.xinguan.utils;

		import lombok.Getter;

/**
 * 全局异常处理中心
 */
@Getter
public enum  CodeMsg {

	SUCCESS(200,"成功"),
	ERROR(401,"系统错误"),
	USERLIST_ERR(5004,"权限认证失败"),
	ERR(5002,"权限认证失败"),
	SERVER_ERROR(500100, "服务端异常");
	private Integer code;
	private String msg;


	CodeMsg(Integer code,String msg ) {
		this.code = code;
		this.msg = msg;
	}




}
