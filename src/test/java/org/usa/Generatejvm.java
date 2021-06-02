package org.usa;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;






public class Generatejvm {
	public static void jvmreport(String json) {
		File file=new File("C:\\Users\\Admin\\eclipse-workspace\\Flipkart\\target");
		Configuration confi=new Configuration(file, "sampledemoproject");
		confi.addClassifications("browser", "Mozillafirebox");
		confi.addClassifications("version", "90.12");
		confi.addClassifications("platform", "w10");
		
		List<String> li=new ArrayList<String>();
		li.add(json);
		ReportBuilder builder=new ReportBuilder(li, confi);
		builder.generateReports();
		
	}

}
