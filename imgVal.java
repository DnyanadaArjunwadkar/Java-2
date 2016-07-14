package imgVal;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.print.attribute.standard.Fidelity;
import javax.swing.filechooser.FileNameExtensionFilter;

public class imgVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		 int bad=0;
         int good=0;
         //Note-> source files i.e. folder number assigned to you
		File dir = new File("/Users/dny/Desktop/shitty_work/172/");
		File[] files = dir.listFiles(new FilenameFilter() {
		    public boolean accept(File dir, String name) {
		    	
		        return (name.toLowerCase().endsWith(".jpg")|name.toLowerCase().endsWith(".tif")||name.toLowerCase().endsWith(".jpeg"));
		    }
		});
		System.out.println("#files:"+files.length);
		
	   for(File filedata:files)
	    {
		   
	    	//  System.out.println("***********************************************************");
              System.out.println(filedata.toString());
                      
             try {
            	 
            	   BufferedImage image = ImageIO.read(filedata);
            	   int height = image.getHeight();
            	   int width = image.getWidth();
            	   int white=0;
            	   int grey=0;
  				    int totalPixel=0;
            	
            	   if(height<200 && width<200)
            	   {
            		//   System.out.println("Error");
            	//	   System.out.println(filedata.toString());
            		   bad++;
            		   //System.out.println("bad:"+bad);
            		  // System.out.println("Height : "+ height);
                   	   //System.out.println("Width : "+ width);
            		  // filedata.delete();
            		 //Note: source of file:---->  source files i.e. folder number assigned to you
            		 File oldname = new File("/Users/dny/Desktop/shitty_work/172/"+filedata.getName());
            		 //Note:--> folder where files will be moved
      	             File newname = new File("/Users/dny/Desktop/shitty_work/172_bad/"+filedata.getName());
      	             oldname.renameTo(newname);
      	        //     System.out.println("Thumbnail moved");
            	 
            	   }
            	   else
            	   {
            		   good++;
            		  
            		   for (int i = 0; i < height; i++) {
            			      for (int j = 0; j < width; j++) {
            			      //  System.out.println("x,y: " + j + ", " + i);
            			        int pixel = image.getRGB(j, i);
            			        totalPixel++;
            			        int alpha = (pixel >> 24) & 0xff;
            				    int red = (pixel >> 16) & 0xff;
            				    int green = (pixel >> 8) & 0xff;
            				    int blue = (pixel) & 0xff;
            				  //  System.out.println("argb: " + alpha + ", " + red + ", " + green + ", " + blue);
            				    if(red==255 && blue==255 && green==255)
            				    {
            				    	white++;
            				       //System.out.println("argb: " + alpha + ", " + red + ", " + green + ", " + blue);
            				    
            				    }
            				    if(red==blue && blue==green && blue!=255)
            				    {
            				    	grey++;
            				    //	System.out.println("");
            				    }
            			      // System.out.println("white:"+white);
            			    //    System.out.println("");
            			      }
            			    }
            		//   System.out.println("white:"+white);
            		 //  System.out.println("totalPixel:"+totalPixel);
            		   
            		   float percent=((float)white*100)/totalPixel;
            		   float percent_grey=((float)grey*100)/totalPixel;
            		   
            	      
            		   
            		   if(percent<2.00)
            		   {
            			   if(percent_grey<2.00)
            			   {
            				 System.out.println("White color Percentage:"+String.valueOf(percent));
                    	     System.out.println("Grey color Percentage:"+String.valueOf(percent_grey));
                    	     //Note:-> source file//source files i.e. folder number assigned to you
            	             File oldname = new File("/Users/dny/Desktop/shitty_work/172"+filedata.getName());
            	           //Note:--> folder where files will be moved
            	             File newname = new File("/Users/dny/Desktop/shitty_work/172_bad/"+filedata.getName());
            	             oldname.renameTo(newname);
            	             System.out.println("File Moved");
            			   }
            		   }
            		   
            		  
           	        
               	   }
            	  } catch (IOException ioe) {
            		  
            //		  System.out.println("Removing file:"+filedata.getName());
            	//	  filedata.delete();
            	//	  System.out.println("File removed.");
            	   ioe.printStackTrace();
            	   
            	  
            	  }
             System.out.println("***********************************************************");
	    }//end of a for loop which has an image
	  	     
	   //Note-->source of file//source files i.e. folder number assigned to you
	   File dir2 = new File("/Users/dny/Desktop/shitty_work/172");
		File[] files2 = dir.listFiles(new FilenameFilter() {
		    public boolean accept(File dir, String name) {
		    	
		        return (name.toLowerCase().endsWith(".jpg")|name.toLowerCase().endsWith(".tif")||name.toLowerCase().endsWith(".jpeg"));
		    }
		});
		 System.out.println("!!!!!!!!@@@@@@@@########$$$$$$$%%%%%%%%^^^^^^^&&&&&&&********((((((((((((((((");
		 System.out.println("Before moving files:"+files.length);
		System.out.println("After moving files:"+files2.length);   
		int tot=files.length-files2.length;
		System.out.println(("Number of files moved ="+tot));
		System.out.println("good :"+good);
  	}
	
	
}
