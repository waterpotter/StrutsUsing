package com.power.using.typeresult;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.StrutsResultSupport;

import com.opensymphony.xwork2.ActionInvocation;

import cn.dsna.util.images.ValidateCode;

public class CaptachaResult extends StrutsResultSupport{

	@Override
	protected void doExecute(String finalLocation, ActionInvocation invocation) throws Exception {
		
		ValidateCode vcode = new ValidateCode(120, 80,4,100);
		BufferedImage buffImg = vcode.getBuffImg();
		HttpServletResponse response = ServletActionContext.getResponse();
		ImageIO.write(buffImg, "jpeg", response.getOutputStream());
	
	}

}
