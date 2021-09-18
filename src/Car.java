public class Car {
    private double motor;
    public String color;
    public int door;
    public int whell;

    public Car(double motor, String color, int door, int whell) {
        this.motor = motor;
        this.color = color;
        this.door = door;
        this.whell = 4;

        if (door == 2 || door == 4) {
            this.door =door;
        } else {
            this.door = 4;
        }
    }
    public void Showinfo (){
        System.out.println("\nmotor: "+this.motor+"\ncolor: "+this.color+"\ndoor: "+this.door+" \nwhell "+this.whell);
    }
}
