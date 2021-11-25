import javax.swing.JOptionPane;

 void draw(){
for(int i=99; i>2; i--){
  println(i + " bottles of pop on the wall, " + i + " bottles of pop!" + " Take one down, pass it around, " + (i-1) + " bottles of pop on the wall!");
}
println("2 bottles of pop on the wall, 2 bottles of pop!" + " Take one down, pass it around, 1 bottle of pop on the wall!");
println("1 bottle of pop on the wall, 1 bottle of pop! Take one down, pass it around, no bottles of pop on the wall!");
println("No bottles of pop on the wall, no bottles of pop! Go to the store, buy some more, 99 bottles of pop on the wall!");

String goAgain = JOptionPane.showInputDialog("Do you want to sing the song again?");

if(!goAgain.equalsIgnoreCase("yes")){
  System.exit(0);
}
 }
