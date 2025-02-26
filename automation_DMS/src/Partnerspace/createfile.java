package Partnerspace;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.testng.annotations.Test;

import common_function.common_function;
import net.bytebuddy.asm.Advice.Enter;

public class createfile {
	
	private class Thread1 extends Thread {
        public Thread1(File file) {
            this.file = file;
        }

        File file;
       
        public void run() {
            try {
				readFromFiles(this.file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        @Test
        public void readFromFiles(File file) throws IOException {
            try {
                File folder = new File("/home/gautham/Pictures/file");
                File[] listOfFiles = folder.listFiles();
                for (File file1 : listOfFiles) {

                    FileInputStream input_document = new FileInputStream(file);

                    String fileName = file1.getName();
XSSFWorkbook my_xls_workbook = new XSSFWorkbook(input_document); }

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

        public void main(String[] args1) {

            File folder = new File("/folderpath");
            File[] listOfFiles = folder.listFiles();
           
            for (File file1 : listOfFiles) {        
                Thread1 thread=new Thread1(file1);
                thread.start();
            }

        }
	}
}
