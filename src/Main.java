public class Main
{

	public static void main(String[] args)
	{
		Pile p1 = new Pile(10);
		p1.empiler(5);
		p1.depiler();
		p1.depiler();
		p1.empiler(-2);
		p1.empiler(0);
		p1.capacitePile();
		p1.taillePile();
		p1.afficherSommet();

	}

}
