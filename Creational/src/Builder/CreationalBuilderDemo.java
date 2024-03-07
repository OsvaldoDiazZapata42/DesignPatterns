package Builder;

import Builder.Computer.ComputerBuilder;

public class CreationalBuilderDemo {
	
	public static void main(String[] args){
        ComputerBuilder builder = new Computer.ComputerBuilder();
        builder.addRam(new Ram()).addSsd(new Ssd()).hasUsbc(true).hasGigaBitWifi(false);
        Computer compu = builder.build();
        System.out.println(compu);
    }
}
