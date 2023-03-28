package ac.jiu.java.practice.week9;

public class Node {
     private int x;
     private int y;
     public int getX() {
          return x;
     }
     public void setX(int x) {
          this.x = x;
     }


     public int getY() {
          return y;
     }

     public Node(int x, int y){
          this.x = x;
          this.y = y;
     }

     public Node() {

     }

     public Node getCenter(Node other){
          return new Node((this.x + other.getX())/ 2 , (this.y + other.getY()) / 2);
     }


}
