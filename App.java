class App{
	public static void main(String[] args){
		try{
			System.out.println("-->Hello, arg:" + args[0]);
		} catch (Exception e){
			System.out.println("-->No args");
		}
	}
}