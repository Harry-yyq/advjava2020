package cn.tju.chp02.s06.infinal;

public class BikeFinalStatic {
	static final int data;
//	public BikeFinalStatic(){
//		data = 100;
//	}
	
	static{
		data = 100;
	}

	public static void main(String[] args) {
		System.out.println(BikeFinalStatic.data);

	}

}
