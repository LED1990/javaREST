package com.tutorialspoint;

import java.util.ArrayList;
import java.util.List;

/*
 * DAO - Data Access Object
 * instance which is used to access and manipulate data
 * It defines method to operate and modify object of other classes but dont create this object and class
 * for example: in hibernate I have class which defines columns in database (entities etc.) - EntityClass
 * and I have second class (DAO) which provide operations such us add/delete/etc. and manipulate EntityClass instance.  
 */
public class DataDAO {
	
	public List<Data> getAllData(){
		List<Data> myData = new ArrayList<Data>();
		myData.add(new Data(1,"name1","pos1"));
		myData.add(new Data(2,"name2","pos2"));
		myData.add(new Data(3,"name3","pos3"));
		
		return myData;
	}

}
