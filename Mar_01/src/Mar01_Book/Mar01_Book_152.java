package Mar01_Book;

public class Mar01_Book_152 {
	
	private String name;
	private String marry;
	private int children;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarry() {
		return marry;
	}
	public void setMarry(String marry) {
		this.marry = marry;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		Mar01_Book_152 mar152 = new Mar01_Book_152();
		
		mar152.setAge(40);
		mar152.setName("James");
		mar152.setMarry("����");
		mar152.setChildren(3);
		
		System.out.println("����\t�̸�\t��ȥ\t���̼�");
		System.out.println("=============================================");
		System.out.printf("%d\t%s\t%s\t%d\n",mar152.getAge(),
				mar152.getName(),
				mar152.getMarry(),
				mar152.getChildren());
		
	}
}


