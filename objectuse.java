class objectuse
{
    int a;
    public void input()
    {
        a=5;
    }
    public void display()
    {
        System.out.println("Value of a = "+a);
    }
    public void square()
    {
        System.out.println("Value of a^2= "+a*a);
    }
    public static void main(String[] args) 
    {
        objectuse a1=new objectuse();
        a1.input();
        a1.display();
        a1.square();
    }
}
