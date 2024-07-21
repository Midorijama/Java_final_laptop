import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class Filter {
public static void main(String[] args) {
    Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Windows",16,256,"black",1000));
        laptops.add(new Laptop("Mac",16,512,"grey",5000));
        laptops.add(new Laptop("Windows 10",32,256,"grey",2035));
        laptops.add(new Laptop("Mac",32,512,"red",1500));
        laptops.add(new Laptop("Windows 10",64,512,"silver",3777));
        laptops.add(new Laptop("Mac",64,256,"black",999));
        laptops.add(new Laptop("Windows 10",16,512,"grey",2689));
        laptops.add(new Laptop("Mac",16,256,"grey",8900));
        laptops.add(new Laptop("Windows 10",16,256,"silver",2853));
        laptops.add(new Laptop("Mac",16,512,"black",1999));
        laptops.add(new Laptop("Windows 10",16,512,"red",2000));
        laptops.add(new Laptop("Mac",32,256,"silver",735));
        laptops.add(new Laptop("Windows 10",32,256,"red",6500));
        laptops.add(new Laptop("Mac",64,512,"black",4000));
        laptops.add(new Laptop("Windows 10",64,256,"silver",1245));

        Scanner reader = new Scanner(System.in);
        Map <String, String> param  = new HashMap<>();
        int choise;

        while (true) {
        System.out.println("Choose laptop parameters for filtering:");
        System.out.println("1 - Operational System");
        System.out.println("2 - RAM");
        System.out.println("3 - Hard Drive");
        System.out.println("4 - Color");
        System.out.println("5 - Price");
        System.out.println("0 - Finish filter input and print results");
            choise = reader.nextInt();
                if (choise == 0){
                    break;
                }
                switch(choise) {
                    case 1:
                    System.out.println("Operational System:\n Please type: Windows or Mac");
                    param.put("OS", reader.next());
                break;
                    case 2:
                    System.out.println("RAM:\n Please type: 16, 32 or 64");
                    param.put("RAM", reader.next());
                break;
                    case 3:
                    System.out.println("Hard drive storage:\n Please type: 256 or 512");
                    param.put("HD", reader.next());
                break;
                    case 4:
                    System.out.println("Color:\n Please type: black, grey, silver or red");
                    param.put("color", reader.next());
                break;
                    case 5:
                    System.out.println("Price:\n Please type the highest price you are willing to pay for a laptop");
                    param.put("price", reader.next());
                break;
                    default:
                    System.out.println("Whoops, something went wrong, please try again");
                break;                    
        }     
    }
reader.close();
Set <Laptop> filtered = new HashSet<>(laptops);
for(Map.Entry <String, String> par : param.entrySet()){
    String key = par.getKey();
    String value = par.getValue();    
    switch (key) {
    case "RAM":
        int RAM = Integer.parseInt(value);
        filtered.removeIf(laptop -> laptop.getRAM() <= RAM);
        break;
    case "OS":
        filtered.removeIf(laptop -> !laptop.getOS().equalsIgnoreCase(value));
        break;
    case "HD":
        int HD = Integer.parseInt(value);
        filtered.removeIf(laptop -> laptop.getHD() <= HD);
        break;
    case "color":
        filtered.removeIf(laptop -> !laptop.getColor().equalsIgnoreCase(value));
        break;
    case "price":
        int price = Integer.parseInt(value);
        filtered.removeIf(laptop -> laptop.getPrice() >= price);
        break;
    }
}
if (filtered.isEmpty()){
    System.out.println("Sorry, there are no laptops that fit your parameters");
}
else{
System.out.println("Laptops that fit you parameters: " + filtered);
}
}
}





