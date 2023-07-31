package com.cg.daysix.statics;

public class StaticClass {
	private static String str = "Static Class";
	 
    static class StaticClass2 {
       
        public void disp(){
          System.out.println(str);
        }
    }

	public static void main(String[] args) {
		StaticClass.StaticClass2 ob = new StaticClass.StaticClass2();
		ob.disp();
	}

    }

