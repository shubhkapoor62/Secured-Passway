
import com.trolltech.qt.gui.*;
import com.trolltech.qt.gui.QFrame;
import com.trolltech.qt.core.*;

public class Iwindow extends QWidget
{
    public Iwindow()
    {
        QFrame  a;
        QPixmap img = new QPixmap("C:\\Users\\hp\\Desktop\\download.jpe");
        //setStyleSheet("QFrame { background: url(:/Images/download.jpg) ;background-position : bottom ;}");
        //QImage back = new QImage("C:\\Users\\hp\\Desktop\\download.jpe");
        a = new QFrame(this);
       
        QLabel l = new QLabel(a);
        l.setPixmap(img);
        l.move(20,20);
        
      
       
        //QPainter paint = new QPainter();
        //paint.drawImage(0,0,back);
        ;
        setStyleSheet("QFrame {background-color:blue}");
        show();
    }
    
    public static void main(String args[])
    {
        QApplication.initialize(args);
        new Iwindow();
        QApplication.execStatic();
        
    }
}
