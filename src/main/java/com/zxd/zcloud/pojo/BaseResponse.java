package com.zxd.zcloud.pojo;

import java.util.HashMap;
import java.util.Map;



/**
* @Title: BaseResponse.java  
* @Package com.zxd.zcloud.pojo  
* @Description: TODO
* @author zhuxindong  E-mail:501801307@qq.com
* @date 创建时间：2018年5月15日 下午9:22:03
* @version 1.0
*/

public class BaseResponse {
	
	/**
	 * 状态码
	 * 100-成功；200-失败
	 */
	private int code;
	
	/**
	 * 历史信息
	 */
	private String msg;
	
	/**
	 * 用户返回的浏览器数据
	 */
	private Map<String, Object> extend = new HashMap<String, Object>();

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getExtend() {
		return extend;
	}

	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}

	
	public static BaseResponse success(){
		
		BaseResponse result = new BaseResponse();
		
		result.setCode(100);
		result.setMsg("处理成功！");
		
		return result;
		
	}
	
	
	public static BaseResponse fail(){
		
		BaseResponse result = new BaseResponse();
		
		result.setCode(200);
		result.setMsg("处理失败！");
		
		return result;
		
	}
	
	public BaseResponse add(String key, Object value){
		this.extend.put(key, value);
		return this;
	}

}
