package com.sahoo.streamAPI;

import java.util.stream.Stream;

public class SeqStreamAndParallelStream {

	public static void main(String[] args) {
		System.out.println("***************Sequential Stream***********************");
        Stream<Integer> ss = Stream.of(1,2,3,4,5);
        System.out.println("Sequential Stream Start Time-"+System.currentTimeMillis());
        long seqStartTime = System.currentTimeMillis();
        ss.forEach(e->System.out.println(e+" :: "+Thread.currentThread().getName()));
        System.out.println("Sequential Stream End Time-"+System.currentTimeMillis());
        System.out.println("Sequential Stream Elapsed Time-"+(System.currentTimeMillis()-seqStartTime));
        
       
        System.out.println("***************Parallel Stream***********************");
        Stream<Integer> ps = Stream.of(1,2,3,4,5);
        System.out.println("Parallel Stream Start Time-"+System.currentTimeMillis());
        long pStartTime = System.currentTimeMillis();
        ps.parallel().forEach(e->System.out.println(e+" :: "+Thread.currentThread().getName()));
        System.out.println("Parallel Stream End Time-"+System.currentTimeMillis());
        System.out.println("Parallel Stream Elapsed Time-"+(System.currentTimeMillis()-pStartTime));
        
        
	}

}
