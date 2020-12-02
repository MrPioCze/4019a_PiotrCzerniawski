package rysunecki;

import java.util.Random;

public class Main {

	  public static void main(String[] args) {
		  int w = 900; //30 * 30
		  int e = 144; //12 * 12

		  StdDraw.setCanvasSize(w, w);
		  StdDraw.setScale(-w / 2, w / 2);
          StdDraw.ellipse(0, 0, e, e);
          StdDraw.setPenRadius(0.05);
          
          Random r = new Random();
          for (int i = 0; i < 50000; i++) {
        	  int x = r.nextInt(w) - w / 2;
        	  int y = r.nextInt(w) - w / 2;        	  
        	 if (x * x + y * y < e * e) {
        		 StdDraw.setPenColor(StdDraw.DARK_GRAY);
        	 }
        	 else {
        		 StdDraw.setPenColor(StdDraw.CYAN);
        	 }
        	 StdDraw.point(x, y);
          }
          
          
      }
	}

