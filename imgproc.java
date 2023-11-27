import org.opencv.core.*;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;

public class imgproc {
    public static void main(String[]args){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat image = new Mat(600, 600, CvType.CV_8UC3, new Scalar(0,0,0));
        Mat image2 = new Mat(600, 600, CvType.CV_8UC3, new Scalar(0,0,0));


        Imgproc.line(image,new Point(200,300),new Point(400,300),new Scalar(0,0,255));
        HighGui.imshow("line",image);

        Imgproc.line(image,new Point(300,200),new Point(300,400),new Scalar(0,0,255));
        HighGui.imshow("line",image);


        Imgproc.line(image,new Point(200,200),new Point(200,300),new Scalar(0,0,255));
        HighGui.imshow("line",image);

        Imgproc.line(image,new Point(300,200),new Point(400,200),new Scalar(0,0,255));
        HighGui.imshow("line",image);

        Imgproc.line(image,new Point(400,300),new Point(400,400),new Scalar(0,0,255));
        HighGui.imshow("line",image);

        Imgproc.line(image,new Point(200,400),new Point(300,400),new Scalar(0,0,255));
        HighGui.imshow("line",image);

       // HighGui.waitKey();
        Imgproc.circle(image,new Point(300, 200),5, new Scalar(0,255,255), Imgproc.FILLED );
        HighGui.imshow("image",image);

        Imgproc.circle(image,new Point(200, 300),5, new Scalar(0,255,255),Imgproc.FILLED);
        HighGui.imshow("image",image);

        Imgproc.circle(image,new Point(200, 200),5, new Scalar(0,255,255),Imgproc.FILLED);

        HighGui.imshow("image",image);



        Imgproc.circle(image,new Point(200, 300),5, new Scalar(0,255,255),2 );
        HighGui.imshow("image",image);



        Imgproc.circle(image,new Point(300, 200),5, new Scalar(0,255,255),2 );
        HighGui.imshow("image",image);




        Imgproc.circle(image2,new  Point(300,300),150,new Scalar(100,150,155),Imgproc.FILLED);
        HighGui.imshow("image2",image2);
        Imgproc.circle(image2,new Point(350,250),20 ,new Scalar(255, 0, 255),Imgproc.FILLED);
        HighGui.imshow("image2",image2);
        Imgproc.circle(image2,new Point(250,250),20,new Scalar(255, 0, 255),Imgproc.FILLED);
        HighGui.imshow("image2",image2);
        HighGui.waitKey();



       // Imgproc.ellipse(image2,new RotatedRect(new Point(22,33),new Size(21,40),180),new Scalar(0,0,0,),2 ,Imgproc.FILLED);
        //HighGui.imshow("image2",image2);
        //HighGui.waitKey();



    }


    }






