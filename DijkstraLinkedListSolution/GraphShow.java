package DijkstraLinkedListSolution;
//Dijkstra Solution - Using Linked List
import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class GraphShow {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        GraphWeighted graphWeighted = new GraphWeighted(true);
        
        NodeWeighted one = new NodeWeighted("A", "Electric Tower");
        NodeWeighted two = new NodeWeighted("B", "Walkway");
        NodeWeighted three = new NodeWeighted("C", "Lab");
        NodeWeighted four = new NodeWeighted("D", "Main Faculty");
        NodeWeighted five = new NodeWeighted("E", "Photo View FSKTM");
        NodeWeighted six = new NodeWeighted("F", "FSKTM Cubicle");
        NodeWeighted seven = new NodeWeighted("G", "Parking DKAP");
        NodeWeighted eight = new NodeWeighted("H", "DKAP B");
        NodeWeighted nine = new NodeWeighted("I", "DKAP A");
        NodeWeighted ten = new NodeWeighted("J", "Parking Faculty");
        
        graphWeighted.addEdge(ten, three, 9);
        graphWeighted.addEdge(ten, four, 7);
        graphWeighted.addEdge(ten, six, 6);
        graphWeighted.addEdge(ten, seven, 4);
        graphWeighted.addEdge(ten, eight, 7);
        graphWeighted.addEdge(eight, seven, 1);
        graphWeighted.addEdge(seven, five, 7);
        graphWeighted.addEdge(five, six, 6);
        graphWeighted.addEdge(four, six, 1);
        graphWeighted.addEdge(three, two, 2);
        graphWeighted.addEdge(six, one, 2);
        graphWeighted.addEdge(four, one, 1);
        graphWeighted.addEdge(three, one, 3);
        graphWeighted.addEdge(two, one, 5);
        graphWeighted.addEdge(nine, eight, 2);
        graphWeighted.addEdge(eight, nine, 2);
   
        String src = JOptionPane.showInputDialog(null,"Where Are you?\n"
        		+ "1 = Electric Tower\n"
        		+ "2 = Walkway\n3 = Lab\n4 = Main Faculty\n5 = Photo View FSKTM\n"
        		+ "6 = FSKTM Cubicle\n7 = Parking DKAP\n8 = DKAP A\n9 = DKAP B\n"
        		+ "10 = Parking Faculty\n\n","Place Confirmation", 
				JOptionPane.INFORMATION_MESSAGE);
        int vertex = Integer.parseInt(src);
        
        if ( vertex==1) {
        	graphWeighted.DijkstraShortestPath(ten,one);}
        else if (vertex==2) {
        	graphWeighted.DijkstraShortestPath(ten,two);}
        else if (vertex==3) {
        	graphWeighted.DijkstraShortestPath(ten,three);}
        else if (vertex==4) {
        	graphWeighted.DijkstraShortestPath(ten,four);}
        else if (vertex==5) {
        	graphWeighted.DijkstraShortestPath(ten,five);}
        else if (vertex==6) {
        	graphWeighted.DijkstraShortestPath(ten,six);}
        else if (vertex==7) {
        	graphWeighted.DijkstraShortestPath(ten,seven);}
        else if (vertex==8) {
        	graphWeighted.DijkstraShortestPath(ten,eight);}
        else if (vertex==9) {
        	graphWeighted.DijkstraShortestPath(ten,nine);}
        else if (vertex==10) {
        	graphWeighted.DijkstraShortestPath(ten,ten);}
        else {
        	JOptionPane.showMessageDialog(null,"No Such Place!!","ERROR", 
    				JOptionPane.INFORMATION_MESSAGE);}
    }
}