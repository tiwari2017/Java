public class Hobbits{
	String name;

	public static void main(String[] args) {
		Hobbits [] h = new Hobbits[3];//object array
		int z = 0;

		while(z<3){
			h[z] = new Hobbits(); //new Hobbit type
			h[z].name = "bilbo";

			if(z == 1){
				h[z].name = "frodo";
			}

			if(z == 2){
				h[z].name = "sam";
			}
			System.out.print(h[z].name + " is a ");
			System.out.println("good Hobbit name");
			z += 1;
		}
	}
}