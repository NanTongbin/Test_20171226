package folder1;
import java.awt.*;
import java.util.List;
import java.util.*;
import java.applet.Applet;
public class Test2 extends Applet{
	public void t2(){

		System.out.println("-=-=test2 class!");
	}
	public void init(){
		Label label=new Label("hello applet");
		this.add(label);
	}
}