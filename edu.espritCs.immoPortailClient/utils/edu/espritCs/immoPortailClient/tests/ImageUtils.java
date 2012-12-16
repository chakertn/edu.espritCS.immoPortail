package edu.espritCs.immoPortailClient.tests;

import java.io.File;
import java.io.FileInputStream;

public abstract class ImageUtils{
public static byte[] getImage(String path){
	File file = new File(path);
	byte[] theFile = new byte[(int) file.length()];
	try {
		FileInputStream fileInputStream = new FileInputStream(file);
	    fileInputStream.read(theFile);
	    fileInputStream.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	return theFile;
}
}
