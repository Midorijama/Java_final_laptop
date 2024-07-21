class Laptop {

    private String OS;
    private int RAM;
    private int HD;
    private String color;
    private int price;

    public Laptop (String OS, int RAM, int HD, String color, int price) {
        this.OS = OS;
        this.RAM = RAM;
        this.HD = HD;
        this.color = color;
        this.price = price;
    } 

    public String getOS() {
        return OS;
    }

    public int getRAM() {
        return RAM;
    }

    public int getHD() {
        return HD;
    }    

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setOS(String OS){
        this.OS = OS;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setHD(int HD) {
        this.HD = HD;
    }    

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString()    {
        StringBuilder laptop = new StringBuilder();
        laptop.append("\n\nLaptop information:\n");
        laptop.append("Operational System: ");
        laptop.append(OS);
        laptop.append('\n');
        laptop.append("RAM: ");
        laptop.append(RAM);
        laptop.append('\n');
        laptop.append("Hard Drive: ");
        laptop.append(HD);
        laptop.append('\n');
        laptop.append("Color: ");
        laptop.append(color);
        laptop.append('\n');
        laptop.append("Price: ");
        laptop.append(price);
        return laptop.toString();

    }
}
