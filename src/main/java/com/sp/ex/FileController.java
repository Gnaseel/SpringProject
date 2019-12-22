package com.sp.ex;

import java.io.File;
import java.io.FileInputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/File")
public class FileController {
	@RequestMapping("/fileDownload")
	public void fileDownload(@Param("path") String path, HttpServletResponse response) throws Exception {
		
		System.out.println("path = " + path);
		response.setHeader("Content-Disposition", "attachment;filename=" + path + ";");
		response.setContentType("text/plain");
		File file = new File(path);
		FileInputStream fileIn = new FileInputStream(file);
		ServletOutputStream servletOutputStream = response.getOutputStream();
		byte b[] = new byte[1024];
		int data = 0;
		while ((data = (fileIn.read(b, 0, b.length))) != -1) {
			servletOutputStream.write(b, 0, data);
		}

		response.flushBuffer();
		fileIn.close();
	}
}
