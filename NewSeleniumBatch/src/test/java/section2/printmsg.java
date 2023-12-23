package section2;

public class printmsg {

	public static void main(String[] args) {
		Hovermessageusingmethod ref=new Hovermessageusingmethod();
		ref.accessBroswer();
		ref.login();
	   String text = ref.getHovermsg();
	   System.out.println(text);
	}

}
