package com;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Project_WEBFServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {		
		String varz=req.getParameter("varz");
		System.out.println(varz);
		if(Integer.parseInt(varz)==1){
		String var1 = req.getParameter("var1");
		int i1 = Integer.parseInt(var1);
		System.out.println(i1);
		String var2 = req.getParameter("var2");
		int i2 = Integer.parseInt(var2);
		System.out.println(i2);
		String operation = req.getParameter("operation");
		int result;
		if(operation.equals("0")){
			result = i1 + i2;
		} else if(operation.equals("1")){
			result = i1 - i2;
		} else if (operation.equals("2")){
			result = i1 * i2;
		} else {
			result = i1 / i2;
		}
		System.out.println(result);
		resp.getWriter().println(result);
		} else if(Integer.parseInt(varz)==2){
			System.out.println("ffffff");
			String var3=req.getParameter("var3");
			boolean d= var3.contains(","); 
			if(d==true) var3=var3.replace(',','.');
			Double a=Double.parseDouble(var3);
			
			String var4=req.getParameter("var4");
			d= var4.contains(","); 
			if(d==true)var4=var4.replace(",", ".");
			Double c=Double.parseDouble(var4);
			
			if(Math.abs(a-10)<Math.abs(c-10))
			resp.getWriter().println("Blejlejashie chislo"+" "+a);
			else resp.getWriter().println("Blejlejashie chislo"+" "+c);
		} else if(Integer.parseInt(varz)==3){
			System.out.println("jj");
			String var1 = req.getParameter("var1");
			int a = Integer.parseInt(var1);
			
			String var2 = req.getParameter("var2");
			int b = Integer.parseInt(var2);
			
			String var3 = req.getParameter("var3");
			int c = Integer.parseInt(var3);	
		//System.out.println(a+" "+b+" "+c);
		//	resp.getWriter().println(c);
				
			float x1=0;
			float x2=0;
			float d=0f;
			d=(float) Math.pow(b,2)-4*a*c;
			//System.out.println("Дискрименант ="+d);
			if(d>0){
				x1=(float) (-b+Math.sqrt(d))/(2*a);
				x2=(float) (-b-Math.sqrt(d))/(2*a);	
				resp.getWriter().println("x1="+x1+" "+"x2="+x2);
			}
			 else if(d==0){
					x1=x2=(float) (-b+Math.sqrt(d))/(2*a);
					resp.getWriter().println("x1=x2="+x1);
				} else resp.getWriter().println("Kopneu net");
		//System.out.println(d+" "+x2);
		}
		}
	}


