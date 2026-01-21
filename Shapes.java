public class Shapes {
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
      Turtle turtle = new Turtle();
      for (int i = 0; i < 4; i++) {
      turtle.forward(50);
      turtle.left(90);
      }      




        // Task 2: Draw a regular shape many times
        Turtle turtle2 = new Turtle(0, 20);
         
       for(int a = 0; a < 4; a++) {
         for(int b = 0; b < 4; b++) {
            turtle2.forward(50);
            turtle2.left(90);
            }
          turtle2.forward(50);
       }
      

         
         
         

        // Task 3: How many times does Turtle turn!
        Turtle turtle3 = new Turtle(-100, 100);

        int totalTurns = 0;
        for(int i2 = 0; i2 <= 3; i2++) {
            for(int i = 0; i <= 3; i++) {
               turtle3.forward(50);
               turtle3.left(90);
               totalTurns ++;
               }
         
        } turtle3.forward(50);

         System.out.print("turtle3 turned " +totalTurns+ " times");

        // Extension 1:
         

        // Extension 2:

    }
}
