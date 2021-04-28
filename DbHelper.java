package com.proje.db;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DbHelper {
	
	private String usr , pass  ;

	private List<String> list;
	
	private Map<String, String> map ;
	
	private Properties props;
	
	
	public void openConnections() {
		
		System.out.println("Connection Established");
		
		System.out.println("username :" +usr);
		System.out.println("pasword :" +pass);
		
		
		System.out.println("----------------list -------------");
		
		for (String string : list) {
			
			System.out.println("\t - "+string);
		}
		
		
		
		System.out.println("----------------map -------------");
		
		Set<String> keys = this.map.keySet();  
 		
		for (String key : keys) {
			
			System.out.println("\t - "+key+" : "+ map.get(key));
			
		}
		
			
		System.out.println("-----------------props ---------");
		
		Set<String> keyProp = this.props.stringPropertyNames();
		
		for (String string : keyProp) {
			
			System.out.println("\t - " + string + " : "  +this.props.getProperty(string));
		}
		
	}
	
	
public void closeConnections() {
		
		System.out.println("Connection Closed");
		
	}
	
	
	
	public DbHelper() {
		
	}
	
	public DbHelper(String usr, String pass) {
		super();
		this.usr = usr;
		this.pass = pass;
	}
	
	public List<String> getList() {
		return list;
	}

	public String getUsr() {
		return usr;
	}

	public void setUsr(String usr) {
		this.usr = usr;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

	public void setList(List<String> list) {
		this.list = list;
	}


	public Map<String, String> getMap() {
		return map;
	}


	public void setMap(Map<String, String> map) {
		this.map = map;
	}


	public Properties getProps() {
		return props;
	}


	public void setProps(Properties props) {
		this.props = props;
	}
	

}
