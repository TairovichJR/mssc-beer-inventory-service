package guru.sfg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class MsscBeerInventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsscBeerInventoryServiceApplication.class, args);

	}



//	public static void countCharOcc(String name){
//
//		int length = name.length();
//
//		Map<Character, Integer> map = new HashMap<>();
//		for (int i = 0; i < length; i++){
//			if (map.containsKey( name.charAt(i))){
//				Integer value = map.get(name.charAt(i));
//				map.put(name.charAt(i), value+1);
//			}else{
//				map.put(name.charAt(i), 1);
//			}
//		}
//		System.out.println(map);
//	}

}
