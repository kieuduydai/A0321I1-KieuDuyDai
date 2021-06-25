package bai_4_OOP;

import java.util.Arrays;

public class stop_watch {
	private long starTime,endTime;
    
	public stop_watch() {
    }
	
    public void start() {
         starTime = System.currentTimeMillis();
    }
    
    public void stop() {
         endTime = System.currentTimeMillis();
    }
    
    public long getElapsedTime() {
        return endTime-starTime;
    }

    public static void main(String[] args) {
        stop_watch stopWatch = new stop_watch();
        
        int[] array = new int[1000000];
        
        for(int i = 0; i < array.length ; i++)
            array[i] = (int) (Math.random()*100000);
        
       
        stopWatch.start();
        
        Arrays.sort(array);
        
        for(int i = 0; i < array.length ; i++)
        	System.out.println(array[i]+" ");
        
        stopWatch.stop();	
        
        System.out.println("Thoi gian thuc thi cua thuat toan sap xep "
        		+ "la "+stopWatch.getElapsedTime()+" ms");
    }
}
