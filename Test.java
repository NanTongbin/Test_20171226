
import java.awt.*;
import java.util.List;
import java.util.*;
import java.applet.Applet;
import folder1.*;

public class Test extends Applet{
	public static void main(String args[]){
		List list =new ArrayList();
		list.add("a1");
		list.add("a2");
		System.out.println("list(0)="+list.get(0));

		System.out.println("test class!");
		Test2 t =new Test2();
		t.t2();
		System.out.println("=========================");
		//Test21 t21 =new Test21();
		//t21.t2();
		
	}
	public void init(){
		Label label=new Label("hello applet");
		this.add(label);
	}
}