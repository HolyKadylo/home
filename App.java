import java.lang.Thread;

class App{
	public static void main(String[] args){
		while(true){
			try{
				System.out.println("-->Sleeping 10 s");
				Thread.currentThread().sleep(10000);
				try{
					System.out.println("-->Hello, arg:" + args[0]);
				} catch (Exception e){
					System.out.println("-->No args");
				}
			} catch (InterruptedException ie){
				System.out.println("-->Interrupted");
				break;
			}
		}
	}
}