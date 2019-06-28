/*
 * CSC422 - Summer 2019 
 * Zombie War Group Project
 * Authors: Mike Nelson, Myra Ausherman, Peter Vang, Vishal Barot, Jason Lundquist.
*/
package zombiewar;

/**
 *
 * @author mike
 */
public class Shotgun extends Weapon {
    //constructor
    public Shotgun() {
        this.accuracy = 66;
        this.damage = 35;
        this.type = "Shotgun";
    }
}

//class Main {
//    public static void main(String[] args) {
//        Shotgun moss = new Shotgun();
//        System.out.println("A " + moss. has " + moss.getDamage() + " damage and " + moss.getAccuracy() + " accuracy.");
//    }
//}