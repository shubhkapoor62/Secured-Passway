package securedpasswa;


/********************************************************************************
 ** Form generated from reading ui file 'IIwindow.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.6
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_Form implements com.trolltech.qt.QUiForm<QWidget>
{
    public QFrame frame;
    public QFrame frame_2;
    public QFrame frame_3;
    public QRadioButton radioButton;
    public QLabel label_3;
    public QFrame frame_4;
    public QLabel label;
    public QLabel label_2;
    public QFrame frame_5;
    public QRadioButton radioButton_2;
    public QLabel label_4;
    public QFrame frame_6;
    public QRadioButton radioButton_3;
    public QLabel label_5;
    public QFrame frame_7;
    public QVBoxLayout verticalLayout;
    public QDialogButtonBox buttonBox;

    public Ui_Form() { super(); }

    public void setupUi(QWidget Form)
    {
        Form.setObjectName("Form");
        Form.resize(new QSize(548, 345).expandedTo(Form.minimumSizeHint()));
        frame = new QFrame(Form);
        frame.setObjectName("frame");
        frame.setGeometry(new QRect(0, 10, 181, 331));
        frame.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        frame.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        frame_2 = new QFrame(Form);
        frame_2.setObjectName("frame_2");
        frame_2.setGeometry(new QRect(180, 10, 351, 331));
        frame_2.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        frame_2.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        frame_3 = new QFrame(frame_2);
        frame_3.setObjectName("frame_3");
        frame_3.setGeometry(new QRect(0, 90, 400,60));
        frame_3.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        frame_3.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        radioButton = new QRadioButton(frame_3);
        radioButton.setObjectName("radioButton");
        radioButton.setGeometry(new QRect(0, 0, 321, 31));
        QFont font = new QFont();
        font.setFamily("Myriad Pro Light");
        font.setPointSize(10);
        font.setBold(true);
        font.setWeight(75);
        radioButton.setFont(font);
        label_3 = new QLabel(frame_3);
        label_3.setObjectName("label_3");
        label_3.setGeometry(new QRect(20,25,261,30));
        frame_4 = new QFrame(frame_2);
        frame_4.setObjectName("frame_4");
        frame_4.setGeometry(new QRect(210, 0, 131, 61));
        frame_4.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        frame_4.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        label = new QLabel(frame_4);
        label.setObjectName("label");
        label.setGeometry(new QRect(10, 10, 111, 21));
        QFont font1 = new QFont();
        font1.setFamily("MV Boli");
        font1.setPointSize(11);
        font1.setBold(true);
        font1.setItalic(true);
        font1.setWeight(75);
        label.setFont(font1);
        label_2 = new QLabel(frame_4);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(20, 30, 81, 20));
        QFont font2 = new QFont();
        font2.setFamily("MV Boli");
        font2.setPointSize(11);
        font2.setBold(true);
        font2.setItalic(true);
        font2.setWeight(75);
        label_2.setFont(font2);
        frame_5 = new QFrame(frame_2);
        frame_5.setObjectName("frame_5");
        frame_5.setGeometry(new QRect(0, 150, 291, 51));
        frame_5.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        frame_5.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        radioButton_2 = new QRadioButton(frame_5);
        radioButton_2.setObjectName("radioButton_2");
        radioButton_2.setGeometry(new QRect(0, 10, 211, 19));
        QFont font3 = new QFont();
        font3.setFamily("Myriad Pro Light");
        font3.setPointSize(10);
        font3.setBold(true);
        font3.setWeight(75);
        radioButton_2.setFont(font3);
        label_4 = new QLabel(frame_5);
        label_4.setObjectName("label_4");
        label_4.setGeometry(new QRect(20, 30, 251, 16));
        frame_6 = new QFrame(frame_2);
        frame_6.setObjectName("frame_6");
        frame_6.setGeometry(new QRect(0, 200, 291, 51));
        frame_6.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        frame_6.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        radioButton_3 = new QRadioButton(frame_6);
        radioButton_3.setObjectName("radioButton_3");
        radioButton_3.setGeometry(new QRect(0, 10, 211, 19));
        QFont font4 = new QFont();
        font4.setFamily("Myriad Pro Light");
        font4.setPointSize(10);
        font4.setBold(true);
        font4.setWeight(75);
        radioButton_3.setFont(font4);
        label_5 = new QLabel(frame_6);
        label_5.setObjectName("label_5");
        label_5.setGeometry(new QRect(20, 30, 241, 16));
        frame_7 = new QFrame(frame_2);
        frame_7.setObjectName("frame_7");
        frame_7.setGeometry(new QRect(20, 260, 182, 45));
        frame_7.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        frame_7.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        verticalLayout = new QVBoxLayout(frame_7);
        verticalLayout.setObjectName("verticalLayout");
        buttonBox = new QDialogButtonBox(frame_7);
        buttonBox.setObjectName("buttonBox");
        buttonBox.setStandardButtons(com.trolltech.qt.gui.QDialogButtonBox.StandardButton.createQFlags(com.trolltech.qt.gui.QDialogButtonBox.StandardButton.Cancel,com.trolltech.qt.gui.QDialogButtonBox.StandardButton.Ok));

        verticalLayout.addWidget(buttonBox);

        retranslateUi(Form);

        Form.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
        radioButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Create and Protect files", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Helps you create new text files and Encrypt\nthem and also encrypts already created Files", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", " WELCOME", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Shubham", null));
        radioButton_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "List all encryptted Files", null));
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "All previous encrypted files are displayed", null));
        radioButton_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Encrypt images", null));
        label_5.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Browse images to Encrypt", null));
    } // retranslateUi

}

