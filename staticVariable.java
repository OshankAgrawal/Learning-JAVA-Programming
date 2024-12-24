class staticVariable {
    static int a = 10;
    void fun()
    {
        int b = 10;
        System.out.println(a+" "+b);
        ++a;  ++b;
    }
    public static void main(String args[])
    {
        staticVariable r=new staticVariable();
        r.fun();
        r.fun();
    }
}
