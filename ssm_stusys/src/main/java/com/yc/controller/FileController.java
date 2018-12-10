package com.yc.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class FileController {

	@RequestMapping("/testUpload")
	public String  testUpload(@RequestParam("desc")String desc,@RequestParam("file") List<MultipartFile> file,HttpServletRequest request){
		System.out.println(file.size());
		System.out.println("文件描述信息："+desc);
		InputStream input =null;
		OutputStream out =null;
		//jsp中上传的文件:file
		try {
			for(MultipartFile fil:file) {
				//使用UUID生成唯一文件名
				String name = UUID.randomUUID().toString().replaceAll("-", "");
				input = fil.getInputStream();
				String filename = fil.getOriginalFilename();
				String url = request.getSession().getServletContext().getRealPath("/upload");
				System.out.println(url);
				//获取文件扩展名
				String ext = FilenameUtils.getExtension(fil.getOriginalFilename());
				out = new FileOutputStream("D://"+name+"."+ext);
				fil.transferTo(new File(url+"/"+name+"."+ext));
				byte [] bt =new byte[1024];
				int len=-1;
				while( (len=input.read(bt))!=1 ) {
					out.write(bt, 0, len);
				}
			}
			out.close();
			input.close();
			System.out.println("上传成功...");
 		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("错误");
		}
		//将文件上传到服务器中的某个硬盘文件中
		return "hello";
	}
	
}
