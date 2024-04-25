package com.itbank.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {

	@Value("file:E://upload")
	private Resource rs;
	
	public File[] getDir() throws IOException {
		File dir = rs.getFile();
		return dir.listFiles();
	}

	public void fileUpload(MultipartFile upload) throws IOException {
		File dir = rs.getFile();
		File dst = new File(dir, upload.getOriginalFilename());
		
		upload.transferTo(dst);
	}
	
}
