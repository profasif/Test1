class Test1
{
    public static void main(String args[])
    {
        System.out.println("Hi");
        Box box=new Box();
        box.setLength(10);
        box.setBreadth(20);
        box.setHeight(30);  
        System.out.println("Length: " + box.getLength());
        System.out.println("Breadth: " + box.getBreadth());         
        System.out.println("Height: " + box.getHeight());   

        System.out.println(box);
        
    }   
}