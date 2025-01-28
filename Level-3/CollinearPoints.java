import java.util.Scanner;
class CollinearPoints{
    public static boolean checkCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3){

        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);
        
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }
    
    public static boolean checkCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3){
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter coordinates for point A (x1, y1):");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        
        System.out.println("Enter coordinates for point B (x2, y2):");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        
        System.out.println("Enter coordinates for point C (x3, y3):");
        int x3 = input.nextInt();
        int y3 = input.nextInt();

        boolean isCollinearSlope = checkCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean isCollinearArea = checkCollinearArea(x1, y1, x2, y2, x3, y3);
        
        if(isCollinearSlope && isCollinearArea){
            System.out.println("The given points are collinear.");
        } else{
            System.out.println("The given points are NOT collinear.");
        }
    }
}
