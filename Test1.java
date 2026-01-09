class Test1
{
    public static void main(String args[])
    {
        Box box = new Box();
        box.setLength(10);
        box.setBreadth(5);
        box.setHeight(2);
        System.out.println("Box Details: " + box.toString());
        System.out.println("Volume of the Box: " + box.getVolume());
        
    }   
}