import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;

public class Main {
    public static void main(String[] args) {

        System.loadLibrary( Core.NATIVE_LIBRARY_NAME );

        VideoCapture videoCapture=new VideoCapture();
        videoCapture.open(1);
        Mat kamera=new Mat();
        if (videoCapture.isOpened()){
            videoCapture.read(kamera);
            Imgcodecs.imwrite(System.getProperty("user.home") + "C:/Users/halit/OneDrive/Masaüstü/fotogelecejava/kameralı.jpg", kamera);
            videoCapture.release();
        }
        System.out.println("foto kayıt edıldı");
    }
}