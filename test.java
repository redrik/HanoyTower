class HanoyTower
{
    public static void main(String[] args) 
    {
        printStep(4, 1, 3, 2);
    }
    public static void printStep(int rings, int from, int to, int buffer)
    {
    	if(rings <= 1)
    	{
    		System.out.print(from);
    		System.out.print(" -> ");
    		System.out.println(to);
    	}
    	else
    	{
    		printStep(rings - 1, from, buffer, to);
    		printStep(1, from, to, buffer);
    		printStep(rings - 1, buffer, to, from);
    	}
    }
}