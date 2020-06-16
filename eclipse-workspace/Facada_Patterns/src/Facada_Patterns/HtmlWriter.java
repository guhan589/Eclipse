package Facada_Patterns;
import java.io.*;
public class HtmlWriter {
	public Writer writer;
	public HtmlWriter(Writer writer) {
		this.writer = writer;
	}
	public void title(String title) throws IOException{
		writer.write("<html>");
		writer.write("<head>");
		writer.write("<title>"+title+"</title");
		writer.write("</head>");
		writer.write("<body> \n");
		writer.write("<h1>"+title+"</h1>\n");
		
	}
	public void paragraph(String msg) throws IOException {
		writer.write("<p>"+msg+"</p>\n");
	}
	public void link(String link,String cpation) throws IOException{
		//writer.write("<a herf=\""+link+"\")
	}
	public void mailto() {
		
	}
	public void close() {
		
	}
}
