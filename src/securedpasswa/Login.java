

import com.trolltech.examples.LineEdits;
import com.trolltech.qt.core.Qt;
import com.trolltech.qt.gui.*;
import static com.trolltech.qt.gui.QAccessible.RelationFlag.Right;
import java.sql.*;

public class Login extends QWidget
{
    public Login()
    {
        
       //QImage back = new QImage("C:\\Users\\hp\\Desktop\\dowmload.jpe");
       setFocusPolicy(Qt.FocusPolicy.StrongFocus);
       QGridLayout grid = new QGridLayout();
        QComboBox drop = new QComboBox();
       drop.addItem("Admin");
       drop.addItem("User");
       QPushButton ok = new QPushButton("login", this); 
       QPushButton signup = new QPushButton("Signup", this);    
       QVBoxLayout layout = new QVBoxLayout();
       layout.addLayout(grid);
       setLayout(layout);
       
       QLabel l2 = new QLabel("LOGIN",this);
       QLabel l = new QLabel("Username",this);
       QLabel l1 = new QLabel("Password",this);
       QLineEdit e = new QLineEdit();
       
       QLineEdit e1 = new QLineEdit();
       e.setFocusPolicy(Qt.FocusPolicy.StrongFocus) ;
       
       grid.addWidget(drop,2,3);
       grid.addWidget(l2, 0, 1);
       grid.addWidget(l,4,0);
       grid.addWidget(e,4,2);
       grid.addWidget(l1,6,0);
       grid.addWidget(e1,6,2);
       grid.addWidget(ok, 9, 1);
       
       //##########################################################
       
       setStyleSheet( "QLabel { background-color:#404565}");
       QLabel l3 = new QLabel("SIGNUP",this);
       QLabel l4 = new QLabel("Username",this);
       QLabel l5 = new QLabel("Password",this);
       
       QLabel l6 = new QLabel("Confirm Password",this);
       QLineEdit e3 = new QLineEdit();
       QLineEdit e4 = new QLineEdit();
       
       QLineEdit e5 = new QLineEdit();
       e.setFocusPolicy(Qt.FocusPolicy.StrongFocus);
       
       grid.addWidget(l3, 0, 10);
       grid.addWidget(l4,4,8);
       grid.addWidget(e3,4,10);
       grid.addWidget(l5,6,8);
       grid.addWidget(l6,8,8);
       grid.addWidget(e4,6,10);
       grid.addWidget(e5,8,10);
       grid.addWidget(signup,9,10);
       resize(600,200);
       show();
    }
   public static void main(String args[]) 
   {
    try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            //Get a connection
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/HP;create=true;user=hp;password=123"); 
            Statement stmt = conn.createStatement();
            stmt.execute("insert into " + "HP.USERTABLE" + " values ('" +
                    "141331" + "','" + "shu" + "','" + "Shubham" + "','" + "ans1" + "','" + "ans2" +"')");
        }
        catch (Exception except)
        {
            except.printStackTrace();
        }  
    QApplication.initialize(args);
    new Login();
    
    QApplication.execStatic();
    
   }
}