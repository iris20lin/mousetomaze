import java.util.*; 
 
public class Newfinishmage {
        
   
    public static void main(String[] args) {
       String [][]mazeArray =readData();
       setMaze(mazeArray);
       setMazeWall(mazeArray);
       setstartEnd(mazeArray);
    //   goMaze();
       printMaze(mazeArray);
    }
    static String[][] readData(){
    	Scanner sc=new Scanner(System.in);
    	System.out.print("m,n=>");
    	String [][]mazeArray =new String[sc.nextInt()+2][sc.nextInt()+2];
    	return mazeArray;
    	
    }
    static void setMaze(String[][]mazeArray){
       	System.out.print("p=>");
       	Scanner sc =new Scanner(System.in);
       	int p=sc.nextInt();
       	for(int j=1;j<mazeArray.length-1;j++){
       		for(int i=1;i<mazeArray[j].length;i++){
       			mazeArray[j][i]=((int)(Math.random()*10000)%100<p)?"��":"��";
       		}
       	} 	
       }
    static void setMazeWall(String[][]mazeArray){
       	for(int i=0;i<mazeArray[0].length;i++){
        	mazeArray[0][i]="��";
        	mazeArray[mazeArray.length-1][i]="��";  
        }
        for(int i=0;i<mazeArray.length;i++){
        	mazeArray[i][0]="��";
        	mazeArray[i][mazeArray[i].length-1]="��";
        }
       }
    static void setstartEnd(String[][]mazeArray){
    	printMaze(mazeArray);
       	Scanner sc =new Scanner(System.in);
       	int mousex=sc.nextInt();
       	int mousey=sc.nextInt();
       	int endx=sc.nextInt();
       	int endy=sc.nextInt();
       	mazeArray[mousex][mousey]="��";
       	mazeArray[endx][endy]="��";
       }
    static void goMaze(){
       	
       }
    static void printMaze(String[][]mazeArray){
    	System.out.printf("  ");
    	    for ( int b=0; b < mazeArray[0].length ; b++ ){
        	        System.out.printf( "%2d",b );
        }
        System.out.println("  ");
        	for(int j=0;j<mazeArray.length;j++){
        		System.out.printf( "%2d", j );
        		for(int i=0;i<mazeArray[j].length;i++){
        			switch(mazeArray[j][i]){
        				case"��":System.out.print("�i");break;
        	            case"��":System.out.print("�@");break;
        	            case"��":System.out.print("�I");break;
        	            case"��":System.out.print("**");break;
        	            case"�I":System.out.print("..");break;
        			}
        		}
        		System.out.println();
        	}
       }
}
