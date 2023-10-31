package Excel_Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedata {	
 public  static void writedata() throws IOException{

	 File f = new File("C:\\Users\\HP\\Desktop\\Book2.xlsx");
	 FileInputStream fis = new FileInputStream(f);
	 Workbook wb= new XSSFWorkbook(fis);
	 wb.getSheet("OCT IPT").getRow(0).createCell(0).setCellValue("Student details ");
	 wb.getSheet("OCT IPT").createRow(1).createCell(0).setCellValue("efljsckl");
	 wb.getSheet("OCT IPT").getRow(1).createCell(1).setCellValue("ssgsgd");
	 FileOutputStream fos = new FileOutputStream(f);
	 wb.write(fos);
	 System.exit(0);
	 System.out.println("write successfully");
	 wb.close();
}
 
 public static void main(String[] args) throws IOException {
	writedata();
}
}