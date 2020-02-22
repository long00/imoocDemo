package com.biggg.king.utils;
import java.io.Serializable;

/**
 * @Description 返回结果值
 * @author hutao
 * @date 2020年1月20日
 */
public class ResultData implements Serializable {

	private static final long serialVersionUID = 1L;
	//返回成功
    public static final String RESULT_CODE_SUCCESS = "200";
    //返回业务失败
    public static final String RESULT_CODE_ERROR = "500";

    private String code; // 返回码
    private String message; // 返回信息
    private Object data; // 返回对象

    public ResultData() {
    	
    }

	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Object getData() {
		return data;
	}


	public void setData(Object data) {
		this.data = data;
	}


	/**
	 * @Description 返回成功数据
	 * @author yangtenglong
	 * @date 2020年1月20日
	 */
	public static ResultData SUCCESS(Object data) {
		ResultData resultData = new ResultData();
		resultData.setCode(RESULT_CODE_SUCCESS);
		resultData.setMessage("SUCCESS");
		resultData.setData(data);
		return resultData;
    }
	
	/**
	 * @Description 返回错误数据，如果不设置返回值编码，则默认使用500返回值
	 * @author yangtenglong
	 * @date 2020年1月20日
	 */
	public static ResultData ERROR(String code,String message) {
		ResultData resultData = new ResultData();
		resultData.setCode(RESULT_CODE_ERROR);
		if(code!=null&&!"".equals(code)) {
			resultData.setCode(code);
		}
		resultData.setMessage(message);
		resultData.setData("");
		return resultData;
    }
}
