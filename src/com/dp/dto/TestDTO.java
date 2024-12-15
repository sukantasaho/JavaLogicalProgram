package com.dp.dto;

import java.util.List;

public class TestDTO {

	public static void main(String[] args) {
		 
		Employee e1 = new Employee();
		e1.setAddr("Bhadrak");
		e1.setName("Sukanta");
		e1.setSal(30000d);
		
		Employee e2 = new Employee();
		e2.setAddr("Bhadrak");
		e2.setName("Sukanta");
		e2.setSal(30000d);
		
		List<Employee> list = List.of(e1,e2);
		APIResponse<List<Employee>> res = new APIResponse<List<Employee>>();
		res.setRes(list);
		res.setMessage("SUCCESS");
		res.setStatus("OK");
		res.setStatusCode(200);
		System.out.println(res.getRes());
		res.getRes().forEach(e->System.out.println(e.getAddr()));
		System.out.println(res);
		/*APIResponse res = new APIResponse();
		res.message = "success";
		res.resList=list;
		res.status = true;
		
		res.resList.forEach(e->System.out.println(e.getName()+" "+e.getAddr()+" "+e.getSal()));*/
       

	}

}
