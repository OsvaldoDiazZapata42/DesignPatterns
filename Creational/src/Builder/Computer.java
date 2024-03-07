package Builder;

public class Computer {

    private Ssd diskSize;
    private Ram ramSize;
    private boolean hasUsbc;

    public Ssd getDiskSize() {
        return diskSize;
    }

    public Ram getRamSize() {
        return ramSize;
    }

    public boolean isHasUsbc() {
        return hasUsbc;
    }

    public boolean isHasGigaBitWifi() {
        return hasGigaBitWifi;
    }

    private boolean hasGigaBitWifi;

    
    public Computer(ComputerBuilder builder){
        this.diskSize = builder.diskSize;
        this.ramSize = builder.ramSize;
        this.hasUsbc = builder.hasUsbc;
        this.hasGigaBitWifi = builder.hasGigaBitWifi;
    }

    public static class ComputerBuilder{
        private Ssd diskSize;
        private Ram ramSize;
        private boolean hasUsbc;
        private boolean hasGigaBitWifi;

        public ComputerBuilder(){

        }

        public Computer build(){
            return new Computer(this);
        }

        public ComputerBuilder addSsd(Ssd ssd){
            this.diskSize = ssd;
            return this;
        }

        public ComputerBuilder addRam(Ram ram){
            this.ramSize = ram;
            return this;
        }

        public ComputerBuilder hasUsbc(boolean usbc){
            this.hasUsbc = usbc;
            return this;
        }

        public ComputerBuilder hasGigaBitWifi(boolean wifi){
            this.hasGigaBitWifi = wifi;
            return this;
        }

    }

}