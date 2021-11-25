
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i=0; i<10; i++){
   
  ellipse(250,250, 500 - i*50, 500-i*50);
  //Use an if statement and modulo to alternate the color of your rings.
   if(i % 2 == 1){
    fill(#000000);
  }else{
    fill(#FFFFFF);
  }
  }

}
