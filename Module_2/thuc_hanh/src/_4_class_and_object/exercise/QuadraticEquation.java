package _4_class_and_object.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b,2) - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(this.getDiscriminant())) / 2 * a;
    }

    public double getRoot2() {
        return (-b - Math.sqrt(this.getDiscriminant())) / 2 * a;
    }
    public void solve(){
        if(this.getDiscriminant()<0){
            System.out.println("The equation has no roots");
        }else if(this.getDiscriminant()==0){
            System.out.println("The equation has one root :"+this.getRoot1());
        }else{
            System.out.println("The equation has two root :"+this.getRoot1()+" and "+this.getRoot2());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation q = new QuadraticEquation(a, b, c);
        q.solve();
    }
}
