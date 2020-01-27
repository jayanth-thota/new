class Box1
{
  int boxLength,boxWidth,boxHeight;
  
  Box1()
{
boxLength=2;
boxWidth=3;
boxHeight=4;
}

  void setBox1(int boxLength,int boxWidth,int boxHeight)
  {
    this.boxLength=boxLength;
    this.boxWidth=boxWidth;
    this.boxHeight=boxHeight;
  }
  
  void getBox1()
  {
  System.out.println(""+boxLength+""+boxWidth+""+boxHeight);
  }

  void Volume()
  {
   int Volume=(boxLength*boxWidth*boxHeight);
  
 
  }
}

class Main{



public static void main(String[] args)
{
  Box1 v=new Box1(2,4,6);
  v.getBox1();
  v.Volume();

}
}

 


  
