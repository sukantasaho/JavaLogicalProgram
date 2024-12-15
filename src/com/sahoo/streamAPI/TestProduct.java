package com.sahoo.streamAPI;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class TestProduct {

	public static void main(String[] args) {

		Products m1 = new  Products("Sumsung Tv", 25000d,"Electoronics");
		Products m2 = new  Products("LG  Tv", 25000d,"Electoronics");
		Products m3 = new  Products("Lives Shirts", 2500d,"Fashion");
		Products m4 = new  Products("Basumati Rice bags ", 1555d,"Grosory");
		Products m5 = new  Products("Lives jeans", 2500d,"Fashion");
		Products m6 = new  Products("ATTA Bag ", 2500d,"Grosory");
		Products m7= new  Products("Plan Rice Bag ", 3500d,"Grosory");
		Products m8 = new  Products("Kaju Bag ", 6500d,"Grosory");
		Products m9 = new  Products("Bajaj Fan", 6500d,"Electoronics");
		Products m10 = new  Products("Sumsung Ace", 55000d,"Electoronics");
		Products m11= new  Products("Puma Shirts", 2500d,"Fashion");
		Products m12 = new  Products("Puma  jeans", 2500d,"Fashion");
		
	 List<Products> prod  = List.of(m1, m2, m3, m4, m5, m6, m7, m8, m9, m10,m11,m12);
	    Map<String,List<Products>> Productslists = prod.stream().collect(Collectors.groupingBy(e->e.getCategory()));
	    System.out.println(Productslists);
	    Spliterator<Products> splitr = prod.spliterator();
	    
		
	}

}
