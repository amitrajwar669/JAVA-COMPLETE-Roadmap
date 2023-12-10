
    //  Object 
class Animal//Class
{
    public void eat() //Methods
    {
        System.out.println("I Am Eating");
    }
    public static void main (String[] args){//main method
        System.out.println("1");
        Animal bujo = new Animal();//obj
        bujo.eat();
        bujo.run();
    }
    public void run()
    {
        System.out.println("I am Running");
    }
}
