package collection.inicial;

import java.util.ArrayList;
import java.util.List;

public class AppCollection {

			public static void main(String [] args) {
				
				List<String> maquillajes = new ArrayList<String>();
				System.out.println(maquillajes.size());
				maquillajes.add("rubor");
				maquillajes.add("labial gloss");
				maquillajes.add("lapiz");
				System.out.println(maquillajes);	
				
				System.out.println("Comienzo bucle...");
		        for (int i = 0; i < maquillajes.size(); i++) {
		            String item = maquillajes.get(i);
		            System.out.println(item);
		        }

		        System.out.println("for sin indice...");
		        for (String pos : maquillajes) {
		            System.out.println(pos);
		        }

		        System.out.println("function lambda (arrow function)...");
		        maquillajes.forEach(x -> {
		            System.out.println(x);
		        });
			
			}
	}
