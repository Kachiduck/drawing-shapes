public class Shapes {
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
      Turtle turtle = new Turtle();
      turtle.forward(50);
      turtle.left(90);
      turtle.forward(50);
      turtle.left(90);
      turtle.forward(50);
      turtle.left(90);
      turtle.forward(50);
      




        // Task 2: Draw a regular shape many times
        Turtle turtle2 = new Turtle(200, 200);

       /*for(int i = 0; i <= 3; i++) {
         turtle2.forward(50);
         turtle2.left(90);
         turtle2.forward(50);
         turtle2.left(90);
         turtle2.forward(50);
         turtle2.left(90);
         turtle2.forward(50);
         turtle2.forward(50);
       }
      */   

         
         
         

        // Task 3: How many times does Turtle turn!
        int turns = 0;
        for(int i = 0; i <= 3; i++) {
         if (turtle2.left(90))
            turns ++;
         turtle2.forward(50);
         turtle2.left(90);
         turtle2.forward(50);
         turtle2.left(90);
         turtle2.forward(50);
         turtle2.left(90);
         turtle2.forward(50);
         turtle2.forward(50);
         System.out.print(turns);
       }

         int totalTurns = i * turns;
         System.out.print("<yourTurtleName> has turned " +totalTurns+ "times!");

        // Extension 1:
         

        // Extension 2:

    }
}
