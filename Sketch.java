import processing.core.PApplet;

public class Sketch extends PApplet {
	
	

  public void settings() {
	// put your size call here
    size(1200, 600);
  }
  public void setup() {
    background(45, 150, 207);
  }

  public void draw() {
	
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
  }



  public void draw_section_outlines(){
    stroke(0);
    noFill();
  
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }

  //Draws the bottom left box full of white sqaures
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + intRow*10;  
        intY = 300 + 3 + intColumn*10; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Drawing the second to the left at the bottom with the changing blck and white sqaure in the coloumns
   */
  public void draw_section2(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + intRow*10 +300;  
        intY = 300 + 3 + intColumn*10; 

        if (intRow % 2 == 0){
          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);
        }
        else {
          fill(0);
          noStroke();
          rect(intX, intY, 5, 5);

        }    
      }
    }
  }

  //Drawing the rows of black and white sqaures. The third to the left at the bottom
  public void draw_section3(){

    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + intRow*10+600;  
        intY = 300 + 3 + intColumn*10; 

        if (intColumn % 2 == 0){
          fill(0);
          noStroke();
          rect(intX, intY, 5, 5);
        }
        else {
          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);

        } 
      }
    }
  }
   // drawaing a black white black white pattern
   
  public void draw_section4(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + intRow*10+900;  
        intY = 300 + 3 + intColumn*10; 
 
        if (intColumn % 2 == 0 || intRow % 2 ==1){
          fill(0);
          noStroke();
          rect(intX, intY, 5, 5);
        }
        else {
          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);

        }      
      } 
    }
  }


  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */


   //drawing first half of the triangle
  public void draw_section5(){

    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 30-intRow; intColumn < 30; intColumn++){
        intX = 3 + intRow*10;  
        intY = 3 + intColumn*10; 
 
      
          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);
      
      }
    }

  }

  //drawing second half of triangle
  public void draw_section6(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = intRow; intColumn < 30; intColumn++){
        intX = 3 + intRow*10+300;  
        intY = 3 + intColumn*10; 
 
      
          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);
      
      }
    }
  }

  //drawing first half of the reversed triangle
  public void draw_section7(){
    int intX = 0;
    int intY = 0;

    for(int intColumn = 1; intColumn < 31;intColumn++){
      for(int intRow = -intColumn+30; intRow >-1 ; intRow--){
        intY = 3 + intRow*10;  
        intX = 3 + intColumn*10+590; 

           fill(255);
          noStroke();
          rect(intX, intY, 5, 5); 
      }
    }
  }
  //drawing second half of reversed triangle
  public void draw_section8(){
    int intX = 0;
    int intY = 0;

    for(int intColumn = 30; intColumn > -1;intColumn--){
      for(int intRow = intColumn; intRow < 30; intRow++){
      
        intX = 3 + intRow*10+900;  
        intY = 3 + intColumn*10; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5); 
      }
    }
  }






}
