import java.awt.Color;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.util.ArrayList;

import java.util.List;

import java.util.Random;

import java.util.Scanner;











import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JOptionPane;

import javax.swing.JPanel;

import javax.swing.JTextField;







public class Simon implements ActionListener {



Random rand = new Random();


int control=5;



boolean complete;



JFrame window;



JPanel panel;



JButton red;



JButton yellow;



JButton green;



JButton blue;



int[] nums = {1,1,2,3,4};



int[] imput = new int [nums.length];



public Simon() {



window = new JFrame();



window.setVisible(true);



window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



panel = new JPanel();



red = new JButton();



red.setOpaque(true);



red.setBackground(Color.RED);



red.addActionListener(this);



panel.add(red);



yellow = new JButton();



yellow.setOpaque(true);



yellow.setBackground(Color.YELLOW);



yellow.addActionListener(this);



panel.add(yellow);



green = new JButton();



green.setOpaque(true);



green.setBackground(Color.GREEN);



green.addActionListener(this);



panel.add(green);



blue = new JButton();



blue.setOpaque(true);



blue.setBackground(Color.BLUE);



blue.addActionListener(this);



panel.add(blue);



window.add(panel);



window.setSize(500, 500);



window.pack();

System.out.println(nums[0]);

setUp(nums);

}





public static void main(String[]args) {

Simon s = new Simon();


}







public void setUp(int y[])  {


for (int x =0; x<y.length; x++) {

if (y[x] == 1) {

System.out.println("red");

red.setBackground(Color.BLACK);

panel.repaint();

try {

    Thread.sleep(1000);                 //1000 milliseconds is one second.

} catch(InterruptedException ex) {

    Thread.currentThread().interrupt();

}

red.setBackground(Color.RED);

try {

    Thread.sleep(1000);                 //1000 milliseconds is one second.

} catch(InterruptedException ex) {

    Thread.currentThread().interrupt();

}

}

else if (y[x] == 2) {

System.out.println("yellow");

yellow.setBackground(Color.BLACK);

panel.repaint();

try {

    Thread.sleep(1000);                 //1000 milliseconds is one second.

} catch(InterruptedException ex) {

    Thread.currentThread().interrupt();

}

yellow.setBackground(Color.YELLOW);

try {

    Thread.sleep(1000);                 //1000 milliseconds is one second.

} catch(InterruptedException ex) {

    Thread.currentThread().interrupt();

}

}

else if (y[x] == 3) {

System.out.println("green");

green.setBackground(Color.BLACK);

panel.repaint();

try {

    Thread.sleep(1000);                 //1000 milliseconds is one second.

} catch(InterruptedException ex) {

    Thread.currentThread().interrupt();

}

green.setBackground(Color.GREEN);

try {

    Thread.sleep(1000);                 //1000 milliseconds is one second.

} catch(InterruptedException ex) {

    Thread.currentThread().interrupt();

}

}

else if (y[x] == 4) {

System.out.println("blue");

blue.setBackground(Color.BLACK);

panel.repaint();

try {

    Thread.sleep(1000);                 //1000 milliseconds is one second.

} catch(InterruptedException ex) {

    Thread.currentThread().interrupt();

}

blue.setBackground(Color.BLUE);

try {

    Thread.sleep(1000);                 //1000 milliseconds is one second.

} catch(InterruptedException ex) {

    Thread.currentThread().interrupt();

}

}

}

System.out.println(control);

}

int x;

int y=0;

public void actionPerformed(ActionEvent e) {



if (e.getSource() == red) {

x=1;

}

else if (e.getSource() == yellow) {

x=2;

}

else if (e.getSource() == green) {

x=3;

}

else if (e.getSource() == blue) {

x=4;

}

if(x != nums[y]){

System.out.println("you loose. Your score is: "+y);

}

else{

y++;

}

if(y==nums.length){

System.out.println("you win congrats! ready for the next level?");

if(control <= 20){

control++;

Newarray();


}

}






/*for (int control=0; control<imput.length; control++) {

if (nums[control] != imput[control]) {

System.out.println("You Loose. Your score" + control);

}

}*/

}



private void Newarray() {

int[] nums=new int[control];

for(int x=0;x<control;x++){

int  n = rand.nextInt(4) + 1;

nums[x]=n;

}

setUp(nums);

}











}