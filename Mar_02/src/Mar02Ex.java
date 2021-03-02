import Mar02.service.Mar02_menu;
import Mar02.service.Mar02_service;

public class Mar02Ex {
	
	public static void main(String[] args) {
		
		Mar02_service m02service = new Mar02_service();
		Mar02_menu m02Menu = new Mar02_menu();
		
		m02Menu.menu();
		m02service.print();
		
	}

}
