package Singleton;

public class CreationalSingletonDemo {
	
	public static void main(String[] args){
        DbSingletonConnection instance = DbSingletonConnection.getInstance();
        System.out.println(instance);
        DbSingletonConnection instance2 = DbSingletonConnection.getInstance();
        System.out.println(instance2);
        System.out.println(instance == instance2);   //true     
    }

}
