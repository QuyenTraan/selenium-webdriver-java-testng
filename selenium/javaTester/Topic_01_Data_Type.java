package javaTester;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Topic_01_Data_Type {
    //kieu du lieu trong Java - nhom
    //I - Kieu du lieu nguyen thuy (Primitive)
     // 8 loai
    // So nguyen : byte-short-int-long
    public int iNumber =12331333;
    short sNumber =3000;
    byte bNumber =40;
    long lNumber =234444444;
    // ko co han thap pphan nhan vien trong 1 cong ty/ hoc sinh trong 1 lop/ truong/
    // so thuc: float - double
    float fNumber =9.999f;
    double dNumber =35.98282d;

    //co phan thap han: diem so/luong/..
    //Ki tu: char dai dien cho 1 ky tu
    char c= 'M';
    // String chuoi ky tu
    String name ="Minh";
    //Logic: boolean(  luan ly)
    // ket qua ba test: pass/fail( k ngoai le)

    boolean status= true;
    //II- Kieu du lieu tham chieu (Reference type)
    // class

    FirefoxDriver firefoxDriver= new FirefoxDriver();
Select select= new Select(firefoxDriver.findElement(By.className("")));
//Interface
WebDriver drive;
JavascriptExecutor jsExecutor;
    //object
    Object naome ="Quyen Test";


    //array
    int [] studentAge={15,20,8};
    String[] studentName={"Quyen","Anh"};
    //Collection: List/Set/Queue
List<String> StudentAddress= new ArrayList<String>();
List<String> StudentCity =  new LinkedList<>();
List<String> StudentPhone =  new Vector<>();





    // khai bao 1 bien de luu tru 1 loai du lieu nao do
    //Access Modifier: pham vi truy cap (public/pprivate/protected/default)
    //kieu du lieu
    //ten bien
    //gia tri cua bien - gan vao voi phep =
    //neu nhu khong gan : du lieu mac dinh









}
