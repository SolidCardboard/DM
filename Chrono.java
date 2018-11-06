/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
echo "# DM" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/SolidCardboard/DM.git
git push -u origin master
package chrono;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author solid_cardboard
 */
public class Chrono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Timer timer = new Timer("Printer");
        MyTask t = new MyTask();
        timer.schedule(t, 0, 2000);
    }
}
class MyTask extends TimerTask {
    private int times = 0;
    public void run() {
        times++;
if (times <= 8) {
        System.out.println("I'm alive...");
} else {
        System.out.println("Timer stops now...");
        //Stop Timer.
        this.cancel();
                Random rand = new Random();
                 for (int j=0;j<1;j++) {
                    System.out.print(rand.nextInt(100));
                    System.out.println();
                for (int a=0;j<1;j++) {
                    System.out.print(rand.nextInt(100));
                    System.out.println();
                for (int b=0;j<1;j++) {
                    System.out.print(rand.nextInt(100));
                    System.out.println();    
Scanner keyb = new Scanner(System.in);{
int d = keyb.nextInt();
if (d==j){
    int e = keyb.nextInt();
    System.out.println("au deuxième chiffre a inscrire");
    }else if(d<j){
        System.out.println("désolé mais le chiffre est plus haut");
    }else if (d>j){
        System.out.println("désolé mais le chiffre est plus bas");
if (e==a){
    int f = keyb.nextInt();
    System.out.println("au troisième chiffre a inscrire");
    if (e>a)
    System.out.println("désolé mais le chiffre est plus haut");
    else if (e<a)
    System.out.println("désolé mais le chiffre est plus bas");
if (f==b){
    System.out.println("bravo vous avez reussi a temps");
    if (f>b);
    System.out.println("désolé mais le chiffre est plus haut");
    if (f<b);
    System.out.println("désolé mais le chiffre est plus bas");
} 
}
}
}
        }
}
    }
}
    }
}